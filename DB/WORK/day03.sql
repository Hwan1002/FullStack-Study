--10번 및 30번 부서에 속하는 모든 사원 중 급여가 1500을 넘는
-- 사원번호, 이름 및 급여를 조회하세요.

SELECT DEPARTMENT_ID, FIRST_NAME, SALARY FROM EMPLOYEES
WHERE DEPARTMENT_ID = 10 OR DEPARTMENT_ID = 30 AND SALARY > 1500;

--관리자가 없는 모든 사원에 이름 및 직종을 출력하세요
SELECT FIRST_NAME, JOB_ID  FROM EMPLOYEES WHERE MANAGER_ID IS NULL;

--직업이 IT_PROG 또는 SA_MAN이면서 급여가 1000,3000,5000이 아닌 사원들의
--이름, 직종 및 급여를 조회하세요
SELECT FIRST_NAME,JOB_ID,SALARY
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG'OR JOB_ID = 'SA_MAN'
AND SALARY NOT IN(1000,3000,5000)
ORDER BY SALARY DESC;


--TBL-STUDENT
--학번, 이름, 전공, 성별, 생일
--BAN_CHAR (성별) 체크 제약조건 위배
--INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER ,BIRTH)
--VALUES(0,'홍길동','컴퓨터공학과', 'A', '1980-01-02');

--BAN_DATE 체크 제약조건 위배
--INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER ,BIRTH)
--VALUES(0,'홍길동','컴퓨터공학과', 'M', '1979-01-02');

--STD_PK 프라이머리키 인덱스가 겹쳐서 생기는 오류
INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,GENDER ,BIRTH)
VALUES(1,'박디비','컴퓨터공학과', 'W', '1990-02-06');

SELECT * FROM TBL_STUDENT;

--DDEFAULT 값 사용해보기
INSERT INTO TBL_STUDENT (ID,NAME,MAJOR,BIRTH)
VALUES(2,'박디비','컴퓨터공학과', '1994-08-26');

--INSERT 할때 컬럼명을 생략하면 DEFAULT 값을 넣을 수 없다.
INSERT INTO TBL_STUDENT 
VALUES(3,'이자바','컴퓨터공학과', 'M','1994-08-26');

--FOLWER 테이블에 데이터 넣기
-- 꽃이름
-- 꽃색깔
-- 가격
-- 장미꽃, 빨간색, 3000
INSERT INTO FLOWER
VALUES('장미꽃','빨간색',3000);

INSERT INTO FLOWER
VALUES('튤립','흰색',4000);

INSERT INTO FLOWER
VALUES('해바라기','노란색',2000);

--POT 테이블에 데이터 추가하기
--화분번호, 화분색깔, 화분모양, 꽃이름
--화분테이블에 데이터를 추가할때 꽃 테이블에 있는 꽃만 추가할 수 있다.
INSERT INTO POT
VALUES(202408260001,'검정색','둥근형','튤립');

CREATE TABLE FLOWER2(
	F_NAME2 VARCHAR2(200) PRIMARY KEY,
	F_COLOR2 VARCHAR2(100),
	F_PRICE NUMBER
);

--다른 테이블에 있는 데이터를 조회해서 추가하는것이 가능하다.
--복사붙혀넣기
INSERT INTO FLOWER2(F_NAME2,F_COLOR2,F_PRICE)
SELECT F_NAME, F_COLOR, F_PRICE
FROM FLOWER;

SELECT * FROM FLOWER2;


--여러테이블에 한번에 데이터를 추가하는것도 가능
INSERT ALL
INTO FLOWER VALUES('수국', '보라색', 5000)
INTO FLOWER2 VALUES('수국', '흰색', 7000)

SELECT * FROM DUAL;


SELECT * FROM FLOWER;
SELECT * FROM FLOWER2;


DELETE FROM FLOWER WHERE F_NAME = '수국';

--PK와 FK로 연결된 테이블에서 외래키로 참조되고 있는 데이터는
--부모테이블에서 삭제가 불가능하다
DELETE FROM FLOWER WHERE F_NAME = '장미꽃';

