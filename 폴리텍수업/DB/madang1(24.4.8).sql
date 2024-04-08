INSERT INTO BOOK(BOOKID, BOOKNAME, PRICE, PUBLISHER)
      SELECT BOOKID, BOOKNAME, PRICE, PUBLISHER
      FROM IMPORTED_BOOK;
      
      SELECT * FROM BOOK;
      
UPDATE BOOK SET PRICE = PRICE * 1.1
WHERE BOOKID >= 21; -- IN(21,22)

SELECT * FROM BOOK;

--1 ���Լ����� ���ǻ縦 POLYTECH���� ����, 20%���� �λ�
UPDATE BOOK SET PUBLISHER = 'POLYTECH', PRICE = PRICE * 1.2
WHERE BOOKID IN(21,22);

--2 ���Լ��� ����(21,22)
DELETE FROM BOOK WHERE BOOKID IN(21,22);

SELECT * FROM BOOK;


--3 BOOK2���̺� ���� Ȯ��
SELECT * FROM BOOK2;

--4 3�� ������ ������ 10�� ������ �������� ��ȯ
UPDATE BOOK2 SET PRICE = (SELECT PRICE
                          FROM BOOK2
                          WHERE BOOKID=10 )
WHERE BOOKID = 3;  

--5 CUSTOMER2 ����

SELECT * FROM CUSTOMER2;

--6 �߽ż��� ��ȭ��ȣ�� NULL�� ����
UPDATE CUSTOMER2 SET PHONE = NULL WHERE NAME= '�߽ż�';
SELECT * FROM CUSTOMER2;

--7 ORDERS2 ����
CREATE TABLE ORDERS2 AS SELECT * FROM ORDERS;

SELECT * FROM ORDERS2;

SELECT * FROM ORDERS;

--8 �ֹ����� 1�Ͼ� ��� ���� ��Ű��
UPDATE ORDERS2 SET ORDERDATE = ORDERDATE + 1;

--9 �ֹ����� 1�Ͼ� ��� ���� ��Ű��
UPDATE ORDERS2 SET ORDERDATE = ORDERDATE - 1;

DELETE FROM CUSTOMER;

DELETE FROM ORDERS;

DELETE FROM CUSTOMER;

ROLLBACK;

--���� 1-1 �������� ������ ������ ���ǻ�� ���� ���ǻ翡�� ������ ������ ���� �̸�
SELECT NAME
FROM CUSTOMER C, BOOK B, ORDERS O
WHERE C.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID
AND NAME != '������'
AND PUBLISHER IN(SELECT PUBLISHER
                    FROM CUSTOMER C, BOOK B, ORDERS O
                    WHERE C.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID AND NAME = '������');

--1-1-1 �������� ������ ������ ���ǻ�(CUSTOMER, BOOK, ORDERS)
SELECT PUBLISHER
FROM CUSTOMER C, BOOK B, ORDERS O
WHERE C.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID AND NAME = '������';

SELECT PUBLISHER
FROM BOOK A JOIN ORDERS B ON(B.BOOKID = A.BOOKID) JOIN CUSTOMER C ON(B.CUSTID=C.CUSTID)
WHERE C.NAME = '������';

--���� 1-2 �� �� �̻��� ���� �ٸ� ���ǻ翡�� ������ ������ ���� �̸�

--1-2-1 ���� ������ ������ ���ǻ� ��

SELECT NAME 
FROM CUSTOMER C1
WHERE 2 <= (SELECT COUNT(DISTINCT PUBLISHER)
            FROM CUSTOMER C2, BOOK B, ORDERS O
            WHERE C2.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID AND C2.NAME = C1.NAME);

--1-2-2 ���� ������ ������ ���ǻ� ���� 2���� ����

SELECT NAME
FROM CUSTOMER C1
WHERE 2 <= (SELECT COUNT(DISTINCT PUBLISHER)
            FROM CUSTOMER C2, ORDERS O , BOOK B
            WHERE C2.CUSTID=O.CUSTID AND B.BOOKID=O.BOOKID
            AND C2.NAME=C1.NAME);

