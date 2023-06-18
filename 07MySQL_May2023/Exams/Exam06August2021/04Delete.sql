DELETE g FROM games g
        LEFT JOIN
    games_categories gc ON gc.game_id = g.id 
WHERE
    g.release_date IS NULL
    AND gc.game_id IS NULL;