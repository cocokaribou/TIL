SELECT * FROM emp;
SELECT EMPNO,ENAME,SAL,DEPTNO FROM emp WHERE SAL>1000 AND DEPTNO=30;

--annual income (SAL * 12 + COMM)
SELECT ENAME, SAL, SAL*12+COMM AS ANNSAL, COMM
FROM EMP;

SELECT * FROM emp WHERE SAL ^= 3000;
SELECT * FROM emp WHERE SAL != 3000;
SELECT * FROM emp WHERE JOB <> 'SALESMAN';
--SELECT * FROM emp WHERE NOT JOB = 'SALESMAN';


--same logic, different expression
SELECT * FROM emp WHERE NOT (deptno = 30 AND sal >=1000);
SELECT * FROM emp WHERE (deptno != 30 OR sal<1000);

--IN operator
SELECT * FROM emp WHERE JOB IN('CLERK', 'PRESIDENT', 'ANALYST');

--instead of using IN operator, use index
SELECT * FROM emp 
WHERE JOB = 'CLERK'
OR JOB = 'PRESIDENT'
OR JOB = 'ANALYST';

