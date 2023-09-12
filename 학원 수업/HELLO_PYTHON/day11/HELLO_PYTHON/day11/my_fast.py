from fastapi import FastAPI
import uvicorn
from starlette.responses import HTMLResponse
from starlette.templating import Jinja2Templates
from starlette.requests import Request
from day11.daomember import DaoMember
from fastapi.param_functions import Form

templates = Jinja2Templates(directory="templates")
app = FastAPI()

@app.get("/", response_class=HTMLResponse)
@app.get("/member_list", response_class=HTMLResponse)
async def member_list(request: Request):
    dm = DaoMember()
    mylist = dm.selectList()
    return templates.TemplateResponse("member_list.html", {"request" : request, "mylist":mylist})

@app.get("/member_detail", response_class=HTMLResponse)
async def member_detail(request: Request, m_id: str):
    de = DaoMember()
    member = de.selectOne(m_id)
    return templates.TemplateResponse("member_detail.html", {"request": request, "member":member})

@app.get("/member_mod", response_class=HTMLResponse)
async def member_mod(request: Request, m_id: str):
    de = DaoMember()
    member = de.selectOne(m_id)
    return templates.TemplateResponse("member_mod.html", {"request": request, "member":member })

@app.post("/member_mod_act", response_class=HTMLResponse)
async def member_act(request: Request, m_id: str=Form(), m_name : str=Form(), tel: str=Form() , email: str=Form()):
    de = DaoMember()
    cnt = de.update(m_id, m_name, tel, email)
    return templates.TemplateResponse("member_mod_act.html", {"request": request, "cnt":cnt })

@app.post("/member_del_act", response_class=HTMLResponse)
async def member_del_act(request: Request, m_id: str=Form()):
    de = DaoMember()
    cnt = de.delete(m_id)
    return templates.TemplateResponse("member_del_act.html", {"request": request, "cnt":cnt })

@app.get("/member_add", response_class=HTMLResponse)
async def member_add(request: Request):
    return templates.TemplateResponse("member_add.html", {"request": request })

@app.post("/member_add_act", response_class=HTMLResponse)
async def member_add_act(request: Request, m_name : str=Form(), tel: str=Form() , email: str=Form()):
    de = DaoMember()
    cnt = de.insert(m_name, tel, email)
    return templates.TemplateResponse("member_add_act.html", {"request": request, "cnt":cnt })

if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)
    
    
    