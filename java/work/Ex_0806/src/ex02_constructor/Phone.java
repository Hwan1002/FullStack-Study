package ex02_constructor;

public class Phone {
	String brand;
	int series;
	String color = "검정색";
	
	public Phone(String brand, int seties) {
		this.brand = brand;
		this.series = seties;
}
	//this()
	//현재 클래스에 선언되어있는 생성자를 가리킬수 있는 키워드
	//같은 클래스 안에 있는 생성자 중 매개변수의 개수, 자료형,
	//순서에 맞는 다른 생성자를 호출하는 메서드로
	//생성자 내부에서만 사용할 수 있다.
	public Phone(String brand, int series, String color) {
			this(brand,series); //this() 호출할때는 첫줄에서만 사용할 수 있다.
			this.color = color;
	}
	
	//휴대전화의 정보를 출력하는 phoneInfo() 만들기
	public void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
}
