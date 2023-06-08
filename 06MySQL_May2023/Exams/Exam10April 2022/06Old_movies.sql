SELECT 
    m.id, m.title, ma.runtime, ma.budget, ma.release_date
FROM
    movies_additional_info ma
        JOIN
    movies m ON ma.id = m.movie_info_id
WHERE
    YEAR(ma.release_date) BETWEEN 1996 AND 1999
ORDER BY ma.runtime , m.id
LIMIT 20;