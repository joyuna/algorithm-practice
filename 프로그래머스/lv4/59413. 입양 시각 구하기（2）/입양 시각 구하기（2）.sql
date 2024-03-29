-- 코드를 입력하세요
WITH RECURSIVE CTE(HOUR) AS(
    SELECT 0
    UNION ALL
    SELECT HOUR + 1 FROM CTE WHERE HOUR < 23
)
SELECT CTE.HOUR AS HOUR, COUNT(AO.ANIMAL_ID) AS COUNT
FROM CTE LEFT JOIN ANIMAL_OUTS AO ON CTE.HOUR = HOUR(AO.DATETIME)
GROUP BY HOUR
ORDER BY HOUR;