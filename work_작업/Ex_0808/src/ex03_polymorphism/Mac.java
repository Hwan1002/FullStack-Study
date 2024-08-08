package ex03_polymorphism;
//Mac 클래스를 만들어서 Computer를 부모로써 안에 메서드를 상속받는다
public class Mac extends Computer{
	
	//오버라이딩을 해서 Computer 안에있는 메서드를 그대로 가져오고 출력문 내용만 바꿈
	@Override
	public void powerOn() {
		super.powerOn();
		System.out.println("Hello Apple");
	}
	@Override
	public void powerOff() {
		super.powerOff();
		System.out.println("Bye Apple");
	}
	
	public void info() {
		System.out.println("apple 입니다.");
	}
}
