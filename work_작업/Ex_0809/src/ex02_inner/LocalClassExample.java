package ex02_inner;

public class LocalClassExample {
	private int speed = 10;
	
	public void getUnit(String unitName) {
		class Unit{
			public void move() {
				System.out.println(unitName + "이 " + speed + "의 속도로 이동합니다.");
			}//move 끝
		}//Unit 끝
		Unit unit= new Unit();
		unit.move();
	}//getUnit(); 끝
	
	
	public static void main(String[] args) {
		LocalClassExample local = new LocalClassExample();
		local.getUnit("마린");
	}
}
	