use foreginkey;
select * from department;
# TCL
start transaction;
insert into department values(150, "Finance");
update department set name = "Marketing" where deptId=105;

rollback;
commit;
# ------------------------------------------------ 
# DCL
select user from mysql.user;		# shows list of created users
select user();						# current working user

grant insert on department to Deva@localhost;
revoke insert on department from Deva@localhost;
