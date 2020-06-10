SELECT * FROM EMPLOYEES;

SELECT department_id AS �μ���ȣ, 
    COUNT(*) AS �����, 
    TRUNC(AVG(salary), 3) AS �޿����,
    MIN(salary) AS �����޿�,
    MAX(salary) AS �ְ�޿�,
    SUM(salary) AS �޿��հ�
FROM EMPLOYEES GROUP BY department_id
ORDER BY department_id DESC;

select * from user_constraints;

SELECT department_id AS �μ���ȣ, 
    COUNT(*) AS �����, 
    SUM(salary) AS �޿��հ�
FROM EMPLOYEES
GROUP BY department_id
HAVING count(employee_id) > 4;

SELECT job_id AS ����ID,
    SUM(salary) AS �޿��հ�
FROM EMPLOYEES
WHERE job_id NOT LIKE 'SA%'
GROUP BY job_id
HAVING SUM(salary) > 10000;

--using subquery
SELECT e1.employee_id AS �����ȣ,
    e1.first_name AS �̸�,
    e1.manager_id AS "����� �����ȣ",
    e2.first_name AS "����� �̸�"
FROM employees e1, employees e2
WHERE e2.first_name = (
    SELECT first_name
    FROM employees
    WHERE employee_id = 108
)AND e1.manager_id = 108;

--using table join (self join)
SELECT e1.employee_id AS �����ȣ,
    e1.first_name AS �̸�,
    e1.manager_id AS "����� �����ȣ",
    e2.first_name AS "����� �̸�"
FROM employees e1, employees e2
WHERE e1.manager_id = 108
	AND e1.manager_id = e2.employee_id;
    
    
--using table join (right outer join)
SELECT e1.employee_id AS �����ȣ,
    e1.first_name AS �̸�,
    e1.manager_id AS "����� �����ȣ",
    e2.first_name AS "����� �̸�"
FROM employees e1, employees e2
WHERE e1.manager_id = 108
	AND e1.manager_id(+) = e2.employee_id;
    
--just in case theres any null value