DELIMITER $$
CREATE FUNCTION udf_actor_history_movies_count(full_name VARCHAR(50))
RETURNS INT

DETERMINISTIC
BEGIN
	RETURN (
		SELECT 
			COUNT(m.title)
				FROM
			actors a
				JOIN
			movies_actors ma ON a.id = ma.actor_id
				JOIN
			movies m ON ma.movie_id = m.id
				JOIN
			genres_movies gm ON m.id = gm.movie_id
		WHERE
			CONCAT(a.first_name, ' ', a.last_name) = full_name
				AND gm.genre_id = 12);
END $$
