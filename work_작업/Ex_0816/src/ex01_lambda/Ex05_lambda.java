package ex01_lambda;

import java.util.function.Function;

/*람다식의 합성과 결합
* 두 람다식을 합성해서 새로운 람다식을 만들 수 있다.
* f.andThen(g) -> f를 먼저 적용하고 그다음에 g를 적용한다.
* f.compose(g) -> g를 먼저 적용하고 f를 적용한다.
*/
public class Ex05_lambda {
	public static void main(String[] args) {
		//R apply(T t)
		//16진수 -> 10진수로 변환
		Function<String, Integer> f = s -> Integer.parseInt(s,16);
		//2진수로 변환
		Function<Integer, String> g = i -> Integer.toBinaryString(i);
		Function<String, String> h = f.andThen(g);
		//FF -> 255 -> (2진수로 바꾸면)11111111
		System.out.println(h.apply("FF"));
		
		Function<Integer, String> x = i -> Integer.toBinaryString(i);
		Function<String, Integer> y = s -> Integer.parseInt(s,16);
		Function<Integer, Integer> z = f.compose(x);
		System.out.println(z.apply(2)); // 2 -> "10" -> 16
			
	}
}
