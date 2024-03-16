--1 도서명 순으로 도서정보 검색 
SELECT *
FROM BOOK
ORDER BY BOOKNAME;

--2 출판사 순으로 검색하되 같은 출판사이면 도서명 순으로 도서정보 검색
SELECT *
FROM BOOK
ORDER BY PUBLISHER, BOOKNAME;

--3 도서 가격 순으로 검색하되 같은 가격이면 도서명 순으로 검색
SELECT *
FROM BOOK
ORDER BY PRICE, BOOKNAME;

--4 도서를 가격의 내림차순으로 검색
SELECT *
FROM BOOK
ORDER BY PRICE DESC;

--5 도서를 가격의 내림차순으로 검색하되 같은 가격인 도서는 출판사명 순으로 도서정보
SELECT *
FROM BOOK
ORDER BY PRICE DESC, PUBLISHER; 

--6 고객이 주문한 도서의 판매액을 구하세요
SELECT SALEPRICE
FROM ORDERS;

--7 고객이 주문한 도서의 총 판매액을 구하세요
SELECT SUM(SALEPRICE) "총 판매액"
FROM ORDERS;

--8 주문 도서의 평균 판매액을 구하세요
SELECT AVG(SALEPRICE) "평균 판매액"
FROM ORDERS;

--9 주문 도서 중 최고 판매가를 구하세요
SELECT MAX(SALEPRICE) "최고 판매가"
FROM ORDERS;

--10 주문 도서 중 최저 판매가를 구하세요
SELECT MIN(SALEPRICE) "최저 판매가"
FROM ORDERS;

--11 2번 김연아 고객이 주문한 도서의 총 판매액
SELECT SUM(SALEPRICE) "총 판매액"
FROM ORDERS
WHERE CUSTID=2;

--12 고객이 주문한 도서의 총 판매액, 평균값, 최저값, 최고값을 구하세요.
SELECT SUM(SALEPRICE) "총 판매액", AVG(SALEPRICE) "평균값", MIN(SALEPRICE) "최저값", MAX(SALEPRICE) "최고값"
FROM ORDERS;

--13 도서 주문 건수 
SELECT COUNT(*) AS "건수"
FROM ORDERS;

--14 고객의 수
SELECT COUNT(*) AS "고객의 수"
FROM CUSTOMER;

--15 도서의 수
SELECT COUNT(*) AS "도서의 수"
FROM BOOK;

--16 출판사의 수
SELECT COUNT(DISTINCT PUBLISHER) AS "출판사의 수"
FROM BOOK;

--17 도서정가가 13000원인 도서의 수
SELECT COUNT(*)
FROM BOOK
WHERE PRICE = 13000;

--18 도서 가격이 10000 이상 20000 이하인 도서의 권수 검색
SELECT COUNT(*)
FROM BOOK
WHERE PRICE >= 10000 AND PRICE <= 20000;

--19 도서명에 축구가 들어간 도서의 수 검색
SELECT COUNT(*)
FROM BOOK
WHERE BOOKNAME LIKE '%축구%';

--20 대한미디어에서 출간한 도서의 수 검색 
SELECT COUNT(*)
FROM BOOK
WHERE PUBLISHER LIKE '대한미디어';

--21 영국에 살고 있는 고객의 수 검색 
SELECT COUNT(*)
FROM CUSTOMER
WHERE ADDRESS LIKE '%영국%';

--22 1번 도서를 구매한 고객의 수 검색
SELECT COUNT(*)
FROM ORDERS
WHERE BOOKID = 1;

--23 10000원 이상이 도서의 수 검색 
SELECT COUNT(*)
FROM BOOK
WHERE PRICE >= 10000;

--24 책 이름이 축구의 역사인 책의 가격
SELECT PRICE AS "축구의 역사 가격"
FROM BOOK
WHERE BOOKNAME LIKE '축구의 역사';

--25 출판사별로 몇 권의 책을 출간했을까?
SELECT PUBLISHER 출판사, COUNT(*) 권수
FROM BOOK
GROUP BY PUBLISHER;

--26 출판사별로 몇 권의 책을 출간했을까? 단, 2권 이상 출간한 출판사 정보만!
SELECT PUBLISHER 출판사, COUNT(*) 권수
FROM BOOK
GROUP BY PUBLISHER HAVING COUNT(*) >= 2;

--27 3번 내용을 출판사 이름 순으로
SELECT PUBLISHER 출판사, COUNT(*) 권수
FROM BOOK
GROUP BY PUBLISHER HAVING COUNT(*) >= 2 ORDER BY PUBLISHER;

--28 4번 내용 중 도서 가격이 10000원 이상인 것만
SELECT PUBLISHER 출판사, COUNT(*) 권수
FROM BOOK
WHERE PRICE >= 10000 GROUP BY PUBLISHER HAVING COUNT(*) >= 2 ORDER BY PUBLISHER;

--29 고객의 이름과 주소 출력
SELECT NAME, ADDRESS
FROM CUSTOMER;

--30 고객의 이름과 주소와 전화번호
SELECT NAME, ADDRESS, PHONE
FROM CUSTOMER;

--31 주문번호, 고객번호, 도서번호 출력
SELECT ORDERID, CUSTID, BOOKID
FROM ORDERS;

--32 도서명, 정가, 출판사
SELECT BOOKNAME, PRICE, PUBLISHER
FROM BOOK;

--33 고객번호, 도서번호, 판매가, 주문일
SELECT CUSTID, BOOKID, SALEPRICE, ORDERDATE
FROM ORDERS;

--34 출판사, 도서명
SELECT PUBLISHER, BOOKNAME
FROM BOOK;

