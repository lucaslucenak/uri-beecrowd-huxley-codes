(SELECT l.name, l.customers_number
FROM lawyers l
ORDER BY l.customers_number DESC
limit 1)

UNION ALL

(SELECT l.name, l.customers_number
FROM lawyers l
ORDER BY l.customers_number ASC
limit 1)

union ALL

(SELECT 'Average', round(AVG(customers_number), 0)
FROM lawyers)
