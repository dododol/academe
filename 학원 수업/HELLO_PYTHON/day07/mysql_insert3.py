import pymysql
 
conn = pymysql.connect(host='localhost', user='root', password='python',
                       db='python', port=3305, charset='utf8')

e_id = '6'
e_name = '6'
gen = '6'
addr = '6'

curs = conn.cursor()

sql = f"""
insert into emp(e_id, e_name, gen, addr)
values('{e_id}', '{e_name}', '{gen}', '{addr}')

"""
cnt = curs.execute(sql)
print("cnt",cnt)
print("rowcount",curs.rowcount)
conn.commit()

curs.close()
conn.close()