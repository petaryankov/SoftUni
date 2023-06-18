DELIMITER $$
CREATE FUNCTION udf_customer_products_count(name VARCHAR(30))
RETURNS INT

DETERMINISTIC
BEGIN
	DECLARE count_customer_products INT;
	SET count_customer_products := (
    SELECT 
		COUNT(c.id)
	FROM
		customers c
	JOIN orders o ON c.id = o.customer_id
	JOIN orders_products op ON o.id = op.order_id
	WHERE first_name = name
	GROUP BY c.id);
    
	RETURN count_customer_products;
END $$


