--1 ������ ������ �������� �˻� 
SELECT *
FROM BOOK
ORDER BY BOOKNAME;

--2 ���ǻ� ������ �˻��ϵ� ���� ���ǻ��̸� ������ ������ �������� �˻�
SELECT *
FROM BOOK
ORDER BY PUBLISHER, BOOKNAME;

--3 ���� ���� ������ �˻��ϵ� ���� �����̸� ������ ������ �˻�
SELECT *
FROM BOOK
ORDER BY PRICE, BOOKNAME;

--4 ������ ������ ������������ �˻�
SELECT *
FROM BOOK
ORDER BY PRICE DESC;

--5 ������ ������ ������������ �˻��ϵ� ���� ������ ������ ���ǻ�� ������ ��������
SELECT *
FROM BOOK
ORDER BY PRICE DESC, PUBLISHER; 

--6 ���� �ֹ��� ������ �Ǹž��� ���ϼ���
SELECT SALEPRICE
FROM ORDERS;

--7 ���� �ֹ��� ������ �� �Ǹž��� ���ϼ���
SELECT SUM(SALEPRICE) "�� �Ǹž�"
FROM ORDERS;

--8 �ֹ� ������ ��� �Ǹž��� ���ϼ���
SELECT AVG(SALEPRICE) "��� �Ǹž�"
FROM ORDERS;

--9 �ֹ� ���� �� �ְ� �ǸŰ��� ���ϼ���
SELECT MAX(SALEPRICE) "�ְ� �ǸŰ�"
FROM ORDERS;

--10 �ֹ� ���� �� ���� �ǸŰ��� ���ϼ���
SELECT MIN(SALEPRICE) "���� �ǸŰ�"
FROM ORDERS;

--11 2�� �迬�� ���� �ֹ��� ������ �� �Ǹž�
SELECT SUM(SALEPRICE) "�� �Ǹž�"
FROM ORDERS
WHERE CUSTID=2;

--12 ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ��� ���ϼ���.
SELECT SUM(SALEPRICE) "�� �Ǹž�", AVG(SALEPRICE) "��հ�", MIN(SALEPRICE) "������", MAX(SALEPRICE) "�ְ�"
FROM ORDERS;

--13 ���� �ֹ� �Ǽ� 
SELECT COUNT(*) AS "�Ǽ�"
FROM ORDERS;

--14 ���� ��
SELECT COUNT(*) AS "���� ��"
FROM CUSTOMER;

--15 ������ ��
SELECT COUNT(*) AS "������ ��"
FROM BOOK;

--16 ���ǻ��� ��
SELECT COUNT(DISTINCT PUBLISHER) AS "���ǻ��� ��"
FROM BOOK;

--17 ���������� 13000���� ������ ��
SELECT COUNT(*)
FROM BOOK
WHERE PRICE = 13000;

--18 ���� ������ 10000 �̻� 20000 ������ ������ �Ǽ� �˻�
SELECT COUNT(*)
FROM BOOK
WHERE PRICE >= 10000 AND PRICE <= 20000;

--19 ������ �౸�� �� ������ �� �˻�
SELECT COUNT(*)
FROM BOOK
WHERE BOOKNAME LIKE '%�౸%';

--20 ���ѹ̵��� �Ⱓ�� ������ �� �˻� 
SELECT COUNT(*)
FROM BOOK
WHERE PUBLISHER LIKE '���ѹ̵��';

--21 ������ ��� �ִ� ���� �� �˻� 
SELECT COUNT(*)
FROM CUSTOMER
WHERE ADDRESS LIKE '%����%';

--22 1�� ������ ������ ���� �� �˻�
SELECT COUNT(*)
FROM ORDERS
WHERE BOOKID = 1;

--23 10000�� �̻��� ������ �� �˻� 
SELECT COUNT(*)
FROM BOOK
WHERE PRICE >= 10000;

--24 å �̸��� �౸�� ������ å�� ����
SELECT PRICE AS "�౸�� ���� ����"
FROM BOOK
WHERE BOOKNAME LIKE '�౸�� ����';