--STUDENT 테이블에서 홍길동 삭제
DELETE FROM TBL_STUDENT WHERE NAME = '홍길동';



--학생테이블에서 학번이 1번인 학생의 이름을 홍길동으로, 성별을 남자로 수정
UPDATE TBL_STUDENT SET 
NAME = '홍길동',GENDER = 'M'
WHERE ID = 1;

--회원과 관련된 기능
--로그인 -> SELECT
--회원가입 -> INSERT
--회원정보수정 -> UPDATE
--회원탈퇴 -> DELETE


--상품과 관련된 기능
--검색 -> SELECT
--추가 -> INSERT
--재고처리 -> UPDATE
--상품삭제 ->DELETE

--사원테이블에서 급여를 많이 받는 순서대로 사번, 이름, 급여 입사일순으로 출력하되,
--급여가 같은경우 입사일이 빠른순으로 정렬

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, HIRE_DATE
FROM EMPLOYEES
ORDER BY SALARY DESC, HIRE_DATE;

--사원테이블에서 부서번호가 빠른순, 부서번호가 같다면 직종이 빠른순
--직종도 같다면 급여를 많이 받는순으로 정렬해서 사번,이름,부서번호,직종,급여순으로 출력
SELECT EMPLOYEE_ID,FIRST_NAME,DEPARTMENT_ID,JOB_ID,SALARY
FROM EMPLOYEES
ORDER BY DEPARTMENT_ID ASC,JOB_ID , SALARY DESC;

--문자와 관련된 함수

--ASCII()
--지정된 문자의  ASCII값을 반환한다.
SELECT ASCII('A') FROM DUAL;

--CHR()
-- 지정된 숫자의 ASCII문자를 반환한다.
SELECT CHR(65) FROM DUAL;

--RPAD(데이터, 고정길이, 문자)
--데이터를 왼쪽으로 몰아서 정렬 후 생긴 빈 공백에 특정 문자를 채워 반환
SELECT RPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS;

--LPAD(데이터,고정길이,문자)
--데이터를 오른쪽으로 몰아서 정렬 후 생긴 빈 공백에 특정 문자를 채워 반환
SELECT LPAD(DEPARTMENT_NAME,10,'*') FROM DEPARTMENTS;

--TRIM()
--문자열의 공백제거
SELECT TRIM('  HELLOW  ') FROM DUAL;

--RTRIM()
--오른쪽 공백제거
--LTRIM()
--왼쪽 공백제거

--INSTR()
--특정문자의 위치를 반환
SELECT INSTR('HELLOW','O') FROM DUAL;

--INSTR(데이터, 찾을문자, 검색위치, 몇번째 나오는지)
SELECT INSTR('HELLOW','L',1,2) FROM DUAL;

--찾는 문자열이 없으면 0을반환한다.
SELECT INSTR('HELLOW','Z') FROM DUAL;

--INITCAP()
--첫문자를 대문자로 변환하는 함수
SELECT INITCAP('good morning') FROM DUAL;

--LENGTH()
--주어진 문자열의 길이를 반환
SELECT LENGTH('JOHN') FROM DUAL;

--CONCAT()
-- 주어지는 두 문자열을 연결한다.
SELECT CONCAT('HELLOW','WORLD')FROM DUAL; 

--SUBSTR()
--문자열의 시작 위치부터 길이만큼 자른 후 반환
--길이는 생략 가능하며, 생략시 문자열의 끝까지 반환한다.
SELECT SUBSTR('Hello Oracle',2), substr('Hello Oracle',7,5)
FROM DUAL;

--REPLACE(데이터,원래글자,바꿀글자)
--첫 번째 지정한 문자를 두번째 지정한 문자로 바꿔 반환한다.
SELECT REPLACE('HELLO WORLD','WORLD', 'FUCKERS' ) FROM DUAL;

--UPPER()
--주어진 문자열을 전부 대문자로 바꿈
SELECT UPPER('good morning') FROM DUAL;

