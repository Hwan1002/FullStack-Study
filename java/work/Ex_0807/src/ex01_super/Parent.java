package ex01_super;

//부모 역할을 하는 클래스
public class Parent{
	//모든 클래스는 생성자를 가진다.
	
/*super
 * 부모클래스에서 상속받은 필드나 메서드를
 * 자식클래스에서 참조하는데 사용하는 참조변수이다.
 * */
	
	int money = 1000000; //부모가 가진 필드
	
	public Parent(int n) {
		System.out.println("부모(Parent)클래스"+n);
	}
	public int result() {
		return 100;
	}
}
