--11 SCOTT 접속 비번 : TIGER
-- 관리자가 없는 사원정보
SELECT * FROM EMP;
SELECT * FROM EMP
WHERE MGR IS NULL;
-- 사원테이블 구조
DESC EMP;

--EMPNO    NOT NULL NUMBER(4)    --사원번호
--ENAME             VARCHAR2(10) --사원명
--JOB               VARCHAR2(9)  --직업
--MGR               NUMBER(4)    --관리자번호
--HIREDATE          DATE         --입사일
--SAL               NUMBER(7,2)  --급여
--COMM              NUMBER(7,2)  --보너스
--DEPTNO            NUMBER(2)    --부서번호

--12 상급자가 있는 사원 정보
SELECT *
FROM EMP
WHERE MGR IS NOT NULL;

--13 보너스가 안 정해진 사원 정보
SELECT *
FROM EMP
WHERE COMM IS NULL;

--14 보너스 받는 사원 정보(사원의 수)
SELECT COUNT(*)
FROM EMP
WHERE COMM IS NOT NULL;

SELECT *
FROM EMP
WHERE COMM > 0;

SELECT COUNT(*)
FROM EMP
WHERE COMM > 0;

