SELECT prod.name, prov.name
FROM providers prov
INNER JOIN products prod ON (prod.id_providers = prov.id)
WHERE (prov.name LIKE 'Ajax SA')