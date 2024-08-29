package ex04_generic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*제네릭 와일드카드
 *제네릭 간의 형변환을 성립되게 하기 위해서는
 *제네릭에서 제공하는 와일드카드 문법을 이용해야 한다. 
 *
 *<?> : Unbounded WildCards(제한없음)
 *타입 파라이멑를 대치하는 구체적인 타입으로 모든 클래스나 
 *인터페이스 타입이 올 수 있다.
 *
 *<? extends 상위타입> : Upper Bounded WildCards(상위 클래스 제한)
 *타입 파라미터를 대치하는 구체적인 타입으로
 *상위 타입이나, 상위타입의 하위 타입만 올 수 있다.
 *
 *<? super 하위타입> : Lower Bounded WildCards(하위 클래스 제한)
 *타입 파라미터를 대치하는 구체적인 타입으로
 *하위 타입이나 하위 타입의 상위 타입만 올 수 있다.
 */
public class Ex04_generic {
	public static void main(String[] args) {
		//<? extends Object> -> Object부터 하위 크래스가 올 수 있다.
		//<? super String> -> String부터 상위 클래스가 들어올 수 없다.
		
		/*List<>는 컬렉션 프레임워크(Collection Framework)의 일부로,
		 * 동적 크기 배열을 구현하는 인터페이스이다.
		 * List<>를 사용하면 데이터를 순서대로 저장하고 관리할 수 있다.
		 * 이를 통해 배열과 비슷한 동작을 하지만 크기를 자동으로 조정할 수 있는 장점을 갖는다.*/
		List<? extends Object> list = new ArrayList<String>();
		List<? super String> list2 = new ArrayList<Object>();
		
		List<Integer> lists = new ArrayList<>(Arrays.asList(1,2,3));
		print(lists);
	}
	//매개변수로 Number와 그 하위타입인 (Integer,Double)등만 받는다.
	public static void print(List<? extends Number> list) {
		for(Object e :list) {
			System.out.println(e);
		}
	}
}
