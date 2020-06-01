CREATE TABLE HUMAN (
    SN VARCHAR2(100), 
    NAME VARCHAR2(100),
    AGE NUMBER(3)
);

INSERT INTO HUMAN VALUES ('1111','�̿���',34);
INSERT INTO HUMAN (SN, NAME, AGE) 
    VALUES ('2222', '������', 32);
    
INSERT INTO HUMAN (NAME) VALUES ('������');
COMMIT;

DELETE FROM HUMAN;
ROLLBACK;


--DELETE HUMAN WHERE SN = '2222';
--TABLE �� ��� ����

DELETE FROM HUMAN WHERE NAME = '������' AND SN = null; --AND �� OR�� ���� ���ǹ� �ɾ��� �� ����
COMMIT;

UPDATE HUMAN SET NAME = '�̻�' WHERE SN = '1111';
COMMIT;

--�������� Į�� ���� ���ÿ� ����
UPDATE HUMAN 
    SET NAME = '������', AGE = 25 
    WHERE SN = '1111';

--���ڴ� ���굵 ����, ��ȸ�� ������ �� ����
UPDATE HUMAN
    SET AGE = AGE+1
    WHERE SN = '1111';

-- comment, CTRL+/
/* 
comment
block
*/

COMMIT;

SELECT * FROM HUMAN;
SELECT AGE FROM HUMAN;
SELECT * FROM HUMAN WHERE SN != '1111' OR AGE<50;