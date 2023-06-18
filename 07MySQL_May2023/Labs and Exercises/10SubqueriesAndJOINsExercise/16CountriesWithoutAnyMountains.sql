SELECT 
    COUNT(*) AS country_count
FROM
    countries c
        LEFT JOIN
    mountains_countries mc USING (country_code)
        LEFT JOIN
    mountains m ON mc.mountain_id = m.id
WHERE
    m.id IS NULL;