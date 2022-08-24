package com.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductManagementApplicationTests {

	@Test
	void contextLoads() {
	}
/*
create table MYUSER(
   userId VARCHAR(30) not null primary key,
   usedPw VARCHAR(50) not null,
   userNm VARCHAR(20) not null,
   userAddr VARCHAR(100) not null,
   userTel VARCHAR(15) not null
);

drop table myuser;

drop table board;

select * from myuser;

insert into MYUSER VALUES("ADMIN", "1234", "storeA", "seoul0", "02-123-4567");
insert into MYUSER VALUES("USER1", "1234", "storeB", "seoul1", "02-124-4568");
insert into MYUSER VALUES("USER2", "1234","storeC", "busan2", "051-125-4569");
insert into MYUSER VALUES("USER3", "1234","storeD", "suwon0", "031-126-4560");
insert into MYUSER VALUES("USER4", "1234","storeE", "daegu1", "053-123-4567");
insert into MYUSER VALUES("USER5", "1234","storeF", "incheon2", "032-124-4568");
insert into MYUSER VALUES("USER6", "1234","storeG", "gwangju7", "062-125-4569");
insert into MYUSER VALUES("USER7", "1234","storeAH", "jeju2", "064-126-4560");


create table User_Product(
   UserId varchar(50),
   PROKEY varchar(50),
   PROPRICE int not null,
   PROCNT int,
   PRONM varchar(50),
   constraint FK_PROKEY 
   foreign key (PROKEY) 
   references product(PROKEY),
   constraint FK_UserId 
   foreign key (UserId) 
   references MYUSER(userid)
);

drop table user_product;


CREATE TABLE `board` (
   `boardSeq`   int auto_increment primary key,
   `boardTitle`   varchar(200)   not NULL,
   `boardContent`   varchar(1000)   not NULL,
   `boardDate`   DATE   NULL,
   `userId`   varchar(100),
   foreign key (userId)
   references MYUSER(userId) 
);

create table orders(
   UserId varchar(50),
   PROKEY varchar(50),
   PROCNT int,
   userNm varchar(20)
);

drop table orders;

insert into user_product values("USER1","A1","15000","65","크리스피 치킨파우더");
insert into user_product values("USER1","A2","13000","42","뿌링클 가루");
insert into user_product values("USER1","A3","44900","39","왕갈비치킨 소스");
insert into user_product values("USER1","A4","34500","23","찜닭양념 간장");
insert into user_product values("USER1","B1","24000","100","치킨트레이 포장 용기");
insert into user_product values("USER1","B2","36000","100","종이박스 포장용기");
insert into user_product values("USER1","C1","21000","70","치즈맛 감자튀김");
insert into user_product values("USER1","C2","12000","30","떡");
insert into user_product values("USER1","D1","12000","150","닭");

insert into user_product values("USER2","A1","15000","75","크리스피 치킨파우더");
insert into user_product values("USER2","A2","13000","50","뿌링클 가루");
insert into user_product values("USER2","A3","44900","43","왕갈비치킨 소스");
insert into user_product values("USER2","A4","34500","32","찜닭양념 간장");
insert into user_product values("USER2","B1","24000","200","치킨트레이 포장 용기");
insert into user_product values("USER2","B2","36000","150","종이박스 포장용기");
insert into user_product values("USER2","C1","21000","120","치즈맛 감자튀김");
insert into user_product values("USER2","C2","12000","70","떡");
insert into user_product values("USER2","D1","12000","300","닭");


select * from user_product;
select * from myuser;


create table Product(
   PROKEY varchar(50) primary key,
   PROPRICE int not null,
   PROCNT int,
   PRONM varchar(50)
);

drop table user_product;
drop table product;


insert into product values("A1","15000","1000","크리스피 치킨파우더");
insert into product values("A2","13000","1500","뿌링클 가루");
insert into product values("A3","44900","700","왕갈비치킨 소스");
insert into product values("A4","34500","800","찜닭양념 간장");
insert into product values("B1","24000","5000","치킨트레이 포장 용기");
insert into product values("B2","36000","8000","종이박스 포장 용기");
insert into product values("C1","21000","3000","치즈맛 감자튀김");
insert into product values("C2","12000","800","떡");
insert into product values("D1","2000","10000","닭");


create table profit(
	month int,
	profit int,
	userId varchar(10)
);
drop table profit;

insert into profit values (1,6, 'USER1');
insert into profit values (2,100, 'USER1');
insert into profit values (3,10, 'USER1');
insert into profit values (4,80, 'USER1');
insert into profit values (6,30, 'USER1');
insert into profit values (7,150, 'USER1');
insert into profit values (8,100, 'USER1');
insert into profit values (9,30, 'USER1');
insert into profit values (10,70, 'USER1');
insert into profit values (11,50, 'USER1');
insert into profit values (12,50, 'USER1');
insert into profit values (1,100, 'USER2');
insert into profit values (2,30, 'USER2');
insert into profit values (3,50, 'USER2');
insert into profit values (4,30, 'USER2');
insert into profit values (5,40, 'USER2');
insert into profit values (6,20, 'USER2');
insert into profit values (7,100, 'USER2');
insert into profit values (8,100, 'USER2');
insert into profit values (9,150, 'USER2');
insert into profit values (10,10, 'USER2');
insert into profit values (11,50, 'USER2');
insert into profit values (12,90, 'USER2');
insert into profit values (1,100, 'USER3');
insert into profit values (2,30, 'USER3');
insert into profit values (3,40, 'USER3');
insert into profit values (4,60, 'USER3');
insert into profit values (5,70, 'USER3');
insert into profit values (6,100, 'USER3');
insert into profit values (7,100, 'USER3');
insert into profit values (8,30, 'USER3');
insert into profit values (9,40, 'USER3');
insert into profit values (10,50, 'USER3');
insert into profit values (11,60, 'USER3');
insert into profit values (12,70, 'USER3');
insert into profit values (1,80, 'USER4');
insert into profit values (2,90, 'USER4');
insert into profit values (3,100, 'USER4');
insert into profit values (4,30, 'USER4');
insert into profit values (5,40, 'USER4');
insert into profit values (6,60, 'USER4');
insert into profit values (7,70, 'USER4');
insert into profit values (8,90, 'USER4');
insert into profit values (9,100, 'USER4');
insert into profit values (10,10, 'USER4');
insert into profit values (11,20, 'USER4');
insert into profit values (12,300, 'USER4');

select * from profit;
CREATE TABLE `board` (
   `boardSeq`   int auto_increment primary key,
   `boardTitle`   varchar(200)   not NULL,
   `boardContent`   varchar(1000)   not NULL,
   `boardDate`   DATE   NULL,
   `userId`   varchar(100),
   foreign key (userId)
   references MYUSER(userId) 
);

drop table board;
*/
}
