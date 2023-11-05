create database lab;

use lab;

create table orders(
	ord_no bigint,
    purch_amt decimal(10,2),
    ord_date date,
    customer_id int,
    salesman_id int );
    
show tables;
select * from orders;

insert into orders(ord_no, purch_amt, ord_date, customer_id, salesman_id)
values(70001,150.5,'2012-10-05',3005,5002);
insert into orders(ord_no, purch_amt, ord_date, customer_id, salesman_id)
values(70009,270.65,'2012-09-10',3001,5005);
insert into orders(ord_no, purch_amt, ord_date, customer_id, salesman_id)
values(70002,65.26,'2012-10-05',3002,5001);
insert into orders(ord_no, purch_amt, ord_date, customer_id, salesman_id)
values(70005,2400.6,'2012-07-27',3007,5001);
insert into orders(ord_no, purch_amt, ord_date, customer_id, salesman_id)
values(70008,5760,'2012-09-10',3002,5001);

# 1. the average purchase amount of all orders.
select avg(purch_amt) as 'Average' from orders;

# 2. the number of unique salespeople. Return number of salespeople.
select count(distinct (salesman_id)) as 'No. of salesperson'  from orders;

#total purchase amount.
select sum(purch_amt) as 'Total Amount' from orders;

#Return salesperson ID and city.
alter table orders
	add column city varchar(50) after salesman_id;
    
update orders
	set city = 'Nagpur'
    where salesman_id = 5001;
    
update orders
	set city = 'Delhi'
    where salesman_id = 5002;
    
update orders
	set city = 'Mumbai'
    where salesman_id = 5005;
    
select * from orders;
select distinct(salesman_id) as 'salesperson ID', city as 'City' from orders;