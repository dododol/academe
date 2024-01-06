--문제1

--1 '축구의 역사'라는 도서의 출판사와 정가
SELECT PUBLISHER, PRICE, BOOKNAME FROM BOOK WHERE BOOKNAME = '축구의 역사';

--2 대한미디어 출판사에서 출판한 도서의 정보
SELECT * FROM BOOK WHERE PUBLISHER = '대한미디어';

--3 정가가 10000원 이하인 도서 정보
SELECT * FROM BOOK WHERE PRICE<=10000;

--4 김연아 고객의 전화번호
SELECT PHONE,NAME FROM CUSTOMER WHERE NAME='김연아';

--5 김연아 고객의 주소
SELECT ADDRESS, NAME FROM CUSTOMER WHERE NAME='김연아';

--6 김연아, 박지성 고객의 주소
SELECT ADDRESS, NAME FROM CUSTOMER WHERE NAME='박지성'OR NAME='김연아';
SELECT ADDRESS, NAME FROM CUSTOMER WHERE NAME IN('박지성', '김연아');

--7 도서 가격이 10000원 이상인 도서명과 출판사
SELECT BOOKNAME, PUBLISHER, PRICE FROM BOOK WHERE PRICE>=10000;

--8 출판사명 검색 (DISTINCT: 중복 제거)
SELECT DISTINCT PUBLISHER FROM BOOK;

--9 출판사명 검색 ALL - 생략가능
SELECT PUBLISHER FROM BOOK;
SELECT ALL PUBLISHER FROM BOOK;

--10 출판사순으로 도서정보 검색
SELECT * FROM BOOK ORDER BY PUBLISHER DESC;
--ASC : 오름차순(기본값), DESC : 내림차순
--조건없는 정렬은 WHERE 안씀

--11 출판사순, 가격순으로 도서정보
SELECT * FROM BOOK ORDER BY PUBLISHER, PRICE;

--12 출판사순, 가격순, 도서명순 도서정보
SELECT * FROM BOOK ORDER BY PUBLISHER, PRICE, BOOKNAME;

--13 모든 도서 정보를 출력
SELECT * FROM BOOK;

--14 도서명과 가격 검색
SELECT BOOKNAME, PRICE FROM BOOK;

--15 도서명과 출판사 검색
SELECT BOOKNAME, PUBLISHER FROM BOOK;

--16 출판사명을 한번씩만 검색
SELECT DISTINCT PUBLISHER FROM BOOK;

--17 대한미디어 출판사의 도서명만 검색
SELECT BOOKNAME,PUBLISHER FROM BOOK WHERE PUBLISHER='대한미디어';

--18 가격이 20000원 이상인 도서명과 가격 
SELECT BOOKNAME, PRICE FROM BOOK WHERE PRICE>=20000;

--19 도서가격이 10000원 이상 20000원 이하 도서 정보
SELECT * FROM BOOK WHERE PRICE>=10000 AND PRICE<=20000;
SELECT * FROM BOOK WHERE PRICE BETWEEN 10000 AND 20000;

--20 도서가격이 10000, 20000, 30000 인 도서 정보 
SELECT * FROM BOOK WHERE PRICE IN(10000,20000,30000);

--21 도서 가격이 NULL인 도서 정보 검색
SELECT * FROM BOOK WHERE PRICE IS NULL;
SELECT * FROM BOOK WHERE PRICE IS NOT NULL;

--22 도서 가격이 20000 미만인 도서 정보 
SELECT * FROM BOOK WHERE PRICE<20000;

--23 도서 가격이 20000미만이고 도서명이 축구의 역사인 도서 정보
SELECT * FROM BOOK WHERE PRICE<20000 AND BOOKNAME='축구의 역사';

--24 도서 가격이 20000미만이거나 도서명이 축구의 역사인 도서 정보
SELECT * FROM BOOK WHERE PRICE<20000 OR BOOKNAME='축구의 역사';

--25 출판사가 굿스포츠와 삼성당에서 나온 도서명과 출판사 검색
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE PUBLISHER IN('굿스포츠','삼성당');

--26  출판사가 굿스포츠와 삼성당이 아닌 출판사에서 나온 도서명과 출판사 검색
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE NOT PUBLISHER IN('굿스포츠','삼성당');
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE PUBLISHER NOT IN('굿스포츠','삼성당');

--27 도서 가격이 정해진 도서 정보 검색
SELECT * FROM BOOK WHERE PRICE IS NOT NULL;

--28 도서 가격이 10000미만, 20000 초과 도서 정보 검색
SELECT * FROM BOOK WHERE PRICE<10000 OR PRICE>20000;

--29 도서 가격이 20000원인 도서 정보 검색
SELECT * FROM BOOK WHERE PRICE=20000;

--30 도서 가격이 20000원이 아닌 도서 정보 검색
SELECT * FROM BOOK WHERE NOT PRICE=20000;
SELECT * FROM BOOK WHERE PRICE!=20000;

--31 '축구의 역사'를 출간한 출판사
SELECT PUBLISHER, BOOKNAME FROM BOOK WHERE BOOKNAME='축구의 역사';

--32 도서명에 '축구'가 포함된 출판사
SELECT PUBLISHER, BOOKNAME FROM BOOK WHERE BOOKNAME LIKE '%축구%';

--33 오늘 날짜 정보 확인
SELECT SYSDATE FROM DUAL;

