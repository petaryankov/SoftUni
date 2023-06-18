DELIMITER $$
CREATE FUNCTION udf_client_bill(full_name VARCHAR(50))
RETURNS DECIMAL(19,2)

DETERMINISTIC
BEGIN
	RETURN (
		SELECT SUM(price) AS bill
			FROM
		clients c
			JOIN
		orders_clients oc ON c.id = oc.client_id
			JOIN orders_products op ON oc.order_id = op.order_id
			JOIN products p ON op.product_id = p.id
		WHERE
			concat(c.first_name,' ', c.last_name) = full_name
            );
END $$
