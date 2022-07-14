SELECT P.id, P.name
FROM products P
INNER JOIN categories C
ON P.id_categories = C.id
WHERE C.name LIKE 'super%';