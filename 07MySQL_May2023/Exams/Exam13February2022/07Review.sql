SELECT 
    *
FROM
    reviews
WHERE
    content LIKE 'my%'
        AND CHAR_LENGTH(content) > 61
ORDER BY rating DESC;