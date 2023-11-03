# stored procedure
use foreginkey;

Delimiter  //
create procedure getAllemployee()
begin
	select empName from employee;
end //

delimiter ;

call getAllemployee();

delimiter //
create procedure getAllemplyeeAndNOs()
begin
	select empName from employee;
    select count(*) from employee;
end //
delimiter ;
call getAllemplyeeAndNOs();

# ***********************IN/OUT/INPUT**********************
# in
delimiter //
create procedure getSingleemplyee(in id int)
begin
	select empName from employee where empId = id;
end //
delimiter ;
call getSingleemplyee(3);

# out
delimiter //
create procedure findMaxSalary(out highestSalary decimal(10,2))
begin
	select max(empSalary) into highestSalary from employee;
end //
delimiter ;

call findMaxSalary(@d);
select @d as highest;

#***********************************************************
# inout

Delimiter //
create procedure findSalary(in id int, out Salary decimal(10,2))
begin
	select empSalary into Salary from employee where empid = id;
end //
delimiter ;

call findSalary(1,@m);
select @m as highest;

#****************************************************************

Delimiter //
create procedure updateSalary(inout sal decimal(10,2),in id int)
begin
	select empSalary into sal from employee where empId = id ;
    
    set sal = sal * 1.10;
    update employee set empSalary = sal where empId = id;
end //
delimiter ;

call updateSalary(@s,1);
select @s as "updated salary";