package ex03_annotation;
//ElementType은 열거형 이다.
import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.*;
//어노테이션이 적용될 위치
@Target({TYPE, FIELD, TYPE_USE, METHOD})
//어노테이션이 적용될 기간
@Retention(RUNTIME)

/*@Retention
*- 어노테이션이 유지되는 기간을 지정하는데 사용된다.

*@Retention(SOURCE) 소스 코드에만 이용 가능하며 컴파일 후에는 사라짐
*@Retention(CLASS) 어노테이션이 .class파일에 존재하지만 런타임에는 사라짐(실행시 사용 불가)
*@Retention(RUNTIME) 어노테이션이 컴파일러와 런타임시에 사용 가능(실행시에 정보 제공)
*
*@Target
*- 어노테이션이 적용가능한 대상을 지정하는데 사용된다.
*@Target(ElementType.TYPE) 클래스의 어떤 요소에나 적용 가능, 기본값
*@Target(ElementType.FIELD) 클래스의 특정 필드에 적용
*@Target(ElementType.METHOD) 클래스의 특정 메서드에 적용
*@Target(ElementType.PARAMETER) 메서드의 매개변수에 적용
*@Target(ElementType.CONSTRUCTOR) 생성자에 적용
*@Target(ElementType.ANNOTATION_TYPE) 어노테이션 타입
*
**/
public @interface TestInfo {
	/*어노테이션 요소의 규칙
	- 요소의 타입은 기본자료혀으 String, Enum, 어노테이션, Class만 허용된다.
	- ()안에 매개변수를 선언할 수 없다.
	- 예외를 선언할 수 없다.
	- 요소를 타입 매개변수로 정의할 수 없다.*/
	
	
		String value();//추상메서드 배열형태로 저장이 가능하다.
}
