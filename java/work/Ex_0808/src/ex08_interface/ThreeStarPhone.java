package ex08_interface;
//클래스를 상속 -> extends 사용
//인터페이스 구현 -> implements 사용
public class ThreeStarPhone implements Phone{
	int batteryCapacity = 40;
	boolean isOn = false;
	
	@Override
	public void powerOn() {
		if(batteryCapacity > 30) {
			System.out.println("@@@전원이 켜졌습니다!!@@@");
			isOn = true;
		} else {
			System.out.println("배터리가 부족합니다...");
		}
		
	}
	
	@Override
	public void powerOff() {
		System.out.println("@@@전원이 꺼졌습니다!!@@@\n");
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
			System.out.println("----유튜브 시청중-----");
			batteryCapacity -= 10;
			System.out.println("배터리는 .... "+ batteryCapacity+"%\n");
		}else {
			System.out.println("배터리 부족...");
			powerOff();
		}
	}
	
	@Override
	public void charge() {
		if(batteryCapacity < Phone.MAX_BATTERY_CAPACITY - 20) {
			System.out.println("--- 충전중 ---");
			batteryCapacity += 5;
			System.out.println("충전되었습니다..." + batteryCapacity + "%\n");
		} else {
			System.out.println("충전할 필요가 없습니다...");
			System.out.println("배터리량이 충분합니다..." + batteryCapacity + "%");
		}
		
	}
}
