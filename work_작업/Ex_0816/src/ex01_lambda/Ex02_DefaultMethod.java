package ex01_lambda;
/*<컬렉션 프레임워크와 함수형 인터페이스>
 - 컬렉션 프레임워크의 인터페이스에 다수의 디폴트 메서드가 추가되었고,
 - 그 중 일부는 함수형 인터페이스를 사용한다.

  인터페이스 -> 서비스의 가이드라인을 제공
  구현클래스에서 모든 추상 메서드를 다 오버라이딩 받아야함

<default method>
 - 인터페이스에 있는 구현 메서드
 - 추상 메서드와 다른점은 body를 가지고 있다는것
 
 장점
- 인터페이스에 기본 구현을 제공함으로써,
 해당 인터페이스를 구현하는 클래스에서 모든 메서드
 재정의할 필요가 없게 됐다.
- default메서드를 통해 인터페이스에서 다중 상속과
 유사한 기능을 제공할 수 있게 됐다. 
 */
interface Interface{
	abstract void methodA();
	abstract void methodB();
	abstract void methodC();
	
	//메서드 앞에 Default 예약어를 붙힌다.
	//2.body(구현부)가 있어야 한다.
	default void defaultMethodA() {
		System.out.println("디폴트메서드 A");
	}
}

class InterImpl implements Interface{
	//안쓴다고 할지라도 일단 인터페이스의 모든 추상메서드를 오버라이딩 해야한다.
	
	@Override
	public void methodA() {
		System.out.println("오버라이딩된 메서드A");
	}
	@Override
	public void methodB() {
		System.out.println("오버라이딩된 메서드B");
	}
	@Override
	public void methodC() {
		System.out.println("오버라이딩된 메서드C");
	}
}

public class Ex02_DefaultMethod {
	public static void main(String[] args) {
		Interface inter = new InterImpl();
		inter.methodA();
		inter.methodB();
		inter.methodC();
		inter.defaultMethodA();
		
	}
}
