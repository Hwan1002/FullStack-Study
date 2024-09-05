//데이터 타입
//1. Number 정수, 실수
//2. String 문자 작은따옴표, 큰따옴표 둘다 사용가능
//3. Boolean 참과 거짓을 표현 (true. false)
//4. undefined 변수에 값이 설정이 안되있을때

//1. 문자열 길이
console.log('text'.length);
//2. 문자열이 특정 문자로 시작하는 지 검사
console.log('text'.startsWith('te'));
console.log('text'.startsWith('xt'));
//3. 문자열이 특정 문자로 끝나는 지 검사
console.log('text'.endsWith('te'));
console.log('text'.endsWith('xt'));

//4. 특정 문자의 index 위치 찾기 
console.log('text'.indexOf('x'));
console.log('text'.indexOf('a'));

//5. 특정 문자열의 반복
console.log('abc'.repeat(3));

//6. 문자열을 다른 문자열로 대체
console.log('hellow world'.replace('hellow','bye'));

//7. 문자열을 특정문자를 기준으로 잘라서 저장
console.log('abcabcdabcde'.split('a'));

//8. 대문자로 바꾸기
console.log('abc'.toUpperCase());

//9. 소문자로 바꾸기
console.log('ABC'.toLowerCase());

//Boolean
//참과 거짓을 표현하기 위해 사용
//true -> 1
//false -> 0
console.log(true+1);
console.log(false+1);

//undefined
//데이터가 입력될 수 있는 공간임에도 불구하고 비어있다
let i;
console.log(i);
