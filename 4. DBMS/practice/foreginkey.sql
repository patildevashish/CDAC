create database foreginkey;
use foreginkey;

create table Department(
	deptId int primary key, 
    name varchar(50) not null
    );

create table Employee(
	empId int primary key,
    empName varchar(50) not null,
    empSalary decimal(15,2),
    did int,
    foreign key(did) references department(deptId)
    );

insert into Department(deptId, name)
values(101, 'Account'), (102, 'Developer'), (103,'Admin');
select * from department;

insert into employee(empId, empName, empSalary,did)
values(1, "Ramesh", 45789,102); 

insert into employee(empId, empName, empSalary,did)
values(2, "Suresh",35789,101), (3, "Kailash",55789,103),(4, "Bhavesh",75789,102),(5, "Dinesh",25789,101),(6, "Ganesh",75789,103);

select employee.did,employee.empName, department.name
from employee, department 
where employee.did=department.deptId;

select * from employee;
select * from department;


#Copy structure of existing table to new table
create table deprt like department;