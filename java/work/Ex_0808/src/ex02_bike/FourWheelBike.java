package ex02_bike;

public class FourWheelBike extends Bike {
	@Override
	public void info() {
		super.info();
	}
	
	public void addWheel() {
		//wheel이 2개라면 4개로 만들고
		if(wheel == 2) {
			wheel = 4;
			System.out.println(riderName + "의 자전거에 보조 바퀴를 부착하였습니다.");
		}else {
			System.out.println(riderName + "의 자전거에 이미 보조 바퀴가 부착되어 있습니다");
			 
		}
	}
}
