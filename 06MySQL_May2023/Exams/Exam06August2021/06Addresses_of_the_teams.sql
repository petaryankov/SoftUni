SELECT 
    t.name AS team_name,
    a.name AS address_name,
    CHAR_LENGTH(a.name)
FROM
    teams t
        JOIN
    offices o ON t.office_id = o.id
        JOIN
    addresses a ON o.address_id = a.id
WHERE
    o.website IS NOT NULL
ORDER BY team_name , address_name;