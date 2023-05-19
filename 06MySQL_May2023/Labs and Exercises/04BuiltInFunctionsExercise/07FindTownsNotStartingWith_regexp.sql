SELECT 
    *
FROM
    towns
WHERE
    name REGEXP '^[^r, b, d]'
ORDER BY name;