create database employee;
use employee;
create table Employees(
	Emp_Id int,
    Emp_Name varchar(50),
    Post varchar(50));
    
    show tables;
    
    desc Employees;
    
    insert into Employees(Emp_Id, Emp_Name, Post)
		values(101, "Devashish", "CEO");
	
    select * from Employees;
    
        insert into Employees(Emp_Id, Emp_Name, Post)
		values(102, "Kshitij", "Manager");
        
            insert into Employees(Emp_Id, Emp_Name, Post)
		values(103, "Raman", "Developer");
        
	UPDATE Employees 
    SET Emp_Name="Pranav" 
    WHERE Emp_Id=103;
    
    DELETE from Employees
    where Emp_Id=103;
    
    alter table Employees
    add column salary decimal(10,2) after Post;
    
    update Employees
    set salary = 10000
    where Emp_Id = 103;
    
        select * from Employees;