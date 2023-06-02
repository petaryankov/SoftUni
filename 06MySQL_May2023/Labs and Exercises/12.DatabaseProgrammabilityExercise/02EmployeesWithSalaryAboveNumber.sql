DELIMITER $$
CREATE PROCEDURE usp_get_employees_salary_above(input_num DECIMAL(19,4))

BEGIN
	SELECT first_name, last_name FROM employees
    WHERE salary >= input_num
    ORDER BY first_name, last_name, employee_id;
END $$