package ex02_object;
/*기본 API 클래스
 * 자바에서 제공하는 API프로그램 개발에 자주 사용되는 클래스 및
 * 인터페이스의 모음을 맗하며 라이브러리 라고도 부른다.
 * 
 * java.lang 패키지
 * java.lang 패키지는 자바 프로그램의 기본적인 클래스를 담고있는 패키지
 * 
 * Object 자바 클래스의 최상위 클래스
 * System 시스템의 표준 입력/출력 
 * 장치로 부터 데이터를 입력받거나 출력하기 위해 사용
 * String 문자열을 저장하고 여러가지 정보를 얻을 때 사용
 * StringBuffer/StringBuilder
 * 문자열을 저장하고 내부 문자열을 조작할 때 사용
 * Math 수학 관련 함수를 이용할 때 사용 
 *
 *Object 클래스
 *자바에서 생성되는 모든 클래스는 생성될 때 상속을 하지않아도
 *Object를 자동으로 상속받게 되어있다.
 *따라서 클래스를 생성하면 Object가 가지고 있는 여러 메서드를 그대로 사용하거나
 *Override하여 사용할 수 있다.
 *
 *protected Object clone() - 객체 자신을 복사한 후 반환
 *boolean equals(Object obj) - 다른 객체와 자신이 가진 실제 값을 비교
 *int hashCode() - 객체의 hashCode 값을 반환 (주소값)
 *String toString() - 객체 자신의 정보를 반환
 * */
public class Ex01_equals {
	public static void main(String[] args) {
		//equals()
		//기본자료형의 데이터들을 동등 비교를 위해서 '=='비교 연산자를 사용한다.
		//하지만 객체를 동등비교 할 경우, 해당 객체의 값을 비교하는 것이 아니라
		//객체가 메모리에 있는 위치를 비교하게 된다.
		//객체의 데이터를 비교할 때는 equals()메서드를 사용한다.
		
		String str1 = "Hello";//암시적 객체 생성
		String str2 = "Hello";
		String str3 = new String("Hello");//명시적 객체 생성
		
		//암시적 객체 생성을 할 때, 먼저 만들어져있는게 있으면 같이 참조를 한다.
		
		System.out.println("str1 vs str2 " + (str1 == str2)); //같은 주소를 참조하고있다
		str1 = "Bye"; //str2와 같은 주소를 참조하니까 str2도 Bye로 바뀌는게 맞지않을까??
		System.out.println("str2 : " + str2);
		
		//불변의 법칙
		//값이 새로 대입되거나 추가로 들어오게 되면 
		//기존의 메모리를 버리고 새로 할당받는다.
		
		System.out.println("str2 vs str3 " + (str2 == str3));
		
		//각 문자열 변수가 있는 위치의 값을 출력
		//System.identityHashCode() : 객체의 고유한 hashcode를 리턴하는 메서드 주소값을 비교
		//hashcode()는 다른 객체이지만 주소가 동일한 경우가 있을 수 있다.
		System.out.println("str1 hashCode : " + System.identityHashCode(str1));
		System.out.println("str1 hashCode : " + System.identityHashCode(str2));
		System.out.println("str1 hashCode : " + System.identityHashCode(str3));
		
		//문자열 데이터 비교
		System.out.println("str1 vs str2 " + str1.equals(str2));
		System.out.println("str1 vs str3 " + str1.equals(str3));
	}
}
