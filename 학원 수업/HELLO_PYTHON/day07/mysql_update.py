import pymysql


conn = pymysql.connect(user='root', password='python', host='127.0.0.1', port=3305, db='python', charset='utf8')

curs = conn.cursor()

sql = """
delete from emp
    WHERE e_id=7;
"""

cnt = curs.execute(sql)
print("cnt",cnt)
print("cnt",curs.rowcount)
conn.commit()

curs.close()
conn.close()