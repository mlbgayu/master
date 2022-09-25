USE database14

   
   CREATE TABLE EMPLOYEE(Emp_Name varchar(50),Emp_ID int,Dept_ID int,Salary int)
   
   INSERT INTO EMPLOYEE VALUES('gayathri',111,1101,200000)
   
   INSERT INTO EMPLOYEE VALUES('govindan',112,1102,250000)
   
   INSERT INTO EMPLOYEE VALUES('bhavya',113,1103,300000)
   
   INSERT INTO EMPLOYEE VALUES('VYAS',114,1104,350000)
   
   INSERT INTO EMPLOYEE VALUES('prabha',115,1101,250000)
   
   INSERT INTO EMPLOYEE VALUES('gomathy',116,1102,350000)
   
   INSERT INTO EMPLOYEE VALUES('gayu',117,1103,400000)
   
   INSERT INTO EMPLOYEE VALUES('vignesh',118,1104,450000)
   
   SELECT*FROM EMPLOYEE
   
   CREATE TABLE DEPARTMENT(Dept_ID int,Dept_Name varchar(50))
   
   INSERT INTO DEPARTMENT VALUES(1101,'admin')
   
   INSERT INTO DEPARTMENT VALUES(1102,'sales')
   
   INSERT INTO DEPARTMENT VALUES(1103,'finace')
   
   INSERT INTO DEPARTMENT VALUES(1104,'marketing')
   
   SELECT MAX (salary) FROM EMPLOYEE
   
   SELECT MAX (salary) FROM EMPLOYEE GROUP BY  (Dept_ID)
   
   SELECT E.Emp_ID,E.Emp_Name ,D.Dept_Name FROM 
   EMPLOYEE E INNER JOIN DEPARTMENT D ON E.DEPT_ID=D.Dept_ID
   
   SELECT (D.Dept_Name)  AS 'Department Name' , count(D.Dept_Name) AS 'Number of Employees'
   FROM 
   EMPLOYEE E INNER JOIN DEPARTMENT D ON E.DEPT_ID=D.Dept_ID
   GROUP BY D.Dept_Name 
   
   
   SELECT (D.Dept_Name) AS 'Department Name',count (D.Dept_Name)AS 'Number of Employees'
   FROM
   EMPLOYEE E RIGHT JOIN DEPARTMENT D ON E.DEPT_ID=D.Dept_ID
   GROUP BY D.Dept_Name
   
   SELECT (D.Dept_Name) AS 'Department Name',COUNT (d.Dept_Name)AS 'Number of Employee'
   FROM
   EMPLOYEE E LEFT JOIN DEPARTMENT D ON E.Dept_ID=D.Dept_ID
   GROUP BY D.Dept_Name                    
   
 
   
   