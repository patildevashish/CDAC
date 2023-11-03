# lab task no 5
create database lab5;
use lab5;

create table products(
	srNo int,
    ID int,
    Category varchar(50),
    Product varchar(50),
    value int);

select * from products;

insert into products(srNO, Id, Category, Product, value)
values(1,1,"Non-veg", "Chicken",150);

insert into products(srNO, Id, Category, Product, value)
values(2,2,"Non-veg", "Mutton",200),
(3,3,"Non-veg", "Fish",220),
(4,4,"Non-veg", "Prawns",250),
(5,5,"Veg", "Gobi",100),
(6,6,"Veg", "Parota",45),
(7,7,"Veg", "vegbirinayi",150);

create table OrderDetails(
	OrderNumber bigint,
    OrderLine int,
    Part varchar(1));
insert into OrderDetails(OrderNumber, OrderLine, Part)
values (10001,1,"A"), 
(10001,2,"B"), 
(10001,3,"C"), 
(10002,1,"A"),
(10002,2,"B"),
(10002,3,"C"),
(10003,1,"A");

SELECT * FROM OrderDetails;
alter table products
add primary key(Id);

desc products;
desc OrderDetails;

alter table OrderDetails
add constraint OrderDetails foreign key(OrderLine) 
references products(Id); 

select * from products order by value;
