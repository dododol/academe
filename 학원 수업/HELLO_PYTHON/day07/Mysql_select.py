import pymysql
 

conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python', port=3305, charset='utf8')
 

curs = conn.cursor()
 

sql = "select * from emp"
curs.execute(sql)
 

rows = curs.fetchall()
print(rows)   

conn.close()

rows = curs.fetchall()
print(rows)