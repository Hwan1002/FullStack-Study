package ex02_modifier;

public class PublicA {//클래스
	
	public int a;
	
	public PublicA(int a) {//생성자
		this.a= a;
	}
	public void printA() {//메서드
		System.out.println("PublicA 클래스의 printA()메서드 호출");
	}
	//같은 패키지안에 있기 때문에 객체 생성이 가능
	DefaultC dc= new DefaultC();
	
	void methodA(){
		dc.variableC = 20; //public으로 선언된 필드이기 때문에 사용가능
	}
}
