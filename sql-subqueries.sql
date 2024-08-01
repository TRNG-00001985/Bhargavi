use db1;
select * from Emps;
-- Find the names of employees who work in the same department as 'John';
 
 SELECT Empname from Emps
 where Depid in (SELECT Depid from Emps where Empname="John")
 AND Empname!="John";
 
-- Find departments that have more than one employee

Select Depname From Dep
 where Depid IN (SELECT Depid FROM Emps GROUP BY Depid HAVING COUNT(Depid)>1);
 
-- Find the projects that are not assigned to any department

Select Depname From Dep
 where Depid IN (SELECT Depid FROM Emps GROUP BY Depid HAVING COUNT(Depid)>1);
 
-- Find the department with the maximum number of employees.

 SELECT Depname,
 (SELECT COUNT(Depid) FROM Emps GROUP BY Depid ORDER BY count(Depid) DESC LIMIT 1) 
 AS COUNT1 FROM Dep
 WHERE Depid IN (SELECT Depid FROM Emps GROUP BY Depid ORDER BY count(Depid) DESC ) LIMIT 1;

-- Find employees who are working on projects in the 'Sales' department.
SELECT Empname FROM Emps WHERE Depid in (SELECT Depid FROM Dep where Depname="Sales");

-- Find the names of departments that do not have any projects.
SELECT * FROM Proj;
SELECT * FROM Dep;
INSERT INTO Dep VALUES (5,"NON PROJECT");
DELETE FROM Dep WHERE Depid=5;
SELECT Depname FROM Dep WHERE Depid NOT IN (SELECT Depid FROM Proj where Depid IS NOT NULL);

-- Find employees who are not working on any project.
SELECT * FROM Emps;
Update Emp 
SET Depid=5 where Empid=5;

SELECT Depid FROM Proj WHERE Depid IS NOT NULL;

SELECT Empname From Emps Where Depid Not IN (SELECT Depid FROM Proj WHERE Depid IS NOT NULL );

-- Find the department names and the number of employees in each department, only for departments with more than two employees.
SELECT Depname,(SELECT count(Depid) FROM Emps group by Depid Having count(Depid)>1) as count1 FROM Dep
WHERE Depid in (SELECT Depid FROM Emps group by Depid Having count(Depid)>1);



-- Find the projects handled by employees in the 'IT' department.
SELECT Projname From Proj WHERE Deptid IN (SELECT Depid FROM Dep where Depname="IT");

-- Find the names of employees who do not work in the 'Marketing' department.
SELECT Empname FROM Emps WHERE Depid NOT IN (SELECT Depid FROM Dep WHERE Depname="Marketing");