(A) Employee Department Salary
SELECT department, COUNT(*) AS employee_count, AVG(salary) AS average_salary FROM employee GROUP BY department;

(B) Departments with High Average Salary
SELECT department, AVG(salary) AS average_salary FROM employee GROUP BY department HAVING AVG(salary) > 40000;

(C) Customer and Orders
SELECT
    c.customer_name,
    c.city,
    o.order_id,
    o.amount AS order_amount
FROM customer c
INNER JOIN orders o
ON c.customer_id = o.customer_id;

(D). Total Purchase by Each Customer
SELECT
    c.customer_id,
    c.customer_name,
    SUM(o.amount) AS total_purchase_amount
FROM customer c
INNER JOIN orders o
    ON c.customer_id = o.customer_id
GROUP BY
    c.customer_id,
    c.customer_name
ORDER BY total_purchase_amount DESC;


(E). Find Valuable Customers
SELECT
    c.customer_name,
    c.city,
    SUM(o.amount) AS total_amount_spent
FROM customer c
INNER JOIN orders o
    ON c.customer_id = o.customer_id
GROUP BY
    c.customer_name,
    c.city
HAVING SUM(o.amount) > 50000;





