--Question:8

--Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.

select city.name from city inner join country on city.country_code=country.code where country.continent='Africa';