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

-- Q. 고객의 이름,전화번호만 출력하세요.
select cus_name, cus_phone from customer;

-- Q. 이름을 기준으로 오름차순 정렬하여 출력하시오.
select * from customer order by cus_name desc; -- desc

-- Q. 전체 고객이 몆명인지 출력하시오.
select count(*) as cnt from customer; -- 2

-- Q. 이름에 홍으로 시작하는 고객을 모두 출력하시오.
select * from customer where cus_name='홍길동';
select * from customer where cus_name like '%홍';
select * from customer where cus_name like '홍%';
select * from customer where cus_name like '%홍%';

-- Q. 