//Car 클래스는 gasGauge필드를 갖고 있고, 생성자를 통해 초기화한다.
//가스잔여량을 출력하는 함수인 showCurrentGauge()를 갖고 있다.
//
//HybridCar 클래스는 electricGauge변수를 갖고 있고, Car 클래스를 상속하고 생성자를 생성할 때
//gasGauge,electricGauge를 파라미터로 받는다.
//메서드는 오버라이딩을 이용하여 잔여 가스와 잔여 전기량을 출력
//   
//HybridWaterCar 클래스는 waterGauge변수를 갖고 있고, HybridCar 클래스를 상속받는다.
//생성자 생성할 때는 gasGauge,electricGauge,waterGauge를 파라미터로 받는다.
//메서드 오버라이딩을 이용하여 잔여 가스와 잔여 전기량, 잔여 물량 출력
//   
//main에서 HybridWaterCar 객체를 생성하여 다음과 같은 결과를 출력하시오.
//
//잔여 가스량 : 15
//잔여 전기량 : 30
//잔여 물량 : 25

package ex01_super;
/*클래스에 들어갈 수 있는것
 * 1. 필드
 * 2. 메서드
 * 3. 생성자
 * */
public class Car {
	//필드
	int gasGauge;
	
	/*생성자
	 * 접근제한자 + 클래스명 (매개변수)
	 * */
	public Car(int gasGauge) {
		this.gasGauge = gasGauge; //값을 파라미터로 받은것을 필드까지 전송
	}
	
	//메서드만드는방법
	//접근제한자 반환형 메서드명(매개변수){}
	//가스잔여량 출력하는 함수
	public void showCurrentGauge() {
		System.out.println("가스 잔여량 :"+ gasGauge);
	};
	
}
class HybridCar extends Car{
	int electricGauge;
	public HybridCar(int gasGauge, int electricGauge){
		super(gasGauge);//가스게이지는 부모한테 전달
		this.electricGauge = electricGauge;
	}
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();//부모클래스의 매서드를 실행시킴
		System.out.println("전기량 : "+ electricGauge);
	}
	
}
class HybridWaterCar extends HybridCar{
	int waterGauge;
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) 
	{	super(gasGauge, electricGauge);
		this.waterGauge=waterGauge;
	}
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("물량 : " + waterGauge);
	}
	
} 