--34 도서명이 '축구'로 시작하는 도서명 출력
SELECT BOOKNAME FROM BOOK WHERE BOOKNAME LIKE '축구%';

--35 출판사 명이 '대한'으로 시작하는 출판사에서 출간한 도서명과 출판사명
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE PUBLISHER LIKE '대한%';

--37 도서명의 두번째 글자가 '구'인 도서명 검색
SELECT BOOKNAME FROM BOOK WHERE SUBSTR(BOOKNAME, 2, 1)='구';
SELECT BOOKNAME FROM BOOK WHERE BOOKNAME LIKE '_구%';

--38 축구에 관한 도서 중 가격이 20000원 이상인 도서정보
SELECT * FROM BOOK WHERE BOOKNAME LIKE '%축구%' AND PRICE>=20000;


--문제2

--1 도서명 순으로 도서정보 검색 
SELECT * FROM BOOK ORDER BY BOOKNAME;

--2 출판사 순으로 검색하되 같은 출판사이면 도서명 순으로 도서정보 검색
SELECT * FROM BOOK ORDER BY PUBLISHER ,BOOKNAME;

--3 도서 가격 순으로 검색하되 같은 가격이면 도서명 순으로 검색
SELECT * FROM BOOK ORDER BY PRICE, BOOKNAME;

--4 도서를 가격의 내림차순으로 검색
SELECT * FROM BOOK ORDER BY PRICE DESC;

--5 도서를 가격의 내림차순으로 검색하되 같은 가격인 도서는 출판사명 순으로 도서정보
SELECT * FROM BOOK ORDER BY PRICE DESC, PUBLISHER ASC;

--6 고객이 주문한 도서의 판매액을 구하세요


--7 고객이 주문한 도서의 총 판매액을 구하세요


--8 주문 도서의 평균 판매액을 구하세요


--9 주문 도서 중 최고 판매가를 구하세요


--10 주문 도서 중 최저 판매가를 구하세요


--11 2번 김연아 고객이 주문한 도서의 총 판매액


--12 고객이 주문한 도서의 총 판매액, 평균값, 최저값, 최고값을 구하세요.


--13 도서 주문 건수 


--14 고객의 수


--15 도서의 수


--16 출판사의 수


--17 도서정가가 13000원인 도서의 수


--18 도서 가격이 10000 이상 20000 이하인 도서의 권수 검색


--19 도서명에 축구가 들어간 도서의 수 검색


--20 대한미디어에서 출간한 도서의 수 검색 


--21 영국에 살고 있는 고객의 수 검색 


--22 1번 도서를 구매한 고객의 수 검색


--23 10000원 이상이 도서의 수 검색 


--24 책 이름이 축구의 역사인 책의 가격


--25 출판사별로 몇 권의 책을 출간했을끼?


--26 출판사별로 몇 권의 책을 출간했을까? 단, 2권 이상 출간한 출판사 정보만!


--27 3번 내용을 출판사 이름 순으로


--28 4번 내용 중 도서 가격이 10000원 이상인 것만


--29 고객의 이름과 주소 출력


--30 고객의 이름과 주소와 전화번호


--31 주문번호, 고객번호, 도서번호 출력


--32 도서명, 정가, 출판사


--33 고객번호, 도서번호, 판매가, 주문일


--34 출판사, 도서명


--35 주문된 도서번호


--36 주문된 도서번호(중복없이)


--37 도서번호가 5번에서 8번까지의 도서 정보


--38 도서번호가 1~4까지, 7~10까지의 도서 정보


--39 가격이 8000이상인 도서명과 출판사


--40 고객번호가 3,4인 고객명과 고객번호, 전화번호


--41 판매가가 10000원 이상인 도서번호, 판매가, 주문일


--42 출판사명에 스포츠라는 단어가 들어간 도서정보


--43 출판사명에 두번째 글자가 한 이라는 글자가 들어간 도서명, 출판사명, 정가


--44 도서명이 야구로 시작하는 도서정보


--45 굿스포츠와 대한미디어 출판사에서 출간한 도서정보


--46 굿스포츠에서 출간했고, 도서정가가 10000원 미만인 도서정보


--47 출판사명순으로 도서정보 검색


--48 가격순으로 하되, 같은 가격이면 도서명 순으로 도서정보 검색


--49 가격역순으로 정렬하되, 같은 가격이면 출판사 순으로 도서정보 검색

 
--50 주문받은 모든 도서의 판매가격 합계를 출력하되 별칭을 사용(총매출)

 
--51 도서의 수


--52 고객의 수


--53 주문받은 건수


--54 주문받은 도서번호

 
--55 주문받은 도서번호(중복제거)

 
--56 1번 책을 주문한 고객번호

 
--57 총 판매액, 총 판매건수, 최저 판매가, 최고 판매가


--58 고객별 주문금액 합계

 
--59 주문날짜별 주문금액 합계, 주문건수

 
--60 판매가격이 5000원 이상인 도서를 구매한 고객에 대해 고객별 주문도서 수

 
--61 37번 문제에 추가로 두 권이상 구매한 고객만


--62 출판사별 출간한 도서수

 
--63 고객별 구매건수

 
--64 도서별 주문건수


--65 주문날짜가 14년 7월 1일 주문정보


--66 주문날짜가 14년 7월 1일~3일 주문정보





