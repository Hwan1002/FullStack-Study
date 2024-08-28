package ex03_polymorphism;
//컴퓨터실
public class ComputerRoom {
	//객체를 필드로 받는다
	//필드에 있는것이 기본자료형이 아닌 객체변수(Samsung,Lz,Mac)가 선언되있다.
	//String str; 과 같은 느낌인것이다.
	//Samsung com1;
	//Samsung com2;
	//Lz com1;
	//Lz com2;
	Computer com1;
	Computer com2;
	Computer com3;
	
	
	//cr.com1 , cr.com2 와 같은 의미
	
	//결국에는 computer에 지정해둔 모든 컴퓨터들의 메서드를 킴
	public void allPowerOn() {
		com1.powerOn();
		com2.powerOn();
	}
	
	public void allPowerOff() {
		com1.powerOff();
		com2.powerOff();
	}
	
}
