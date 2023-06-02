DELIMITER $$
CREATE PROCEDURE usp_get_towns_starting_with (input VARCHAR(50))

BEGIN
	SELECT name AS town_name FROM towns
    WHERE name LIKE concat(input, '%')
    ORDER BY town_name;
END $$
