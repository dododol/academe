--1 �����ϴ�. DESCRIBE
DESC BOOK;
DESCRIBE BOOK;
--BOOKID    NOT NULL NUMBER(2)    ������ȣ
--BOOKNAME           VARCHAR2(40) ������
--PUBLISHER          VARCHAR2(40) ���ǻ�
--PRICE              NUMBER(8)    ����(����)

--2 �����̺� ����
DESC CUSTOMER;
--CUSTID  NOT NULL NUMBER(2)    ����ȣ    
--NAME             VARCHAR2(40) ����
--ADDRESS          VARCHAR2(50) �ּ�
--PHONE            VARCHAR2(20) ��

--3 �ֹ����̺� ����
DESC ORDERS;
--ORDERID   NOT NULL NUMBER(2)  �ֹ���ȣ 
--CUSTID             NUMBER(2)  ����ȣ
--BOOKID             NUMBER(2)  ������ȣ
--SALEPRICE          NUMBER(8)  �ǸŰ�
--ORDERDATE          DATE       �ֹ���¥

--4 ��������
SELECT *
FROM BOOK;

--5 ������ ��
SELECT COUNT(*)
FROM BOOK;

--6 �� ����
SELECT *
FROM CUSTOMER;

--7 ���� ��
SELECT COUNT(*)
FROM CUSTOMER;

--8 �ֹ� ����
SELECT *
FROM ORDERS;

--9 �ǸŰ����� 10000�� �̻��� ���� �Ǹŵ� �Ǽ�
SELECT COUNT(*)
FROM ORDERS
WHERE SALEPRICE >= 10000;

--10 2014�� 7�� 4�� �ֹ� �Ǽ�
SELECT COUNT(*)
FROM ORDERS
WHERE ORDERDATE = '2014/07/04';

--11 2014�� 7�� �ֹ� �Ǽ�
SELECT COUNT(*)
FROM ORDERS
WHERE ORDERDATE BETWEEN '2014/07/04'
  AND '2014/07/31';
  
--BETWEEN A AND B

-- ���� + E Ž����, ���� ��Ʈ��ũ Ŭ��, �ּ�:\\professor-pc Ŭ��/�л�����/db
--12 Ű : 
-- �ĺ�Ű: ���ϼ�, �ּҼ�
-- �⺻Ű: �ĺ�Ű �� ���õ� Ű, ����: �ߺ�x, nullx
-- ��üŰ: �ĺ�Ű �� �⺻Ű ��
-- ����Ű: ���ϼ��� O �ּҼ� x
-- �ܷ�Ű: �ٸ� ���̺��� �⺻Ű�� ����, �ߺ�O, null O, ���� ���� ������ �� x
-- �븮Ű: �߰�

--13 ���Ἲ ��������
-- ������ ���Ἲ: �ϰ���, ��Ȯ��
-- 1. ������(domain:����) ���Ἲ : ������ ����(����, ����, ��¥ ��), ��(null/not null), �⺻��(default), üũ(check)
-- 2. ��ü ���Ἲ : �⺻Ű(pk)�� �ߺ�x, null x
-- 3. ���� ���Ἲ : �����ϴ� ���� �����ΰ� ���ƾ���. �ܷ�Ű�� ����, 

--14 1�� ������ �� �� �ֹ�
SELECT COUNT(*)
FROM ORDERS
WHERE BOOKID = 1;

--15 �ֹ��� ���� ��ȣ
SELECT CUSTID
FROM ORDERS;

SELECT DISTINCT CUSTID
FROM ORDERS;

--16 ���ѹα��� ��� �� ����
SELECT *
FROM CUSTOMER
WHERE ADDRESS LIKE '%���ѹα�%';
 
--17 �Ǹŵ� ������ȣ(ORDERS, BOOKID)
SELECT BOOKID
FROM ORDERS;
 
--18 �Ǹŵ� ������ȣ (�ߺ�����)
SELECT DISTINCT BOOKID
FROM ORDERS;

--19 ����(BOOK)�� �ֹ�(ORDERS)����
SELECT *
FROM BOOK, ORDERS;
 
--19-0 CROSS JOIN
SELECT *
FROM BOOK,ORDERS
WHERE BOOK.BOOKID = ORDERS.BOOKID;

--19-1 ALIAS : ��Ī   "comma join" �Ǵ� "cross join"
SELECT *
FROM BOOK A,ORDERS B
WHERE A.BOOKID = B.BOOKID;
 
--19-2 INNER ��������
SELECT *
FROM BOOK A INNER JOIN ORDERS B ON(B.BOOKID = A.BOOKID);

SELECT *
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID);

--19-3 ON�� �ƴ� USING ���
SELECT *
FROM BOOK A JOIN ORDERS B USING(BOOKID);

--19-4 NATURAL JOIN
SELECT *
FROM BOOK A NATURAL JOIN ORDERS B;

--20 SELECTION( SELECT ������ ���� �����ϰ� WHERE ������ ���ϴ� ���� �����Ѵ�)
SELECT *
FROM BOOK
WHERE BOOKID=1 OR BOOKID=2 OR BOOKID=3;


