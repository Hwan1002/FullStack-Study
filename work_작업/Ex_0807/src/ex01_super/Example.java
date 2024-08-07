package ex01_super;
class A{
	public A() {System.out.println("A");}
	public A(int x) {System.out.println("A" + x);}
	
}
class B extends A{
	//A의 생성자를 호출
	public B() {super(100);}
	//이걸실행 하지만 A를 참조하니까 
	public B(int x) {
		//super();를 사용하지않아도 B클래스가 A클래스를 부모로써 참조하기 때문에 A클래스의 첫번째를 실행
		System.out.println("B" + x);
		}
	
}
public class Example {

	public static void main(String[] args) {
		B b = new B(11);
		
		//A클래스의 첫번째 실행문이 실행이되고 파라미터로 x가 전달되고 B클래스에서 실행이됨
		
	}
}
