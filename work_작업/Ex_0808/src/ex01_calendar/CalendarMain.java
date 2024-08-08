package ex01_calendar;

public class CalendarMain {

	public static void main(String[] args) {
		DeskCalendar dc = new DeskCalendar("보라",6);
		//오버라이드된 메서드가 출력
		dc.info();
		
		dc.hanging();
		
		dc.onTherDesk();
		
		Calendar c = new DeskCalendar("검정", 12);
		c.info();//부모타입으로 변환해도 오버라이딩된 메서드가 호출된다.
		c.hanging();//부모 클래스에 있는 메서드
		//c.onTheDesk(); 자식클래스에 선언된 메서드는 사용 불가
		
		//부모타입으로 변환한 자식 객체는, 더이상 자식 클래스만의
		//멤버나 메서드를 호출할 수 없다.
	}

}
