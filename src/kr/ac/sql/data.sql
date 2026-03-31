drop database ai;
-- MySQL : DBMS(데이터베이스관리시스템)
create database ai;
use ai;
-- 고객 테이블, 책, 구매 : 모델링
-- DDL(데이터베이스 정의언어)
create table customer(
                         cus_id int primary key auto_increment,
                         cus_name varchar(50),
                         cus_phone varchar(50) not null unique,
                         cus_email varchar(50) unique,
                         cud_date datetime default now()
);
drop table customer;
-- DML(데이터베이스관리언어) , DCL(데이터베이스제어언어)
-- SQL - select : 검색(Read)
select * from customer;
-- insert SQL : 생성(Create)
insert into customer(cus_name,cus_phone,cus_email)
values('박매일','010-1111-1111','aaa@ac.kr');

insert into customer(cus_name,cus_phone,cus_email)
values('홍길동','010-2222-1111','bbb@ac.kr');



