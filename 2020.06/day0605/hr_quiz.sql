SELECT LAST_NAME, SALARY * 12
FROM employees
WHERE SALARY*12 >= 120000;


SELECT *
FROM EMPLOYEES
WHERE department_id IN (50, 80, 100)
    AND salary BETWEEN 7000 AND 8000;
    
SELECT *
FROM employees
WHERE (department_id = 50 OR department_id = 80 OR department_id = 100) 
AND salary>=7000 
AND salary<=8000
ORDER BY employee_id;


SELECT EMPLOYEE_ID, HIRE_DATE, ROUND(SYSDATE-HIRE_DATE)
FROM EMPLOYEES
ORDER BY HIRE_DATE DESC;


SELECT last_name, 
	employee_id, 
	TO_CHAR(hire_date, 'YYYY/MM/DD') 
FROM employees 
WHERE hire_date > TO_DATE('20080220', 'YYYY/MM/DD') 
	AND hire_date < TO_DATE('20080501', 'YYYY/MM/DD') 
ORDER BY hire_date;