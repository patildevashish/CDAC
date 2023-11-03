create database lab7;
use lab7;

create table EmployeeInfo(
	EmpID int,
    EmpFname varchar(20),
    EmpLname varchar(20),
    Salary decimal(50,2));
insert into EmployeeInfo(EmpID, EmpFname, EmpLname, Salary)
values(1,"Devashish","Patil",500000),
(2,"Kshitij","Kanake",80000),
(3,"Sangharsh","Tamgadge",500000),
(4,"Pranav","Chavan",40000),
(5,"Aditi","Patil",30000);

select * from EmployeeInfo;
#  Write a query to find the names of employees that begin with ‘S’?
select * from EmployeeInfo where EmpFname like 'S%';

#Write a query to retrieve the EmpFname and EmpLname in a single column as “FullName”. The first name and the last name must be separated with space.
select concat(EmpFname," ", EmpLname) as "fullName" from EmployeeInfo;

# Write query to find all the employees whose salary is between 50000 to 100000
select * from EmployeeInfo where Salary between '50000' and '100000';

# Write a query to fetch all the records from the EmployeeInfo table ordered by EmpLname in descending order and Department in the ascending order
alter table EmployeeInfo
	add column Department varchar(20) after EmpLname;

update EmployeeInfo
set Department = "Developer"
where EmpID = 5;
SELECT * FROM EmployeeInfo ORDER BY EmpLname desc, Department asc;
