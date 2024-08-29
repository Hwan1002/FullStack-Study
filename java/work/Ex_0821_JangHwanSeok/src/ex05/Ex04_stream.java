package ex05;
/*스트림의 연산
- 메서드를 통해 연산을 하는데, 메서드의 실행결과가 다시 스트림이다.
- 체인형태로 이어서 연산을 하는것이 가능하다.                                                                                                                                                                              Stream<T> 뒤에 붙는 연산기능
distinct() - 중복을 제거                                                            
filter((람다식이 들어올 수 있음)Predicate<T> predicate) - 조건에 안 맞는 요소 제외
limit(long maxSize) - 스트림의 일부를 잘라낸다
skip(long n) - 스트림의 일부를 건너뛴다                                                   
peek(Consumer<T> action) - 스트림의 요소에 특정 작업 수행
sorted()
sorted(Comparator<T> comparator) - 스트림의 요소를 정렬한다. */
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex04_stream {
	public static void main(String[] args) {
		Integer[] nums = {1,44,33,21,36,68,88,4,5,6,1,1,1,2,2,2};
		
		//1. 스트림객체생성
		//클래스 이름 변수명 = new 클래스명();
		Stream<Integer> stream = Arrays.stream(nums);
		
		//2. 중간연산
		//원본의 nums배열을 복사해서 조건을 붙혀서 조회를 하는것
		//이런식으로 체인형태로 이어 나갈 수 있다.
		stream.distinct().sorted().limit(5).forEach(x -> System.out.print(x+" "));
		//원본배열을 조회하면 변하지않은것을 확인할 수 있다.
		//stream.sorted().skip(3).limit(5).forEach(x->System.out.print(x+" "));
		System.out.println(Arrays.toString(nums));
		
		
		//rangeClosed로 1~10까지의 숫자를 반환
		IntStream intStream = IntStream.rangeClosed(1,10);
		//skip(n) : 맨처음 n 개를 버리고 시작
		//limit(n) : n개의 개수를 갖는 스트림을 반환
		intStream.skip(3).limit(5).forEach(x->System.out.print(x + " "));
		System.out.println();
		
		IntStream intStream2 = IntStream.of(1,2,3,4,5,6,7,8,9,10);
		// 2 4 6 8 10
		intStream2.filter(x->(x%2==0)).forEach(x-> System.out.print(x+" "));
		
		System.out.println();
		//문자열의 길이가 3이상인것만 출력하기
		Stream.of("ab","a","abc","abcd","abcdef","abcdefg").filter(x->x.length()>=3).forEach(x->System.out.println(x+" "));;
		
		/*최종연산
		 * - 연산결과가 스트림이 아닌 연산
		 * - 스트림 요소를 소모하므로 한 번만 가능
		 * void forEach(Consumer<? super T>action) 요소를 순회함
		 * long count() 스트림의 요소를 개수를 반환
		 * Optional<T> max(Comparator<? super T> comparator)최대값 반환
		 * Optional<T> min(Comparator<? super T> comparator)최대값 반환
		 * Optional<T> findAny() // 아무거나 하나
		 * Optional<T> findFirst() // 첫 번째 요소를 반환
		 * boolean allMatch(Predicate<T> p) // 모두 만족하는지
		 * boolean anyMatch(Predicate<T> p) // 하나라도 만족하는지
		 * boolean noneMatch(Predicate<T> p) // 모두 만족하지 않는지
		 * Object[] toArray()		
		   A[] toArray(IntFunction<A[]> generator) 스트림의 모든 요소를 배열로 변환
		 * Optional<T> reduce(BinaryOperator<T> accumulator)
		 * T reduce(T identity, BinaryOperator<T> accumulator) 스트림 요소를 하나씩 줄여가면서(리듀싱) 계산한다.
		 * R collect(Collector<T,A,B> collector) 스트림의 요소를 수집한다. 주로 요소를 그룹화하거나 분할한 결과를 컬렉션에 담아 반환하는데 사용한다.
		 * */
		
		
	}
}
