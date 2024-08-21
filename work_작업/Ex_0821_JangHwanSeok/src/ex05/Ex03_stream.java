package ex05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
//List를 사용하는 이유는 갯수의 제한이 없고 제네릭타입으로 객체를 가져올수 있기때문
public class Ex03_stream {
	public static void main(String[] args) {
		//int를 제네릭으로 바꿀때 사용
		//오토박싱 int -> Integer로 만드는것
		//특정 범위의 정수를 요소로 갖는 스트림 생성하기
		//range는 범위를 만들어주는 기능 [1,2,3,4]
		IntStream intStream = IntStream.range(1, 5);
		//여기서 rangeClosed는 [1,2,3,4,5]
		LongStream longStream = LongStream.rangeClosed(1, 5);
		
		Stream<Integer> boxedIntStream = IntStream.range(1,5).boxed();
		//[Java Stream API를 사용한 방식 ]
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
		
		names.stream().filter(x-> x.startsWith("A") && x.length() >=4).sorted().forEach(System.out::println);
		
		
	}
}
