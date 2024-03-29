SELECT * FROM EMPLOYEES;

SELECT department_id AS 부서번호, 
    COUNT(*) AS 사원수, 
    TRUNC(AVG(salary), 3) AS 급여평균,
    MIN(salary) AS 최저급여,
    MAX(salary) AS 최고급여,
    SUM(salary) AS 급여합계
FROM EMPLOYEES GROUP BY department_id
ORDER BY department_id DESC;

select * from user_constraints;

SELECT department_id AS 부서번호, 
    COUNT(*) AS 사원수, 
    SUM(salary) AS 급여합계
FROM EMPLOYEES
GROUP BY department_id
HAVING count(employee_id) > 4;

SELECT job_id AS 업무ID,
    SUM(salary) AS 급여합계
FROM EMPLOYEES
WHERE job_id NOT LIKE 'SA%'
GROUP BY job_id
HAVING SUM(salary) > 10000;

--using subquery
SELECT e1.employee_id AS 사원번호,
    e1.first_name AS 이름,
    e1.manager_id AS "상사의 사원번호",
    e2.first_name AS "상사의 이름"
FROM employees e1, employees e2
WHERE e2.first_name = (
    SELECT first_name
    FROM employees
    WHERE employee_id = 108
)AND e1.manager_id = 108;

--using table join (self join)
SELECT e1.employee_id AS 사원번호,
    e1.first_name AS 이름,
    e1.manager_id AS "상사의 사원번호",
    e2.first_name AS "상사의 이름"
FROM employees e1, employees e2
WHERE e1.manager_id = 108
	AND e1.manager_id = e2.employee_id;
    
    
--using table join (right outer join)
SELECT e1.employee_id AS 사원번호,
    e1.first_name AS 이름,
    e1.manager_id AS "상사의 사원번호",
    e2.first_name AS "상사의 이름"
FROM employees e1, employees e2
WHERE e1.manager_id = 108
	AND e1.manager_id(+) = e2.employee_id;
    
--just in case theres any null value