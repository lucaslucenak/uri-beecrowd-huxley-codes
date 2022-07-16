SELECT l.name, CAST(EXTRACT(day FROM l.payday) AS INT)
FROM loan l;