--21 BOOKID, BOOKNAME, PRICE => BOOK -> PROJECTION
SELECT BOOKID, BOOKNAME, PRICE
FROM BOOK;

--22 8,000�� ������ ������ �˻��Ͻÿ�.
SELECT *
FROM BOOK
WHERE PRICE <= 8000;

--23 8000�� �����̸鼭 ������ȣ 3�� �̻�
SELECT *
FROM BOOK
WHERE PRICE <= 8000 AND BOOKID >= 3;

--24 ���� �̸�, �ּ�, ��
SELECT NAME, ADDRESS, PHONE
FROM CUSTOMER;

--25 ������ȣ, ������, ����, �ֹ���ȣ, ����ȣ, �ǸŰ�
SELECT A.BOOKID, A.BOOKNAME, A.PRICE, B.ORDERID, B.CUSTID, B.SALEPRICE
FROM BOOK A, ORDERS B
WHERE A.BOOKID = B.BOOKID;

-- ON(�Ҽ� ��������. A.BOOKID, B.BOOKID)
SELECT A.BOOKID, A.BOOKNAME, A.PRICE, B.ORDERID, B.CUSTID, B.SALEPRICE
FROM BOOK A INNER JOIN ORDERS B ON(A.BOOKID = B.BOOKID);

--B.BOOKID(X)����Ӽ� �Բ� ���, �Ҽ� X, B.BOOKNAME(O)
SELECT BOOKID, BOOKNAME, PRICE, ORDERID, CUSTID, SALEPRICE
FROM BOOK A INNER JOIN ORDERS B USING(BOOKID);

-- �ڿ�����(NATURAL JOIN)
SELECT BOOKID, BOOKNAME, PRICE, ORDERID, CUSTID, SALEPRICE
FROM BOOK A NATURAL JOIN ORDERS B;

--26 �ֹ��� ���� ����
--�ֹ��� ��: ORDERS
--�� ����: CUSTOMER
SELECT A.*
FROM ORDERS A , CUSTOMER B
WHERE A.CUSTID=B.CUSTID;

--27 �Ǹŵ� ������ȣ
SELECT BOOKID
FROM ORDERS;

--28 �Ǹŵ� ������ ���� ��
SELECT COUNT(DISTINCT BOOKID)
FROM ORDERS;

--29 �ֹ��� ����
SELECT NAME
FROM ORDERS A JOIN CUSTOMER B ON(B.CUSTID = A.CUSTID);


--30 ���̸� �� ������
SELECT *
FROM CUSTOMER
ORDER BY NAME;

--GROUP BY ��ƺ���
--HAVING ��ƺ��� �Ӽ�(?)
--ORDER BY ����

--31 �ǸŰ��� �� �ֹ�����
SELECT *
FROM ORDERS
ORDER BY SALEPRICE;

--32 ���ǻ� �� ��������
SELECT *
FROM BOOK
ORDER BY PUBLISHER;

--33 ���ǻ� ��, �������� �������� ASC(ASCEND), DESC(DESCEND)
SELECT *
FROM BOOK
ORDER BY PRICE DESC;

--34 �ֹ��� ���� �̸��� ��ȭ��ȣ
SELECT NAME, PHONE
FROM ORDERS A JOIN CUSTOMER B ON(A.CUSTID=B.CUSTID);

--35 ����ȣ
SELECT CUSTID
FROM CUSTOMER;

--36 �ֹ��� ����ȣ
SELECT DISTINCT CUSTID
FROM ORDERS;

--37 �ֹ��� �� �� ����ȣ
SELECT CUSTID
FROM CUSTOMER
MINUS
SELECT CUSTID
FROM ORDERS;

--38 ��, �ֹ����� ��� �ϵ� ��� �� ������ �� ��������
SELECT *
FROM CUSTOMER A LEFT OUTER JOIN ORDERS B ON(A.CUSTID=B.CUSTID);

-- OUTER�� �ִ°Ͱ� ���°Ϳ� ���̰� ����.
SELECT *
FROM CUSTOMER A LEFT JOIN ORDERS B ON(A.CUSTID=B.CUSTID);

--39 �ֹ� ���� ����ȣ(LEFT OUTER JOIN ���)
SELECT A.CUSTID
FROM CUSTOMER A LEFT JOIN ORDERS B ON(A.CUSTID=B.CUSTID)
WHERE B.CUSTID IS NULL;

--40 ������ȣ
SELECT BOOKID
FROM BOOK;

--41 �Ǹŵ� ������ȣ
SELECT DISTINCT BOOKID
FROM ORDERS;

--42 �ǸŰ� �ȵ� ������ȣ(MINUS)
SELECT BOOKID
FROM BOOK
MINUS
SELECT BOOKID
FROM ORDERS;

--43 �ǸŰ� �ȵ� ������ȣ(LEFT OUTER JOIN)
SELECT A.BOOKID
FROM BOOK A LEFT JOIN ORDERS B ON(A.BOOKID=B.BOOKID)
WHERE B.BOOKID IS NULL;




