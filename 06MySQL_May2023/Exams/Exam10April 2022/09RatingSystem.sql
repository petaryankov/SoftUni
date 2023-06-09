SELECT 
    m.title,
    CASE
        WHEN mi.rating <= 4 THEN 'poor'
        WHEN mi.rating <= 7 THEN 'good'
        ELSE 'excellent'
    END AS rating,
    IF(mi.has_subtitles = 1, 'english', '-') AS subtitles,
    mi.budget
FROM
    movies m
        JOIN
    movies_additional_info mi ON m.movie_info_id = mi.id
ORDER BY mi.budget DESC;