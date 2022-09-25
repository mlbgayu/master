

create table exam(studentname varchar(100),subject varchar(50),marks integer)
insert into exam values('bharath','tamil',97)
insert into exam values('kavya','english',94)
insert into exam values('bhavya','maths',95)
insert into exam values ('vyas','science',94)
insert into exam values('govind','social science',96)
select * from exam
select distinct subject from exam 
select * from exam where studentname= 'bhavya'
select*from exam where marks>=95

select *from exam where subject='tamil' and marks=97
select *from exam where studentname='vyas' and marks=95
select * from exam where subject='english' or studentname='bhavya'
select * from exam where not marks<95