INSERT INTO BOOK(BOOKID, BOOKNAME, PRICE, PUBLISHER)
      SELECT BOOKID, BOOKNAME, PRICE, PUBLISHER
      FROM IMPORTED_BOOK;
      
      SELECT * FROM BOOK;
      
UPDATE BOOK SET PRICE = PRICE * 1.1
WHERE BOOKID >= 21; -- IN(21,22)

SELECT * FROM BOOK;

--1 수입서적의 출판사를 POLYTECH으로 수정, 20%가격 인상
UPDATE BOOK SET PUBLISHER = 'POLYTECH', PRICE = PRICE * 1.2
WHERE BOOKID IN(21,22);

--2 수입서적 삭제(21,22)
DELETE FROM BOOK WHERE BOOKID IN(21,22);

SELECT * FROM BOOK;


--3 BOOK2테이블 내용 확인
SELECT * FROM BOOK2;

--4 3번 도서의 가격을 10번 도서의 가격으로 변환
UPDATE BOOK2 SET PRICE = (SELECT PRICE
                          FROM BOOK2
                          WHERE BOOKID=10 )
WHERE BOOKID = 3;  

--5 CUSTOMER2 생성

SELECT * FROM CUSTOMER2;

--6 추신수의 전화번호를 NULL로 수정
UPDATE CUSTOMER2 SET PHONE = NULL WHERE NAME= '추신수';
SELECT * FROM CUSTOMER2;

--7 ORDERS2 생성
CREATE TABLE ORDERS2 AS SELECT * FROM ORDERS;

SELECT * FROM ORDERS2;

SELECT * FROM ORDERS;

--8 주문일을 1일씩 모두 증가 시키기
UPDATE ORDERS2 SET ORDERDATE = ORDERDATE + 1;

--9 주문일을 1일씩 모두 감소 시키기
UPDATE ORDERS2 SET ORDERDATE = ORDERDATE - 1;

DELETE FROM CUSTOMER;

DELETE FROM ORDERS;

DELETE FROM CUSTOMER;

ROLLBACK;

--연습 1-1 박지성이 구매한 도서의 출판사와 같은 출판사에서 도서를 구매한 고객의 이름
SELECT NAME
FROM CUSTOMER C, BOOK B, ORDERS O
WHERE C.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID
AND NAME != '박지성'
AND PUBLISHER IN(SELECT PUBLISHER
                    FROM CUSTOMER C, BOOK B, ORDERS O
                    WHERE C.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID AND NAME = '박지성');

--1-1-1 박지성이 구매한 도서의 출판사(CUSTOMER, BOOK, ORDERS)
SELECT PUBLISHER
FROM CUSTOMER C, BOOK B, ORDERS O
WHERE C.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID AND NAME = '박지성';

SELECT PUBLISHER
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID) JOIN CUSTOMER C ON(B.CUSTID=C.CUSTID)
WHERE C.NAME = '박지성';

--연습 1-2 두 개 이상의 서로 다른 출판사에서 도서를 구매한 고객의 이름

--1-2-1 고객이 구매한 도서의 출판사 수

SELECT NAME 
FROM CUSTOMER C1
WHERE 2 <= (SELECT COUNT(DISTINCT PUBLISHER)
            FROM CUSTOMER C2, BOOK B, ORDERS O
            WHERE C2.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID AND C2.NAME = C1.NAME);

--1-2-2 고객이 구매한 도서의 출판사 수가 2개인 고객명

SELECT NAME
FROM CUSTOMER C1
WHERE 2 <= (SELECT COUNT(DISTINCT PUBLISHER)
            FROM CUSTOMER C2, ORDERS O , BOOK B
            WHERE C2.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID
            AND C2.NAME=C1.NAME);

--연습 1-3 전체 고객의 30% 이상이 구매한 도서
--1-3-1 전체 고객의 수
SELECT COUNT(*)
FROM CUSTOMER;
--1-3-2 전체 고객의 수의 30%
SELECT COUNT(*) *0.3
FROM CUSTOMER;
--1-3-3 각 도서가 주문된 도서의 수
SELECT BOOKID, COUNT(*)
FROM ORDERS
GROUP BY BOOKID;

