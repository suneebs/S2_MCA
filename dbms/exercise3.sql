use university;
create table student (name varchar(20), student_number int, class int, major varchar(10));
insert into student values ('smith',17,1,'cs');
insert into student values ('Brown',8,2,'cs');

create table course (course_name varchar(50), course_number varchar(20), credit_hours int, department varchar(10));
insert into course values ('intro to computer science','CS1310',4,'cs');
insert into course values ('Data Structures','CS3320',4,'cs');
insert into course values ('Discrete Mathematics','MATH2410',3,'math');
insert into course values ('Database','CS3380',3,'cs');
select * from course;

create table section (section_identifier int, course_number varchar(20),semester varchar(10),year int, instructor varchar(20));
insert into section values(85,'MATH2410','fall',07,'King');
insert into section values(92,'CS1310','fall',07,'Anderson');
insert into section values(102,'CS3320','spring',08,'Knuth');
insert into section values(112,'MATH2410','fall',08,'Chang');
insert into section values(119,'CS1310','fall',08,'Anderson');
insert into section values(135,'CS3380','fall',08,'Stone');
select * from section;

create table grade_report(student_number int,section_identifier int,grade varchar(2));
insert into grade_report values(17,112,'B');
insert into grade_report values(17,119,'C');
insert into grade_report values(8,85,'A');
insert into grade_report values(8,92,'A');
insert into grade_report values(8,102,'B');
insert into grade_report values(8,135,'A');
SELECT * FROM grade_report;

create table prerequisite(course_number varchar(20),prerequisite_number varchar(20));
insert into prerequisite values('CS3380','CS3320');
insert into prerequisite values('CS3380','MATH2410');
insert into prerequisite values('CS3320','CS1310');
SELECT * FROM prerequisite;

-- Exercise questions //////////////////////////////////////////////////////////////////////////////////////
 
