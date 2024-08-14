package ex03_generic;
/*제네릭 사용시 주의사항
 * 1. 제네릭 타입의 객체는 생성할 수 없다.
 * 제네릭 타입 자체로 타입을 지정하여 객체를 생성하는 것은 불가능하다.
 * ex) T t = new T(); -> X 안됌
 * 
 * 2. static 멤버에 제네릭 타입이 올 수 없음
 * static 멤버는 클래스가 동일하게 공유하는 변수로서
 * 제네릭 객체가 생성되기도전에 이미 자료 타입이 정해져 있어야 하기 때문이다.
 * 
 * 	static 메서드의 반환타입으로 사용이 불가능
 * 	 public static T getAge(int n){} -> X 안됌
 * 
 * 	static 메서드의 매개변수 타입으로 사용 불가
 *   public static void setAge(T age) { -> X 안됌
 *   
 *3. 제네릭으로 배열 선언 주의점
 *	기본적으로 제네릭 클래스 자체를 배열로 만들 수는 없다.
 * 	Sample<Integer>[] arr1 = new Sample<>[10]; -> X 안됌
	제네릭 타입에 클래스가 들어온다는 것은, 클래스끼리 상속을 통해
	관계를 맺는 다형성이 그대로 적용되지 않을까??
 * 
 * */

public class Ex01_Generic {
	public static void main(String[] args) {
		//하나의 클래스로 모든 타입을 커버할 수 있다.
		//객체를 생성하면서 제네릭 변수에 타입이 결정된다.
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(2000);
		System.out.println(v2.getValue());
		
		GenEx<Character> v3 = new GenEx<>();
		v3.setValue('B');
		System.out.println(v3.getValue());
		
		GenEx<Double> v4 = new GenEx<>();
		v4.setValue(100.2456);
		System.out.println(v4.getValue());
	}

}
