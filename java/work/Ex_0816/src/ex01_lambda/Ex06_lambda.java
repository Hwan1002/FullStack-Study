package ex01_lambda;

import java.util.function.Predicate;

/*<결합>
*- Predicate를 and(),or(),negate()로 연결하여 새로운 Predicate로 결합할 수 있다.
*- Predicate의 끝에 negate()를 붙이면 조건식 전체가 부정이 된다.
*- static메서드인 isEqual()은 두대상을 비교하는 Predicate를 만들때 사용한다.
*/
public class Ex06_lambda {
	public static void main(String[] args) {
		//람다식의 결합
		//논리를 가지고 연산을 하는 논리연산자와 비슷하다.
		Predicate<Integer> a = i -> i < 100;
		Predicate<Integer> b = i -> i < 200;
		Predicate<Integer> c = i -> i % 2 == 0;
		Predicate<Integer> notA = a.negate();
		
		System.out.println("a : " + a.test(101));
		System.out.println("notA : " + notA.test(101));
		
		Predicate<Integer> all = notA.and(b.or(c));
		System.out.println("all : " + all.test(150));
		
		
		//str1과 str2가 같은지 비교한 결과를 반환
		String str1 = "abc";
		String str2 = "abc";
		Predicate<String> p2 = Predicate.isEqual(str1);
		boolean result = p2.test(str2);
		System.out.println("결과 : " + result);
	}
}
