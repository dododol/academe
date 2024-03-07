--1 '�౸�� ����'��� ������ ���ǻ�� ����
SELECT PUBLISHER, PRICE
FROM BOOK
WHERE BOOKNAME LIKE '�౸�� ����';

--2 ���ѹ̵�� ���ǻ翡�� ������ ������ ����
SELECT *
FROM BOOK
WHERE PUBLISHER LIKE '���ѹ̵��';

--3 ������ 10000�� ������ ���� ����
SELECT *
FROM BOOK
WHERE PRICE <= 10000;

--4 �迬�� ���� ��ȭ��ȣ
SELECT PHONE
FROM CUSTOMER
WHERE NAME LIKE '�迬��';

--5 �迬�� ���� �ּ�
SELECT ADDRESS
FROM CUSTOMER
WHERE NAME LIKE '�迬��';

--6 �迬��, ������ ���� �ּ�
SELECT ADDRESS
FROM CUSTOMER
WHERE NAME LIKE '�迬��'
  OR NAME LIKE '������';

--7 ���� ������ 10000�� �̻��� ������� ���ǻ�
SELECT BOOKNAME, PUBLISHER
FROM BOOK
WHERE PRICE >= 10000;

--8 ���ǻ�� �˻� (DISTINCT: �ߺ� ����)
SELECT DISTINCT PUBLISHER
FROM BOOK;

--9 ���ǻ�� �˻� ALL - ��������
SELECT ALL PUBLISHER
FROM BOOK;

--10 ���ǻ������ �������� �˻�
SELECT *
FROM BOOK
ORDER BY PUBLISHER;

--11 ���ǻ��, ���ݼ����� ��������
SELECT * 
FROM BOOK
ORDER BY PUBLISHER, PRICE;

--12 ���ǻ��, ���ݼ�, ������� ��������
SELECT *
FROM BOOK
ORDER BY PUBLISHER, PRICE, BOOKNAME;

--13 ��� ���� ������ ���
SELECT *
FROM BOOK;

--14 ������� ���� �˻�
SELECT BOOKNAME, PRICE
FROM BOOK;

--15 ������� ���ǻ� �˻�
SELECT BOOKNAME, PUBLISHER
FROM BOOK;

--16 ���ǻ���� �ѹ����� �˻�
SELECT DISTINCT PUBLISHER
FROM BOOK;

--17 ���ѹ̵�� ���ǻ��� ������ �˻�
SELECT BOOKNAME
FROM BOOK
WHERE PUBLISHER LIKE '���ѹ̵��';

--18 ������ 20000�� �̻��� ������� ���� 
SELECT BOOKNAME, PRICE
FROM BOOK
WHERE PRICE >= 20000;

--19 ���������� 10000�� �̻� 20000�� ���� ���� ����
SELECT *
FROM BOOK
WHERE PRICE >= 10000 AND PRICE <= 20000;

SELECT *
FROM BOOK
WHERE PRICE BETWEEN 10000 AND 20000;

--20 ���������� 10000, 20000, 30000 �� ���� ���� 
SELECT *
FROM BOOK
WHERE PRICE = 10000 OR PRICE = 20000 OR PRICE = 30000;

SELECT *
FROM BOOK
WHERE PRICE IN(10000,20000,30000);

--21 ���� ������ NULL�� ���� ���� �˻�
SELECT *
FROM BOOK
WHERE PRICE IS NULL;

--22 ���� ������ 20000 �̸��� ���� ���� 
SELECT *
FROM BOOK
WHERE PRICE < 20000;

--23 ���� ������ 20000�̸��̰� �������� �౸�� ������ ���� ����
SELECT *
FROM BOOK
WHERE PRICE < 20000 AND BOOKNAME LIKE '�౸�� ����';

--24 ���� ������ 20000�̸��̰ų� �������� �౸�� ������ ���� ����
SELECT *
FROM BOOK
WHERE PRICE < 20000 OR BOOKNAME LIKE '�౸�� ����';

--25 ���ǻ簡 �½������� �Ｚ�翡�� ���� ������� ���ǻ� �˻�
SELECT BOOKNAME, PUBLISHER
FROM BOOK
WHERE PUBLISHER IN('�½�����','�Ｚ��');

--26  ���ǻ簡 �½������� �Ｚ���� �ƴ� ���ǻ翡�� ���� ������� ���ǻ� �˻�
SELECT BOOKNAME, PUBLISHER
FROM BOOK
WHERE PUBLISHER NOT IN('�½�����','�Ｚ��');

--27 ���� ������ ������ ���� ���� �˻�
SELECT *
FROM BOOK
WHERE PRICE IS NOT NULL;

--28 ���� ������ 10000�̸�, 20000 �ʰ� ���� ���� �˻�
SELECT *
FROM BOOK
WHERE PRICE < 10000 OR PRICE > 20000;

--29 ���� ������ 20000���� ���� ���� �˻�
SELECT *
FROM BOOK
WHERE PRICE = 20000;

--30 ���� ������ 20000���� �ƴ� ���� ���� �˻�
SELECT *
FROM BOOK
WHERE PRICE != 20000;

--31 '�౸�� ����'�� �Ⱓ�� ���ǻ�
SELECT PUBLISHER
FROM BOOK
WHERE BOOKNAME LIKE '�౸�� ����';

--32 ������ '�౸'�� ���Ե� ���ǻ�
SELECT PUBLISHER
FROM BOOK
WHERE BOOKNAME LIKE '%�౸%';

--33 ���� ��¥ ���� Ȯ��
SELECT SYSDATE
FROM DUAL;

--34 �������� '�౸'�� �����ϴ� ������ ���
SELECT BOOKNAME
FROM BOOK
WHERE BOOKNAME LIKE '�౸%';

--35 ���ǻ� ���� '����'���� �����ϴ� ���ǻ翡�� �Ⱓ�� ������� ���ǻ��
SELECT BOOKNAME, PUBLISHER
FROM BOOK
WHERE PUBLISHER LIKE '����%';

--36 �������� �ι�° ���ڰ� '��'�� ������ �˻�
SELECT BOOKNAME
FROM BOOK
WHERE BOOKNAME LIKE '_��%';

--37 �౸�� ���� ���� �� ������ 20000�� �̻��� ��������
SELECT *
FROM BOOK
WHERE BOOKNAME LIKE '%�౸%' AND PRICE >= 20000;
