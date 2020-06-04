--day0604
--SCOTT schema is a small oracle database schema
--that allows you to play around with several tables
--to see whether the scott schema is installed in your database,
--you can log in as the sysdba and issue this query:
--SELECT * FROM DBA_USERS WHERE USERNAME = 'SCOTT'
SELECT * FROM all_tables WHERE USER = 'scott';

SELECT * FROM EMP;

--ORDER BY column_name
--Ascending order(default)
SELECT * FROM EMP ORDER BY SAL;

--ORDER BY column_name DESC;
--Descending order
SELECT * FROM EMP ORDER BY SAL DESC;

SELECT ENAME FROM EMP ORDER BY ENAME;

--in ascending order, (null) data sort to the bottom
--null is treated as a very large value by oracle   
SELECT COMM FROM EMP ORDER BY COMM;
--COMM
--0
--300
--500
--1400
--(null)
--..

SELECT * FROM EMP ORDER BY DEPTNO, SAL;
--SAL  DEPTNO
--1300  10
--2450  10
--5000  10
--..    20


--TO_CHAR(datetime, frmt)
SELECT TO_CHAR(SYSDATE, 'dd/mm/yyyy hh12:mi:ss') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'dd/mm/yyyy AM hh12:mi:ss') FROM DUAL;
SELECT TO_CHAR(SYSDATE, 'yyyy/mm/dd hh24:mi:ss') FROM DUAL;

SELECT HIREDATE, TO_CHAR(HIREDATE, 'YYYY/MM/DD day') AS HIREDATE_2 FROM EMP;


--TO_DATE(char, frmt)
SELECT ENAME, HIREDATE FROM EMP WHERE HIREDATE > TO_DATE('19810601', 'YYYY/MM/DD')
ORDER BY HIREDATE, ENAME;


--handling (null)
SELECT * FROM EMP WHERE COMM IS NULL;
SELECT * FROM EMP WHERE COMM IS NOT NULL;


--you cannot operate (null) with other data
SELECT ENAME, SAL, COMM, SAL+COMM FROM EMP;
--SAL   COMM    SAL+COMM
--800   (null)  (null)


--NVL(expr1, expr2)
--if expr1 is null, return expr2
--if expr1 is not null, return expr1

SELECT SAL, COMM, SAL+COMM, NVL(SAL, 0), SAL+NVL(COMM,0)
FROM EMP;
--convert (null) to 0 so you can operate with numbers

--SAL   COMM    SAL+COMM    NVL(SAL,0)  SAL+NVL(COMM,0)
--800   null    null        800         800
--2975  null    null        2975        2975


--NVL2(expr1, expr2, expr3)
--if expr1 is not null, return expr2
--if expr1 is null, return expr3


SELECT ENAME, COMM, NVL2(COMM, 'O','X') FROM EMP;
--ENAME COMM    NVL2(COMM,'O','X')
--SMITH null    X
--ALLEN 300     O

SELECT ENAME, SAL, COMM, NVL2(COMM, SAL+COMM, SAL) FROM EMP;
--ENAME SAL     COMM    NVL2(COMM,SAL+COMM, SAL)
--SMITH 800     null    800
--ALLEN 160     300     1900


--DECODE(column_name, serach, result)

SELECT ENAME, JOB, SAL, 
DECODE(JOB,
        'MANAGER', SAL*1.1,
        'SALESMAN', SAL*1.05,
        'ANALYST', SAL,
        SAL*1.03) AS UPSAL --default
FROM EMP;


--CASE expr WHEN comparison_expr THEN return_expr ELSE else_expr

SELECT ENAME, JOB, SAL, CASE JOB
                            WHEN 'MANAGER' THEN SAL*1.1
                            WHEN 'SALESMAN' THEN SAL*1.05
                            WHEN 'ANALYST' THEN SAL
                            ELSE SAL*1.03
                        END AS UPSAL
FROM EMP;


--aggregate functions
--SUM(expr)
SELECT SUM(SAL) FROM EMP;

--COUNT(expr)
SELECT COUNT(SAL) FROM EMP;

SELECT MAX(SAL), MIN(SAL), AVG(SAL), SUM(SAL) FROM EMP;
--.... AVG
--.... 2077.083333333333333333333333333333333333

SELECT MAX(SAL), MIN(SAL), ROUND(AVG(SAL),2), SUM(SAL) FROM EMP;
--.... AVG
--.... 2077.08

SELECT MAX(SAL), MIN(SAL), TRUNC(AVG(SAL),2), SUM(SAL) FROM EMP;
--.... AVG
--.... 2077.08


--"not a single-group group function"
--SELECT SUM(SAL), ENAME FROM EMP;


--add and count salaries of employees whoese EMPNO is over 7800
SELECT SUM(SAL), COUNT(SAL) FROM EMP WHERE EMPNO > 7800;
SELECT SUM(SAL), COUNT(*) FROM EMP WHERE EMPNO > 7800;
SELECT SUM(SAL), COUNT(0) FROM EMP WHERE EMPNO > 7800;


--aggregate functions are commonly used with the GROUP BY clause
--in a SELECT STATEMENT
--GROUP BY
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO ORDER BY DEPTNO ;
--DEPTNO    SUM(SAL)
--10        8750
--20        6775
--30        9400

--without GROUP BY
--"not a single-group group function"
SELECT DEPTNO, SUM(SAL) FROM EMP;

SELECT HIREDATE, COUNT(*) FROM EMP GROUP BY HIREDATE;