//타입캐스팅
//데이터 타입의 종류를 바꾸는 행위

//String()
console.log(typeof(String(3))); 

//Number()
console.log(Number(3)+1);
console.log(Number(false));
console.log(Number("abc"));

//Boolean()
console.log(Boolean(1));
console.log(Boolean(0));
console.log(Boolean(NaN));
console.log(Boolean(3));
console.log(Boolean("x"));

//인덱싱과 슬라이싱
//index : 0부터 순차적으로 증가하는 정수값
//인덱싱은 데이터를 분석하여 우리가 원하는 순서에 위치한 데이터를 뽑는것
console.log("abcde"[2]);

//여러개의 값으로 자르고 싶다면 slice() 메서드를 이용
console.log("abcdefgh".slice(3,5));
