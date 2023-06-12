SELECT 
    g.name,
    g.release_date,
    CONCAT((SUBSTRING(description, 1, 10)), '...') AS summary,
    CASE
        WHEN MONTH(release_date) IN (1 , 2, 3) THEN 'Q1'
        WHEN MONTH(release_date) IN (4 , 5, 6) THEN 'Q2'
        WHEN MONTH(release_date) IN (7 , 8, 9) THEN 'Q3'
        ELSE 'Q4'
    END AS quarter,
    t.name AS team_name
FROM
    games g
        JOIN
    teams t ON g.team_id = t.id
WHERE
    YEAR(release_date) = 2022
        AND MONTH(release_date) % 2 = 0
        AND g.name LIKE '%2'
ORDER BY quarter;