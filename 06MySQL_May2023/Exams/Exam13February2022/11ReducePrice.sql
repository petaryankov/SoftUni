DELIMITER $$
CREATE PROCEDURE udp_reduce_price(category_name VARCHAR(50))

BEGIN
	UPDATE products p
		JOIN reviews r ON p.review_id = r.id
		JOIN categories c ON p.category_id = c.id
	SET p.price = p.price * 0.7
	WHERE c.name = category_name AND r.rating < 4;
END $$
