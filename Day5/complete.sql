CREATE DATABASE college;
USE college;
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30),
    salary DECIMAL(10,2)
);
INSERT INTO employee VALUES
(1, 'John', 'CSE', 30000),
(2, 'Alice', 'ECE', 35000),
(3, 'Bob', 'CSE', 40000),
(4, 'David', 'ME', 32000);
SELECT * FROM employee;
UPDATE employee
SET salary = 45000
WHERE emp_id = 3;
SELECT * FROM employee;
CREATE TABLE student (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(30),
    marks INT
);
DESC student;
SHOW TABLES;
INSERT INTO student VALUES
(101, 'Alice', 'CSE', 85),
(102, 'Bob', 'ECE', 78),
(103, 'Charlie', 'CSE', 92),
(104, 'David', 'ME', 70);
SELECT * FROM student;
UPDATE employee
SET department = 'IT'
WHERE emp_id = 2;
DELETE FROM employee
WHERE emp_id = 4;
SELECT * FROM employee;


CREATE DATABASE company;
USE company;

CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30),
    salary INT
);

INSERT INTO employee VALUES
(1, 'John', 'CSE', 30000),
(2, 'Alice', 'ECE', 40000),
(3, 'Bob', 'CSE', 50000),
(4, 'David', 'ME', 35000),
(5, 'Ravi', 'ECE', 45000);
SELECT emp_name, salary
FROM employee
WHERE salary > (
    SELECT AVG(salary)
    FROM employee
);
SELECT emp_name, salary
FROM employee
WHERE salary = (
    SELECT MAX(salary)
    FROM employee
);
SELECT emp_name
FROM employee
WHERE department = (
    SELECT department
    FROM employee
    WHERE emp_name = 'John'
);
SELECT emp_name, salary
FROM employee
WHERE salary > (
    SELECT salary
    FROM employee
    WHERE emp_name = 'John'
);

SELECT emp_name, department
FROM employee
WHERE department IN (
    SELECT department
    FROM employee
    WHERE salary > 40000
);



CREATE DATABASE college1;

USE college1;

CREATE TABLE student (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(30),
    marks INT
);

INSERT INTO student VALUES
(101, 'Alice', 'CSE', 85),
(102, 'Bob', 'ECE', 78),
(103, 'Charlie', 'CSE', 92);

SELECT * FROM student;
Step 2: Save the script
Save the file as:
college.sql
Step 3: Execute
Click the Execute button ⚡ in MySQL Workbench.
Complete script


CREATE DATABASE college;

USE college;

CREATE TABLE student (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(30),
    marks INT
);

INSERT INTO student VALUES
(101, 'Alice', 'CSE', 85),
(102, 'Bob', 'ECE', 78),
(103, 'Charlie', 'CSE', 92);

SELECT * FROM student;
create database user_management;
SHOW DATABASES;
use user_management;

CREATE DATABASE jdbc_learning;
USE jdbc_learning;
show databases;
CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    age INT,
    department VARCHAR(50)
);
show tables;
DESC students;

SELECT VERSION();

SHOW DATABASES;
create database college1;
show databases;
use college1;
create table student (
id int primary key,
name varchar(99),
age int,
department varchar(50),
city varchar(99) );
show tables;
desc student;
INSERT INTO student
VALUES (101, 'Rahul', 21, 'CSE', 'Hyderabad');
INSERT INTO student VALUES
(102, 'Priya', 22, 'ECE', 'Bangalore'),
(103, 'Arun', 20, 'CSE', 'Chennai'),
(104, 'Sneha', 21, 'IT', 'Hyderabad'),
(105, 'Kiran', 23, 'ECE', 'Vijayawada'),
(106, 'Anjali', 20, 'IT', 'Bangalore');
select * from student;
select name , age from student;
select distinct department from student;
select * from student where id=101;
select * from student where age>21;
select name , age from student;
select distinct department from student;
select * from student where id=101;
select * from student where age>20 and department='cse';
select * from student where  Not department='cse';
select * from student where age between 20 and 22;
select * from student where department in ('cse','ece','it');
select * from student where name LIKE 'A%';
select * from student where name LIKE '%A';
select * from student where name LIKE '%A%';
select * from student where name LIKE '___A%';
select * from student order by age desc;
select * from student order by age asc;
select * from student limit 3;
update student set city='mumbai' where id = 101;
select * from student;
update student set city='delhi',age=22 where id = 102;
select * from student;
delete from student where id=106;
select * from student;
alter table student add email varchar(99);
desc student;
alter table student modify name varchar(88);
alter table student rename column city to address;
desc student;
alter table student drop column email;
desc student;

