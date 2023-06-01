DELIMITER $$
CREATE FUNCTION ufn_count_employees_by_town(town_name VARCHAR(50))
RETURNS INT
DETERMINISTIC
BEGIN
RETURN (SELECT 
    COUNT(employee_id) AS count
FROM
    employees
        JOIN
    addresses USING (address_id)
        JOIN
    towns USING (town_id)
WHERE
    towns.name = town_name);
END$$
DELIMITER ;
;


