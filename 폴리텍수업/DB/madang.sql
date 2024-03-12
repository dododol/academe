--1삼성당 출판사의 도서 수 (테이블: )
SELECT COUNT(*)
FROM BOOK
WHERE PUBLISHER='심성당';

--2 1번 도서 판매된 건 수
SELECT COUNT(*)
FROM BOOK
WHERE BOOKID=1;

--3 축구의 역사 판매된 건 수
SELECT COUNT(*)
FROM BOOK
WHERE BOOKNAME='축구의 역사';

--4 박지성이 구매한 도서 수
SELECT COUNT(*)
FROM CUSTOMER A JOIN ORDERS B ON(B.CUSTID = A.CUSTID)
WHERE A.NAME='박지성';

--5 미국에 사는 고객이 주문한 정보
SELECT *
FROM CUSTOMER A JOIN ORDERS B ON(B.CUSTID = A.CUSTID)
WHERE A.ADDRESS LIKE '%미국%';

--6 전화번호가 000-5000-0001인 고객의 주문일
SELECT B.ORDERDATE
FROM CUSTOMER A JOIN ORDERS B ON(B.CUSTID = A.CUSTID)
WHERE A.PHONE='000-5000-0001';

--7 이상미디어 출판사 도서의 주문건수, 판매액 합계
SELECT COUNT(*) AS 주문건수, SUM(B.SALEPRICE) AS "판매액 합계"
FROM BOOK A JOIN ORDERS B ON(A.BOOKID=B.BOOKID)
WHERE A.PUBLISHER LIKE '이상미디어';

--8 가격(정가)이 10000~20000 사이인 도서의 판매액 평균
SELECT AVG(B.SALEPRICE)
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID)
WHERE A.PRICE>=10000 AND A.PRICE<=20000;

--9 이상미디어의 도서를 구매한 고객의 정보
SELECT C.*
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID) JOIN CUSTOMER C ON(B.CUSTID=C.CUSTID)
WHERE A.PUBLISHER LIKE '이상미디어';

--10 TEST 테이블 생성
CREATE TABLE TEST(
ID NUMBER(2),
NAME VARCHAR2(10)
);

--11 (1,A) 삽입 -> INSERT INTO 테이블(속성1, 속성2, ...) VALUES(값1, 값2, ...);
INSERT INTO TEST(ID, NAME) VALUES(1,'A');

--12 (2,B) 삽입
INSERT INTO TEST(ID, NAME) VALUES(2,'B');

--13 NAME 만 넣기 값:C
INSERT INTO TEST(ID, NAME) VALUES(NULL,'C');
--INSERT INTO TEST(NAME) VALUES('C');

SELECT * FROM TEST;

--14 
DROP TABLE TEST;

CREATE TABLE TEST(
ID NUMBER(2) NOT NULL,
NAME VARCHAR2(10)
);

INSERT INTO TEST(ID, NAME) VALUES(1,'A');
INSERT INTO TEST(ID, NAME) VALUES(2,'B');
INSERT INTO TEST(NAME) VALUES('C'); --X , NOT NULL 인 ID 값을 안넣어서!
INSERT INTO TEST(ID, NAME) VALUES(1,'A');
SELECT * FROM TEST;

--15 (1,'A')튜플 삭제
DELETE FROM TEST WHERE ID=1;

--16 15번 취소
ROLLBACK;
SELECT * FROM TEST;

INSERT INTO TEST(ID, NAME) VALUES(1,'A');
INSERT INTO TEST VALUES(1,'B');
COMMIT;
DELETE FROM TEST WHERE ID=1;
SELECT * FROM TEST;
ROLLBACK;

SELECT * FROM TEST;
INSERT INTO TEST(ID) VALUES(3);

CREATE TABLE TEST2(
ID NUMBER(2),
NAME VARCHAR2(10)
);

INSERT INTO TEST(ID, NAME) VALUES(1,'A');

DROP TABLE TEST;

