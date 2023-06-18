SELECT 
    c.name, COUNT(m.country_id) AS movies_count
FROM
    movies m
        JOIN
    countries c ON m.country_id = c.id
GROUP BY m.country_id
HAVING movies_count >= 7
ORDER BY c.name DESC;