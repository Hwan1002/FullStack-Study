package ex01_interface;

public class Main {
	public static void main(String[] args) {
		//Point를 상속 받아 색을 가진 점을 나타내는 ColorPoint 클래스 만들기
		//main 메서드를 실행한 결과는 다음과 같다.
		ColorPoints cp = new ColorPoints(5,5,"Yellow");
		cp.setXY(10,20);
		cp.setColor("Red");
		
		String str = cp.toString();
		System.out.println(str+"입니다.");
		
		//결과 
		//Red 색의 (10,20)의 점입니다.
	}
}
