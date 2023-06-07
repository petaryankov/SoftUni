SELECT 
    CONCAT(first_name, ' ', last_name) AS full_name,
    address,
    o.order_datetime
FROM
    customers c
        JOIN
    orders o ON c.id = o.customer_id
WHERE
    YEAR(o.order_datetime) <= 2018
ORDER BY full_name DESC;
