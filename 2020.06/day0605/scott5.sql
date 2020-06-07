--day0605
SELECT * FROM emp ORDER BY deptno;

--GROUP BY
SELECT deptno, 
round(AVG(sal)) AS AVERAGE_SAL,
MAX(sal) AS MAX,
COUNT(*) AS EMPLOYEE_NO
FROM emp
GROUP BY deptno
ORDER BY deptno;

--column-Name must be a column from the current scope of the query
--SELECT ename, avg(sal)
--FROM emp
--GROUP BY deptno;


--SelectItems in the SelectExpression with a GROUP BY clause must contain only aggregates or grouping columns.
SELECT deptno, job, sum(sal), max(sal), count(*)
FROM emp
GROUP BY deptno, job --though it is unlikely to group column twice
ORDER BY deptno;

--DEPTNO    JOB         SUM(SAL)    MAX(SAL)    COUNT
--10        CLERK       1300        1300        1
--10        MANAGER     2450        2450        1
--...
--30        SALESMAN    5600        1600        3


--HAVING
--conditioned grouping
--you can't use WHERE to condition GROUP BY Clause

SELECT deptno, sum(sal), max(sal), count(*)
FROM emp
WHERE sal >= 2000
GROUP BY deptno;

--you can use WHERE before grouping columns


SELECT deptno, sum(sal), max(sal), count(*)
FROM emp
WHERE sal >= 2000 --conditioning SELECT
GROUP BY deptno
HAVING count(*) >= 2; --conditioning GROUP BY



--joining tables

--selecting two tables without defining any condition
--is called cross join, or Cartesian product
--selected_column_no = table1_column_no * table2_column_no

SELECT * FROM emp, dept
ORDER BY empno;
--EMPNO ENAME   JOB     MGR     HIREDATE    SAL     COMM    DEPTNO  DEPTNO_1    DNAME       LOC
--7369  SMITH   CLERK   7902    ...                                 10          ACCOUNTING  NEW YORK
--7369  SMITH   CLERK   7902    ...                                 30          SALES       CHICAGO
--7369  SMITH   CLERK   7902    ...                                 20          RESEARCH    DALLAS
--7369  SMITH   CLERK   7902    ...                                 50          OPERATION   BOSTON
--...


--conditional join
--equi join, inner join
SELECT e.*, d.dname, d.loc
FROM emp e, dept d
WHERE e.deptno = d.deptno
ORDER BY e.deptno;


--non-equi join
SELECT *
    FROM emp e, salgrade s
WHERE e.sal BETWEEN s.losal AND s.hisal;


--self join
--don't have to copy table
SELECT e1.*, e2.ename as manager_name, e2.job
FROM emp e1, emp e2 --copy of a table
WHERE e1.mgr = e2.empno;

--doesn't return KING who doesn't have a boss

--outer join
--left outer join
--employee(E2.empno(+)) who doesn't have a manager(E1.mgr)
SELECT E1.EMPNO, E1.ENAME, NVL2(E1.MGR, TO_CHAR(E1.MGR), 'X') AS MGR,
NVL2(E2.EMPNO, TO_CHAR(E1.MGR), 'X') AS MGR_EMPNO,
NVL2(E2.ENAME, TO_CHAR(E1.MGR), 'X') AS MRG_ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR = E2.EMPNO(+)
ORDER BY E1.EMPNO;

--right outer join
--manager(E1.mgr(+)) who doesn't have a employee(E2.empno)
SELECT E1.EMPNO, E1.ENAME, NVL(E1.MGR, 0),
E2.EMPNO AS MGR_EMPNO,
E2.ENAME AS MRG_ENAME
FROM EMP E1, EMP E2
WHERE E1.MGR(+) = E2.EMPNO
ORDER BY E1.EMPNO;