--25 ���ǻ纰�� �� ���� å�� �Ⱓ������?
SELECT PUBLISHER ���ǻ�, COUNT(*) �Ǽ�
FROM BOOK
GROUP BY PUBLISHER;

--26 ���ǻ纰�� �� ���� å�� �Ⱓ������? ��, 2�� �̻� �Ⱓ�� ���ǻ� ������!
SELECT PUBLISHER ���ǻ�, COUNT(*) �Ǽ�
FROM BOOK
GROUP BY PUBLISHER HAVING COUNT(*) >= 2;

--27 3�� ������ ���ǻ� �̸� ������
SELECT PUBLISHER ���ǻ�, COUNT(*) �Ǽ�
FROM BOOK
GROUP BY PUBLISHER HAVING COUNT(*) >= 2 ORDER BY PUBLISHER;

--28 4�� ���� �� ���� ������ 10000�� �̻��� �͸�
SELECT PUBLISHER ���ǻ�, COUNT(*) �Ǽ�
FROM BOOK
WHERE PRICE >= 10000 GROUP BY PUBLISHER HAVING COUNT(*) >= 2 ORDER BY PUBLISHER;

--29 ���� �̸��� �ּ� ���
SELECT NAME, ADDRESS
FROM CUSTOMER;

--30 ���� �̸��� �ּҿ� ��ȭ��ȣ
SELECT NAME, ADDRESS, PHONE
FROM CUSTOMER;

--31 �ֹ���ȣ, ����ȣ, ������ȣ ���
SELECT ORDERID, CUSTID, BOOKID
FROM ORDERS;

--32 ������, ����, ���ǻ�
SELECT BOOKNAME, PRICE, PUBLISHER
FROM BOOK;

--33 ����ȣ, ������ȣ, �ǸŰ�, �ֹ���
SELECT CUSTID, BOOKID, SALEPRICE, ORDERDATE
FROM ORDERS;

--34 ���ǻ�, ������
SELECT PUBLISHER, BOOKNAME
FROM BOOK;

--35 �ֹ��� ������ȣ
SELECT BOOKID
FROM ORDERS;

--36 �ֹ��� ������ȣ(�ߺ�����)
SELECT DISTINCT BOOKID
FROM ORDERS;

--37 ������ȣ�� 5������ 8�������� ���� ����
SELECT *
FROM BOOK
WHERE BOOKID >= 5 AND BOOKID <= 8;

SELECT *
FROM BOOK
WHERE BOOKID BETWEEN 5 AND 8;

--38 ������ȣ�� 1~4����, 7~10������ ���� ����
SELECT *
FROM BOOK
WHERE BOOKID BETWEEN 1 AND 4 OR BOOKID BETWEEN 7 AND 10; 

SELECT * 
FROM BOOK 
WHERE BOOKID NOT IN(5,6);

--39 ������ 8000�̻��� ������� ���ǻ�
SELECT BOOKNAME, PUBLISHER
FROM BOOK
WHERE PRICE >= 8000;

--40 ����ȣ�� 3,4�� ����� ����ȣ, ��ȭ��ȣ
SELECT NAME, CUSTID, PHONE
FROM CUSTOMER
WHERE CUSTID IN(3,4);

--41 �ǸŰ��� 10000�� �̻��� ������ȣ, �ǸŰ�, �ֹ���
SELECT BOOKID, SALEPRICE, ORDERDATE
FROM ORDERS
WHERE SALEPRICE >= 10000;

--42 ���ǻ�� ��������� �ܾ �� ��������
SELECT *
FROM BOOK
WHERE PUBLISHER LIKE '%������%';

--43 ���ǻ�� �ι�° ���ڰ� �� �̶�� ���ڰ� �� ������, ���ǻ��, ����
SELECT BOOKNAME, PUBLISHER, PRICE
FROM BOOK
WHERE PUBLISHER LIKE '_��%';

--44 �������� �߱��� �����ϴ� ��������
SELECT *
FROM BOOK
WHERE BOOKNAME LIKE '�߱�%';