--���� 1-3 ��ü ���� 30% �̻��� ������ ����
--1-3-1 ��ü ���� ��
SELECT COUNT(*)
FROM CUSTOMER;
--1-3-2 ��ü ���� ���� 30%
SELECT COUNT(*) *0.3
FROM CUSTOMER;
--1-3-3 �� ������ �ֹ��� ������ ��
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

--���� 2-1 ���ο� ����('������ ����', '���ѹ̵��', 10000��)�� ���缭���� �԰�Ǿ���. 
INSERT INTO BOOK VALUES('������ ����','���ѹ̵��',10000);
--SQL ����: ORA-00947: not enough values
DESC BOOK;
--BOOKID NOT NULL
INSERT INTO BOOK VALUES(10, '������ ����','���ѹ̵��',10000);
--SQL ����: ORA-00001: unique constraint (MADANG.SYS_C006997) violated
--00001. 00000 -  "unique constraint (%s.%s) violated"
INSERT INTO BOOK VALUES(11, '������ ����','���ѹ̵��',10000);
INSERT INTO BOOK(BOOKID, BOOKNAME, PRICE, PUBLISHER) VALUES(12, '������ ����', 10000, '���ѹ̵��');
--������ �� �� ��� �ʿ��� �����Ͱ� �� �ִ��� ã�ƺ���. BOOKID ���� �ȵ�, �ʼ� ����

--���� 2-2 '�Ｚ��'���� ������ ������ �����ؾ� �Ѵ�.
DELETE FROM BOOK WHERE PUBLISHER = '�Ｚ��';
--'�̻�̵��'���� ������ ������ �����ؾ� �Ѵ�. ������ �� �� ��� ������ �����غ���.
DELETE FROM BOOK WHERE PUBLISHER = '�̻�̵��';
--SQL ����: ORA-02292: integrity constraint (MADANG.SYS_C007001) violated - child record found
--02292. 00000 - "integrity constraint (%s.%s) violated - child record found"
--*Cause:    attempted to delete a parent key value that had a foreign
--           dependency.
--*Action:   delete dependencies first then parent or disable constraint.

SELECT BOOKID FROM BOOK WHERE PUBLISHER = '�̻�̵��';

--2-4 ���ǻ� '���ѹ̵��'��'�������ǻ�'�� �̸��� �ٲپ���.

UPDATE BOOK SET PUBLISHER='�������ǻ�' WHERE PUBLISHER='���ѹ̵��';
ROLLBACK;

--10
SELECT CUSTID AS ����ȣ, ROUND(SUM(SALEPRICE)/COUNT(*), -2) AS "�ֹ��ݾ� ���"
FROM ORDERS
GROUP BY CUSTID;

--11  �ƽ�Ű�ڵ� 68�� �ش��ϴ� ��(����)�� ����
SELECT CHR(68)
FROM DUAL;

--12 �� ������ ����
SELECT CONCAT('����','����')
FROM DUAL;

--13 ù�ڸ� �빮��
SELECT INITCAP('THE soap')
FROM DUAL;

--14 �ҹ��ڷ�
SELECT LOWER('MR.SCOTT')
FROM DUAL;

--15 Page 1�� 10ĭ�� �ۼ��ϵ� ������ *�� ä��
SELECT LPAD('Page 1', 10, '*')
FROM DUAL;

--15-2 15���� 15ĭ�� �ְ� �������� #���� ä�� => ****Page 1#####
SELECT RPAD(LPAD('Page 1', 10, '*'),15,'#')
FROM DUAL;

--16 ���� �ڸ��� <>=�� �ƴ� ���� ������ STOP
SELECT LTRIM('<===>BROWNING<==>','<>=')
FROM DUAL;

--17 ��ü��Ű��( J -> BL)
SELECT REPLACE('JACK and JUE','J','BL')
FROM DUAL;

