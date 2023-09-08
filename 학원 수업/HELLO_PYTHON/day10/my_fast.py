from fastapi import FastAPI, Form, Request
import uvicorn
from starlette.responses import HTMLResponse
from fastapi.param_functions import Form
import pymysql
from starlette.templating import Jinja2Templates
from starlette.requests import Request
from starlette.responses import RedirectResponse
from day10.daoEmp import daoEmp



templates = Jinja2Templates(directory="templates")

app = FastAPI()

de = daoEmp

@app.get("/", response_class=HTMLResponse)
@app.get("/emp_list", response_class=HTMLResponse)
async def emp_list(request: Request):
    de = daoEmp()
    mylist = de.selectList()
    return templates.TemplateResponse("emp_list.html", {'request': request, "mylist":mylist})

@app.get("/emp_list", response_class=HTMLResponse)
async def emp_detail(request: Request):
    return templates.TemplateResponse("emp_detail.html", {'request': request})


if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)