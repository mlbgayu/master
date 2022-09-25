--Question:9

--Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent)
 --and their respective average city populations (CITY.Population) rounded down to the nearest integer.

select country.continent,round(avg(city.population))
from country inner join city on country.code=city.country_code group by country.continent