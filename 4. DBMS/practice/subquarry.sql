use foreginkey;
select * from employee;
desc employee;

select empName from employee where 
did=(Select deptId from department where name = "Developer");

update employee set empSalary = empSalary + 5000 where
did=(Select deptId from department where name = "Developer");

select empSalary from employee order by (empSalary) desc limit 1 offset 1;

create view showView as
select max(empSalary) from employee where 
empSalary < (select max(empSalary) from employee);

select * from showView;
