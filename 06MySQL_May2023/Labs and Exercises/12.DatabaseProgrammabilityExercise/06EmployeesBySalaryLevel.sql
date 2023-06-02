DELIMITER $$
CREATE FUNCTION ufn_get_salary_level(salary DECIMAL(19,4))

RETURNS VARCHAR(7)
DETERMINISTIC
BEGIN
	RETURN (
    CASE
		WHEN salary < 30000 THEN 'Low'
        WHEN salary <= 50000 THEN 'Average'
        ELSE 'High'
        END
    );
END$$

CREATE PROCEDURE usp_get_employees_by_salary_level(level_of_salary VARCHAR(10))

BEGIN
	SELECT first_name, last_name FROM employees
    WHERE ufn_get_salary_level(salary) = level_of_salary
    ORDER BY first_name DESC, last_name DESC;
END $$