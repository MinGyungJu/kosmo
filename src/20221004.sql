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
                    WHEN 'SA_MAN' THEN '�Ǹźμ�'
                    ELSE '�� �� �μ�'
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
--7 �μ��� �ִ� �޿��� ���Ͻÿ�
SELECT MAX(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID;

--###### ����Ŭ ���Խ� ǥ��
--# �Ʒ��� ���� ���̺��� �����ϰ� ���ڵ带 �Է��� ��
--# REGEXP_LIKE  �ܿ� REGEXP_REPALCE, REGEXP_INSTR, REGEXP_SUBSTR, REGEXP_COUNT �Լ��� ���� �׷��� �Ʒ��� ������ regexp_like �Լ��� �̿��Ͽ��� ������.
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

INSERT INTO reg_tab VALUES('��');

INSERT INTO reg_tab VALUES('cat');

INSERT INTO reg_tab VALUES('catty');

INSERT INTO reg_tab VALUES('9catty');

INSERT INTO reg_tab VALUES('catwoman');

INSERT INTO reg_tab VALUES('�����');

INSERT INTO reg_tab VALUES('BAT');

INSERT INTO reg_tab VALUES('BATMAN');

INSERT INTO reg_tab VALUES('BATGIRL'); 

INSERT INTO reg_tab VALUES('0BATGIRL'); 

INSERT INTO reg_tab VALUES('����');
COMMIT;
DESC reg_tab;
-- 1.  text �÷��� ���ڿ����� 't'�� �����ϴ� ������ �˻�
SELECT *
FROM reg_tab
where SUBSTR(TEXT,1,1) like 't';

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'^t');


-- 2.  text �÷��� ���ڿ����� 't'�� ������ ������ �˻�
SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, 't$');
?
-- 3. ù��° 't'�� �����Ͽ� 5��° 'r'�� �ִ� ������ �˻�
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '^t...r');
?
-- 4. ���ڷ� ������ ������ �˻�
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '[0-9]$');


-- 5. ���ڷ� �����ϴ� ����Ÿ �˻�
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '^[0-9]');


-- 6. ���ڰ� �ƴ� ���ڷ� �����ϴ� ������ �˻�
SELECT *
from reg_tab
WHERE  REGEXP_LIKE(TEXT, '^[0-9]');


-- 7. �빮�ڷ� �����ϴ� ������ �˻�
SELECT *
from reg_tab
WHERE  REGEXP_LIKE(TEXT, '^[A-Z]');


-- 8. �ҹ��� ���� ���ڷ� �����ϴ� ������ �˻�
SELECT *
from reg_tab
WHERE not REGEXP_LIKE(TEXT, '^[a-z]');


-- 9. �ѱ۷� �����ϴ� ������ �˻�
SELECT *
from reg_tab
WHERE not REGEXP_LIKE(TEXT, '^[��-�R]');
?

-- 10. ������ �� 'gg'�� 'GG'�� ����ִ� ������ �˻�
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, 'gg')
or REGEXP_LIKE(TEXT, 'GG');
?
