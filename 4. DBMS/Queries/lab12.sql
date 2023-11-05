create database TriggersDemo;
use TriggersDemo;
create table Orders(
	OrderID int primary key auto_increment,
    CustomerName varchar(255),
    OrderDate date,
    TotalAmount decimal(10,2));

delimiter //
create trigger BeforeInsertTrigger
before insert on Orders
for each row
begin
	set new.OrderDate = curdate();
end //
delimiter ;

insert into Orders(CustomerName,TotalAmount)
values("Devashish",150.23);
insert into Orders(CustomerName,TotalAmount)
values("Kshitij",151.23),("Mahesh",201.1);
select * from orders;

########## Part3 ##########
delimiter //
create trigger BeforeUpdateTrigger
before update on Orders
for each row
begin
	if new.TotalAmount < old.TotalAmount then
		signal sqlstate '40000'
        set message_text='It is my Error message';
    end if;
end //
delimiter ;
drop trigger BeforeUpdateTrigger;
update Orders set TotalAmount = 1500
where OrderID = 1;

############ Part 4 ################

delimiter //
create trigger BeforeDeleteTrigger
before update on Orders
for each row
begin
	if 1000 < old.TotalAmount then
		signal sqlstate '40000'
        set message_text='Unable to delete';
    end if;
end //
delimiter ;

delete from Orders 
where OrderID = 3;