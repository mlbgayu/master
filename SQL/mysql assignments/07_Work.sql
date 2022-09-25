--Question:7

--Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia’

select sum(city.population)from city inner join country  on city.country_code=country.code  where country.continent ='Asia';