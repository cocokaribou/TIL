CREATE SEQUENCE STDID_SEQ;


CREATE TABLE STUDENT(
    sid INT CONSTRAINT STDNT_ID_PK PRIMARY KEY,
    name VARCHAR2(40) CONSTRAINT STDNT_NAME_NN NOT NULL,
    major VARCHAR2(40) CONSTRAINT STDNT_MJR_NN NOT NULL
);

CREATE TABLE STUDENT_EXAM(
    student_id INT CONSTRAINT STDEXM_STDID_FK REFERENCES STUDENT(sid),
    exam_id INT CONSTRAINT STDEXM_EXMID_FK REFERENCES COURSE_EXAM(exam_id),
    score INT CONSTRAINT STDEXM_SCR_NN NOT NULL
);

CREATE TABLE GRADE(
    grade INT CONSTRAINT GRD_GRD_PK PRIMARY KEY,
    loscore INT,
    hiscore INT
);


CREATE TABLE COURSE(
    course_id INT CONSTRAINT CRS_ID_PK PRIMARY KEY,
    inst_name VARCHAR2(40) CONSTRAINT CRS_INSTNAME_NN NOT NULL,
    time DATE,
    semester INT,
    room_num VARCHAR2(40) CONSTRAINT COURSE_ROOMID_UNQ UNIQUE,
    description VARCHAR2(2000)
);

CREATE TABLE COURSE_EXAM(
    exam_id int CONSTRAINT CRSEXM_EXMID_PK PRIMARY KEY,
    course_id int CONSTRAINT CRSEXM_ID_FK REFERENCES course(course_id),
    room_num VARCHAR2(40) CONSTRAINT CRSEXM_ROOMID_FK REFERENCES course(room_num)
);

CREATE TABLE STUDENT_REPORT(
    student_id INT CONSTRAINT STDRPRT_ID_FK REFERENCES STUDENT(sid),
    grade INT CONSTRAINT STDRPRT_GRD_FK REFERENCES GRADE(grade)
);


drop table student CASCADE;



INSERT INTO student(sid, name, major) VALUES(
    STDID_SEQ.nextval,
    '이영인',
    '컴퓨터공학과'
);
INSERT INTO student(sid, name, major) VALUES(
    STDID_SEQ.nextval,
    '이윤형',
    '국제경영학과'
);
INSERT INTO student(sid, name, major) VALUES(
    STDID_SEQ.nextval,
    '김현정',
    '통계학과'
);
INSERT INTO student(sid, name, major) VALUES(
    STDID_SEQ.nextval,
    '이상성',
    '전기전자공학과'
);
INSERT INTO student(sid, name, major) VALUES(
    STDID_SEQ.nextval,
    '홍길동',
    '오징어심리학과'
);

