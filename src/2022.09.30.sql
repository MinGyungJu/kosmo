--8000�� ������� <�����̸�>�� �޿� 10000 �� ����
INSERT INTO EMP( EMPNO, ename, sal ) VALUES ( 8000,'ȫ����',10000 );

SELECT * FROM emp;
--{#}7788�� ������� <�����̸�>�� �޿� 10000 �� ���� ,7788�� �浹
INSERT INTO EMP( EMPNO, ename, sal ) VALUES ( 7788,'ȫ����',10000 );
SELECT * FROM emp;
INSERT INTO EMP( EMPNO, ename, sal, deptno ) VALUES ( 8001,'ȫ�汹',10000,20 );
SELECT * FROM emp;
-- (#) dept ���
INSERT INTO EMP( EMPNO, ename, sal, deptno ) VALUES ( 8002,'ȫ��ehd',10000,50 );
----------------------------------------------------------------------------------
INSERT into INFO_TAB(tel , name, jumin,gender, age, home) --��ü Į���� ���°� ����  (�ٿ��� �������ѵ�)
VALUES('032','ȫ��','801212','����',33,'����');

SELECT * FROM info_tab;

INSERT into INFO_TAB
VALUES('032','ȫ��','801212','����',33,'����');
SELECT * FROM info_tab;

INSERT into INFO_TAB(TEL, NAME) VALUES('1001', 'ȫ�浿');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '��浿');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '�Ѹ�');
ROLLBACK
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '�Ѹ�');
SELECT * FROM info_tab;

INSERT into INFO_TAB(tel , name, jumin,gender, age, home) --��ü Į���� ���°� ����  (�ٿ��� �������ѵ�)
VALUES('032','ȫ��','801212','����',33,'����');

SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1001', 'ȫ�浿');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '��浿');
SELECT * FROM info_tab;
INSERT into INFO_TAB(TEL, NAME) VALUES('1002', '�Ѹ�');
SELECT * FROM info_tab;
INSERT into INFO_TAB(NAME, JUMIN) VALUES('��浿', '901212-1234567');
INSERT into INFO_TAB(GENDER, AGE) VALUES('����', 22);
INSERT into INFO_TAB(tel,GENDER, AGE) VALUES(9999,'����', 22);
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

insert into info_tab(tel, name, jumin) values('20001','ȫ����','990101');
insert into info_tab(tel, name, jumin) values('20002','ȫ����','990101');
insert into info_tab(tel, name) values('20002','ȫ����'); -- ��

alter table info_tab 
add constraint ck_info_gender check (gender in ('����','����'));

insert into info_tab(tel, name, gender) values ('10001', 'ȫ����', '����');
insert into info_tab(tel, name, gender) values ('20001', 'ȫ����', '����');
insert into info_tab(tel, name, gender) values ('30001', 'ȫ����', '����');

alter table info_tab
    modify (gender varchar2(6)default '����');

insert into info_tab(tel,name) values ('7777','ȫ��');    

-- [Ȯ��]


Insert INTO info_tab( name, tel, jumin ) 
VALUES('������', '02-777-4444', '990909-1234567');

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('������','03-555-5555', '880808-1234567', '����', 27,'���');

INSERT INTO info_tab( name, tel, jumin, gender, age, home )
VALUES('ȫ�浿','03-031-0310', '900909-1234567', '����', 27,'���');

INSERT INTO info_tab( name, jumin) VALUES('ȫ����', '550505-1234567');

INSERT INTO info_tab( tel, jumin ) VALUES('031-777-7777', '700707-1234567');

INSERT INTO info_tab( name, tel, jumin ) VALUES('������', '031-000-0000', '700707-1234567');

drop table info_tab;

CREATE TABLE info_tab
(
    name       varchar2(10) not null,
    jumin       char(15),
    tel         varchar2(20),
     gender      varchar2(10) default '����',
     age         number(3),
     home       varchar2(20),
     deptno     number(2), 
     Constraint pk_info_tel primary key (tel),
     constraint uq_info_jumin unique (jumin),
     constraint ck_info_gender Check (gender in ('����','����')),
     constraint fk_info_deptno foreign key (deptno) references dept(deptno)
);

rollback;

insert into info_tab(tel, name, deptno) values('7777','����',20);
insert into info_tab(tel, name, deptno) values('8888','����',20);
insert into info_tab(tel, name) values('9999','¯��');

CREATE TABLE sawon
(
  sabun         number(6),
  sawon_name    varchar2(15),
  ubmu          varchar2(30) default '����',
  weolgub       number(7),
  buseo         number(3),
  jiyeok        varchar2(30) not null,
  Constraint pk_sawon_sabun primary key (sabun),
  constraint ck_sawon_ubmu check (ubmu in ('����','��������','����')),
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

insert into buseo(buseo_no, buseo_name) values(101,'����Ʈ��������������');
insert into buseo(buseo_no, buseo_name) values(202,'������');
insert into buseo(buseo_no, buseo_name) values(303,'�����ڿ���');
desc buseo;

insert into sawon(sabun, sawon_name,weolgub,buseo,jiyeok)
values(8001,'ȫ�浿�̱�',100000,101,'�λ�');

--�繫���� �ȵ�--
insert into sawon(sabun, sawon_name,ubmu,weolgub,buseo,jiyeok)
values(8002,'ȫ����','�繫',200000,202,'��õ');
--�μ��� 111�� ����--
insert into sawon(sabun, sawon_name,ubmu,buseo,jiyeok)
values(8003,'ȫ���','����',111,'����');

insert into sawon(sabun, sawon_name,weolgub,jiyeok)
values(8004,'ȫ���',12345678,'����');

insert into sawon(sabun, sawon_name,ubmu,buseo,jiyeok)
values(8005,'ȫ��ö','��������',303,'�Ǳ�');

--11-
ALTER TABLE sawon DROP ( jiyeok );
desc sawon;

--12-
--Foreign Key
DELETE FROM buseo WHERE buseo_name = '�����ڿ���';

--13-
truncate table sawon;
DROP TABLE sawon;

commit;
