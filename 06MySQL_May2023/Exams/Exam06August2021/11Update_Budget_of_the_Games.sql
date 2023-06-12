DELIMITER $$
CREATE PROCEDURE udp_update_budget(min_game_rating FLOAT)

BEGIN
	UPDATE games g LEFT JOIN games_categories gc ON g.id = gc.game_id
    SET g.budget = g.budget + 100000, release_date = date_add(release_date, interval 1 year)
    WHERE gc.category_id IS NULL AND g.rating > min_game_rating AND g.release_date IS NOT NULL;
END $$