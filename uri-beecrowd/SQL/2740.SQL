(
SELECT 'Podium: ' || l.team
FROM league l
WHERE (l.position IN (1, 2, 3))
)
UNION ALL
(
SELECT 'Demoted: ' || l.team
FROM league l
WHERE (l.position IN (14, 15))
);