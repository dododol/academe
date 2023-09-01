from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy import Column, Integer, String
from sqlalchemy import create_engine
from sqlalchemy.orm import sessionmaker

DATABASES = create_engine('mysql+mysqldb://root:python@127.0.0.1:3305/python', echo=True)

# orm과의 매핑 선언
Base = declarative_base()


class Sample(Base):

    __tablename__ = 'sample'
    
    col01 = Column(String(20), primary_key=True)
    col02 = Column(String(20))
    col03 = Column(String(20))
    
    def __init__(self, col01, col02, col03):
    
        self.col01 = col01
        self.col02 = col02
        self.col03 = col03
    
    def __repr__(self):
        return "<Sample('%s', '%s', '%s')>" % (self.col01, self.col02, self.col03)


if __name__ == '__main__':

    Base.metadata.create_all(DATABASES)
    
    # 세션 연결
    Session = sessionmaker()
    Session.configure(bind=DATABASES)
    session = Session()
    
    samples = session.query(Sample).filter(Sample.col01==1).delete()
    
        # 세션에 추가를 한다.
    session.commit()