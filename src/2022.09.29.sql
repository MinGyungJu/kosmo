-- �������
/*
    �̸�      name        varchar2(10)
    �ֹι�ȣ    jumin       char(15)
    ��ȭ��ȣ    tel         varchar2(20)
    ����      gender      varchar(10)
    ����      age         number(3)
    �����     home       varchar2(20)
*/
-- CREATE TABLE table_name ( [column_name data_type] );

CREATE TABLE info_tab
(
    name       varchar2(10),
    jumin       char(15),
    tel         varchar2(20),
     gender      varchar(10),
     age         number(3),
     home       varchar2(20)
);

-- ���̺� ����Ȯ��
desc info_tab;

-- ����Ÿ Ȯ��
SELECT * From info_tab;

/* ���̺�� : student_score

�й�      id          char(4)
�л���     name        varchar2(20)
����      kor         number(3)
����      eng         number (3)
����      total         number
���      avg         number(5,2)     --���ڸ��� ��ü�ڸ��� 

*/
create Table student_score
(
      id          char(4),
    name        varchar2(20),
     kor         number(3),
     eng         number (3),
     total         number,
      avg         number(5,2) 
);
desc student_score;

SELECT * From student_score;

Drop table Student_score;

desc student_score;

create Table student_score
(
      id          char(4),
    name        varchar2(20),
     kor         number(3),
     eng         number (3),
     total         number,
      avg         number(5,2) 
);

desc student_score;

--���� �÷����߰�
--ALTER TABLE table_name ADD ( [ column_name data_type ] );

ALTER TABLE student_score ADD ( math number(3)  );

desc student_score;

--���� �÷��� �����ϱ�
--ALTER TABLE table_name DROP ( [ column_name ] );
ALTER TABLE student_score DROP (  total  );

desc student_score;

--��� �÷����� �Ҽ��� 1�ڷ� ����
--ALTER TABLE table_name MODIFY ( [ column_name data_type ] );
ALTER TABLE student_score MODIFY (avg  number(4,1));

desc student_score;

-- ����Ÿ �Է�
-- ���� : ' ' 
INSERT INTO student_score(id, name, kor, eng ) VALUES ( '0001','ȫ�浿',50,80 );

SELECT * From student_score;

-- 2000�� �й��� ȫ������ ����� ���������� ���� 60, 90������ ����
Insert into student_score(id, name , kor, eng) values ('2000','ȫ����',60,90);

SELECT * From student_score;

Commit;
Rollback;

-- 1000�� �л� ȫ��� ������ �����ض�
Insert into student_score(id, name ) values ('1000','ȫ���');
-- �̸��� ȫ����� �л��� ���ڵ带 ����
DELETE FROM student_score WHERE name = 'ȫ���';

SELECT * From student_score;

-- 0001�� �л��� ���������� 100������ ����
UPDATE student_score SET kor=100 WHERE ID ='0001';
SELECT * From student_score;

--ȫ������ ���������� 90������ �Է��ϱ�
UPDATE student_score SET  math=100 WHERE ID ='2000';
SELECT * From student_score;

--�л����� ��� ���ϱ�;
update student_score set avg=(kor+eng+nvl(math, 0)) /3 ;
SELECT * From student_score;

create table emp_copy 
    as select * from emp;
    
desc emp_copy;

--[ �������� ] emp ��ü emp_copy ���纻 ���̺� ���� ��
--1. �����ȣ�� 7788�� ����� �μ��� 10������ ����
UPDATE emp_copy SET deptno=10 WHERE Empno =7788;
SELECT * From emp_copy;
--2. �����ȣ�� 7782�� ����� �̸��� ȫ������� �����ϰ� �޿��� 3500���� ����
UPDATE emp_copy SET ENAME = 'ȫ���',sal =3500 WHERE Empno =7782;
SELECT * From emp_copy;
--3. ��� �μ����� ���ʽ��� 300�� �λ� ����
UPDATE emp_copy SET COmm =+300 ;
SELECT * From emp_copy;
rollback;
SELECT * From emp_copy;
UPDATE emp_copy SET COmm =comm+300 ;
SELECT * From emp_copy;
rollback;
UPDATE emp_copy SET COmm =(300+nvl(comm,0)) ;
SELECT * From emp_copy;
--4. �����ȣ�� 7499�� ����� ������ ����
DELETE FROM emp_copy WHERE EMPNO = 7499;
SELECT * From emp_copy;
--5. �Ի����ڰ� 81�� 6�� 1�� ������ ����� ������ ����
DELETE FROM emp_copy WHERE Hiredate <'81/06/01';
SELECT * From emp_copy;

DROP TABLE info_tab ;
CREATE TABLE info_tab
(
    name       varchar2(10),
    jumin       char(15),
    tel         varchar2(20),
     gender      varchar(10),
     age         number(3),
     home       varchar2(20)
);





