import pymysql


conn = pymysql.connect(user='root', password='python', host='127.0.0.1', port=3305, db='python', charset='utf8')
curs = conn.cursor(pymysql.cursors.DictCursor)

sql = """
insert into emp(e_id, e_name, gen, addr) values(%s, %s, %s, %s)
"""

curs.execute(sql,(5,5,5,5))

conn.commit()

curs.close()
conn.close()