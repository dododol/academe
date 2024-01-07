--����1

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


--����2

--1 ������ ������ �������� �˻� 
SELECT * FROM BOOK ORDER BY BOOKNAME;

--2 ���ǻ� ������ �˻��ϵ� ���� ���ǻ��̸� ������ ������ �������� �˻�
SELECT * FROM BOOK ORDER BY PUBLISHER ,BOOKNAME;

--3 ���� ���� ������ �˻��ϵ� ���� �����̸� ������ ������ �˻�
SELECT * FROM BOOK ORDER BY PRICE, BOOKNAME;

--4 ������ ������ ������������ �˻�
SELECT * FROM BOOK ORDER BY PRICE DESC;

--5 ������ ������ ������������ �˻��ϵ� ���� ������ ������ ���ǻ�� ������ ��������
SELECT * FROM BOOK ORDER BY PRICE DESC, PUBLISHER ASC;

--6 ���� �ֹ��� ������ �Ǹž��� ���ϼ���


--7 ���� �ֹ��� ������ �� �Ǹž��� ���ϼ���


--8 �ֹ� ������ ��� �Ǹž��� ���ϼ���


--9 �ֹ� ���� �� �ְ� �ǸŰ��� ���ϼ���


--10 �ֹ� ���� �� ���� �ǸŰ��� ���ϼ���


--11 2�� �迬�� ���� �ֹ��� ������ �� �Ǹž�


--12 ���� �ֹ��� ������ �� �Ǹž�, ��հ�, ������, �ְ��� ���ϼ���.


--13 ���� �ֹ� �Ǽ� 


--14 ���� ��


--15 ������ ��


--16 ���ǻ��� ��


--17 ���������� 13000���� ������ ��


--18 ���� ������ 10000 �̻� 20000 ������ ������ �Ǽ� �˻�


--19 ������ �౸�� �� ������ �� �˻�


--20 ���ѹ̵��� �Ⱓ�� ������ �� �˻� 


--21 ������ ��� �ִ� ���� �� �˻� 


--22 1�� ������ ������ ���� �� �˻�


--23 10000�� �̻��� ������ �� �˻� 


--24 å �̸��� �౸�� ������ å�� ����


--25 ���ǻ纰�� �� ���� å�� �Ⱓ������?


--26 ���ǻ纰�� �� ���� å�� �Ⱓ������? ��, 2�� �̻� �Ⱓ�� ���ǻ� ������!


--27 3�� ������ ���ǻ� �̸� ������


--28 4�� ���� �� ���� ������ 10000�� �̻��� �͸�


--29 ���� �̸��� �ּ� ���


--30 ���� �̸��� �ּҿ� ��ȭ��ȣ


--31 �ֹ���ȣ, ����ȣ, ������ȣ ���


--32 ������, ����, ���ǻ�


--33 ����ȣ, ������ȣ, �ǸŰ�, �ֹ���


--34 ���ǻ�, ������


--35 �ֹ��� ������ȣ


--36 �ֹ��� ������ȣ(�ߺ�����)


--37 ������ȣ�� 5������ 8�������� ���� ����


--38 ������ȣ�� 1~4����, 7~10������ ���� ����


--39 ������ 8000�̻��� ������� ���ǻ�


--40 ����ȣ�� 3,4�� ����� ����ȣ, ��ȭ��ȣ


--41 �ǸŰ��� 10000�� �̻��� ������ȣ, �ǸŰ�, �ֹ���


--42 ���ǻ�� ��������� �ܾ �� ��������


--43 ���ǻ�� �ι�° ���ڰ� �� �̶�� ���ڰ� �� ������, ���ǻ��, ����


--44 �������� �߱��� �����ϴ� ��������


--45 �½������� ���ѹ̵�� ���ǻ翡�� �Ⱓ�� ��������


--46 �½��������� �Ⱓ�߰�, ���������� 10000�� �̸��� ��������


--47 ���ǻ������� �������� �˻�


--48 ���ݼ����� �ϵ�, ���� �����̸� ������ ������ �������� �˻�


--49 ���ݿ������� �����ϵ�, ���� �����̸� ���ǻ� ������ �������� �˻�

 
--50 �ֹ����� ��� ������ �ǸŰ��� �հ踦 ����ϵ� ��Ī�� ���(�Ѹ���)

 
--51 ������ ��


--52 ���� ��


--53 �ֹ����� �Ǽ�


--54 �ֹ����� ������ȣ

 
--55 �ֹ����� ������ȣ(�ߺ�����)

 
--56 1�� å�� �ֹ��� ����ȣ

 
--57 �� �Ǹž�, �� �ǸŰǼ�, ���� �ǸŰ�, �ְ� �ǸŰ�


--58 ���� �ֹ��ݾ� �հ�

 
--59 �ֹ���¥�� �ֹ��ݾ� �հ�, �ֹ��Ǽ�

 
--60 �ǸŰ����� 5000�� �̻��� ������ ������ ���� ���� ���� �ֹ����� ��

 
--61 37�� ������ �߰��� �� ���̻� ������ ����


--62 ���ǻ纰 �Ⱓ�� ������

 
--63 ���� ���ŰǼ�

 
--64 ������ �ֹ��Ǽ�


--65 �ֹ���¥�� 14�� 7�� 1�� �ֹ�����


--66 �ֹ���¥�� 14�� 7�� 1��~3�� �ֹ�����





