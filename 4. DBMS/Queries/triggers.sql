create  table user(
	id int primary key auto_increment,
    name varchar(50),
    email varchar(50)
    );

create table audit_log(
	event_type varchar(50),
    event_description varchar(150)
);

## insert event ##
delimiter //
create trigger after_user_insert
after insert on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values ('Insert', concat('New user inserted: Id ',new.id,',Name',new.name,'Email ',new.email));
end //
delimiter ;

insert into user(name, email)
values("Ramesh","ram@gmail.com");

insert into user(name, email)
values("Suresh","sur@gmail.com");

## Delete ##
delimiter //
create trigger before_user_delete
before delete on user
for each row 
begin
	insert into audit_log(event_type, event_description)
    values ('Delete', concat('Old user Deleted: Id ',old.id,',Name',old.name,'Email ',old.email));
end //
delimiter ;

delete from user where id =2 ;

select * from audit_log;

## Update
delimiter //
create trigger after_user_update
after update on user
for each row
begin
	insert into audit_log(event_type, event_description)
    values ('Update', concat('User Updated: Id ',new.id,',Name',new.name,'Email ',new.email));
end //
delimiter ;

update user set email = "ramesh@gmail.com"
where id = 1;

# **********************************************************************************************
use foreginkey;
delimiter //
create trigger before_salary_insert
before insert on employee
for each row
begin
	if new.empSalary < 0 then
	set new.empSalary = 5000;
    end if;
end //
delimiter ;
drop trigger after_salary_insert;

insert into employee (empId,empName, empSalary,did) 
values(7,"Rutuja",-12000,102);

select * from employee;
