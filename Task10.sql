(A).  Employees Earning More Than Average
SELECT emp_id, emp_name, department, salary
FROM employee
WHERE salary > (SELECT AVG(salary) FROM employee);

(B). Highest Paid Employee
SELECT emp_name, department, salary FROM employee WHERE salary = (SELECT MAX(salary) FROM employee);

(C). Product Costlier than Average
SELECT product_id, product_name, category, price
FROM product
WHERE price > (SELECT AVG(price) FROM product);

(D). Employees froma particular department
SELECT emp_id, emp_name, department_id, salary
FROM employee
WHERE department_id = (SELECT department_id FROM department WHERE department_name = 'IT');

(E). Second Highest Salary
SELECT emp_name, department, salary
FROM employee
WHERE salary = (
    SELECT MAX(salary) FROM employee WHERE salary < (SELECT MAX(salary) FROM employee));
