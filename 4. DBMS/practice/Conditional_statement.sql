select if( 10 < 20, "10 is smaller", "20 is smaller");

use foreginkey;
# if
select empName,empSalary, if(empSalary>50000,"Higher salary","Lower salary") as result from employee;

# ****************************************
# if else
delimiter //
create procedure salaryStatus(in id int)
begin
	declare salary decimal(10,2);
    declare status varchar(50);
    
    select empSalary into salary from employee where empId = id;
    
    if salary>50000 then
		set status = "Good Salary";
	else
		set status = "Less salary";
	end if;
    
    select status as Result;
end //
delimiter ;

call salaryStatus(5);
# ***********************************************************
# switch case
delimiter //
create procedure salaryStatus1(in id int)
begin
	declare salary decimal(10,2);
    declare status varchar(50);
    
    select empSalary into salary from employee where empId = id;
    
    set status = 
    case
		when salary > 70000 then "Excellent"
        when salary > 60000 then "Very Good"
        when salary > 50000 then "Good"
        else "Keep growing....."
        end;
    
    select status as Result;
end //
delimiter ;

call salaryStatus1(4);

#*************************************************************************************

#elseif

delimiter //
create procedure salaryStatus2(in id int)
begin
	declare salary decimal(10,2);
    declare status varchar(50);
    
    select empSalary into salary from employee where empId = id;
    
    if salary>50000 then
		set status = "Good Salary";
	elseif salary > 40000 and salary < 50000 then
		set status = "Nice salary";
	else
		set status = "Less salary";
	end if;
    
    select status as Result;
end //
delimiter ;

call salaryStatus2(4);
