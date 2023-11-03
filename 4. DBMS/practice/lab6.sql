create database lab6;
use lab6;

create table salesman(
	salesman_id int,
    name varchar(50),
    city varchar(50),
    commission decimal(2,2));

insert into salesman(salesman_id, name, city, commission)
values (5001,"James Hoog","California",0.15),
(5002,"Nail knite","Paris",0.13),
(5005,"Pit Alex","London",0.11),
(5006,"Mc Lyon","Paris",0.14),
(5007,"Paul Adam","Rome",0.13),
(5008,"Lauson","San Jose",0.12);

desc salesman;
create view showCali as
select * from salesman where city = "California";

select * from showCali;

create table customers(
	customer_id int,
    cust_name varchar(50),
    city varchar(50),
    grade int,
    salesman_id int
);

insert into customers(customer_id, cust_name,city, grade, salesman_id)
values(3002, " Nick Rimando","California",100,5001),
(3007, " Brad Davis ","California",200,5001),
(3005, " Graham Zusi ","New York",200,5002),
(3008, " Julian Green ","London",300,5002),
(3004, " Fabian Johnson ","Paris",300,5006);

select * from customers;

CREATE VIEW gradecount (grade, number)
AS SELECT grade, COUNT(*)
FROM customers
GROUP BY grade;

select * from gradecount;