select department_name, category
from TB_DEPARTMENT;

------------01 2��
select 
 concat( CONCAT( department_name, '�� ������') 
,concat( capacity ,'�Դϴ�.'))as �а���_�ο�
from TB_DEPARTMENT;

----------------02 01��
select student_no as �й�, student_name as �̸�, to_char(ENTRANCE_DATE,'YYYY-MM-DD') as ���г⵵
from TB_STUDENT;
where department_no=002

----------------02 02��
select professor_name, professor_ssn
from tb_professor
where length(professor_name)!=3;

----------------02 03��

select professor_name as �����̸�, 123-to_number(SUBSTR(professor_ssn , 1 , 2 )) as ����

from tb_professor
ORDER BY 2 asc;
----------------02 04��

select (SUBSTR(professor_name , 2 , 2 )) as �����̸�
from tb_professor;

----------------02 05��
select student_no, student_name , to_char(entrance_date,'RRRR/MM/DD'),
                     to_char( (to_date(SUBSTR(student_ssn , 1 , 6) ) ) , 'RRRR/MM/DD') as birth, 
                    --(entrance_date) - to_date(SUBSTR(student_ssn , 1 , 2) ,'RRRR'),--entrance_date-
                     (to_date( to_char(entrance_date,'RRRR/MM/DD'))- to_date(to_char( (to_date(SUBSTR(student_ssn , 1 , 6) ) ) , 'RRRR/MM/DD'))) as try
from tb_student
where (to_date( to_char(entrance_date,'RRRR/MM/DD'))- to_date(to_char( (to_date(SUBSTR(student_ssn , 1 , 6) ) ) , 'RRRR/MM/DD'))) < 6570  ;
-------------- 02 06��

-------------- 02 08��

select student_no,student_name
from tb_student
where not student_no LIKE 'A%';

-------------- 02 09��
select round(avg(point),1)
from tb_grade;
where student_no = 'A517178'
group by student_no;
----------------- 02 10��
select department_no as �а���ȣ, count(*)
from tb_student
group by department_no
order by �а���ȣ asc ;

----------------- 02 11��
select count(*)
from tb_student
where COACH_PROFESSOR_NO = (null);


