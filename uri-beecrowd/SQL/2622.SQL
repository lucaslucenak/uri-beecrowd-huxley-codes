SELECT c.name
FROM customers c
WHERE(c.id IN (SELECT
    l.id_customers
    FROM legal_person l)
     );