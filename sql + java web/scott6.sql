--day0608

--salary higher than Jones'

SELECT *
FROM emp
WHERE sal > 2975;

SELECT *
FROM emp
WHERE ename = 'JONES';

--subquery

SELECT *
FROM emp
WHERE sal > (SELECT sal
    FROM emp
    WHERE ename = 'JONES');

--using subqueries in WHERE Clause
--you can't use ORDER BY within a subquery


--single-row subquery

SELECT HIREDATE
FROM EMP
WHERE ENAME = 'MILLER';

SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE<(SELECT HIREDATE
            FROM EMP
            WHERE ENAME = 'MILLER')
ORDER BY HIREDATE;


--aggregate function in subquery

SELECT E.EMPNO, E.ENAME, E.JOB, E.SAL, D.DEPTNO, D.DNAME, D.LOC
FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DEPTNO
    AND E.DEPTNO = 20
    AND E.SAL > (SELECT AVG(SAL) FROM EMP);
    

--multiple-row subquery

--returning highest salary of each department(grouping)
SELECT MAX(SAL)
    FROM EMP
    GROUP BY DEPTNO;
--MAX(SAL)
--2850
--3000
--5000
    
--returning every column that contains 2850, 3000, 5000
--which means if someone in the deptno 10 gets 3000 sal(deptno 20's max value) that person too will be returned.
--IN operator
SELECT *
FROM EMP
WHERE SAL IN (SELECT MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO)
ORDER BY DEPTNO DESC;

--ANY operator
--comes with a comparison operator
--The ANY operator returns true if any of the subquery values meet the condition.
SELECT *
FROM EMP
WHERE SAL = ANY (SELECT MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO)
--WHERE SAL = ANY (2850, 3000, 5000)
ORDER BY DEPTNO DESC;


--SOME operator (basically the same thing as ANY)
--returning every column that contains SAL value less than 2850, 3000, 5000
SELECT *
FROM EMP
WHERE SAL = ANY (SELECT MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO)
ORDER BY DEPTNO DESC;


--ALL operator
--The ALL operator returns true if all of the subquery values meet the condition.
SELECT *
FROM EMP
WHERE SAL < ALL (SELECT MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO)
ORDER BY DEPTNO DESC;


SELECT SAL
FROM EMP
WHERE DEPTNO = 30;

SELECT *
FROM EMP
WHERE SAL<ALL(
    SELECT SAL
    FROM EMP
    WHERE DEPTNO = 30
);


--EXIST Operator
--The EXISTS operator returns true if the subquery returns one or more records.
SELECT *
FROM EMP
WHERE EXISTS(SELECT DNAME
            FROM DEPT
            WHERE DEPTNO = 10);
            
SELECT * FROM EMP;


--multiple-column subquery

SELECT DEPTNO, MAX(SAL)
FROM EMP
GROUP BY DEPTNO;
--DEPTNO    MAX(SAL)
--30        2850
--20        3000
--10        5000

SELECT * 
FROM EMP
WHERE (DEPTNO, SAL) IN (SELECT DEPTNO, MAX(SAL)
            FROM EMP
            GROUP BY DEPTNO);
            
            
--inline view
SELECT * FROM emp WHERE DEPTNO = 10;
SELECT * FROM DEPT;

SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
FROM (SELECT * FROM EMP WHERE DEPTNO = 10) E10,
    (SELECT * FROM DEPT) D
WHERE E10.DEPTNO = D.DEPTNO;


--WITH Clause
WITH
E10 AS (SELECT * FROM emp WHERE deptno = 10),
D AS (SELECT * FROM dept)

SELECT E10.EMPNO, E10.ENAME, E10.DEPTNO, D.DNAME, D.LOC
FROM E10, D
WHERE E10.DEPTNO = D.DEPTNO;



--using Subquery within SELECT Clause

SELECT EMPNO, ENAME, JOB, SAL,
    (SELECT GRADE FROM SALGRADE
        WHERE E.SAL BETWEEN LOSAL AND HISAL) AS SALGRADE,
    DEPTNO,
    (SELECT DNAME FROM DEPT
        WHERE E.DEPTNO = DEPT.DEPTNO) AS DNAME
FROM EMP E;



--DDL

CREATE TABLE MYTABLE(
    column_1 VARCHAR2(20),
    column_2 NUMBER(7),
    column_3 DATE,
    column_4 CHAR(4)
);
--TESTING OUT CREATED TABLE
DESC MYTABLE;

INSERT INTO MYTABLE VALUES('YOUNGIN', 26, TO_DATE('1995-04-29'), 'F');
INSERT INTO MYTABLE VALUES('YOONHYUNG', 24, TO_DATE('1997-05-21'), 'M');

SELECT * FROM MYTABLE;

--don't forget to commit
COMMIT;
--ROLLBACK;

INSERT INTO MYTABLE (column_1, column_2)
    VALUES ('HYUN', 27);
    
DESC MYTABLE;

SELECT * FROM EMP;
    
INSERT INTO MYTABLE
SELECT EMP.ENAME, EMP.EMPNO, HIREDATE, 'A'
FROM EMP;

COMMIT;

SELECT * FROM MYTABLE;


--UPDATE table_name SET column_name = new_value;
UPDATE MYTABLE SET COLUMN_4 = 'B', column_2 = '25' WHERE COLUMN_3 = '97/05/21';

ROLLBACK;

