/*
 * CREATE TABLE 테이블명 
 * 	컬럼명 타입(길이),
 * 	컬럼명 타입(길이),
 * 	컬럼명 타입(길이),
 * 	컬럼명 타입(길이)
 * */
-- 이름
-- 나이  
CREATE TABLE TBL_MEMBER(
	NAME VARCHAR2(100),
	AGE NUMBER
);

--주의점
-- 컬럼이 여러개일때 콤마(,) 잘 써야 함
-- 사이에 공백 두지 않기
-- 테이블이 같은 이름으로는 안만들어짐 
-- 마지막에는 콤마(,) 안붙힘

CREATE TABLE TBL_CAR(
	ID NUMBER, --차량 식별번호
	BRAND VARCHAR2(100), --브랜드
	COLOR VARCHAR2(100), --색상
	PRICE NUMBER, --가격
	--테이블을 생성하면서 제약조건을 지정한것.
	CONSTRAINT CAR_PK PRIMARY KEY(ID)
);
--영구삭제이기 때문에 조심해야한다
DROP TABLE TBL_CAR;
DROP TABLE TBL_MEMBER;


--테이블명 : ex2_10
-- 속성1 : Col1 문자형 길이는 10 null값 비허용,
-- 속성2 : Col2 문자형 길이 10 null값 허용,
-- 속성3 : Create_date 날짜타입 기본값 현재날짜(SYSDATE)

CREATE TABLE ex2_10(
	Col1 VARCHAR2(10) NOT NULL,
	COL2 VARCHAR2(10),
	Create_date DATE DEFAULT sysdate
);

--컬럼명 변경 Col1 -> Col11
--alter table 테이블명 RENAME COLUMN Col1 TO Col11
ALTER TABLE EX2_10 RENAME COLUMN Col1 TO Col11;

--컬럼타입 변경
--alter table 테이블명 modify 컬럼명 데이터타입;
ALTER TABLE EX2_10 MODIFY Col11 CHAR(10);
--컬럼의 추가
--ALTER TABLE 테이블명 ADD 컬럼명 컬럼타입
ALTER TABLE EX2_10 ADD Col3 NUMBER;
--컬럼의 삭제
--ALTER TABLE 테이블명 DROP COLUMN 컬럼명;
ALTER TABLE EX2_10 DROP COLUMN Col11;

--제약조건 추가
--테이블이 생성된후 제약조건을 추가하거나 삭제하는 방법
--ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 제약조건종류(컬럼명);
ALTER TABLE EX2_10 ADD CONSTRAINT PK_EX2_10 PRIMARY KEY(Col3);

--제약조건 삭제
--ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명;
ALTER TABLE EX2_10 DROP CONSTRAINT PK_EX2_10;

--테이블 생성
--테이블명 TBL_ANIMAL
--ID 숫자 기본키
--"TYPE" 문자형길이 100
--AGE 숫자형 길이3
-- FEED 문자형 길이 100 
CREATE TABLE TBL_ANIMAL(
	ID NUMBER PRIMARY KEY,
	"TYPE" VARCHAR2(100),
	AGE NUMBER(3),
	FEED VARCHAR2(100)
);

--기존 제약조건 삭제(primary key)
ALTER TABLE TBL_ANIMAL DROP CONSTRAINT SYS_C007004;
--제약조건 추가
ALTER TABLE TBL_ANIMAL ADD CONSTRAINT ANIMAL_PK PRIMARY KEY(ID);

--TBL_ANIMAL 테이블 삭제
DROP TABLE TBL_ANIMAL;



--DEFAULT 와 CHECK 제약조건
CREATE TABLE TBL_STUDENT(
	ID NUMBER, --학번
	NAME VARCHAR2(100), --이름
	MAJOR VARCHAR2(100), --전공
	GENDER CHAR(1) DEFAULT 'W' NOT NULL CONSTRAINT BAN_CHAR CHECK(GENDER = 'M' OR GENDER = 'W'),
	BIRTH DATE CONSTRAINT BAN_DATE CHECK(BIRTH >= TO_DATE('1980-01-01','YYYY-MM-DD')),
	CONSTRAINT STD_PK PRIMARY KEY (ID)
);
INSERT INTO TBL_STUDENT WHERE ID VALUES(123);
