package ex04_generic;
/*제네릭 타입 범위 한정하기
 * 제네릭에 타입을 지정해줌으로써 클래스의 타입을
 * 컴파일시에 정하여 타입예외에 대한 안정성을
 * 확보하는것은 좋지만 문제는 너무 자유롭다는 점이다.*/

//숫자만 받아 계산하는 계산기 클래스 모듈

/*타입 한정 키워드 extends
 * 작성방법 -> <T extends 제한타입>
 * 
 * extends 키워드 뒤에 올 타입은
 * 일반클래스, 추상클래스, 인터페이스 모두 가능하다.*/
class Calculator<T extends Number >{
	void add(T a, T b) {};
	void min(T a, T b) {};
	void mul(T a, T b) {};
	void div(T a, T b) {};
}


public class Ex01_Generic {
	public static void main(String[] args) {
		//제네릭에 아무 타입이나 모두 할당이 가능해서 문제가 될수 있었지만
		//extends를 사용하고 타입을 어느정도 제한 시킬 수 있다.
		Calculator<Number> cal1 = new Calculator<>();
		Calculator<Integer> cal2 = new Calculator<>();
		Calculator<Double> cal3 = new Calculator<>();
		//Calculator<Object> cal4 = new Calculator<>();
		//Calculator<String> cal5 = new Calculator<>();
		//제네릭에 아무타입이나 모두 할당이 가능하다는 점이 문제다.
		//Calculator<Ex01_Generic> cal6 = new Calculator<>();
		cal3.add(1.4,1.6);
	}
}	
