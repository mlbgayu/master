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