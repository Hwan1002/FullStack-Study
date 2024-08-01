package ex01_switch;

public class Ex03_switch {
	public static void main(String[] args) {
		//break이 없다면 어떻게 될까?
		
		int num = 7;
		switch(num) {
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 7:
			System.out.println("num은 7입니다.");
			break;
		default:
			System.out.println("num은 1도 7도 아닙니다.");
		}
	}
}