--17 TEST테이블 생성, ID 기본키로!
CREATE TABLE TEST(
ID NUMBER(2) PRIMARY KEY,
NAME VARCHAR2(10)
);

INSERT INTO TEST(ID, NAME) VALUES(1,'A');
INSERT INTO TEST(ID, NAME) VALUES(1,'A');                                   
INSERT INTO TEST VALUES(2,'B');
INSERT INTO TEST VALUES(3,'C');

--18 AGE NUMBER(3) 기본값 : DEFAULT 20
DROP TABLE TEST;

CREATE TABLE TEST(
ID NUMBER(2) PRIMARY KEY,
NAME VARCHAR2(10),
AGE NUMBER(3) DEFAULT 20 CHECK(AGE>=20)
);
INSERT INTO TEST(ID,NAME) VALUES(3,'C') ;
INSERT INTO TEST VALUES(3,'C',D) ;

--19 4,D,15 삽입
INSERT INTO TEST VALUES(4,'D',15);

--DOMAIN : 영역, 범위
--WWW.NAVER.COM, WWW.KOPO.AC.KR
--도메인무결성 :  NOT NULL, NULL, DEFAULT, CHECK

--20 3번의 나이를 25세로 변결
SELECT * FROM TEST;

--UPDATE 테이블명 SET 속성명1=값1, 속성명2=값2, ... WHERE 조건
UPDATE TEST
SET AGE=25, NAME ='CC'
WHERE ID = 3;

--21
--SELECT  속성1, 속성2, ...
--FROM    테이블명1, 테이블명2, ...
--WHERE 검색조건 (AND/OR/NOT)
--GROUP BY 속성1, 속성2, ...      : 그룹 지어주기
--HAVING 그룹지을 때 조건(GROUP BY와 함께 사용)
--ORDER BY

--22 출판사별 도서수
SELECT PUBLISHER, COUNT(*)
FROM BOOK
GROUP BY PUBLISHER;

--23 출판사별 도서수(단, 출판사별 도서수가 2권 이상인 것 대상)
SELECT PUBLISHER, COUNT(*)
FROM BOOK
GROUP BY PUBLISHER
HAVING COUNT(*) >=2;

-- 23번을 출판사명 순으로 정렬, SELECT 문에 나오는 속성명 대신 ORDER BY 절에 번호 사용가능.
SELECT PUBLISHER, COUNT(*)
FROM BOOK
GROUP BY PUBLISHER
HAVING COUNT(*) >=2
ORDER BY PUBLISHER;

SELECT PUBLISHER, COUNT(*) AS "도서 수"
FROM BOOK
GROUP BY PUBLISHER
HAVING COUNT(*) >=2
ORDER BY 1;

SELECT PUBLISHER, COUNT(*) AS "도서 수"
FROM BOOK
GROUP BY PUBLISHER
HAVING COUNT(*) >=2
ORDER BY COUNT(*);

--25 정가가 10000원 이상인 도서를 대상으로 출판사별 도서수를 구하되 도서수가 2권 이상인 출판사의 도서수
SELECT PUBLISHER, COUNT(*)
FROM BOOK
WHERE PRICE>=10000
GROUP BY PUBLISHER
HAVING COUNT(*) >= 2
ORDER BY 2 DESC;

--26
CREATE TABLE BOOK2
AS SELECT * FROM BOOK;

SELECT * FROM BOOK2;

--27 값 다 지우기 + COMMIT: TRUNCATE FROM 테이블명;
TRUNCATE TABLE BOOK2;

SELECT * FROM BOOK2;

ROLLBACK;

--28 ALL 쓴것과 안쓴 것 -> 차이 없음 
SELECT PUBLISHER
FROM BOOK;

SELECT ALL PUBLISHER
FROM BOOK;

--29 DISTINCT :분명한[중복 제거]
SELECT DISTINCT PUBLISHER
FROM BOOK;

