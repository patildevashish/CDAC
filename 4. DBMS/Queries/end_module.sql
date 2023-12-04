use library;
#Q1
create table books(
	book_id int primary key,
    title VARCHAR(45),
    author VARCHAR(45),
    publication_year INT,
    price DECIMAL(10,0)
    );
select * from books;
#insert value into the table
insert into books(book_id,title,author,publication_year,price)
values(101,'The story of my life','Hellen Killer',2001,100),(102,'Gullivers Travells','XYZ',2002,150),
(103,'Chanakyaniti','Chanakya',1700,200);

select title from books where book_id = 102;

#change the information of specific book
update books 
set title = 'the new world',
author = 'XYZ',
publication_year = 1798,
 price = 300
 where book_id = 103;
 
#delete book record
delete from books where book_id=103;

#Q2
select * from employees;
CREATE TABLE employees(
	emp_id int primary key,
    emp_name varchar(50) not null,
    emp_salary decimal(10,2),
    emp_department varchar(50),
    emp_join_date date
	);
 #Insert   
delimiter //
create trigger insert_employee_trigger
before insert on employees
for each row
begin
    set new.emp_join_date = curdate();
end //
delimiter ;

insert into employees(emp_id,emp_name,emp_salary,emp_department)
values(101,'Devashish',50000.50,'IT');

insert into employees(emp_id,emp_name,emp_salary,emp_department)
values(102,'Kshitij',40000.50,'IT'),(103,'Ashwin',30000.50,'Finance'),(104,'Pranav',30000.50,'HR'),(106,'Shubham',30000.50,'Technical');

#update
delimiter //
create trigger update_employee_trigger
before insert on employees
for each row
begin
	if emp_salary = new.emp_salary then
    set new.emp_join_date = curdate();
    end if;
end //
delimiter ;

update employees set emp_id = 105
where emp_id = 106;

#delete
delimiter //
create trigger delete_employee_trigger
before delete on employees
for each row 
begin
	insert into delete_employee_log (emp_id,emp_name,emp_salary,emp_department,emp_join_date,date_of_deletation)
    values (old.emp_id,old.emp_name,old.emp_salary,old.emp_department,old.emp_join_date,curdate());
end //
delimiter ;

create table delete_employee_log(
	emp_id int primary key,
    emp_name varchar(50) not null,
    emp_salary decimal(10,2),
    emp_department varchar(50),
    emp_join_date date,
    date_of_deletation date
    );
delete from employees where emp_id = 104;
select * from delete_employee_log;
select * from employees;