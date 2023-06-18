SELECT 
    town_id, name
FROM
    towns
WHERE
    name REGEXP '^[m, k, b, e]'
ORDER BY name;