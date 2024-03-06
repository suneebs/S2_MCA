-- Exercise 2

-- 1.Write a query to display all the countries.
select * from countries;

-- 2.Write a query to display specific columns like email and phonenumber for all the employees.
select email,phone_number from employees;

-- 3.Write a query to display the data of employee whose lastname is “DeHaan”.
select * from employees where last_name='DeHaan';
-- 4.Write a query to find the hiredate for employees whose lastname is “King”or“Kochhar”.
select hire_date from employees where last_name='king' or last_name='Kochhar'; 

-- 5.Write a query to display name of the employee who is shipping clerk.
select first_name,last_name,job_title from employees join jobs on employees.job_id = jobs.job_id where jobs.job_title='ShippingClerk' ;

-- 6.Write a query to get all the employees who work for department 8.
select first_name,last_name,department_id from employees where department_id=8;

-- 7.Write a query to display the departments in the descending order.
select * from dept order by department_name desc;

-- 8.Write a query to display all the employees whose lastname starts with“K”.
select first_name,last_name from employees where last_name like 'k%';

-- 9.Display name of the employees whose hiredates are between 1995 and 1997.
select * from employees where hire_date between '1995-01-01' and '1997-01-01';
select * from employees where year(hire_date) between 1995 and 1997;

-- 10.Write a query to display jobs where the maximum salary is less than 5000.
select * from jobs where max_salary < 5000;

-- 11.Write a query to display email address in lowercase.
select email from employees;
SELECT LOWER(email) from employees;
SELECT upper(email) from employees;

-- 12.Write a query to display name of the employees who were hired in 1995.
SELECT first_name,last_name,hire_date FROM employees WHERE YEAR(hire_date) = '1995';

-- 13.Write a query to insert an employee “PaulNewton” in department 11.
INSERT INTO employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id)VALUES(169,'Paul','Newton','paul.new10.org','6509034','1999-01-11',19,7900.00,100,11);
select * from employees;

-- 14.Write a query to delete the shipping department.
set sql_safe_updates = 1;
delete from dept where department_name ='Shipping';

SELECT first_name,last_name,hire_date FROM employees WHERE dayname(hire_date)='Thursday';
