# while loop
delimiter \\
create procedure while_loop()
begin
	declare num int default 1;
    declare result varchar(100) default '';
    
    set num = 1;
    set result = '';
    
    while num < 10 do
		set result = concat(result,num, ',');
		set num = num+1;
    end while;
    select result;
end \\
delimiter ;

call while_loop();

# *************************************************
# loop
delimiter // 
create procedure LoopDemo()
begin
	declare x int;
    declare str varchar(200);
    
    set x = 1;
    set str = '';
    
    label: loop
		if x > 10 then
        leave label;
        end if;
        
        set x = x + 1;
        if (x mod 2) then
			iterate label;
		else
			set str = concat(str,x,',');
		end if;
    end loop;
    select str as result;
end //
delimiter ;

call LoopDemo();

# *********************************************************************

# Repeat

delimiter // 
create procedure TestRepeat()
begin
	declare num int default 1;
    declare result varchar(100) default '';
    
    repeat
		set result = concat(result,num,',');
        set num = num*5;
	until num > 1000
    end repeat;
    select result;
end //
delimiter ;

call TestRepeat();