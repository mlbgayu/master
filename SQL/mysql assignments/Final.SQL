--Question:1

--Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.
            

create database mlb;

use  mlb;

create table City(id int,name varchar(50),country_code int,district varchar(50),population int);

insert into city values(111,'atlanta','+1','geogia',514457);

insert into city values(112,'sandysprings','+1','georgia',110926);

insert into city values(113,'roswell','+1','georgia',93731);

insert into city values(114,'johnscreek','+1','georgia',83597);

insert into city values(115,'savannah','+1','geoegia',150078);

select *from city;

select * from city where population>=100000;


commit


---question:2
---Find the difference between the total number of CITY entries in the table and the number of distinct CITY entries in the table.
 ---The STATION table is described as follows:


use mlb;

create table station(id int not null primary key,city varchar(50),state varchar(50),lat_n int,long_w int);

insert into station values ( 1,'milton', 'GA' , 34.1,-84.29);

insert into station values (2,'milton','GA',34.1,-84.30);

insert into station values(3,'alpharetta','GA',34.07,-84.28);

insert into station values (4,'alpharetta','GA',34.07,-84.31);

insert into station values(5,'roswell','GA',34.03,-84.33);

select * from station;

select city, count(*) from station group by city;


--Question: 3
--Query the list of CITY names from STATION that do not end with vowels. 
--Your result cannot contain duplicates. The STATION table is described as follows:


use mlb;

select * from station;

select distinct city from station where city not like '%a' and city not like '%e' 
and city not like '%i' and city not like '%o' and city not like '%u'


---Question:4
 
---Write a query that prints a list of employee names (i.e.: the name attribute) from the Employee 
---table in alphabetical order.


use mlb;

create table Employee(emp_id int not null,name varchar(50),months int,salary int);

insert into Employee values(121,'gayathri',01,100000);

insert into Employee values(122,'govindan',02,150000);

insert into Employee values(123,'bhavya',03,200000);

insert into Employee values(124,'vyas',04,250000);

select* from employee;

select (name) from Employee order by(name);


--Question:5
--Query a count of the number of cities in CITY having a Population larger than 100,000.

use mlb;

select * from city;

select count(name) , population   from city group by name having population > 100000;

select count(*)  from city  where population > 100000;


----Question:6

--Query the average population for all cities in CITY, rounded down to the nearest integer.

select round(avg(population)) from city 


--Question:7

--Given the CITY and COUNTRY tables, query the sum of the populations of all cities where the CONTINENT is 'Asia’

select sum(city.population)from city inner join country  on city.country_code=country.code  where country.continent ='Asia';


--Question:8

--Given the CITY and COUNTRY tables, query the names of all cities where the CONTINENT is 'Africa'.

select city.name from city inner join country on city.country_code=country.code where country.continent='Africa';



--Question:9

--Given the CITY and COUNTRY tables, query the names of all the continents (COUNTRY.Continent)
 --and their respective average city populations (CITY.Population) rounded down to the nearest integer.

select country.continent,round(avg(city.population))
from country inner join city on country.code=city.country_code group by country.continent;