--LOWER()
--주어진 문자열을 전부 소문자로 바꿈
SELECT LOWER('GOOD MORNING') FROM DUAL; 


--부서번호가 50번인 사원들의 이름을 출력하되 이름이 'el'을 모두 '**'로 대체하여 출력
SELECT REPLACE(FIRST_NAME,'el','**') FROM EMPLOYEES
WHERE DEPARTMENT_ID = 50;
--이름이 6글자 이상인 사원의 사번과 이름, 급여를 출력
SELECT EMPLOYEE_ID,FIRST_NAME ,SALARY 
FROM EMPLOYEES
WHERE LENGTH(FIRST_NAME) > 6 
ORDER BY SALARY DESC;

--' H E L L O'의 공백을 모두 제거하여 출력
SELECT REPLACE(' H E L L O ',' ','') FROM DUAL;

/*아래칼럼을 가지는 PRODUCT2 테이블을 생성하는 DDL을 작성하시오
 * 제약조건의 이름은 자동을 부여되도록 별도로 지정하지마시오
 * 단,제약조건의 이름을 지정하더라도 감점하지 않는다.
 * <칼럼정보>
 * NO : 제품번호,숫자,기본키
 * NAME : 제품명, 문자열 최대 100바이트 필수
 * PRICE : 제품가격, 숫자 
 * P_DATE: 생산일자, 날짜
 * */
CREATE TABLE PRODUCT2(
	"NO" NUMBER PRIMARY KEY,
	NAME VARCHAR2(100) NOT NULL,
	PRICE NUMBER,
	P_DATE DATE
);
INSERT INTO PRODUCT2("NO",NAME,PRICE,P_DATE)
VALUES(1000,'컴퓨터',100,'21-04-15');
--VALUES(1002,'냉장고',100,'21-03-29');
--VALUES(1003,'에어컨',100,'20-12-15');
--VALUES(1004,'오디오',100,SYSDATE);
--VALUES(1001,'세탁기',100,'21-04-15');

SELECT * FROM PRODUCT2;

--NO가 1000인 데이터의 PRICE를 20 증가시키세요
UPDATE PRODUCT2 SET PRICE = PRICE + 20
WHERE "NO" = 1000;
--NAME이 세탁기인 데이터를 모두 삭제하세요
DELETE FROM PRODUCT2 WHERE NAME= '세탁기';

SELECT * FROM PRODUCT2
ORDER BY PRICE DESC;

/*1. 정규화의 필요성으로 거리가 먼 것은?
1. 데이터 구조의 안정성 최대화
2 중복 데이터의 활성화 CHECK
3 데이터 수정, 삭제 시 이상현상의 최소화
4 테이블 불일치 위험의 최소화 

2. 관계 데이터베이스의 정규화에 대한 설명으로 옳지 않은 것은?

1. 정규화를 거치지 않으면 여러 가지 다른 종류의 정보가 하나의 릴레이션에 표현되기 때문에 릴레이션을 조작할 때 이상현상이 발생할 수 있다.
2. 정규화의 목적은 각 릴레이션에 분산된 종속성을 하나의 릴레이션에 통합하는 것이다.CHECK(통합이 아니라 쪼개는것이다)
3. 이상현상은 속성 간에 존재하는 함수 종속성이 원인이다.
4. 정규화가 잘못되면 데이터의 불필요한 중복을 야기하여 릴레이션을 조작할 때 문제가 된다.

3. 제2정규형에서 제3정규형이 되기 위한 조건은?

1. 이행적 함수 종속을 제거해야 한다.CHECK 
2. 부분 함수 종속을 제거해야 한다.
3. 다치종속을 제거해야 한다.
4. 결정자가 후보키가 아닌 함수적 종속을 제거해야 한다.*/


/*스키마에 대해서 아는대로 쓰시오
 * 데이터 베이스의 제약 조건에 대해 전반적인 명세를 기술한 것
 * 개념 - 전체적인뷰
 * 내부 - 데이터를 어디에 저장을 할것인가
 * 외부 - 사용자 입장에서 어떻게 사용할 것인가
 */