package ex01_super;

public class Child extends Parent{
	
	public Child(int n) {
		//super(); 부모클래스 생성자에 매개변수가 없으면 생략가능
		
		//부모 생성자의 호출 -> 쓰지않아도 쓴것과 같은 동작
		super(n);//부모생성자가 매개변수를 갖기 시작하면 생략할 수 없다. ()안에 매개변수에 맞게 입력
	}
}
