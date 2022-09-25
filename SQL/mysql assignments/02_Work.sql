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

