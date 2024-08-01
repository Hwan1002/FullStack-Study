package ex04_if;
import java.util.Scanner;
public class Ex02_if_else {

	public static void main(String[] args) {
		int num = 5;

		if(num > 4) {
			System.out.println(num+"은 4보다 큽니다.");
		} else {
			System.out.println(num+"은 4보다 작습니다.");
		}
		
		//------------------------------------------------
		//두개의 숫자 비교하기 
		int a = 4;
		int b = 10;

		if(a > b) {
			System.out.printf("%d가 %d보다 큽니다.",a,b);
		} else {
			if(a==b) {
				System.out.printf("%d는 %d와 같습니다.",a,b);
			}else {
				System.out.printf("%d가 %d보다 작습니다.",a,b);
			}
		}
		
		//----------------------------------------
		//int 형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
		int x = '5';
		if(x>10 && x < 20) {
			System.out.println(true);
		}
		//char형 변수 ch 가 'x' 또는 'X'일때 true인 조건식
		char ch = 'x';
		if(ch=='x' || ch == 'X') {
			System.out.println(true);
		}
		//char형 변수 ch2가 알파벳(대문자 또는 소문자)일때 true 인 조건식
		char ch2 = 65;
		if(ch2 >= 65 && ch2 <= 90) {
			System.out.println("소문자 입니다.");
		}else {
			System.out.println("대문자 입니다.");
		}
		
		//삼항연산자로 만들었던 x개의 농구공을 담기위한 박스의 개수 구하기
		//를 조건문으로 만들기
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		// 공의 갯수가 5로 나누어 떨어지는지 안떨어지는지 먼저 확인
//		int ball = 5;
//		int totalBall = 23;
//		int box = totalBall/ball;
//		double result = totalBall % ball == 0? box:box+1; 
//		System.out.println(box);
//		System.out.print("총박스를 입력해주세요 : \n");
//		int boxs = scan.nextInt();
//		if(result == boxs) {
//			System.out.println("정답입니다.");
//		}else {
//			System.out.println("오답입니다.");
//		}
		Scanner scan = new Scanner(System.in);
		System.out.println("농구공 개수를 입력하세요 : ");
		int ball = scan.nextInt();
		int totalBoxs = ball / 5; 
		if(ball % 5 == 0) {
			System.out.println("필요한 박스의 수 " + totalBoxs);
		}else {
			System.out.println("필요한 박스의 수 " + totalBoxs + 1);
		}
	}

}
