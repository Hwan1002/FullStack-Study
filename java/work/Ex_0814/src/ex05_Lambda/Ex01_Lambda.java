package ex05_Lambda;
/*람다식
 * JDK1.8부터 함수형 프로그래밍 '람다식(Lambda expression)'을 지원하고 있다.
 * 람다식은 이름이 없는 익명 함수(anonymous function)를 만들기 위한 표현식을 말한다.
 * 자바는 객체를 기반으로 프로그램을 구현하는 객체 지향 프로그램이다.
 * 따라서 클래스를 먼저 생성하고, 클래스 안에 메서드와 객체를 만들어 사용해야 한다.
 * 
 *람다식이 도입된 이유
 * 함수형 프로그래밍 방식
 * 자바에서는 함수형 프로그래밍 방식이 적용되지 않았다.
 * 자바는 클래스에 함수를 정의하고 객체를 통해 호출하는 방식을 사용했다.
 * 
 *람다식 문법
 * 기존의 자바 문법과는 달라서 객체 지향 프로그래밍에 익숙한 개발자들은
 * 다소 생소할 수 있다.
 * 하지만 문법이 매우 간결해지고, 원하는 결과를 쉽게 집계할 수 있어 익숙해지면 큰 장점이 있다.
 * 기존 문법
 * int add(int x, int y){
		return x+y;
	}
	람다식 표현
	(int x,int y) -> {return x+y;}
	
 * 메서드의 이름과 반환 타입을 제거하고 화살표(->)를 이용해 구현한다.
 * 
 *소괄호 생략하기
 * 람다식 문법에서는 파라미터의 자료형을 생략할 수 있다.
 * 파라미터가 한 개인 경우에는 소괄호도 생략할 수 있다.
 * 그러나 두 개 이상일 경우에는 생략할 수 없다. 
 * (String str) -> {System.out.println(str);}
 *  파라미터가 1개일 때 소괄호와 자료형을 생략할 수 있다.
 * str -> {System.out.println(str);}
 *
 *
 *중괄호 생략하기
 * 함수의 반환형이 void라면 중괄호도 생략할 수 있다.
 * (x,y) -> System.out.println(x+y); 
 * 반환형이 있을때 return 키워드와 중괄호를 같이 생략할 수 있다.
 * (x,y)-> x+y;
 * 
*/

public class Ex01_Lambda {
	public static void main(String[] args) {
		//클래스를 직접 생성하고, 객체를 만들어서 호출하는 방식
		Calculator cal1 = new CalculatorImpl();
		int res = cal1.plus(10, 20);
		System.out.println("cal1 : " + res);
		//익명클래스 만들기
		Calculator cal2 = new Calculator() {
			@Override
			public int plus(int num1, int num2) {
				return num1 + num2;
			}
		};
		res = cal2.plus(20, 30);
		System.out.println("cal2 : " + res);
		
		//람다식을 통한 구현
		Calculator cal3 = (int num1, int num2) -> {return num1 + num2;};
		res = cal3.plus(50,20);
		System.out.println("cal3 : " + res);
		
		//파라미터가 1개인 메서드 람다식으로 만들기
		//자료형지울 수 있고 매개변수가 하나면 소괄호 지울수 있고 중괄호도 지울 수 있다.
		//MyFunction mf = (int num) -> {System.out.println(num);};
		//MyFunction mf = num -> {System.out.println(num);};
		//MyFunction mf = num -> System.out.println(num);
		
		//:: (이중클론) : 메서드 참조 연산자
		//람다식을 보다 간결하게 사용할 수 있도록 해준다.
		MyFunction mf = System.out::println;
		mf.method(10);
		
	}
}
