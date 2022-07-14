SELECT prod.name
FROM products prod
INNER JOIN providers prov on (prov.id = prod.id_providers)
WHERE(prod.amount BETWEEN 10 and 20 AND prov.name LIKE 'P%')