SELECT 
    CONCAT(first_name, ' ', last_name) AS full_name,
    CONCAT(REVERSE(last_name),
            CHAR_LENGTH(last_name),
            '@cast.com') AS email,
    (2022 - YEAR(birthdate)) AS age,
    height
FROM
    actors a
    LEFT JOIN movies_actors ma ON a.id = ma.actor_id
    WHERE ma.actor_id IS NULL
    ORDER BY height;