--
SELECT BOOKNAME 
FROM BOOK B
WHERE ((SELECT COUNT(BOOKID) FROM ORDERS O
        WHERE B.BOOKID=O.BOOKID) >= 0.3 * (SELECT COUNT(*) FROM CUSTOMER));

--
SELECT BOOKNAME
FROM BOOK B, ORDERS O
WHERE B.BOOKID = O.BOOKID
GROUP BY BOOKNAME
HAVING COUNT(*) >= 0.3 * (SELECT COUNT(*) FROM CUSTOMER);

--연습 2-1 새로운 도서('스포츠 세계', '대한미디어', 10000원)이 마당서점에 입고되었다. 
INSERT INTO BOOK VALUES('스포츠 세계','대한미디어',10000);
--SQL 오류: ORA-00947: not enough values
DESC BOOK;
--BOOKID NOT NULL
INSERT INTO BOOK VALUES(10, '스포츠 세계','대한미디어',10000);
--SQL 오류: ORA-00001: unique constraint (MADANG.SYS_C006997) violated
--00001. 00000 -  "unique constraint (%s.%s) violated"
INSERT INTO BOOK VALUES(11, '스포츠 세계','대한미디어',10000);
INSERT INTO BOOK(BOOKID, BOOKNAME, PRICE, PUBLISHER) VALUES(12, '스포츠 세계', 10000, '대한미디어');
--삽입이 안 될 경우 필요한 데이터가 더 있는지 찾아보자. BOOKID 생략 안됨, 필수 사항

--연습 2-2 '삼성당'에서 출판한 도서를 삭제해야 한다.
DELETE FROM BOOK WHERE PUBLISHER = '삼성당';
--'이상미디어'에서 출판한 도서를 삭제해야 한다. 삭제가 안 될 경우 원인을 생각해보자.
DELETE FROM BOOK WHERE PUBLISHER = '이상미디어';
--SQL 오류: ORA-02292: integrity constraint (MADANG.SYS_C007001) violated - child record found
--02292. 00000 - "integrity constraint (%s.%s) violated - child record found"
--*Cause:    attempted to delete a parent key value that had a foreign
--           dependency.
--*Action:   delete dependencies first then parent or disable constraint.

SELECT BOOKID FROM BOOK WHERE PUBLISHER = '이상미디어';

--2-4 출판사 '대한미디어'가'대한출판사'로 이름을 바꾸었다.

UPDATE BOOK SET PUBLISHER='대한출판사' WHERE PUBLISHER='대한미디어';
ROLLBACK;

--10
SELECT CUSTID AS 고객번호, ROUND(SUM(SALEPRICE)/COUNT(*), -2) AS "주문금액 평균"
FROM ORDERS
GROUP BY CUSTID;

--11  아스키코드 68에 해당하는 값(문자)가 나옴
SELECT CHR(68)
FROM DUAL;

--12 두 문자의 결합
SELECT CONCAT('마당','서점')
FROM DUAL;

--13 첫자만 대문자
SELECT INITCAP('THE soap')
FROM DUAL;

--14 소문자로
SELECT LOWER('MR.SCOTT')
FROM DUAL;

--15 Page 1을 10칸에 작성하되 왼쪽은 *로 채움
SELECT LPAD('Page 1', 10, '*')
FROM DUAL;

--15-2 15번을 15칸에 넣고 오른쪽을 #으로 채움 => ****Page 1#####
SELECT RPAD(LPAD('Page 1', 10, '*'),15,'#')
FROM DUAL;

--16 왼쪽 자르기 <>=가 아닌 문자 나오면 STOP
SELECT LTRIM('<===>BROWNING<==>','<>=')
FROM DUAL;

--17 대체시키기( J -> BL)
SELECT REPLACE('JACK and JUE','J','BL')
FROM DUAL;

