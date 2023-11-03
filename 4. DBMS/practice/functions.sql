use tp;

select char(22,44,88);
select concat("Devashish"," ","Patil");
select lower("DEVASHISH");
select upper("deva");
select trim("Deva");
select substr("Devashish",1,4);

select instr("My name is Deva", "a");
select length("Devashish Patil");

#---------------------------NUMERIC FUNCTION----------------------------------------------

select mod(10,2);
select power(10,2);
select round(193.25,1);
select truncate(193.222,2);

#---------------------------Date Function------------------------------------------------
select curdate();
select now();
select month(curdate());
select year(curdate());
select day(now());
select month('2023-12-23 3:45:00');
select weekday(curdate());
select week(curdate());
select sysdate();

#--------------------------Stored Function----------------------------------------------
Delimiter //
create function hello_sir()
	returns varchar(50)
    deterministic
begin
	return "Hallo sir";
end //
delimiter ;

select hello_sir();

delimiter //
create function addition(x int, y int)
	returns int
    deterministic
begin
	return(x+y);
end //
delimiter ; 

select addition(10,23);