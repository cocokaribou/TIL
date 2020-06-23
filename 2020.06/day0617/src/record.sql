drop table record;

create table record(
    ID number(38,0) primary key, 
    NAME varchar2(20) not null,
    win_count number(10,0) default 0,
    lose_count number(10,0) default 0,
    total_count number(10,0) default 0
)