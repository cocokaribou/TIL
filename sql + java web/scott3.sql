--day0603
--LIKE operator

SELECT * FROM EMP WHERE ENAME LIKE 'SMITH';

--Wild Card
--ENAME that starts with 'M'
SELECT * FROM EMP WHERE ENAME LIKE 'M%';

--ENAME that ends with 'R'
SELECT * FROM EMP WHERE ENAME LIKE '%R';

--ENAME that starts with 'M' and ends with 'R'
SELECT * FROM EMP WHERE ENAME LIKE 'M%R';

--ENAME that contains 'L'
SELECT * FROM EMP WHERE ENAME LIKE '%L%';

--underbar _ operator
--means single character

SELECT * FROM EMP WHERE ENAME LIKE '_L%';
SELECT * FROM EMP WHERE ENAME LIKE '__L%';

--ENAME that contains 'M','A' or 'A''M';

SELECT * FROM EMP WHERE ENAME LIKE '%A%M%' OR ENAME LIKE '%M%A%';

--ENAME that does NOT contain 'MI'
SELECT * FROM EMP WHERE ENAME NOT LIKE '%MI%';


--escape character '\'
--When you use braces to escape a single character, the escaped character becomes a separate token in the query.
--Use the backslash character to escape a single character or symbol. Only the character immediately following the backslash is escaped.

--SELECT * FROM SOME_TABLE
--WHERE SOME_COLUMN
--LIKE 'A\_A%' ESCAPE '\';


--METHOD in Java
--FUNCTION in C, Oracle

--UPPER(column_name)
--LOWER(column_name)
SELECT UPPER(ENAME), LOWER(ENAME) FROM EMP;

SELECT * FROM EMP WHERE UPPER(ENAME) = UPPER('miller');


--if input data was 'Ellen'
--SELECT first_name FROM employees
--WHERE UPPER(first_name) = 'ELLEN';


--SUBSTR(char, position)
--SUBSTR(char, position, substring_length)

--if position is 0, then it is treated as 1.
SELECT ENAME, SUBSTR(ENAME, 0) FROM EMP;

--starting from the second character
--substring length of 3
SELECT ENAME, SUBSTR(ENAME, 2, 3) FROM EMP;


--SYSDATE FUNCTION
SELECT SYSDATE FROM EMP;

--DUAL TABLE
--DUAL is a table automatically created by Oracle Database along with the data dictionary. 
--DUAL is in the schema of the user SYS but is accessible by the name DUAL to all users. 
--It has one column, DUMMY, defined to be VARCHAR2(1), and contains one row with a value X. 
--Selecting from the DUAL table is useful for computing a constant expression with the SELECT statement. 
-- Because DUAL has only one row, the constant is returned only once. 

--https://en.wikipedia.org/wiki/DUAL_table
SELECT * FROM DUAL;

--selects only one data
SELECT SYSDATE FROM DUAL;
SELECT UPPER('test') FROM DUAL;


--can't insert data into DUAL
--INSERT INTO DUAL VALUES('A');

--TO_CHAR(datetime)
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD HH24:MI:SS') FROM DUAL;
SELECT TO_CHAR(SYSDATE) AS NOW FROM DUAL;

--you can operate sysdate and return as well
SELECT SYSDATE, SYSDATE+1, SYSDATE-7 FROM DUAL;

SELECT ENAME, SYSDATE - HIREDATE FROM EMP;

--you can substract DATE to DATE
--can't add DATE to DATE
SELECT SYSDATE + (SYSDATE-7) FROM DUAL;


--ADD_MONTHS(date, integer)
SELECT ADD_MONTHS(SYSDATE, 3) FROM DUAL;

SELECT ENAME, HIREDATE, TO_CHAR(
    ADD_MONTHS(HIREDATE,1)) "Next Month"
    FROM EMP;
    
--return Employee who's been working over 4 years
SELECT ENAME, HIREDATE FROM EMP 
WHERE ADD_MONTHS(HIREDATE, 464) > SYSDATE;

SELECT MONTHS_BETWEEN(HIREDATE, SYSDATE), --minus result
    MONTHS_BETWEEN(SYSDATE, HIREDATE)
FROM EMP;

--TRUNC()
SELECT MONTHS_BETWEEN(HIREDATE, SYSDATE), --minus result
    MONTHS_BETWEEN(SYSDATE, HIREDATE),
    TRUNC(MONTHS_BETWEEN(SYSDATE, HIREDATE))
FROM EMP;

