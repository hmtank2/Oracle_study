select department_name, category
from TB_DEPARTMENT;

------------01 2번
select 
 concat( CONCAT( department_name, '의 정원은') 
,concat( capacity ,'입니다.'))as 학과별_인원
from TB_DEPARTMENT;

----------------02 01번
select student_no as 학번, student_name as 이름, to_char(ENTRANCE_DATE,'YYYY-MM-DD') as 입학년도
from TB_STUDENT;
where department_no=002

----------------02 02번
select professor_name, professor_ssn
from tb_professor
where length(professor_name)!=3;

----------------02 03번

select professor_name as 교수이름, 123-to_number(SUBSTR(professor_ssn , 1 , 2 )) as 나이

from tb_professor
ORDER BY 2 asc;
----------------02 04번

select (SUBSTR(professor_name , 2 , 2 )) as 교수이름
from tb_professor;

----------------02 05번
select student_no, student_name , to_char(entrance_date,'RRRR/MM/DD'),
                     to_char( (to_date(SUBSTR(student_ssn , 1 , 6) ) ) , 'RRRR/MM/DD') as birth, 
                    --(entrance_date) - to_date(SUBSTR(student_ssn , 1 , 2) ,'RRRR'),--entrance_date-
                     (to_date( to_char(entrance_date,'RRRR/MM/DD'))- to_date(to_char( (to_date(SUBSTR(student_ssn , 1 , 6) ) ) , 'RRRR/MM/DD'))) as try
from tb_student
where (to_date( to_char(entrance_date,'RRRR/MM/DD'))- to_date(to_char( (to_date(SUBSTR(student_ssn , 1 , 6) ) ) , 'RRRR/MM/DD'))) < 6570  ;
-------------- 02 06번

-------------- 02 08번

select student_no,student_name
from tb_student
where not student_no LIKE 'A%';

-------------- 02 09번
select round(avg(point),1)
from tb_grade;
where student_no = 'A517178'
group by student_no;
----------------- 02 10번
select department_no as 학과번호, count(*)
from tb_student
group by department_no
order by 학과번호 asc ;

----------------- 02 11번
select count(*)
from tb_student
where COACH_PROFESSOR_NO = (null);


