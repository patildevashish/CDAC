# create stored procedure as generateEvenOddNumber
# fibbonicii
# factoral
create database tp;
use tp;
delimiter //
create procedure Evenodd()
begin
	declare n int;
    declare c varchar(50);
    set n = 5;
    if (n%2=0) then
		set c = 'number is even';
	else
		set c = 'number is odd';
	end if;
    
    select c as result;
end //
delimiter ;
drop procedure Evenodd;
call Evenodd();

-- --------------------------------------------------------------------------------------------
delimiter //
create procedure factorial()
begin
	declare n int default 5; 
    declare m int default 1;
    declare a int;
    declare str varchar(50);
    
    set a = 1;
    while m<=n do
    set a = a*m;
    set m = m+1;
    end while;
    select a as result;
end //
delimiter ;
drop procedure factorial;
call factorial();