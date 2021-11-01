
drop table if exists customer
drop table if exists employee
drop table if exists account
drop table if exists bank
drop table if exists customer_account
drop table if exists tranx

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

create table if not exists account (
	acc_id serial primary key,
	balance money,
	acc_type varchar(100)
);

create table if not exists customer_account (
	cid serial,
	acc_id serial,
	FOREIGN KEY (cid) REFERENCES customer(cid),
	FOREIGN KEY (acc_id) REFERENCES account(acc_id)
);

create table if not exists employee (
	eid serial primary key,
	first_name varchar(100),
	last_name varchar(100),
	user_name varchar(100),
	pass_word varchar(100),
	acc_id serial,
	FOREIGN KEY (acc_id) REFERENCES account(acc_id)
);

create table if not exists tranx (
	tid serial primary key,
	amount money,
	balance money,
	description text,
	acc_id serial,
	FOREIGN KEY (acc_id) REFERENCES account(acc_id)
);
