--day0609
--DDL
--CREATE, ALTER, TRUNCATE, DROP cannot be undone by ROLLBACK

SELECT * FROM MYTABLE;

--create a copy of a existing table
--AS Operator

CREATE TABLE MYTABLE_COPY
    AS SELECT * FROM MYTABLE;
    
SELECT * FROM MYTABLE_COPY;

--ALTER
--ADD Operator, add new column

ALTER TABLE MYTABLE_COPY
    ADD column_5 VARCHAR2(20);
    
SELECT * FROM MYTABLE_COPY;


--RENAME Operator
--rename a column_name

ALTER TABLE MYTABLE_COPY
    RENAME COLUMN column_5 to column_55;

SELECT * FROM MYTABLE_COPY;


--MODIFY Operator
--will not allow the lossy conversion

desc mytable_copy;

--ALTER TABLE MYTABLE_COPY
--    MODIFY COLUMN_2 NUMBER(6);
--"column to be modified must be empty to decrease precision or scale"

ALTER TABLE MYTABLE_COPY
    MODIFY COLUMN_2 NUMBER(8);

INSERT INTO MYTABLE_COPY (COLUMN_2) VALUES(12345678);
    
SELECT * FROM MYTABLE_COPY;


--DROP Operator
ALTER TABLE MYTABLE_COPY DROP COLUMN COLUMN_2;

DESC MYTABLE_COPY;
SELECT * FROM MYTABLE_COPY;


COMMIT;

--DROP (DDL)
DROP TABLE MYTABLE_COPY;
SELECT * FROM MYTABLE_COPY;
--"table or view does not exist"



--Constraints
--is to maintain integrity, accuracy of the data

--NOT NULL
CREATE TABLE table_notnull(
    login_id varchar2(20) not null,
    login_pw varchar2(20) not null,
    tel varchar2(20)
);

--checking out if a column has constraints or not
desc table_notnull;
--LOGIN_ID  NOT NULL    VARCHAR(20)
--LOGIN_PW  NOT NULL    VARCHAR(20)
--TEL                   VARCHAR(20)


INSERT INTO table_notnull VALUES(
    'TEST_ID1', 'TEST_PW1', '000-0000'
);

--INSERT INTO table_notnull(tel) VALUES(
--    '000-0000'
--);
--"cannot insert NULL into ("SCOTT"."TALBE_NOTNULL"."LOGIN_ID")"

INSERT INTO table_notnull(login_id, login_pw) VALUES(
    'TEST_ID2', 'TEST_PW2'
);

SELECT * FROM TABLE_NOTNULL;
--LOGIN_ID      LOGIN_PW    TEL
------------------------------------
--TEST_ID1      TEST_PW1    000-0000
--TEST_ID2      TEST_PW2    (null)

--TEL column can be nullified because it wasn't declared NOT NULL


SELECT owner, constraint_name, constraint_type, table_name
FROM user_constraints;

--OWNER CONSTRAINT_NAME     CONSTRAINT_TYPE TABLE_NAME
-------------------------------------------------------
--SCOTT PK_DPET             P               DEPT
--SCOTT PK_EMP              P               EMP
--SCOTT FK_DEPTNO           R               EMP
--SCOTT SYS_C007006         C               TABLE_NOTNULL
--SCOTT SYS_C007007         C               TABLE_NOTNULL



--constraint naming
-- If a query (insert, update, delete) violates a constraint, 
--SQL will generate an error message that will contain the constraint name. 
--If the constraint name is clear and descriptive, 
--the error message will be easier to understand
CREATE TABLE table_notnull2(
    login_id varchar2(20) CONSTRAINT TBLNN2_LGNID_NN NOT NULL,
    login_pw varchar(20) CONSTRAINT TBLNN2_LGNPW_NN NOT NULL,
    tel varchar2(20)
);

SELECT owner, constraint_name, constraint_type, table_name
FROM user_constraints;

--OWNER CONSTRAINT_NAME     CONSTRAINT_TYPE TABLE_NAME
-------------------------------------------------------
--SCOTT PK_DPET             P               DEPT
--SCOTT PK_EMP              P               EMP
--SCOTT FK_DEPTNO           R               EMP
--SCOTT SYS_C007006         C               TABLE_NOTNULL
--SCOTT SYS_C007007         C               TABLE_NOTNULL
--SCOTT TBLNN2_LGNID_NN     C               TABLE_NOTNULL2
--SCOTT TBLNN2_LGNPW_NN     C               TABLE_NOTNULL2



