use fullstack14

select * from emp

begin tran
go
insert into emp values(1001,'azar',10000);

commit

delete from emp where empid=1003

begin tran
go 
rollback

begin tran
go
insert into emp values(1002,'azar1',20000);

select * from emp

delete from emp where empid=1002

begin tran

go 
delete from emp where empid=1002

rollback tran



-- Start a new transaction    
BEGIN TRANSACTION  
-- SQL Statements  
 INSERT INTO emp VALUES(1003, 'mohan', 2000)  
 UPDATE emp SET salary = 4500 WHERE empid = 1002 
 -- Commit changes   
COMMIT TRANSACTION  

select * from emp


-- Start a new transaction    
BEGIN TRANSACTION  
-- SQL Statements  
UPDATE emp SET salary = 5001 WHERE empid = 1003  

DELETE FROM emp WHERE empid = 1003 


begin transaction

SAVE transaction sp1

delete  from emp where empid=1003

select * from emp

rollback transaction sp1

  
  save transaction s2
  
  delete from emp where empid=1001
  
  rollback transaction s2

rollback

select * from emp








begin transaction

select * from emp

rollback transaction