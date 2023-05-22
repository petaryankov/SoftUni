SELECT 
    COUNT(salary) AS salry
FROM
    employees
WHERE
    manager_id IS NULL;