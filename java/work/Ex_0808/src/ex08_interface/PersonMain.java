package ex08_interface;

public class PersonMain {
	public static void main(String[] args) {
		//객체 생성자를 통해 객체 생성자를 보내는방법
		Person hwanseok = new Person(new PineApplePhone());
		hwanseok.turnOnPhone();
		for(int i =1; i<6; i++) {
			hwanseok.watchUtube();
			if(i % 3 == 0) {
				hwanseok.chargePhone();
			}
		}
		hwanseok.buyNewPhone(new ThreeStarPhone());
		hwanseok.turnOnPhone();
		for(int i =1; i<6; i++) {
			hwanseok.watchUtube();
			if(i % 3 == 0) {
				hwanseok.chargePhone();
			}
		}
		
	}
}
