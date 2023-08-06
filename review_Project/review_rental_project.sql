
create table rental_place
(
  place_no number CONSTRAINT renta_place_place_no_pk PRIMARY KEY,
  manager_no number CONSTRAINT renta_place_manager_no_fk references rental_manager(MANAGER_NO ),
  place_nm varchar2(30),
  place_ard varchar2(400)
);

CREATE TABLE RENTAL_RESERVATION
(
res_num number,
res_date   NUMBER,
client_no  NUMBER constraint rental_client_client_no_fk references rental_client(client_no), -- "" 
  place_no   NUMBER CONSTRAINT rental_place_place_no_fk references rental_place(place_no)   , -- foreign Ű�� �ٲ� ��.
  
  end_use    CHAR(2) --Ȥ�� ���� --VARCHAR(2char) byte?
  
  
    
)
;
drop table RENTAL_RESERVATION;
CREATE TABLE RENTAL_MANAGER
(
  MANAGER_NO NUMBER CONSTRAINT RENTAL_MANAGER_MANAGER_NO_PK PRIMARY KEY,
  MANAGER_ID VARCHAR2(30),
  MANAGER_PW VARCHAR2(30),
  PHONE CHAR(11)
)
;

create table rental_client 
(
  client_no number constraint rental_client_client_no_pk primary key,
  client_id varchar2(30),
  client_pw varchar2(30),
  client_nm varchar2(30),
  phone char(11),
  secession_fl char(1)
);
------------����� �ű��� ��.
insert into rental_manager
values(1,'manager','tiger','01012345678'
);
insert into rental_manager
(
  manager_no
)
values(2);
insert into rental_place
values
(
  1,1,'����ũ ������','���� ���ʱ� ������� 373ȫ����� 10��'
);
insert into rental_place
values
(
  4,1,'����ũ ������ 2ȣ�� ','���� ���ʱ� �������5�� 7 10��'
);
insert into rental_place
values
(
  5,1,'����ũ �ų���','���� ���ʱ� ���ʴ��77�� 55 �������ν����� 6��'
);
  
insert into rental_place
values
(
  2,2,'���� 2ȣ��',2
);
insert into rental_place
values
(
  3,2,'���� 2ȣ��',2
);
---���� ������ �ִٰ� �ؾ��ϳ�.
insert into rental_client
(
  client_no , CLIENT_NM
)
values
( 
  1,'�����ż�'
);
insert into rental_client
(
  client_no , CLIENT_NM
)
values
( 
  2,'�ܱ��'
);
insert into rental_client
(client_no , CLIENT_NM)
values
( 3,'�����');
insert into rental_client
(client_no , CLIENT_NM)
values
( 4,'�����');

----���⼭���� ���� �ʱⰪ
insert into RENTAL_RESERVATION
values(1,14, 1,2,'N');
insert into RENTAL_RESERVATION
values(2,16, 1,5,'N');
insert into RENTAL_RESERVATION
values(3,12, 2,1,'N');
insert into RENTAL_RESERVATION
values(4,11, 3,2,'N');
insert into RENTAL_RESERVATION
values(5,13, 3,3,'N');
insert into RENTAL_RESERVATION
values(6,17, 4,5,'N');
insert into RENTAL_RESERVATION
values(7,21 ,4,1,'N');
insert into RENTAL_RESERVATION
values(8,15, 4,2,'N');
