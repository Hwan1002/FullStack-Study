package ex04_Math;
/*Math 클래스
 * 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스로
 * 자바에서는 수학 계산이 필요할때 주로 사용한다.
 * 객체를 선언하지 않고 바로 사용할 수 있도록 해당 클래스가 제공하는 모든 메서드는
 * 모두 정적 메서드로 이루어져 있다.*/

public class Ex01_Math {
	public static void main(String[] args) {
		//올림
		System.out.println("3.51올림 : " + Math.ceil(3.51));
		
		//내림
		System.out.println("13.61내림 : " + Math.floor(13.61));
		
		//반올림
		System.out.println("12.8 반올림 : " + Math.round(12.8));
		
		//최대값 반환
		int maxValue = Math.max(1, 10);
		
		//최소값 반환
		int minValue = Math.min(1,10);
		System.out.println(maxValue);
		System.out.println(minValue);
		
		//소수점 둘째자리 이하에서 반올림하고 싶을때
		double pie = 3.14561877895;
		System.out.println(Math.round(pie*100)/100.0);
		System.out.println(Math.round(pie*1000)/1000.0);
	}

}
