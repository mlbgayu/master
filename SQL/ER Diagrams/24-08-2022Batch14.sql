create database fullstack14
use fullstack14

create table emp(empid integer,empname varchar(100),salary integer)

select * from emp

insert into emp values(1001,'azar',10000)

insert into emp values(1002,'azar1',20000)

insert into emp values(1003,'mohamed',10000)

select * from emp

select empid,empname from emp

select * from emp where empid=1001

insert into emp values(1001,'azar',10000)

select * from emp

select distinct empname from emp


select * from emp where salary>=20000

select * from emp where empname='azar1'


create table customers(customerid integer,customername varchar(100),contactname varchar(80),city varchar(100),postalcode integer,country varchar(100))

select * from customers

insert into customers values(1,'azar','Maria','hyd',1234,'India')

insert into customers values(2,'yamuna','Hanna','bang',1235,'India')

insert into customers values(3,'jasmeen','simpsom','hyd',1245,'India')

insert into customers values(4,'mohan','kumar','tax',2345,'usa')

select * from customers

select * from customers where city='hyd' and country='India'

select * from customers where city='hyd' and country='India1'

select * from customers where city='hyd' or country='India1'

select * from customers where not country='India'


select * from customers

select * from customers order by country

select * from customers order by country desc

select * from customers order by country asc


update customers set country='asia' where customername='azar'

update customers set country='India',postalcode=4321 where customername='azar'

select * from emp


delete from emp where empid=1001

select * from customers

select MIN(customerid) as xyz from customers


select MAX(customerid) as xyz from customers

select COUNT(customerid)as counts from customers

select * from customers

select * from customers where customername like 'a%'

select * from customers where customername like '%a'


select * from customers where customername like 'm___%'

select * from customers where customername like 'j%n'

select * from customers where city in('hyd','tax')

select * from customers where city not in('hyd','tax')


select * from customers where customerid between 1 and 3

select * from customers where customerid not between 1 and 3

select * from customers

select * from customers where customerid between 1 and 3 OR city in('UK','hyd')

--Join
begin transation
create table product(pid varchar(100),pname varchar(100),pprice varchar(200),cid varchar(100))

create table category(cid varchar(100),cname varchar(100))

insert into product values(1001,'apple',100,2001)

insert into product values(1002,'mango',200,2001)

insert into product values(1003,'moto',10000,2002)

insert into product values(1004,'motoe4',20000,2002)

insert into product values(1005,'motoe4',20000,2003)

select * from product

select * from category

insert into category values(2001,'fruits')

insert into category values(2002,'mobile')

select product.pid as productpid,product.pname as productpname,product.cid as productcid,category.cname as categorycname,category.cid as categorycid from product inner join category on product.cid=category.cid


select product.pid as productpid,product.pname as productpname,category.cid as categorycid,product.cid as productcid from product left join category on product.cid=category.cid


select * from emp



delete from emp where empid=1001

