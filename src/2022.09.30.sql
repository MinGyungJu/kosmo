--8000번 사원으로 <본인이름>과 급여 10000 을 저장
INSERT INTO EMP( EMPNO, ename, sal ) VALUES ( 8000,'홍길자',10000 );

SELECT * FROM emp;
--{#}7788번 사원으로 <본인이름>과 급여 10000 을 저장 ,7788에 충돌
INSERT INTO EMP( EMPNO, ename, sal ) VALUES ( 7788,'홍길자',10000 );
SELECT * FROM emp;
INSERT INTO EMP( EMPNO, ename, sal, deptno ) VALUES ( 8001,'홍길국',10000,20 );
SELECT * FROM emp;
-- (#) dept 없어서
INSERT INTO EMP( EMPNO, ename, sal, deptno ) VALUES ( 8002,'홍길ehd',10000,50 );
----------------------------------------------------------------------------------
INSERT into INFO_TAB(tel , name, jumin,gender, age, home) --전체 칼럼을 쓰는걸 권장  (줄여도 가능은한데)
VALUES('032','홍자','801212','남자',33,'제주');

SELECT * FROM info_tab;

INSERT into INFO_TAB
VALUES('032','홍자','801212','남자',33,'제주');
SELECT * FROM info_tab;

INSERT into INFO_TAB(TEL, NAME) VALUES('1001', '홍길동');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '김길동');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '둘리');
ROLLBACK
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '둘리');
SELECT * FROM info_tab;

INSERT into INFO_TAB(tel , name, jumin,gender, age, home) --전체 칼럼을 쓰는걸 권장  (줄여도 가능은한데)
VALUES('032','홍자','801212','남자',33,'제주');

SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1001', '홍길동');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '김길동');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '둘리');
SELECT * FROM info_tab;
INSERT into INFO_TAB(NAME, JUMIN) VALUES('김길동', '901212-1234567');
INSERT into INFO_TAB(GENDER, AGE) VALUES('남자', 22);
INSERT into INFO_TAB(tel,GENDER, AGE) VALUES(9999,'남자', 22);
SELECT * FROM info_tab;

delete from Info_tab;
commit;
SELECT * FROM info_tab;

ALTER  TABLE   INFO_tab
ADD  CONSTRAINT  pk_info_tel  PRIMARY  KEY ( tel );

drop table info_tab;

CREATE TABLE info_tab
(
    name       varchar2(10) ,
    jumin       char(15),
    tel         varchar2(20),
     gender      varchar(10),
     age         number(3),
     home       varchar2(20),
     Constraint pk_info_tel primary key (tel)
);
drop table info_tab;
CREATE TABLE info_tab
(
    name       varchar2(10) ,
    jumin       char(15),
    tel         varchar2(20),
     gender      varchar(10),
     age         number(3),
     home       varchar2(20),
     Constraint pk_info_tel primary key (tel)
);
alter table info_tab
modify (name varchar2(10) not null);

alter table info_tab
add constraint uq_info_jumin unique(jumin);

insert into info_tab(tel, name, jumin) values('20001','홍실이','990101');
insert into info_tab(tel, name, jumin) values('20002','홍돌이','990101');
insert into info_tab(tel, name) values('20002','홍돌이'); -- 들어감

alter table info_tab 
add constraint ck_info_gender check (gender in ('남성','여성'));

insert into info_tab(tel, name, gender) values ('10001', '홍돌이', '남성');
insert into info_tab(tel, name, gender) values ('20001', '홍숙이', '남자');
insert into info_tab(tel, name, gender) values ('30001', '홍숙이', '여성');

alter table info_tab
    modify (gender varchar2(6)default '남성');

insert into info_tab(tel,name) values ('7777','홍이');    

-- [확인]


Insert INTO info_tab( name, tel, jumin ) 
VALUES('갑순이', '02-777-4444', '990909-1234567');

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('갑갑이','03-555-5555', '880808-1234567', '남자', 27,'경기');

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('홍길동','03-031-0310', '900909-1234567', '남성', 27,'경기');

INSERT INTO info_tab( name, jumin) VALUES('홍길자', '550505-1234567');

INSERT INTO info_tab( tel, jumin ) VALUES('031-777-7777', '700707-1234567');

INSERT INTO info_tab( name, tel, jumin ) VALUES('갑동이', '031-000-0000', '700707-1234567');

drop table info_tab;

CREATE TABLE info_tab
(
    name       varchar2(10) not null,
    jumin       char(15),
    tel         varchar2(20),
     gender      varchar2(10) default '남성',
     age         number(3),
     home       varchar2(20),
     deptno     number(2), 
     Constraint pk_info_tel primary key (tel),
     constraint uq_info_jumin unique (jumin),
     constraint ck_info_gender Check (gender in ('남성','여성')),
     constraint fk_info_deptno foreign key (deptno) references dept(deptno)
);

rollback;

insert into info_tab(tel, name, deptno) values('7777','맹이',20);
insert into info_tab(tel, name, deptno) values('8888','꽁이',20);
insert into info_tab(tel, name) values('9999','짱이');

CREATE TABLE sawon
(
  sabun         number(6),
  sawon_name    varchar2(15),
  ubmu          varchar2(30) default '개발',
  weolgub       number(7),
  buseo         number(3),
  jiyeok        varchar2(30) not null,
  Constraint pk_sawon_sabun primary key (sabun),
  constraint ck_sawon_ubmu check (ubmu in ('개발','유지보수','관리')),
  constraint fk_sawon_buseo foreign key(buseo) references buseo(buseo_no)
);
DROP TABLE sawon;

create table buseo
(
  buseo_no  number(3),
  buseo_name varchar2(30),
  constraint pk_buseo_no primary key(buseo_no)
);
DROP TABLE buseo;

insert into buseo(buseo_no, buseo_name) values(101,'소프트웨어유지보수부');
insert into buseo(buseo_no, buseo_name) values(202,'관리부');
insert into buseo(buseo_no, buseo_name) values(303,'인적자원부');
desc buseo;

insert into sawon(sabun, sawon_name,weolgub,buseo,jiyeok)
values(8001,'홍길동이군',100000,101,'부산');

--사무들어가서 안됨--
insert into sawon(sabun, sawon_name,ubmu,weolgub,buseo,jiyeok)
values(8002,'홍길자','사무',200000,202,'인천');
--부서에 111이 없음--
insert into sawon(sabun, sawon_name,ubmu,buseo,jiyeok)
values(8003,'홍길순','개발',111,'대전');

insert into sawon(sabun, sawon_name,weolgub,jiyeok)
values(8004,'홍길순',12345678,'서울');

insert into sawon(sabun, sawon_name,ubmu,buseo,jiyeok)
values(8005,'홍길철','유지보수',303,'판교');

--11-
ALTER TABLE sawon DROP ( jiyeok );
desc sawon;

--12-
--Foreign Key
DELETE FROM buseo WHERE buseo_name = '인적자원부';

--13-
truncate table sawon;
DROP TABLE sawon;

commit;
