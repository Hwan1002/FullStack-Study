package ex05_Lambda;
/*간혹 프로그래밍을 하다보면 람다식으로 구현한 인터페이스에
 *실수로 두 개 이상의 메서드를 추가하는 오류를 범할 수 있다.
이를 방지하고자 어노테이션을 부여해 제한을 줄 수 있다.
이 때 사용하는 어노테이션이 @FunctionalInterface이다.*/
@FunctionalInterface
public interface MyFunction {
	void method(int num);
}
