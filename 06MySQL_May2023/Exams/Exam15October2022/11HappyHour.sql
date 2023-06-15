DELIMITER $$

CREATE PROCEDURE udp_happy_hour(type VARCHAR(50))

BEGIN
	UPDATE products AS p
    SET p.price = p.price * 0.8
    WHERE p.type = type AND p.price >= 10;
END $$