--30-1 중복 X
SELECT * FROM BOOK WHERE PUBLISHER='대한미디어'
UNION
SELECT * FROM BOOK WHERE PUBLISHER='나무수';

--30-2 중복 O
SELECT * FROM BOOK WHERE PUBLISHER='대한미디어'
UNION ALL
SELECT * FROM BOOK;

--31 두번째 글자가 '스'인 출판사 명
SELECT PUBLISHER
FROM BOOK
WHERE PUBLISHER LIKE '_스%';

--32 굿스포츠, 대한미디어 도서정보
SELECT *
FROM BOOK
WHERE PUBLISHER LIKE '굿스포츠' OR PUBLISHER LIKE'대한미디어';

SELECT *
FROM BOOK
WHERE PUBLISHER IN('굿스포츠','대한미디어');

--33 도서명에 축구가 들어있거나 가격이 20000원 이하인 도서정보
SELECT *
FROM BOOK
WHERE BOOKNAME LIKE '%축구%' OR PRICE <= 20000;

--34 도서가격 순, 가격이 같으면 이름 순 도서정보
SELECT *
FROM BOOK
ORDER BY PRICE,BOOKNAME;

--35 도서 가격 내림차순, 출판사 오름차순 도서정보
SELECT *
FROM BOOK
ORDER BY PRICE DESC, PUBLISHER;

--36 도서 총 판매액
SELECT SUM(SALEPRICE)
FROM ORDERS;

--37 판매 건수, 판매액 평균, 최고판매가, 최저판매가, 판매액 합계
SELECT COUNT(*), AVG(SALEPRICE), MAX(SALEPRICE), MIN(SALEPRICE), SUM(SALEPRICE)
FROM ORDERS;

--38 2번 고객이 주문한 도서정보
SELECT B.*
FROM ORDERS A JOIN BOOK B ON(B.BOOKID = A.BOOKID)
WHERE CUSTID=2;

--39 2번 고객이 주문한 주문금액 총액을 별칭을 사용해서 출력
SELECT SUM(SALEPRICE) AS "주문금액 총액"
FROM ORDERS
WHERE CUSTID=2;

--40 GROUP BY와 HAVING절 주의사항
-- 그룹함수(집계함수)와 함께 나오는 속성은 GROUP BY 사용해야함.
-- 도서별 판매건수
SELECT BOOKNAME, COUNT(*)
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID)
GROUP BY BOOKNAME;

--1-1 도서번호가 1인 도서의 이름
SELECT BOOKNAME
FROM BOOK
WHERE BOOKID=1;

--1-2 가격이 20,000원 이상인 도서의 이름
SELECT BOOKNAME
FROM BOOK
WHERE PRICE >= 20000;

--1-3 박지성의 총 구매액(박지성의 고객번호는 1번으로 놓고 작성)
SELECT SUM(B.SALEPRICE)
FROM CUSTOMER A JOIN ORDERS B ON(A.CUSTID=B.CUSTID)
WHERE A.CUSTID=1;

--1-4 박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성)
SELECT COUNT(*)
FROM CUSTOMER A JOIN ORDERS B ON(A.CUSTID=B.CUSTID)
WHERE A.CUSTID=1;

--2-1 마당서점의 도서의 총 개수
SELECT COUNT(*)
FROM BOOK;

--2-2 마당서점에 도서를 출고하는 출판사의 총 개수
SELECT COUNT(DISTINCT (PUBLISHER)) 
FROM BOOK;

--2-3 모든 고객의 이름, 주소
SELECT NAME, ADDRESS
FROM CUSTOMER;

--2-4 2014년 7월 4일~7월 7일 사이에 주문 받은 도서의 주문번호
SELECT ORDERID
FROM ORDERS
WHERE ORDERDATE BETWEEN '2014-07-04' AND '2014-07-07';

--2-5 2014년 7월 4일~7월 7일 사이에 주문 받은 도서를 제외한 도서의 주문번호
SELECT ORDERID
FROM ORDERS
WHERE NOT ORDERDATE BETWEEN '2014-07-04' AND '2014-07-07';