DESC TABLE_NOTNULL;
DESC TABLE_NOTNULL2;

--adding constraint to an exisiting column
--while naming constraint


ALTER TABLE TABLE_NOTNULL2 MODIFY(tel CONSTRAINT TBLNN2_TEL_NN NOT NULL);

SELECT owner, constraint_name, constraint_type, table_name
FROM user_constraints;

--OWNER CONSTRAINT_NAME     CONSTRAINT_TYPE TABLE_NAME
-------------------------------------------------------
--SCOTT PK_DPET             P               DEPT
--SCOTT PK_EMP              P               EMP
--SCOTT FK_DEPTNO           R               EMP
--SCOTT SYS_C007006         C               TABLE_NOTNULL
--SCOTT SYS_C007007         C               TABLE_NOTNULL
--SCOTT TBLNN2_LGNID_NN     C               TABLE_NOTNULL2
--SCOTT TBLNN2_LGNPW_NN     C               TABLE_NOTNULL2
--SCOTT TBLNN2_TEL_NN       C               TABLE_NOTNULL2


DESC USER_CONSTRAINTS;

SELECT * FROM user_constraints;
SELECT * FROM all_constraints;
--https://docs.oracle.com/cd/B19306_01/server.102/b14237/statviews_1037.htm#i1576022

--dropping constraints
ALTER TABLE TABLE_NOTNULL2 DROP CONSTRAINT TBLNN2_TEL_NN;

DESC TABLE_NOTNULL2;
--LOGIN_ID  NOT NULL    VARCHAR2(20)
--LOGIN_PW  NOT NULL    VARCHAR2(20)
--TEL                   VARCHAR2(20)



--UNIQUE

CREATE TABLE TABLE_UNIQUE(
    login_id VARCHAR2(20) CONSTRAINT TBLUQ_LGNID_UQ UNIQUE,
    login_pw VARCHAR2(20) CONSTRAINT TBLUQ_LGNPW_NN NOT NULL,
    tel VARCHAR2(20)
);

DESC TABLE_UNIQUE;
--LOGIN_ID              VARCHAR2(20)
--LOGIN_PW  NOT NULL    VARCHAR2(20)
--TEL                   VARCHAR2(20)


SELECT * FROM USER_CONSTRAINTS;
--....
--SCOTT TBLUQ_LGNPW_NN  C   TABLE_UNIQUE
--SCOTT TBLUQ_LGNID_UQ  U   TABLE_UNIQUE


INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PW) VALUES(
    'TEST_ID1', 'TEST_PW1'
);
SELECT * FROM TABLE_UNIQUE;

--INSERT INTO TABLE_UNIQUE(LOGIN_ID, LOGIN_PW) VALUES(
--    'TEST_ID1', 'TEST_PW1'
--);
--"unique constraint (SCOTT.TBLUQ_LGNID_UQ) violated"

INSERT INTO TABLE_UNIQUE(LOGIN_PW) VALUES(
    'TEST_PW1'
);

SELECT * FROM TABLE_UNIQUE;
--LOGIN_ID  LOGIN_PW    TEL
--TEST_ID1  TEST_PW1    (null)
--(null)    TEST_PW1    (null)

--A unique constraint prohibits multiple rows from having the same value in the same column 
--but allows some values to be null.


--PRIMARY KEY
CREATE TABLE TABLE_PK(
    LOGIN_ID VARCHAR2(20) CONSTRAINT TBLPK_LGNID_PK PRIMARY KEY,
    LOGIN_PW VARCHAR2(20) CONSTRAINT TBLPK_LGNPW_NN NOT NULL,
    TEL VARCHAR2(20)
);


SELECT * FROM USER_CONSTRAINTS;
--...
--SCOTT TBLPK_LGNID_PK  P
--SCOTT TBLPK_LGNPW_NN  C


--you cannot alter CONSTRAINT afterward
--just drop the constraint and create a new one


INSERT INTO table_pk VALUES(
    'TEST_ID1', 'TEST_PW1', '000-0000'
);


--INSERT INTO table_pk VALUES(
--    'TEST_ID1', 'TEST_PW1', '000-0000'
--);
--"unique constraint (SCOTT.TBLPK_LGNID_PK) violated"


