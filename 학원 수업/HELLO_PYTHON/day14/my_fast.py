from fastapi import FastAPI, staticfiles
import uvicorn
from starlette.responses import HTMLResponse, RedirectResponse
from fastapi.params import Form
from starlette.requests import Request
from starlette.templating import Jinja2Templates
from starlette.staticfiles import StaticFiles
from pydantic.main import BaseModel
from day13.daoemp import DaoEmp

templates = Jinja2Templates(directory="templates")
app = FastAPI()
app.mount("/static", StaticFiles(directory="static"), name="static")


@app.get("/", response_class=HTMLResponse)
async def root(requqest: Request):
    return RedirectResponse(url="/static/emp.html")


if __name__ =="__main__":
    uvicorn.run(app, host="0.0.0.0", port=8000)