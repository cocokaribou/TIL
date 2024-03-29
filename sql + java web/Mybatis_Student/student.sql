create table student (
	id		number(38,0) primary key,		
	name	varchar2(20) not null,			
	kor		number(3) default 0,			
	eng 	number(3) default 0,			
	mat		number(3) default 0				
);

insert into student (id, name, kor, eng, mat) values ('1111', '홍길동', 100, 90, 80);
commit;
