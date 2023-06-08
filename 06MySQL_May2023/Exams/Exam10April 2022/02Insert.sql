INSERT INTO actors(first_name,last_name,birthdate,height,awards,country_id)
SELECT reverse(first_name), reverse(last_name), date_add(birthdate, interval -2 day), height + 10, country_id, 3
FROM actors
WHERE id <= 10;