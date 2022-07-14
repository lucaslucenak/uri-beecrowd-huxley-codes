SELECT c.name, o.id
FROM orders o
INNER JOIN customers c ON (o.id_customers = c.id)
WHERE EXTRACT(MONTH FROM o.orders_date) IN (01, 02, 03, 04, 05, 06);