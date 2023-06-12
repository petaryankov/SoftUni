SELECT 
    g.name,
    IF(g.budget < 50000,
        'Normal budget',
        'Insufficient budget') AS budget_level,
    t.name AS team_name,
    a.name AS address_name
FROM
    games g
        LEFT JOIN
    games_categories gc ON g.id = gc.game_id
        JOIN
    teams t ON g.team_id = t.id
        JOIN
    offices o ON t.office_id = o.id
        JOIN
    addresses a ON o.address_id = a.id
WHERE
    g.release_date IS NULL
        AND gc.game_id IS NULL
ORDER BY g.name;