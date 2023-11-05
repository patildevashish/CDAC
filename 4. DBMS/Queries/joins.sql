#Joins
create database joins;
use joins;

create table customer(
	customerid int,
    firstname varchar(50),
    lastname varchar(50));

insert into customer(customerid, firstname, lastname)
values(101, 'Ramesh', 'Solanki');

insert into customer(customerid, firstname, lastname)
values(102, 'Suresh', 'Sharma');

insert into customer(customerid, firstname, lastname)
values(103, 'Bhavesh', 'Roy');

insert into customer(customerid, firstname, lastname)
values(104, 'Kailash', 'Gupta');

insert into customer(customerid, firstname, lastname)
values(105, 'Mahesh', 'Sharma');

select * from customer;

create table orders(
	ordid int,
    customerid int,
    prodname varchar(50));

insert into orders(ordid, customerid, prodname)
value(1, 102, 'laptop');

insert into orders(ordid, customerid, prodname)
value(2, 104, 'mobile');

insert into orders(ordid, customerid, prodname)
value(3, 102, 'camera');

insert into orders(ordid, customerid, prodname)
value(4, 106, 'bike');

insert into orders(ordid, customerid, prodname)
value(5, 108, 'chair');

select * from orders;

select customer.firstname, orders.prodname from customer inner join orders on customer.customerid = orders.customerid;

select customer.firstname, orders.prodname from customer left join orders on customer.customerid = orders.customerid;

select customer.firstname, orders.prodname from customer right join orders on customer.customerid = orders.customerid;

select * from customer union select * from orders;
