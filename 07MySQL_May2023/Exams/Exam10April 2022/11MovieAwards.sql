DELIMITER $$

CREATE PROCEDURE udp_award_movie(movie_title VARCHAR(50))

BEGIN
	UPDATE movies m
			JOIN
		movies_actors ma ON m.id = ma.movie_id
			JOIN
		actors a ON ma.actor_id = a.id
		SET a.awards = a.awards + 1
		WHERE
		m.title = movie_title;
END $$