--18 오른쪽 자르기 <>= 가 아닌 문자 나오면 STOP
SELECT RTRIM('<===>BROWNING<==>','<>=1')
FROM DUAL;

--19 문자열 일부선택, 문자열 중 3번째부터 4개 추출 -->CDEF
SELECT  SUBSTR('ABCDEFG',3,4)
FROM DUAL;

--19-2 오른쪽 4글자 추출
SELECT SUBSTR('ABCDEFG',-4)
FROM DUAL;

--19-3 3번째 글자 이후 모두 추출
SELECT SUBSTR('ABCDEFG',3)
FROM DUAL;

--20 양쪽의 해당문자 삭제, 문자열만 사용시 양쪽 빈 문자 삭제 --> >BROWNING<
SELECT TRIM('=' FROM '===>BROWNING<==')
FROM DUAL;

SELECT TRIM(' BROWING ')
FROM DUAL;
--21 대문자로 변경
SELECT UPPER('mr.scott')
FROM DUAL;

--22 대상 알파벳 문자를 아스키코드값으로 변경
SELECT ASCII('D')
FROM DUAL;

--23 문자열 주 3번째 이후 두번째 나오는 OR의 위치
SELECT INSTR('CORPORATE FLOOR','OR',3,2)
FROM DUAL;

--23-2 문자열 중 첫번째 나오는 OR의 위치
SELECT INSTR('CORPORATE FLOOR','OR')
FROM DUAL;

--23-3 문자열 중 3번째 이후 첫번째 나오는 OR의 위치
SELECT INSTR('CORPORATE FLOOR','OR',3)
FROM DUAL;

--24 도서제목에 야구가 포함된 도서를 농구로 변경한 후 도서 목록을 보이시오.
SELECT REPLACE(BOOKNAME, '야구','농구')
FROM BOOK;
--25 도서제목에 야구가 포함된 도서를 농구로 변경
UPDATE BOOK SET BOOKNAME = REPLACE(BOOKNAME, '야구', '농구');

SELECT * FROM BOOK;

--26
SELECT BOOKNAME, LENGTH(BOOKNAME), LENGTHB(BOOKNAME)
FROM BOOK
WHERE PUBLISHER='굿스포츠';

--27 마당서점 고객 중 같은 성 가진 사람이 몇명인지 성별 인원수
--실행순서:FROM, GROUP BY, SELECT
SELECT SUBSTR(NAME, 1, 1) AS 성, COUNT(*)
FROM CUSTOMER
GROUP BY SUBSTR(NAME,1,1);

--28 2020-09-14
SELECT TO_DATE('2020-09-14', 'YYYY-MM-DD')
FROM DUAL;

--29--오류발행 : 문자열+1?
SELECT '2020-09-14', '2020-09-14' +1
FROM DUAL;

--30 2020-09-14, 그 다음날
SELECT TO_DATE('2020-09-14', 'YYYY-MM-DD'), TO_DATE('2020-09-14','YYYY-MM-DD')+1
FROM DUAL;

--31 오늘의 날짜를 월과 일만 출력 : 04월 08일
SELECT TO_CHAR(SYSDATE,'MM/DD')
FROM DUAL;

--: 04월 08일
SELECT TO_CHAR(SYSDATE,'MM"월 "DD"일 " HH"시 " MI"분 "SS"초" AM')
FROM DUAL;

--32 오늘 날짜, 두달 뒤 날짜 : ADD_MONTHS(날짜, 숫자)
SELECT SYSDATE, ADD_MONTHS(SYSDATE,2)
FROM DUAL;

--33 생일 12개월 뒤 날짜
SELECT '1994/3/4', ADD_MONTHS('1994/3/4',12)
FROM DUAL;

--34 이번 달의 마지막 날 : LAST_DAY()
SELECT LAST_DAY(SYSDATE)
FROM DUAL;

--35생일 달 마지막날
SELECT LAST_DAY('1994/03/04')
FROM DUAL;



