select count(*) from student; 
select avg(age) from student;
select min(age) from student;
select max(age) from student;
select sum(age) from student;




select department,count(*) from  student
group by department;
select department,min(age) from  student group by department;
select department,max(age) from student group by department;

select department,count(*) as stdent_details from  student
group by department having count(*)=2;

CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    hod VARCHAR(100)
);
INSERT INTO departments VALUES
(1, 'CSE', 'Ramesh'),
(2, 'ECE', 'Suresh'),
(3, 'IT', 'Mahesh'),
(4, 'AI&DS', 'Lakshmi');

show tables;

select student.name, departments.hod
from student 
left join departments
on student.department=departments.department_name;

select student.name, departments.hod
from student 
right join departments
on student.department=departments.department_name;

select * from student where age>(select avg(age) from student); 



select * from student;
select name , department from student;
select * from student where id=105;
select * from student where age > 21;
select * from student where department='cse';
select * from studnet where address='Bangalore';
select * from stduent where age between 20 and 22;
select * from student where department in ('cse','ece','it');
select * from student where name LIKE 'A%';
select * from student order by age asc;


select * from student order by age desc limit 3;
select count(*) from student ;
select avg(age) from student ;
select * from student order by age asc limit 1;
select * from student order by age desc limit 1;
select department,count(*) from  student group by department;
select department,avg(age) from  student group by department;
select department,count(*) as stdent_details from  student
group by department having count(*)>2;
update student set address='kuppam' where id=107;
delete from student  where id=110;


select * from student where age>(select avg(age) from student);
select * from student where age=(select max(age) from student);
select * from student where address not in ('Bangalore','Hydrabad');
select department,count(*) as dep from  student group by department order by dep desc;
select department from  student group by department order by count(*) desc limit 1;

create database Learned;
use learned;
CREATE TABLE student (
    student_id INT PRIMARY KEY,
    name VARCHAR(50),
    department VARCHAR(30),
    marks INT
);
show tables;
desc student;

select * from student;

create database college_management;
show databases;
use college_management;
create database student_records;
show databases;
drop database student_records;
show databases;

create table students(
student_id int primary key,
student_name varchar(99),
age int,
gender varchar(10),
department varchar(10),
city varchar(10),
marks varchar(99),
admission_date varchar(99)
);

desc students;
show tables;

create table teachers(
teacher_id int primary key,
teacher_name varchar(99),
subject varchar(99),
salary int,
department varchar(99)
);
insert into students values(101,'kishore',19,'male','cse','kuppam',90,'19/6/2026');
insert into students values
(102,'anu',19,'female','ece','ananthapur',78,'19/20/2026'),(3, 'Sneha', 19, 'Female', 'CSE', 'Karimnagar', '92', '2026-11-21'),
(4, 'Arjun', 22, 'Male', 'MECH', 'Nizamabad', '75', '2026-11-22'),
(5, 'Priya', 20, 'Female', 'EEE', 'Hyderabad', '88', '2026-11-23'),
(6, 'Ravi', 21, 'Male', 'CIVIL', 'Khammam', '80', '2026-11-24');

insert into students
 (student_id,student_name,department,city) 
 values
 (7,"anjali","cse","hyderabad"); 
 INSERT INTO students
VALUES
(8, 'Vikram', 20, 'Male', 'ECE', 'Hyderabad', '81', '2026-11-25'),
(9, 'Meena', 21, 'Female', 'MECH', 'Warangal', '79', '2026-11-25'),
(10, 'Suresh', 22, 'Male', 'EEE', 'Karimnagar', '84', '2026-11-25');

INSERT INTO students
VALUES
(11, 'Asha', 20, 'Female', 'CSE', 'Hyderabad', '90', '2026-11-26'),
(12, 'Kiran', 21, 'Male', 'CSE', 'Warangal', '82', '2026-11-26'),
(13, 'Deepa', 19, 'Female', 'CSE', 'Nizamabad', '87', '2026-11-26');

select * from students;


select * from students;
select marks from students;
select student_name,marks from students;
select student_name,marks,department from students;
select distinct department from students;
select distinct city from students;
select distinct department,city from students;
select student_name as Name from students;
select marks as student_Marks from students;

select * from students;

select * from students where department="cse";
select * from students where marks>80;
select * from students where age=20;
select * from students where age<=20;
select * from students where marks<=75;
select * from students where not department="cse";
select * from students where marks between 70 and 90;
select * from students where department="cse" and marks>80;
select * from students where city="Bangalore" and city="Mysore";
select * from students where not city="Hyderabad";
select * from students where gender="female" and marks > 85;

