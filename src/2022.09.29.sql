-- 구조잡기
/*
    이름      name        varchar2(10)
    주민번호    jumin       char(15)
    전화번호    tel         varchar2(20)
    성별      gender      varchar(10)
    나이      age         number(3)
    출신지     home       varchar2(20)
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

-- 테이블 구조확인
desc info_tab;

-- 데이타 확인
SELECT * From info_tab;

/* 테이블명 : student_score

학번      id          char(4)
학생명     name        varchar2(20)
국어      kor         number(3)
영어      eng         number (3)
총점      total         number
평균      avg         number(5,2)     --앞자리는 전체자리수 

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

--수학 컬럼을추가
--ALTER TABLE table_name ADD ( [ column_name data_type ] );

ALTER TABLE student_score ADD ( math number(3)  );

desc student_score;

--총점 컬럼을 삭제하기
--ALTER TABLE table_name DROP ( [ column_name ] );
ALTER TABLE student_score DROP (  total  );

desc student_score;

--평균 컬럼에서 소수점 1자로 변경
--ALTER TABLE table_name MODIFY ( [ column_name data_type ] );
ALTER TABLE student_score MODIFY (avg  number(4,1));

desc student_score;

-- 데이타 입력
-- 문자 : ' ' 
INSERT INTO student_score(id, name, kor, eng ) VALUES ( '0001','홍길동',50,80 );

SELECT * From student_score;

-- 2000번 학번인 홍길자의 국어와 영어점수를 각각 60, 90점으로 저장
Insert into student_score(id, name , kor, eng) values ('2000','홍길자',60,90);

SELECT * From student_score;

Commit;
Rollback;

-- 1000번 학생 홍길숙 정보를 저장해라
Insert into student_score(id, name ) values ('1000','홍길숙');
-- 이름이 홍길숙인 학생의 레코드를 삭제
DELETE FROM student_score WHERE name = '홍길숙';

SELECT * From student_score;

-- 0001번 학생의 국어점수를 100점으로 수정
UPDATE student_score SET kor=100 WHERE ID ='0001';
SELECT * From student_score;

--홍길자의 수학점수를 90점으로 입력하기
UPDATE student_score SET  math=100 WHERE ID ='2000';
SELECT * From student_score;

--학생들의 평균 구하기;
update student_score set avg=(kor+eng+nvl(math, 0)) /3 ;
SELECT * From student_score;

create table emp_copy 
    as select * from emp;
    
desc emp_copy;

--[ 연습문제 ] emp 전체 emp_copy 복사본 테이블 생성 후
--1. 사원번호가 7788인 사원의 부서를 10번으로 변경
UPDATE emp_copy SET deptno=10 WHERE Empno =7788;
SELECT * From emp_copy;
--2. 사원번호가 7782인 사원의 이름을 홍길숙으로 변경하고 급여를 3500으로 변경
UPDATE emp_copy SET ENAME = '홍길숙',sal =3500 WHERE Empno =7782;
SELECT * From emp_copy;
--3. 모든 부서원의 보너스를 300씩 인상 변경
UPDATE emp_copy SET COmm =+300 ;
SELECT * From emp_copy;
rollback;
SELECT * From emp_copy;
UPDATE emp_copy SET COmm =comm+300 ;
SELECT * From emp_copy;
rollback;
UPDATE emp_copy SET COmm =(300+nvl(comm,0)) ;
SELECT * From emp_copy;
--4. 사원번호가 7499인 사원의 정보를 삭제
DELETE FROM emp_copy WHERE EMPNO = 7499;
SELECT * From emp_copy;
--5. 입사일자가 81년 6월 1일 이전인 사원의 정보를 삭제
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





