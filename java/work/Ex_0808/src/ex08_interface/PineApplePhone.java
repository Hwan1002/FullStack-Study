package ex08_interface;
//<implements>
//- 구현 클래스는 인터페이스를 사용해 구현하겠다는 선언을 해야 한다.
//- 구현한다는 의미를 가지고 있는 implements키워드를 사용하여 명시할 수 있다.
public class PineApplePhone implements Phone{
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("@@@Power On!!@@@");
			isOn = true;
		} else {
			System.out.println("Low Battery...");
		}
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("@@@Power Off!!@@@\n");
		isOn = false;
		
	}
	
	@Override
	public boolean isOn() {
		if(isOn) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void watchUtube() {
		if(batteryCapacity > 10) {
			System.out.println("----watching youtube-----");
			batteryCapacity -= 10;
			System.out.println("battery is .... "+ batteryCapacity+"%\n");
		}else {
			System.out.println("Low Battery...");
			powerOff();
		}
	}
	
	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- charging ---");
			batteryCapacity += 5;
			System.out.println("Charged..." + batteryCapacity + "%\n");
		} else {
			System.out.println("You don't have to charge...");
			System.out.println("It's enough..." + batteryCapacity + "%");
		}
		
	}
}