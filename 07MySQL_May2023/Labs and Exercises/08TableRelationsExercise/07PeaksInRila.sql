SELECT 
    mountain_range, peak_name, elevation
FROM
    peaks p
        JOIN
    mountains m ON p.mountain_id = m.id
WHERE
    p.mountain_id = 17
ORDER BY elevation DESC;