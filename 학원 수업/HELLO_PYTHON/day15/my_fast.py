from fastapi import FastAPI, staticfiles
import uvicorn
from starlette.responses import HTMLResponse, RedirectResponse
from fastapi.params import Form
from starlette.requests import Request
from starlette.templating import Jinja2Templates
from starlette.staticfiles import StaticFiles
from pydantic.main import BaseModel
from day15.daoexam import DaoExam


templates = Jinja2Templates(directory="templates")
app = FastAPI()
app.mount("/static", StaticFiles(directory="static"), name="static")

class Exam(BaseModel):   #VO 모델 객체 표현
    e_id: str = None
    m_id: str = None
    kor: str = None
    eng: str = None
    math: str = None

@app.get("/", response_class=HTMLResponse)
async def root(requqest: Request):
    return RedirectResponse(url="/static/exam.html")

@app.post("/exam_select")
def exam_select(e:Exam):
    de = DaoExam()
    list = de.selectList()
    print(e)
    return {"list": list}

@app.post("/exam_select_one")
def exam_select_one(e:Exam):
    e_id = e.e_id
    de = DaoExam()
    exam = de.selectOne(e_id)
    return {"exam": exam}

@app.post("/exam_insert")
def exam_insert(e:Exam):
    de = DaoExam()
    cnt = de.insert(e.m_id,e.kor,e.eng,e.math)
    return {"cnt": cnt}

@app.post("/exam_update")
def emp_update(e:Exam):
    de = DaoExam()
    cnt = de.update(e.e_id,e.m_id,e.kor,e.eng,e.math)
    return {"cnt": cnt}

@app.post("/exam_delete")
def emp_delete(e:Exam):
    de = DaoExam()
    cnt = de.delete(e.e_id)
    return {"cnt": cnt}

if __name__ =="__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)