--INSERT INTO table_pk VALUES(
--    '', 'TEST_PW1', '000-0000'
--);
--"cannot insert NULL into ("SCOTT"."TABLE_PK"."LOGIN_ID")"



--FOREIGN KEY
--A foreign key constraint requires values in one table to match values in another table.
--referenced column must be either PRIMARY KEY or UNIQUE

CREATE TABLE DEPT_FK(
    DEPTNO NUMBER(2)CONSTRAINT DPETFK_DETPNO_PK PRIMARY KEY,
    DNAME VARCHAR2(14),
    LOC VARCHAR2(13)
);

--declare emp_fk.deptno foreign key
--...CONSTRAINT constraint_name REFERENCE table_name(column_name)
CREATE TABLE EMP_FK(
    EMPNO NUMBER(4) CONSTRAINT EMPFK_EMPNO_PK PRIMARY KEY,
    ENAME VARCHAR2(14),
    DEPTNO NUMBER(2) CONSTRAINT EMPFK_DEPTNO_FK REFERENCES DEPT_FK(DEPTNO)
);

--FOREIGN KEY can have a different column_name
--what matter is not the name but the content

--INSERT INTO EMP_FK VALUES(1000, 'LEE', 10);
--"integrity constraint (SCOTT.EMPFK_DPETNO_FK) violated - parent key not found"

--insert a department to DEPT_FK table
INSERT INTO DEPT_FK VALUES(10, 'ACCOUNT', 'TOKYO');

INSERT INTO EMP_FK VALUES(1000, 'LEE', 10);

--INSERT INTO EMP_FK VALUES(1001, 'LEE', 30);
--"integrity constraint (SCOTT.EMPFK_DPETNO_FK) violated - parent key not found"

DROP TABLE DEPT_FK;
--unique/primary keys in table referenced by foreign keys


--CASCADE
--drop all referential integrity contraints that refer to primary and unique keys
--in the dropped table
DROP TABLE DEPT_FK CASCADE CONSTRAINTS;

SELECT * FROM EMP_FK;
SELECT * FROM DEPT_FK;


--CHECK
--conditional constraints
CREATE TABLE TABLE_CHECK(
    LOGIN_ID VARCHAR2(20) CONSTRAINT TBLCK_LGNID_PK PRIMARY KEY,
    LOGIN_PW VARCHAR2(20) CONSTRAINT TBLCK_LGNPW_CK CHECK (LENGTH(LOGIN_PW)>3)
);

--INSERT INTO TABLE_CHECK VALUES('TEST_ID','ABC');
--"check constraint (SCOTT.TBLCK_LGNPW_CK) violated"


CREATE TABLE TABLE_CHECK2(
    LOGIN_PW VARCHAR2(20) CONSTRAINT TBLCK1_LGNPW_CK 
        CHECK (LOGIN_PW IN('A','B','C'))
);

INSERT INTO TABLE_CHECK2 VALUES ('B');
--INSERT INTO TABLE_CHECK2 VALUES ('T');
--"check constraints (SCOTT.TBLCK1_LGNPW_CK) violated"


--DEFAULT CONSTRAINT
CREATE TABLE TABLE_DEFAULT(
    LOGIN_ID VARCHAR2(20),
    LOGIN_PW VARCHAR2(20)DEFAULT 'ABCD'
);

INSERT INTO TABLE_DEFAULT(LOGIN_ID) VALUES(
    'joyful'
);

SELECT * FROM TABLE_DEFAULT;
--LOGIN_ID      LOGIN_PW
--joyful        ABCD        --DEFAULT VALUE



--SEQUENCE
--CREATE SEQUENCE sequence_name

--[INCREMENT BY n]
--[START WITH n]
--[MAXVALUE N | NOMAXVALUE]
--[MINVALUE N | NOMINVALUE]
--[CYCLE | NOCYCLE]
--[CACHE | NOCACHE]


CREATE SEQUENCE TEST_SEQ;

INSERT INTO table_default (LOGIN_ID) VALUES (
    TEST_SEQ.NEXTVAL
);
--LOGIN_ID  LOGIN_PW
--...
--1         ABCD

SELECT * FROM TABLE_DEFAULT;

INSERT INTO table_default (LOGIN_ID) VALUES (
    TEST_SEQ.NEXTVAL
);
--LOGIN_ID  LOGIN_PW
--...
--1         ABCD
--2         ABCD

--incremented sequence cannot be decremented