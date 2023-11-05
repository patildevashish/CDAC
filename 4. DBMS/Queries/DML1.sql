# for creation of database
create database dac23;

#for selecting the database
use dac23;

#for checking available databases
show databases;

# create a table
create table Employee(
empId int, empName varchar(20));

#check for table availability
show tables;


#check schema of table structure
desc employee;

#add new column to existing table
alter table employee
	add column depart varchar(50);

#add new column to existing table at particular position
alter table employee
	add column salary decimal(10,2) after empName;

# Modify Existing column in the table
alter table employee
	modify column empName varchar(50) not null;
    
#change name of the existing column
alter table employee
	change column salary  empSalary decimal(10,2); 
    
#change table name
alter table employee
	rename dacEmployee;
    
desc dacEmployee;

#delete particulat column
alter table dacEmployee
	drop column depart;
    
#Delete complete table structure 
Drop table dacEmployee; 

#Delete database
drop database dac23