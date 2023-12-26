--1 '�౸�� ����'��� ������ ���ǻ�� ����
SELECT PUBLISHER, PRICE, BOOKNAME FROM BOOK WHERE BOOKNAME = '�౸�� ����';

--2 ���ѹ̵�� ���ǻ翡�� ������ ������ ����
SELECT * FROM BOOK WHERE PUBLISHER = '���ѹ̵��';

--3 ������ 10000�� ������ ���� ����
SELECT * FROM BOOK WHERE PRICE<=10000;

--4 �迬�� ���� ��ȭ��ȣ
SELECT PHONE,NAME FROM CUSTOMER WHERE NAME='�迬��';

--5 �迬�� ���� �ּ�
SELECT ADDRESS, NAME FROM CUSTOMER WHERE NAME='�迬��';

--6 �迬��, ������ ���� �ּ�
SELECT ADDRESS, NAME FROM CUSTOMER WHERE NAME='������'OR NAME='�迬��';
SELECT ADDRESS, NAME FROM CUSTOMER WHERE NAME IN('������', '�迬��');

--7 ���� ������ 10000�� �̻��� ������� ���ǻ�
SELECT BOOKNAME, PUBLISHER, PRICE FROM BOOK WHERE PRICE>=10000;

--8 ���ǻ�� �˻� (DISTINCT: �ߺ� ����)
SELECT DISTINCT PUBLISHER FROM BOOK;

--9 ���ǻ�� �˻� ALL - ��������
SELECT PUBLISHER FROM BOOK;
SELECT ALL PUBLISHER FROM BOOK;

--10 ���ǻ������ �������� �˻�
SELECT * FROM BOOK ORDER BY PUBLISHER DESC;
--ASC : ��������(�⺻��), DESC : ��������
--���Ǿ��� ������ WHERE �Ⱦ�

--11 ���ǻ��, ���ݼ����� ��������
SELECT * FROM BOOK ORDER BY PUBLISHER, PRICE;

--12 ���ǻ��, ���ݼ�, ������� ��������
SELECT * FROM BOOK ORDER BY PUBLISHER, PRICE, BOOKNAME;

--13 ��� ���� ������ ���
SELECT * FROM BOOK;

--14 ������� ���� �˻�
SELECT BOOKNAME, PRICE FROM BOOK;

--15 ������� ���ǻ� �˻�
SELECT BOOKNAME, PUBLISHER FROM BOOK;

--16 ���ǻ���� �ѹ����� �˻�
SELECT DISTINCT PUBLISHER FROM BOOK;

--17 ���ѹ̵�� ���ǻ��� ������ �˻�
SELECT BOOKNAME,PUBLISHER FROM BOOK WHERE PUBLISHER='���ѹ̵��';

--18 ������ 20000�� �̻��� ������� ���� 
SELECT BOOKNAME, PRICE FROM BOOK WHERE PRICE>=20000;

--19 ���������� 10000�� �̻� 20000�� ���� ���� ����
SELECT * FROM BOOK WHERE PRICE>=10000 AND PRICE<=20000;
SELECT * FROM BOOK WHERE PRICE BETWEEN 10000 AND 20000;

--20 ���������� 10000, 20000, 30000 �� ���� ���� 
SELECT * FROM BOOK WHERE PRICE IN(10000,20000,30000);

--21 ���� ������ NULL�� ���� ���� �˻�
SELECT * FROM BOOK WHERE PRICE IS NULL;
SELECT * FROM BOOK WHERE PRICE IS NOT NULL;

--22 ���� ������ 20000 �̸��� ���� ���� 
SELECT * FROM BOOK WHERE PRICE<20000;

--23 ���� ������ 20000�̸��̰� �������� �౸�� ������ ���� ����
SELECT * FROM BOOK WHERE PRICE<20000 AND BOOKNAME='�౸�� ����';

--24 ���� ������ 20000�̸��̰ų� �������� �౸�� ������ ���� ����
SELECT * FROM BOOK WHERE PRICE<20000 OR BOOKNAME='�౸�� ����';

--25 ���ǻ簡 �½������� �Ｚ�翡�� ���� ������� ���ǻ� �˻�
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE PUBLISHER IN('�½�����','�Ｚ��');

--26  ���ǻ簡 �½������� �Ｚ���� �ƴ� ���ǻ翡�� ���� ������� ���ǻ� �˻�
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE NOT PUBLISHER IN('�½�����','�Ｚ��');
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE PUBLISHER NOT IN('�½�����','�Ｚ��');

--27 ���� ������ ������ ���� ���� �˻�
SELECT * FROM BOOK WHERE PRICE IS NOT NULL;

--28 ���� ������ 10000�̸�, 20000 �ʰ� ���� ���� �˻�
SELECT * FROM BOOK WHERE PRICE<10000 OR PRICE>20000;

--29 ���� ������ 20000���� ���� ���� �˻�
SELECT * FROM BOOK WHERE PRICE=20000;

--30 ���� ������ 20000���� �ƴ� ���� ���� �˻�
SELECT * FROM BOOK WHERE NOT PRICE=20000;
SELECT * FROM BOOK WHERE PRICE!=20000;

--31 '�౸�� ����'�� �Ⱓ�� ���ǻ�
SELECT PUBLISHER, BOOKNAME FROM BOOK WHERE BOOKNAME='�౸�� ����';

--32 ������ '�౸'�� ���Ե� ���ǻ�
SELECT PUBLISHER, BOOKNAME FROM BOOK WHERE BOOKNAME LIKE '%�౸%';

--33 ���� ��¥ ���� Ȯ��
SELECT SYSDATE FROM DUAL;

--34 �������� '�౸'�� �����ϴ� ������ ���
SELECT BOOKNAME FROM BOOK WHERE BOOKNAME LIKE '�౸%';

--35 ���ǻ� ���� '����'���� �����ϴ� ���ǻ翡�� �Ⱓ�� ������� ���ǻ��
SELECT BOOKNAME, PUBLISHER FROM BOOK WHERE PUBLISHER LIKE '����%';

--37 �������� �ι�° ���ڰ� '��'�� ������ �˻�
SELECT BOOKNAME FROM BOOK WHERE SUBSTR(BOOKNAME, 2, 1)='��';
SELECT BOOKNAME FROM BOOK WHERE BOOKNAME LIKE '_��%';

--38 �౸�� ���� ���� �� ������ 20000�� �̻��� ��������
SELECT * FROM BOOK WHERE BOOKNAME LIKE '%�౸%' AND PRICE>=20000;
