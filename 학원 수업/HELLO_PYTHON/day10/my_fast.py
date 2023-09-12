from fastapi import FastAPI, Form, Request
import uvicorn
from starlette.responses import HTMLResponse
from fastapi.param_functions import Form
import pymysql
from starlette.templating import Jinja2Templates
from starlette.requests import Request
from starlette.responses import RedirectResponse
from day10.daoemp import DaoEmp

templates = Jinja2Templates(directory="templates")
app = FastAPI()

@app.get("/", response_class=HTMLResponse)
@app.get("/emp_list", response_class=HTMLResponse)
async def emp_list(request: Request):
    de = DaoEmp()
    mylist = de.selectList()
    return templates.TemplateResponse("emp_list.html", {"request" : request, "mylist":mylist})

@app.get("/emp_detail", response_class=HTMLResponse)
async def emp_detail(request: Request, e_id: str):
    de = DaoEmp()
    emp = de.selectOne(e_id)
    return templates.TemplateResponse("emp_detail.html", {"request": request, "emp":emp})

@app.get("/emp_mod", response_class=HTMLResponse)
async def emp_mod(request: Request, e_id: str):
    de = DaoEmp()
    emp = de.selectOne(e_id)
    return templates.TemplateResponse("emp_mod.html", {"request": request, "emp":emp })

@app.post("/emp_mod_act", response_class=HTMLResponse)
async def emp_act(request: Request, e_id: str=Form(), e_name : str=Form(), gen: str=Form() , addr: str=Form() ):
    de = DaoEmp()
    cnt = de.update(e_id, e_name, gen, addr)
    return templates.TemplateResponse("emp_mod_act.html", {"request": request, "cnt":cnt })

@app.post("/emp_del_act", response_class=HTMLResponse)
async def emp_del_act(request: Request, e_id: str=Form()):
    de = DaoEmp()
    cnt = de.delete(e_id)
    return templates.TemplateResponse("emp_del_act.html", {"request": request, "cnt":cnt })

@app.get("/emp_add", response_class=HTMLResponse)
async def emp_add(request: Request):
    return templates.TemplateResponse("emp_add.html", {"request": request })

@app.post("/emp_add_act", response_class=HTMLResponse)
async def emp_add_act(request: Request, e_id: str=Form(), e_name : str=Form(), gen: str=Form() , addr: str=Form()):
    de = DaoEmp()
    cnt = de.insert(e_id, e_name, gen, addr)
    return templates.TemplateResponse("emp_add_act.html", {"request": request, "cnt":cnt })

if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)