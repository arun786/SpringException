create table Profile(
	id integer not null AUTO_INCREMENT,
	profile_id varchar(16) auto_increment,
	prefix varchar(10),
	firstName varchar(100),
	lastName varchar(100),
	suffix varchar(10),
	primary key(id)
);

create table Phone(
	phone_id integer not null AUTO_INCREMENT,
	profile_id integer,
	phone_number varchar(200),
	area_code varchar(200),
	extension varchar(200),
	primary key(phone_id)
);


insert into Profile(prefix,firstName,lastName,suffix) values('Mr.','Arun','Singh','');
insert into Profile(prefix,firstName,lastName,suffix) values('Miss.','Adwiti','Singh','');
insert into Profile(prefix,firstName,lastName,suffix) values('Mrs.','Pushpa','Yadav','');

insert into Phone(profile_id,phone_number,area_code,extension) values (1,'4802321632','480','011');
insert into Phone(profile_id,phone_number,area_code,extension) values (2,'4802321633','480','012');
insert into Phone(profile_id,phone_number,area_code,extension) values (3,'4802321633','480','012');