select * from students where student_name like "a%";
select * from students where student_name like "%a";
select * from students where student_name like "%an%";
select * from students where student_name like "_____";
select * from students where department in ("cse","ece","ise");
select * from students where city in ( "Bangalore", "Chennai","Hyderabad");
select * from students where marks between 70 and  90;
select * from students where age between 19 and 21;
select * from students where student_name not like "p%";
select * from students where marks not between 60 and 80; 

select * from students order by student_name asc;
select * from students order by marks desc;
select * from students order by age asc;
select * from students order by student_name asc;
select * from students order by marks desc limit 3;
select * from students order by marks asc limit 1;
select * from students limit 5;
select * from students order by marks desc limit 5;
select * from students where department="cse" limit 3;
select * from students order by department,marks desc;


update students set marks=90 where student_name="rahul";
update students set city="Bangalore" where student_name="sneha";
update students set marks=marks+5 where department="cse";
UPDATE students SET marks = marks + 5 WHERE department = 'CSE';
update students set department="cse" where student_id=105;
update students set age=21 where age =20;
update students set city="Bangalore"  where city="Mysore";
update students set marks=marks+10 where marks<70;
update students set department="cse" where student_id=102;

update students set marks=90 where name="rahul";
update students set city="Bangalore" where name="sneha";
update students set marks=marks+5 where department="cse";
update students set department="cse" where student_id = 105;
update students set age=21 where age=20;
update students set city="Bangalore" where city="Mysore";
update students set marks=marks+10 where marks<70;
update students set department="ece" where student_id=105;

delete from students where student_id=110;
delete from students where department="CIVIL";
delete from students where marks<40;
delete from students where city="pune";
delete from students where age > 22;
select * from students;
delete from students; 

alter table students add email varchar(99);
alter table students add phone_number varchar(99);
alter table student modify student_name varchar(80);
alter table students modify marks bigint;
alter table students rename column city to student_city;
alter table students drop column phone_number;
alter table students rename to collage_students;
alter table collage_students rename to students;

CREATE TABLE departments (
    department_id INT PRIMARY KEY
);

CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(99) NOT NULL,
    email VARCHAR(99) UNIQUE,
    age INT CHECK (age >= 18),
    salary INT DEFAULT 15000,
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES departments(department_id)
);
INSERT INTO departments VALUES (1);
INSERT INTO employees VALUES (101,'Rahul','rahul@gmail.com',21,25000,1);
INSERT INTO employees VALUES (103,NULL,'anu@gmail.com',22,20000,1);
INSERT INTO employees VALUES (102,'Rahul','kishu@gmail.com',21,25000,1);
INSERT INTO employees VALUES (103,'Rahul','kishu@gmail.com',21,2000,2);
INSERT INTO employees VALUES (104,'Anu','anu@gmail.com',16,5,1);
INSERT INTO employees
(employee_id, employee_name, email, age, department_id)
VALUES
(105,'Priya','priya@gmail.com',20,1);
INSERT INTO departments VALUES (90);
select * from departments;

select * from  employees;


show tables;

select count(*) students  from students;
select avg(marks) from students;
select max(marks) from students;
select min(marks) from students;
select sum(marks) from students;
select count(*) as cse_count from students where department="cse";
select avg(age) from students;
select count(*) from students where student_city="bangalore";
select avg(marks) from students where gender="female";
select max(marks)-min(Marks) from students;


select department,count(*) as total_students from students group by department;
select department,avg(marks) as Average_of_depts from students group by department;
select department,max(marks) as Highest_Marks from students group by department;
select department,min(marks) as Minimum_marks from students group by department;
select department,sum(marks) as Total_Marks from students group by department;
select gender,count(*) as Gender_Count from students group by gender;
select student_city,count(*) from students group by student_city;
select department,avg(age) from students group by department;
select student_city,count(*) from students group by student_city;
select gender , avg(marks) from students group by gender;

SELECT department, COUNT(*) AS CountMoreThanTwo FROM students GROUP BY department HAVING COUNT(*) > 2;
select department,avg(marks) as AvgOfAllDepartments from students
 group by department having avg(marks)>80;
select student_city,count(*) as MORETHANONESTUDENT from students
group by student_city having  count(*)>1;
select department,max(marks) as MaxOfDep from students
group by department having max(marks)>90;
select department,sum(marks) from students
group by department having sum(marks)>200;
select gender,avg(marks) from students
group by gender having avg(marks)>80;
select department,avg(marks),count(*) from students 
group by department having avg(marks)>75 and count(*)>=3;























