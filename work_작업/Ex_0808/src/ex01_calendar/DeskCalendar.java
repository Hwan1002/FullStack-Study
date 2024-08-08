package ex01_calendar;

//Calendar 클래스를 상속받는다

public class DeskCalendar extends Calendar{
	//색 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.
	//라고 출력되는 info메서드 오버라이딩하기
		public DeskCalendar(String color, int months) {
		//부모생성자가 매개변수를 받기때문에 생략을 할 수 없어
		//super(매개변수)를 명시하지 않으면 에러가 난다 중요!!!!
		super(color, months);
	}	
		@Override
		public void info() {
			System.out.println(color+"색 달력을 벽에 걸기 위해 고리가 추가로 필요합니다.");
		}
	
	
	//xx색 달력을 책상에 세울 수 있습니다 라고 출력되는
		public void onTherDesk() {
			System.out.println(color+"색 달력을 책상에 세울 수 있습니다.");
		}
	//onTheDesk 만들기
}
