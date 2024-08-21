package ex05;
/*자바에서 컬렉션 데이터를 처리할때 for,foreach를 사용하면 컬렉션 내부의
요소들을 하나씩 다루었다. 크기자 작으면 상관이 없지만 커지면 루프문의 사용은 성능 저하를 일으켰다.

스트림의 등장
Java8에 추가된 기능으로 컬렉션 데이터를 선언형으로 쉽게 처리할 수 있다.
복잡한 루프문을 사용하지 않아도 되며, 루프문을 중첩해서 사용해야하는 경우도 많이 줄었다.

스트림은 '데이터의 흐름'이다.
배열 또는 컬렉션 객체에 메서드 여러개를 조합해서 원하는 결과를 필터링하고 가공된 결과를 얻을 수 있다. 또한 람다식을 이용해서 코드의 양을 줄이고 간결하게 표현할 수 있다.

즉, 배열과 컬렉션을 함수형으로 처리할 수 있다.

스트림의 특징
-스트립은 대이터소스로부터 데이터를 읽기만 할뿐, 데이터 소스를 변경하지 않는다.(원본은 안바끔);
-스트림은 한 번 사용하면 닫히기 때문에 다시 사용할 수 없다.
(다시 사용하려면 스트림을 다시 생성해야한다.)

스트림을 사용하는법
1. 생성하기 : 스트림 객체의 생성
2. 가공하기 : 필터링 및 매핑등 원하는 결과를 만들어가는 중간작업
3 결과만들기 : 최종적으로 결과를 만들어 반환하는 작업         
                                                                                                                                                                                                                                                                                배열을 통한 생성 
Stream<T> stream = Arrays.stream(배열);                  */
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01_stream {

	public static void main(String[] args) {
		//원본배열
		String[] strArray = {"홍길동","장환석","김현진"};
		//배열이 복사되어 들어감
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(System.out::println);
		
		//integer[] intArray = {1,2,3,4,5};
		//Stream<integer> intStream = Arrays.stream(intArray);
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(System.out::println);
	}

}
