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
                    WHEN 'SA_MAN' THEN 'фг╦е╨н╪╜'
                    ELSE '╠в ©э ╨н╪╜'
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
--7 ╨н╪╜╨╟ цж╢К ╠ч©╘╦╕ ╠╦го╫ц©ю
SELECT MAX(SALARY)
FROM EMPLOYEES
GROUP BY JOB_ID;

--###### ©ю╤Се╛ а╓╠т╫д г╔гЖ
--# ╬ф╥║©м ╟╟юл евюл╨Мю╩ ╩Щ╪╨го╟М ╥╧дз╣Е╦╕ ют╥бгя хд
--# REGEXP_LIKE  ©э©║ REGEXP_REPALCE, REGEXP_INSTR, REGEXP_SUBSTR, REGEXP_COUNT гт╪Ж╣╣ южю╫ ╠в╥╞Ё╙ ╬ф╥║юг ©╧╧╝ю╨ regexp_like гт╪Ж╦╕ юл©Кго©╘╣╣ ╧╚╧Фгт.
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

INSERT INTO reg_tab VALUES('╟Ё');

INSERT INTO reg_tab VALUES('cat');

INSERT INTO reg_tab VALUES('catty');

INSERT INTO reg_tab VALUES('9catty');

INSERT INTO reg_tab VALUES('catwoman');

INSERT INTO reg_tab VALUES('╟М╬Гюл');

INSERT INTO reg_tab VALUES('BAT');

INSERT INTO reg_tab VALUES('BATMAN');

INSERT INTO reg_tab VALUES('BATGIRL'); 

INSERT INTO reg_tab VALUES('0BATGIRL'); 

INSERT INTO reg_tab VALUES('╧заЦ');
COMMIT;
DESC reg_tab;
-- 1.  text дц╥Ёюг ╧╝юз©╜©║╪╜ 't'╥н ╫цюшго╢б ╣╔юлем ╟к╩Ж
SELECT *
FROM reg_tab
where SUBSTR(TEXT,1,1) like 't';

SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(text,'^t');


-- 2.  text дц╥Ёюг ╧╝юз©╜©║╪╜ 't'╥н Ё║Ё╙╢б ╣╔юлем ╟к╩Ж
SELECT *
FROM reg_tab
WHERE REGEXP_LIKE(TEXT, 't$');
?
-- 3. ц╧╧Ьб╟ 't'╥н ╫цюшго©╘ 5╧Ьб╟ 'r'юл юж╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '^t...r');
?
-- 4. ╪Щюз╥н Ё║Ё╙╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '[0-9]$');


-- 5. ╪Щюз╥н ╫цюшго╢б ╣╔юле╦ ╟к╩Ж
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, '^[0-9]');


-- 6. ╪Щюз╟║ ╬ф╢я ╧╝юз╥н ╫цюшго╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE  REGEXP_LIKE(TEXT, '^[0-9]');


-- 7. ╢К╧╝юз╥н ╫цюшго╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE  REGEXP_LIKE(TEXT, '^[A-Z]');


-- 8. ╪р╧╝юз ©эюг ╧╝юз╥н ╫цюшго╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE not REGEXP_LIKE(TEXT, '^[a-z]');


-- 9. гя╠ш╥н ╫цюшго╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE not REGEXP_LIKE(TEXT, '^[╟║-фR]');
?

-- 10. ╣╔юлем аъ 'gg'Ё╙ 'GG'╟║ ╣И╬Нюж╢б ╣╔юлем ╟к╩Ж
SELECT *
from reg_tab
WHERE REGEXP_LIKE(TEXT, 'gg')
or REGEXP_LIKE(TEXT, 'GG');
?
