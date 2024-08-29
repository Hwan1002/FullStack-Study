package ex03_annotation;
@SuppressWarnings("removal")
class A {
	@Deprecated ////앞으로 사용되지 않을 것을 권장하는 대상에게 붙힌다.
	public void oldOne() {
		
	}
	Integer i = new Integer(10);
}
@FunctionalInterface //함수형 인터페이스라는것을 알린다
interface B{
	void method();
}
/*어노테이션
- 프로그램의 소스코드 안에 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨것
- 어노테이션은 주석(comment)처럼 프로그래밍 언어에 영향을 미치지 않으면서도 다른 프로그  램에게 유용한 정보를 제공할 수 있다는 장점이 있다.
- 어노테이션의 뜻은 주석, 주해, 메모이다.

*표준 어노테이션
- 자바에서 제공하는 기본 어노테이션

*메타 어노테션 (우리만의 어노테이션을 만들 수 있다.)
- 어노테이션을 만들기 위한 어노테이션
- 스프링에서는 어노테이션으로 많이 통제를 한다.
- java.lang.annotaion 패키지에 정의되어 있다.
*/
public class Ex01_annotation {
	public static void main(String[] args) {
		//@Override
		//컴파일러에게 재정의하는 메서드라는것을 알린다.
		
		//@Deprecated
		//앞으로 사용되지 않을 것을 권장하는 대상에게 붙힌다.
		
		//@SuppressWarnings
		//컴파일러의 특정 경고메세지가 나타나지 않게 무시 해준다.
		
		//@FunctionalInterface
		//함수형 인터페이스라는 것을 알린다.(JDK1.8)
	}

}
