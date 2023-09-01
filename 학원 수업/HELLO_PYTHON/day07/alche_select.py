from sqlalchemy import create_engine, Column, String
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker

# 데이터베이스 연결 설정
DATABASE = create_engine('mysql+mysqldb://root:python@localhost:3305/python', echo=True)

# ORM과의 매핑 선언
Base = declarative_base()

class Test(Base):
    __tablename__ = 'sample'

    col01 = Column(String(20), primary_key=True)
    col02 = Column(String(20))
    col03 = Column(String(20))

    def __init__(self, col01, col02, col03):
        self.col01 = col01
        self.col02 = col02
        self.col03 = col03

    def __repr__(self):
        return f"<sample('{self.col01}', '{self.col02}', '{self.col03}')>"

if __name__ == '__main__':
    # 세션 연결
    Session = sessionmaker(bind=DATABASE)
    session = Session()

    # 데이터 조회 예제
    result = session.query(Test).all()

    for row in result:
        print(row.col01, row.col02, row.col03)