--35 주문된 도서번호
SELECT BOOKID
FROM ORDERS;

--36 주문된 도서번호(중복없이)
SELECT DISTINCT BOOKID
FROM ORDERS;

--37 도서번호가 5번에서 8번까지의 도서 정보
SELECT *
FROM BOOK
WHERE BOOKID >= 5 AND BOOKID <= 8;

SELECT *
FROM BOOK
WHERE BOOKID BETWEEN 5 AND 8;

--38 도서번호가 1~4까지, 7~10까지의 도서 정보
SELECT *
FROM BOOK
WHERE BOOKID BETWEEN 1 AND 4 OR BOOKID BETWEEN 7 AND 10; 

SELECT * 
FROM BOOK 
WHERE BOOKID NOT IN(5,6);

--39 가격이 8000이상인 도서명과 출판사
SELECT BOOKNAME, PUBLISHER
FROM BOOK
WHERE PRICE >= 8000;

--40 고객번호가 3,4인 고객명과 고객번호, 전화번호
SELECT NAME, CUSTID, PHONE
FROM CUSTOMER
WHERE CUSTID IN(3,4);

--41 판매가가 10000원 이상인 도서번호, 판매가, 주문일
SELECT BOOKID, SALEPRICE, ORDERDATE
FROM ORDERS
WHERE SALEPRICE >= 10000;

--42 출판사명에 스포츠라는 단어가 들어간 도서정보
SELECT *
FROM BOOK
WHERE PUBLISHER LIKE '%스포츠%';

--43 출판사명에 두번째 글자가 한 이라는 글자가 들어간 도서명, 출판사명, 정가
SELECT BOOKNAME, PUBLISHER, PRICE
FROM BOOK
WHERE PUBLISHER LIKE '_한%';

--44 도서명이 야구로 시작하는 도서정보
SELECT *
FROM BOOK
WHERE BOOKNAME LIKE '야구%';

--45 굿스포츠와 대한미디어 출판사에서 출간한 도서정보
SELECT *
FROM BOOK
WHERE PUBLISHER IN('굿스포츠', '대한미디어');

--46 굿스포츠에서 출간했고, 도서정가가 10000원 미만인 도서정보
SELECT *
FROM BOOK
WHERE PUBLISHER LIKE '굿스포츠' AND PRICE < 10000;

--47 출판사명순으로 도서정보 검색
SELECT *
FROM BOOK
ORDER BY PUBLISHER;

--48 가격순으로 하되, 같은 가격이면 도서명 순으로 도서정보 검색
SELECT *
FROM BOOK
ORDER BY PRICE, PUBLISHER;

--49 가격역순으로 정렬하되, 같은 가격이면 출판사 순으로 도서정보 검색
SELECT *
FROM BOOK
ORDER BY PRICE DESC, PUBLISHER;
 
--50 주문받은 모든 도서의 판매가격 합계를 출력하되 별칭을 사용(총매출)
SELECT SUM(SALEPRICE) AS "총매출"
FROM ORDERS;
 
--51 도서의 수
SELECT COUNT(*)
FROM BOOK;

--52 고객의 수
SELECT COUNT(*)
FROM CUSTOMER;

--53 주문받은 건수
SELECT COUNT(*)
FROM ORDERS;

--54 주문받은 도서번호
SELECT BOOKID
FROM ORDERS;
 
--55 주문받은 도서번호(중복제거)
SELECT DISTINCT BOOKID
FROM ORDERS;
 
--56 1번 책을 주문한 고객번호
SELECT CUSTID
FROM ORDERS
WHERE BOOKID = 1;
 
--57 총 판매액, 총 판매건수, 최저 판매가, 최고 판매가
SELECT SUM(SALEPRICE) AS "총 판매액", COUNT(*) AS "총 판매건수", MIN(SALEPRICE) AS "최저 판매가", MAX(SALEPRICE) AS "최고 판매가"
FROM ORDERS;

--58 고객별 주문금액 합계
SELECT CUSTID, SUM(SALEPRICE) AS "총 주문금액"
FROM ORDERS
GROUP BY CUSTID;
 
--59 주문날짜별 주문금액 합계, 주문건수
SELECT ORDERDATE, SUM(SALEPRICE), COUNT(*)
FROM ORDERS
GROUP BY ORDERDATE;
 
--60 판매가격이 5000원 이상인 도서를 구매한 고객에 대해 고객별 주문도서 수
SELECT CUSTID, COUNT(*)
FROM ORDERS
WHERE SALEPRICE >= 5000 GROUP BY CUSTID;
 
--61 37번 문제에 추가로 두 권이상 구매한 고객만
SELECT CUSTID, COUNT(*)
FROM ORDERS
WHERE SALEPRICE >= 5000 GROUP BY CUSTID HAVING COUNT(*)>=2;

--62 출판사별 출간한 도서수
SELECT PUBLISHER 출판사, COUNT(*) 도서수
FROM BOOK
GROUP BY PUBLISHER;

--63 고객별 구매건수
SELECT CUSTID 고객, COUNT(*)
FROM ORDERS
GROUP BY CUSTID;
 
--64 도서별 주문건수
SELECT BOOKID 도서, COUNT(*)
FROM ORDERS
GROUP BY BOOKID;

--65 주문날짜가 14년 7월 1일 주문정보
SELECT *
FROM ORDERS
WHERE ORDERDATE = '2014/07/01';

--66 주문날짜가 14년 7월 1일~3일 주문정보
SELECT *
FROM ORDERS
WHERE ORDERDATE BETWEEN '2014/07/01' AND '2014/07/03';
