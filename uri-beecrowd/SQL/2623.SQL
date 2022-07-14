SELECT p.name, c.name
FROM products p 
INNER JOIN categories c ON (p.id_categories = c.id)
WHERE amount > 100 AND
c.id in (1, 2, 3, 6, 9)
ORDER BY c.id asc