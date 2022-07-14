SELECT c.id, c.name
FROM customers c
where c.id not in (
  SELECT l.id_customers
  FROM locations l
  )