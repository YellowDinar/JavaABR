create table student (
	id integer not null primary key,
	name varchar(30) );
create table lesson (
	id integer not null primary key,
	name varchar(30) );
create table exam (
	sid integer references student(id),
	lid integer references lesson(id),
	score integer );
insert into student values (1, 'Suleyman');
insert into student values (2, 'Rezeda');
insert into student values (3, 'Ilshat');
insert into lesson values (1, 'English');
insert into lesson values (2, 'Discrete Math');
insert into lesson values (3, 'Probability Theory');
insert into exam values(1,1,88);
insert into exam values(2,1,94);
insert into exam values(3,1,66);
insert into exam values(1,2,74);
insert into exam values(2,2,80);
insert into exam values(3,2,60);
insert into exam values(1,3,96);
insert into exam values(2,3,56);
insert into exam values(3,3,92);