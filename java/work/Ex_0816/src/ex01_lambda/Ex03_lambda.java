package ex01_lambda;
/*
함수형 인터페이스로 사용할때
추상메서드는 무조건 하나여야 한다.
단, 디폴트 메서드는 여러개여도 상관없다.

*<java.util.function 패키지>
- 대부분의 메서드의 타입이 비슷하다
- 매개변수는 0 ~ 2개 정도 사용한다.
- 반환값은 없거나 있을 수 있다.
- 제네릭 메서드로 정의를 한다면
  매개변수나 반환타입이 달라도 문제가 안되지 않을까? 
- java.util.function 패키지에 일반적으로
  자주쓰는 형식의 메서드를 함수형 인터페이스로
  미리 정의를 해놨다.
- 매번 함수형 인터페이스를 정의하기 보다는
  가능한 이 패키지의 인터페이스를 활용하는것이 좋다.
*
*
*
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Ex03_lambda {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("이름1" ,"이름2" ,"이름3" ,"이름4"));
		System.out.println(list.toString());
		
		for(String s : list) {
			System.out.println(s+ " ");
		}
		System.out.println();
		
		//void accept(T t)
		//(T t) -> {System.out.println(t)}
		//t -> System.out.println(t); 람다식으로 줄일 수 있다. 
		//System.out::print();
		//Consumer 함수형 인터페이스 
		Consumer<String> print = t -> System.out.print(t + " ");
		list.forEach(print);
		
		
	}
}
