
drop table if exists customer
drop table if exists employee
drop table if exists account
drop table if exists bank

create table if not exists customer (
	cid serial primary key,
	first_name varchar(100),
	last_name varchar(100),
	User_name varchar(100),
	pass_word varchar(100),
	address text,
	SSN varchar(100),
	DOB Date
);

create table if not exists employee (
	eid serial primary key,
	first_name varchar(100),
	last_name varchar(100),
	user_name varchar(100),
	pass_word varchar(100)
);

create table if not exists account (
	aid serial primary key,
	balance money
);
 
