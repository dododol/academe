--11 SCOTT ���� ��� : TIGER
-- �����ڰ� ���� �������
SELECT * FROM EMP;
SELECT * FROM EMP
WHERE MGR IS NULL;
-- ������̺� ����
DESC EMP;

--EMPNO    NOT NULL NUMBER(4)    --�����ȣ
--ENAME             VARCHAR2(10) --�����
--JOB               VARCHAR2(9)  --����
--MGR               NUMBER(4)    --�����ڹ�ȣ
--HIREDATE          DATE         --�Ի���
--SAL               NUMBER(7,2)  --�޿�
--COMM              NUMBER(7,2)  --���ʽ�
--DEPTNO            NUMBER(2)    --�μ���ȣ

--12 ����ڰ� �ִ� ��� ����
SELECT *
FROM EMP
WHERE MGR IS NOT NULL;

--13 ���ʽ��� �� ������ ��� ����
SELECT *
FROM EMP
WHERE COMM IS NULL;

--14 ���ʽ� �޴� ��� ����(����� ��)
SELECT COUNT(*)
FROM EMP
WHERE COMM IS NOT NULL;

SELECT *
FROM EMP
WHERE COMM > 0;

SELECT COUNT(*)
FROM EMP
WHERE COMM > 0;

