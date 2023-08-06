
create table rental_place
(
  place_no number CONSTRAINT renta_place_place_no_pk PRIMARY KEY,
  manager_no number CONSTRAINT renta_place_manager_no_fk references rental_manager(MANAGER_NO ),
  place_nm varchar2(30),
  place_ard varchar2(400)
);

CREATE TABLE RENTAL_RESERVATION
(
  place_no   NUMBER CONSTRAINT rental_place_place_no_fk references rental_place(place_no)   , -- foreign 키로 바꿀 것.
  client_no  NUMBER constraint rental_client_client_no_fk references rental_client(client_no), -- "" 
  end_use    CHAR(2), --혹시 몰라서 --VARCHAR(2char) byte?
  res_date   NUMBER,
  res_num number
    
)
;

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
------------만드는 거까지 함.
insert into rental_place
values
(
  1,1,'위워크 강남점','서울 서초구 강남대로 373홍우빌딩 10층'
);
insert into rental_place
values
(
  4,1,'위워크 강남역 2호점 ','서울 서초구 테헤란로5길 7 10층'
);
insert into rental_place
values
(
  5,1,'위워크 신논현','서울 서초구 서초대로77길 55 에이프로스퀘어 6층'
);
  
insert into rental_place
values
(
  2,2,'역삼 2호점',null
);
insert into rental_place
values
(
  3,2,'선릉 2호점',null
);


