DELIMITER $$
CREATE FUNCTION udf_game_info_by_name (game_name VARCHAR (20))
RETURNS TEXT

DETERMINISTIC
BEGIN
	RETURN (
		SELECT CONCAT('The ',
				g.name,
				' is developed by a ',
				t.name,
				' in an office with an address ',
				a.name) AS info
		FROM
			games g
				JOIN
			teams t ON g.team_id = t.id
				JOIN
			offices o ON t.office_id = o.id
				JOIN
			addresses a ON o.address_id = a.id
		WHERE
			g.name = game_name);
END $$