--45 �½������� ���ѹ̵�� ���ǻ翡�� �Ⱓ�� ��������
SELECT *
FROM BOOK
WHERE PUBLISHER IN('�½�����', '���ѹ̵��');

--46 �½��������� �Ⱓ�߰�, ���������� 10000�� �̸��� ��������
SELECT *
FROM BOOK
WHERE PUBLISHER LIKE '�½�����' AND PRICE < 10000;

--47 ���ǻ������� �������� �˻�
SELECT *
FROM BOOK
ORDER BY PUBLISHER;

--48 ���ݼ����� �ϵ�, ���� �����̸� ������ ������ �������� �˻�
SELECT *
FROM BOOK
ORDER BY PRICE, PUBLISHER;

--49 ���ݿ������� �����ϵ�, ���� �����̸� ���ǻ� ������ �������� �˻�
SELECT *
FROM BOOK
ORDER BY PRICE DESC, PUBLISHER;
 
--50 �ֹ����� ��� ������ �ǸŰ��� �հ踦 ����ϵ� ��Ī�� ���(�Ѹ���)
SELECT SUM(SALEPRICE) AS "�Ѹ���"
FROM ORDERS;
 
--51 ������ ��
SELECT COUNT(*)
FROM BOOK;

--52 ���� ��
SELECT COUNT(*)
FROM CUSTOMER;

--53 �ֹ����� �Ǽ�
SELECT COUNT(*)
FROM ORDERS;

--54 �ֹ����� ������ȣ
SELECT BOOKID
FROM ORDERS;
 
--55 �ֹ����� ������ȣ(�ߺ�����)
SELECT DISTINCT BOOKID
FROM ORDERS;
 
--56 1�� å�� �ֹ��� ����ȣ
SELECT CUSTID
FROM ORDERS
WHERE BOOKID = 1;
 
--57 �� �Ǹž�, �� �ǸŰǼ�, ���� �ǸŰ�, �ְ� �ǸŰ�
SELECT SUM(SALEPRICE) AS "�� �Ǹž�", COUNT(*) AS "�� �ǸŰǼ�", MIN(SALEPRICE) AS "���� �ǸŰ�", MAX(SALEPRICE) AS "�ְ� �ǸŰ�"
FROM ORDERS;

--58 ���� �ֹ��ݾ� �հ�
SELECT CUSTID, SUM(SALEPRICE) AS "�� �ֹ��ݾ�"
FROM ORDERS
GROUP BY CUSTID;
 
--59 �ֹ���¥�� �ֹ��ݾ� �հ�, �ֹ��Ǽ�
SELECT ORDERDATE, SUM(SALEPRICE), COUNT(*)
FROM ORDERS
GROUP BY ORDERDATE;
 
--60 �ǸŰ����� 5000�� �̻��� ������ ������ ���� ���� ���� �ֹ����� ��
SELECT CUSTID, COUNT(*)
FROM ORDERS
WHERE SALEPRICE >= 5000 GROUP BY CUSTID;
 
--61 37�� ������ �߰��� �� ���̻� ������ ����
SELECT CUSTID, COUNT(*)
FROM ORDERS
WHERE SALEPRICE >= 5000 GROUP BY CUSTID HAVING COUNT(*)>=2;

--62 ���ǻ纰 �Ⱓ�� ������
SELECT PUBLISHER ���ǻ�, COUNT(*) ������
FROM BOOK
GROUP BY PUBLISHER;

--63 ���� ���ŰǼ�
SELECT CUSTID ��, COUNT(*)
FROM ORDERS
GROUP BY CUSTID;
 
--64 ������ �ֹ��Ǽ�
SELECT BOOKID ����, COUNT(*)
FROM ORDERS
GROUP BY BOOKID;

--65 �ֹ���¥�� 14�� 7�� 1�� �ֹ�����
SELECT *
FROM ORDERS
WHERE ORDERDATE = '2014/07/01';

--66 �ֹ���¥�� 14�� 7�� 1��~3�� �ֹ�����
SELECT *
FROM ORDERS
WHERE ORDERDATE BETWEEN '2014/07/01' AND '2014/07/03';