--2-6 성이 '김'씨인 고객의 이름과 주소
SELECT NAME, ADDRESS
FROM CUSTOMER
WHERE NAME LIKE '김%';

--2-7 성이 '김'씨이고 이름이 '아'로 끝나는 고객의 이름과 주소
SELECT NAME, ADDRESS
FROM CUSTOMER
WHERE NAME LIKE '김%아';

--41 고객별 주문액 합계와 주문건수를 출력하되 고객이름순으로
SELECT A.NAME, SUM(B.SALEPRICE), COUNT(*)
FROM CUSTOMER A JOIN ORDERS B ON(B.CUSTID = A.CUSTID)
GROUP BY A.NAME
ORDER BY A.NAME;

--42 고객명, 주문한 도서명, 판매가, 주문일

--43 도서정보, 주문정보 -CROSS JOIN
SELECT * FROM BOOK CROSS JOIN ORDERS;

SELECT * FROM BOOK CROSS JOIN CUSTOMER;
-- = 모든 경우의 수
SELECT * FROM BOOK, CUSTOMER;

--44 가격이 20000원인 도서를 주문한 고객의 이름과 도서명
SELECT NAME, BOOKNAME
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID) JOIN CUSTOMER C ON(B.CUSTID=C.CUSTID)
WHERE A.PRICE = 20000;

--45 도서를 주문한 고객의 이름과 전화번호
SELECT DISTINCT A.NAME, A.PHONE
FROM CUSTOMER A JOIN ORDERS B ON(A.CUSTID=B.CUSTID);

--홍길동 010-1111-2222
--홍길동 010-2222-3333
--SELECT DISTINCT NAME, PHONE = > 위의 두개는 나올 수 있다.

--46 도서를 구매하지 않은 고객정보 (LEFT OUTER JOIN) ORDERS 테이블의 값이 NULL인 것
SELECT A.*
FROM CUSTOMER A LEFT JOIN ORDERS B ON(A.CUSTID=B.CUSTID)
AND B.ORDERID IS NULL;

SELECT CUSTID FROM CUSTOMER
MINUS
SELECT CUSTID FROM ORDERS;

--47 판매되지 않은 도서 정보
SELECT A.*
FROM BOOK A LEFT JOIN ORDERS B ON(B.BOOKID = A.BOOKID)
WHERE B.ORDERID IS NULL;

--48 판매되지 않은 도서를 포함하여 도서정보 고객정보 주문정보
SELECT A.*, B.*, C.*
FROM BOOK A LEFT JOIN ORDERS B ON(B.BOOKID = A.BOOKID) JOIN CUSTOMER C ON(B.CUSTID=C.CUSTID);

--48-2
SELECT *
FROM BOOK A LEFT JOIN ORDERS B ON(B.BOOKID = A.BOOKID)
            LEFT JOIN CUSTOMER C ON(B.CUSTID=C.CUSTID);

-- 49

--50 최저가 도서명
SELECT BOOKNAME
FROM BOOK
WHERE PRICE =(SELECT MIN(PRICE) FROM BOOK);

--51 평균가 이상의 도서명
SELECT BOOKNAME
FROM BOOK
WHERE PRICE >=(SELECT AVG(PRICE) FROM BOOK);

--52 도서 구매한 고객명(JOIN)
SELECT DISTINCT NAME
FROM CUSTOMER A JOIN ORDERS B ON(B.CUSTID = A.CUSTID)
WHERE ORDERID IS NOT NULL;

--53 도서 구매한 고객명(SUB QUERY-부속질의)
SELECT NAME
FROM CUSTOMER
WHERE CUSTID IN (SELECT CUSTID FROM ORDERS);

--54 도서 구매 안한 고객명(SUB QUERY-부속질의)
SELECT NAME
FROM CUSTOMER
WHERE CUSTID NOT IN (SELECT CUSTID FROM ORDERS);



































