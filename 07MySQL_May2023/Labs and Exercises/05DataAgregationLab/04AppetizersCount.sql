SELECT 
    COUNT(id) AS appetizers
FROM
    products
WHERE
    price > 8 AND category_id = 2;
