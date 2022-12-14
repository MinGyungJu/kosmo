--1
SELECT EMPLOYEE_ID, FIRST_NAME || LAST_NAME AS FULLNAME, HIRE_DATE
FROM EMPLOYEES
WHERE TO_CHAR(HIRE_DATE,'YYYY') = 2003;
--2
SELECT *
FROM EMPLOYEES
WHERE JOB_ID ='FI_ACCOUNT'
OR JOB_ID = 'FI_MGR'
OR JOB_ID = 'SA_MAN'
OR JOB_ID = 'SA_REP';
--3
SELECT *
FROM EMPLOYEES
WHERE COMMISSION_PCT >0;
--4 
SELECT CASE JOB_ID 
                    WHEN 'SA_MAN' THEN '판매부서'
                    ELSE '그 외 부서'
                    END 
FROM EMPLOYEES;
--5
SELECT TO_CHAR(HIRE_DATE,'YYYY'),MIN(SALARY), MAX(SALARY), SUM(SALARY), AVG(SALARY)
FROM EMPLOYEES
GROUP BY TO_CHAR(HIRE_DATE,'YYYY');
--6
SELECT AVG(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID
HAVING AVG(SALARY)>=10000;
--7 부서별 최대 급여를 구하시오
SELECT MAX(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID;

--###### 오라클 정규식 표현
--# 아래와 같이 테이블을 생성하고 레코드를 입력한 후
--# REGEXP_LIKE  외에 REGEXP_REPALCE, REGEXP_INSTR, REGEXP_SUBSTR, REGEXP_COUNT 함수도 있음 그러나 아래의 예문은 regexp_like 함수를 이용하여도 무방함.
CREATE TABLE reg_tab( text varchar2(20) );

INSERT INTO reg_tab VALUES('TIGER');

INSERT INTO reg_tab VALUES('TIGGER');

INSERT INTO reg_tab VALUES('elephant');

INSERT INTO reg_tab VALUES('tiger');

INSERT INTO reg_tab VALUES('tiger2');

INSERT INTO reg_tab VALUES('tiger3');

INSERT INTO reg_tab VALUES('doggy');

INSERT INTO reg_tab VALUES('5doggy');

INSERT INTO reg_tab VALUES('DOG');

INSERT INTO reg_tab VALUES('DOG2');

INSERT INTO reg_tab VALUES('개');

INSERT INTO reg_tab VALUES('cat');

INSERT INTO reg_tab VALUES('catty');

INSERT INTO reg_tab VALUES('9catty');

INSERT INTO reg_tab VALUES('catwoman');

INSERT INTO reg_tab VALUES('고양이');

INSERT INTO reg_tab VALUES('BAT');

INSERT INTO reg_tab VALUES('BATMAN');

INSERT INTO reg_tab VALUES('BATGIRL'); 

INSERT INTO reg_tab VALUES('0BATGIRL'); 

INSERT INTO reg_tab VALUES('박쥐');
COMMIT;
DESC reg_tab;
-- 1.  text 컬럼의 문자열에서 't'로 시작하는 데이터 검색
SELECT *
FROM reg_tab
where SUBSTR(TEXT,1,1) like 't';

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'^t');


-- 2.  text 컬럼의 문자열에서 't'로 끝나는 데이터 검색
SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, 't$');
?
-- 3. 첫번째 't'로 시작하여 5번째 'r'이 있는 데이터 검색
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '^t...r');
?
-- 4. 숫자로 끝나는 데이터 검색
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '[0-9]$');


-- 5. 숫자로 시작하는 데이타 검색
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '^[0-9]');


-- 6. 숫자가 아닌 문자로 시작하는 데이터 검색
SELECT *
from reg_tab
WHERE  REGEXP_LIKE(TEXT, '^[0-9]');


-- 7. 대문자로 시작하는 데이터 검색
SELECT *
from reg_tab
WHERE  REGEXP_LIKE(TEXT, '^[A-Z]');


-- 8. 소문자 외의 문자로 시작하는 데이터 검색
SELECT *
from reg_tab
WHERE not REGEXP_LIKE(TEXT, '^[a-z]');


-- 9. 한글로 시작하는 데이터 검색
SELECT *
from reg_tab
WHERE not REGEXP_LIKE(TEXT, '^[가-힣]');
?

-- 10. 데이터 중 'gg'나 'GG'가 들어있는 데이터 검색
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, 'gg')
or REGEXP_LIKE(TEXT, 'GG');
?
