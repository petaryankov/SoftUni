SELECT 
    e.employee_id, first_name
FROM
    employees AS e
        LEFT JOIN
    employees_projects AS ep ON e.employee_id = ep.employee_id
WHERE
    project_id IS NULL
ORDER BY employee_id DESC
LIMIT 3;