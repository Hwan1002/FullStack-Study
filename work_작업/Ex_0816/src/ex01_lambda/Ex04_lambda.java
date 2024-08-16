package ex01_lambda;
/*
*java.util.function 패키지의 주요 인터페이스
* java.Runnable		void run() 			매개변수가없고 반환값도 없음
* Supplier			T get()				매개변수는 없고 반환값만 있음
* Consumer			void accept(T t)	Supplier와 반대로 매개변수만 있고, 반환값이 없음
* Function<T,R>		R apply(T t)		일반적인 함수. 하나의 매개변수를 받아서 결과를 반환
* Predicate			boolean test(T t)	조건식을 표현하는데 사용됨. 매개변수는 하나. 반환값은 boolean
*
*
*매개변수가 두 개인 함수형 인터페이스 (자주 쓸일이 없??)
*BiConsumner<T,U>	void accept(T t, U u)	두개의 매개변수만 있고 반환값이 없음
*BiPredicate<T,U>	boolean test(T t, U u)	조건식을 표현하는데 사용됨. 매개변수는 둘, 반환값은 boolean
*BiFunction<T,U,R>	R apply(T t, U u)		두 개의 매개변수를 받아서 하나의 결과를 반환
*
**/
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex04_lambda {
	public static void main(String[] args) {
		//매개변수 1개
		Consumer<String> c1 = t -> System.out.println("입력값 : " + t);
		c1.accept("홍길동");
		//매개변수 2개
		BiConsumer<String, Integer> c2 = (x,y) -> System.out.println("입력값1 : " + x + "입력값2 : " + y);
		c2.accept("james", 100);
		//매개변수가 없으니 소괄호만 
		Supplier<Object> s1 = () -> new Object();
		System.out.println("Object 주소값 : " + s1.get());
		//Inter.parseInt("정수형태의 문자열") -> 문자열에서 정수로 변환
		//String.valueOf(정수) -> 정수에서 문자열로 변환
		Function<Integer, String> f1 = x -> String.valueOf(x);
		System.out.println("문자열 : " + f1.apply(100)+1);
		//두개 대상을 비교함
		BiFunction<String, String, Boolean> f2 = (x,y) -> x.equals(y);
		if(f2.apply("토마토", "토마토")) {
			System.out.println("두문자열은 같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		//조건에 맞는지 boolean 타입으로 반환
		Predicate<Integer> p1 = t -> t >= 60;
		int score = 55;
		boolean pass = p1.test(score);
		if(pass) {
			System.out.println("홍길동님의 점수는 : "+ score + "점이고 합격입니다.");
		}else {
			System.out.println("홍길동님의 점수는 : "+ score + "점이고 불합격입니다.");
		}
		
	}
}
