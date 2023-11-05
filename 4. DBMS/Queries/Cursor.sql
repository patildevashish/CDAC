use foreginkey;
delimiter //
create procedure cursor_demo1 ()
begin
declare name varchar(50);
declare salary decimal(15,2);
declare finished int default 0;

declare cursor1 cursor for select empName, empSalary from employee;
declare continue handler for not found set finished = 1;
open cursor1;
loop1:loop
	if finished 
	then leave loop1;
	end if;
fetch cursor1 into name, salary;

select name,salary;

end loop;

close cursor1;
end //
Delimiter ;
call cursor_demo1();

use assignment;
delimiter //
create procedure cursor_demo2()
begin
declare finish int default 0;
declare id int;
declare name varchar(50);

declare cursor3 cursor for select po_id, po_name from post_office;
declare continue handler for not found set finish = 1;
open cursor3;
loop2:loop
	if finish
    then leave loop2;
    end if;
fetch cursor3 into id,name;
select id,name;
end loop;
close cursor3;
end //
delimiter ;

call cursor_demo2();
