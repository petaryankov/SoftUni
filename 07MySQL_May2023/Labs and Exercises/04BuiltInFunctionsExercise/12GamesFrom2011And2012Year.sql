SELECT 
    name, DATE_FORMAT(start, '%Y-%d-%m') AS start
FROM
    games
WHERE
    YEAR(start) BETWEEN 2011 AND 2012
ORDER BY start , name
LIMIT 50;