package ex02_object;
/*String toString() - 객체 자신의 정보를 반환
 * toString() 메서드
 * toString() 메서드는 객체의 문자 정보를 반환해주는 메서드이다.
 * print()문을 사용해 객체를 출력할 경우 해당 메서드가 자동으로 실행되어
 * 객체의 정보를 반환해주고 출력이 된다.
 * 따라서 해당 메서드를 재정의 해서 사용하면 
 * 원하는 객체의 정보를 쉽게 출력할 수 있다.
 */


public class Ex02_Car {
	private String carName;
	private String company;
	
	public Ex02_Car(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	//자바의 모든 클래스는 Object 클래스를 상속받는다.(명시하지 않더라도)
	@Override
	public String toString() {
		String str = "차량이름 : " + this.carName + ", 제조사 : " + this.company;
		return str;
	}
	public String getCarName() {
		return carName;
	}
	public String getCompany() {
		return company;
	}
	
}