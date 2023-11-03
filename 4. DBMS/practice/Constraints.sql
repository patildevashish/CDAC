create database dac_sept_23;
use dac_sept_23;

create table voter(
	voterId int,
    voterName varchar(50) not null,
    age int check(age>=18),
    aadhar varchar(12) unique,
    income decimal(10,2) default 0.00,
    primary key(voterId)
    );
drop table voter;

insert into voter(voterId, voterName, age, aadhar, income) 
values(101, "Devashish", 22, "868561307952",10000000);

insert into voter(voterId, voterName, age, aadhar, income) 
values(102, "Kshitij", 28, "987456321012",1000000);

insert into voter(voterId, voterName, age, aadhar, income) 
values(103, "Pranav", 23, "987456321013",0);

insert into voter(voterId, voterName, age, aadhar, income) 
values(104, "Mahesh", 24, "987456321014",25000);

insert into voter(voterId, voterName, age, aadhar, income) 
values(106, "Raman", 23, null,30000);

update voter
set income = 45000
where voterId = 105;
select * from voter;
desc voter;

#Aggregate Function
select max(income) as "Highest Income" from voter;
select min(income) as "Lowest Income" from voter;
select sum(income) as "Total Income" from voter;
select count(*) as "Total record" from voter;
select avg(income) as "Average Income" from voter;

#clauses
select voterName, age from voter;
select voterName as Name, age as Age, income from voter where income>100000;
select voterName as Name, age as Age, income from voter where income in (25000);
select voterName as Name, age as Age, income from voter where income between 25000 and 20000000;
select voterName as Name, age as Age, income from voter where age > 20 and income>100000;

select * from voter where voterName like 'D%';
select * from voter where voterName like 'sh%';
select * from voter where voterName like '%sh%';

select voterName,income from voter order by income;
select voterName,income from voter order by income desc; 

select age,sum(income) from voter group by (age);
select age,sum(income) from voter group by (age) having age > 22;

select * from voter;
select * from voter where aadhar is null;
select * from voter where aadhar is not null;

select distinct(voterName) from voter;