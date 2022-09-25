Question:5
--Query a count of the number of cities in CITY having a Population larger than 100,000.

use mlb;

select * from city;

select count(name) , population   from city group by name having population > 100000;

select count(*)  from city  where population > 100000;