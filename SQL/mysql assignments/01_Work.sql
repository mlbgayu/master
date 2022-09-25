--Question:1

--Query all columns for all American cities in the CITY table with populations larger than 100000. The CountryCode for America is USA.


--Answer: 
            

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