--18 ������ �ڸ��� <>= �� �ƴ� ���� ������ STOP
SELECT RTRIM('<===>BROWNING<==>','<>=1')
FROM DUAL;

--19 ���ڿ� �Ϻμ���, ���ڿ� �� 3��°���� 4�� ���� -->CDEF
SELECT  SUBSTR('ABCDEFG',3,4)
FROM DUAL;

--19-2 ������ 4���� ����
SELECT SUBSTR('ABCDEFG',-4)
FROM DUAL;

--19-3 3��° ���� ���� ��� ����
SELECT SUBSTR('ABCDEFG',3)
FROM DUAL;

--20 ������ �ش繮�� ����, ���ڿ��� ���� ���� �� ���� ���� --> >BROWNING<
SELECT TRIM('=' FROM '===>BROWNING<==')
FROM DUAL;

SELECT TRIM(' BROWING ')
FROM DUAL;
--21 �빮�ڷ� ����
SELECT UPPER('mr.scott')
FROM DUAL;

--22 ��� ���ĺ� ���ڸ� �ƽ�Ű�ڵ尪���� ����
SELECT ASCII('D')
FROM DUAL;

--23 ���ڿ� �� 3��° ���� �ι�° ������ OR�� ��ġ
SELECT INSTR('CORPORATE FLOOR','OR',3,2)
FROM DUAL;

--23-2 ���ڿ� �� ù��° ������ OR�� ��ġ
SELECT INSTR('CORPORATE FLOOR','OR')
FROM DUAL;

--23-3 ���ڿ� �� 3��° ���� ù��° ������ OR�� ��ġ
SELECT INSTR('CORPORATE FLOOR','OR',3)
FROM DUAL;

--24 �������� �߱��� ���Ե� ������ �󱸷� ������ �� ���� ����� ���̽ÿ�.
SELECT REPLACE(BOOKNAME, '�߱�','��')
FROM BOOK;
--25 �������� �߱��� ���Ե� ������ �󱸷� ����
UPDATE BOOK SET BOOKNAME = REPLACE(BOOKNAME, '�߱�', '��');

SELECT * FROM BOOK;

--26
SELECT BOOKNAME, LENGTH(BOOKNAME), LENGTHB(BOOKNAME)
FROM BOOK
WHERE PUBLISHER='�½�����';

--27 ���缭�� �� �� ���� �� ���� ����� ������� ���� �ο���
--�������:FROM, GROUP BY, SELECT
SELECT SUBSTR(NAME, 1, 1) AS ��, COUNT(*)
FROM CUSTOMER
GROUP BY SUBSTR(NAME,1,1);

--28 2020-09-14
SELECT TO_DATE('2020-09-14', 'YYYY-MM-DD')
FROM DUAL;

--29--�������� : ���ڿ�+1?
SELECT '2020-09-14', '2020-09-14' +1
FROM DUAL;

--30 2020-09-14, �� ������
SELECT TO_DATE('2020-09-14', 'YYYY-MM-DD'), TO_DATE('2020-09-14','YYYY-MM-DD')+1
FROM DUAL;

--31 ������ ��¥�� ���� �ϸ� ��� : 04�� 08��
SELECT TO_CHAR(SYSDATE,'MM/DD')
FROM DUAL;

--: 04�� 08��
SELECT TO_CHAR(SYSDATE,'MM"�� "DD"�� " HH"�� " MI"�� "SS"��" AM')
FROM DUAL;

--32 ���� ��¥, �δ� �� ��¥ : ADD_MONTHS(��¥, ����)
SELECT SYSDATE, ADD_MONTHS(SYSDATE,2)
FROM DUAL;

--33 ���� 12���� �� ��¥
SELECT '1994/3/4', ADD_MONTHS('1994/3/4',12)
FROM DUAL;

--34 �̹� ���� ������ �� : LAST_DAY()
SELECT LAST_DAY(SYSDATE)
FROM DUAL;

--35���� �� ��������
SELECT LAST_DAY('1994/03/04')
FROM DUAL;



















