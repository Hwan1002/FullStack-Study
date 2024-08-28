package ex05_try_catch;

import java.util.Scanner;

public class Ex05_try_catch {
	public static void main(String[] args) {
		//Finally
		//finally 블록은 예외 발생 유무와 상관없이 실행되는 구문이며 생략할 수 있다.
		//예외를 처리할때 예외아 상관ㅇ벗이 반드시 처리해야 하는 구문들을
		//작성할 때 사용한다.
		//보통 외부 연동이나 예외가 발생해도 정상 종료되어야 할 구문들에서 사용한다.
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요. : ");
			int score = sc.nextInt();
			if(score >= 60) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}catch(Exception e) {
			System.out.println("키보드 입력이 올바르지 않습니다.");
		}finally {//발생여부와 상관없이 꼭 실행해야 하는 코드작성
			
			//보통 finally에는 연결을끊고 닫아야할 것들을 정의해둔다.
			//예외 발생여부와 상관없이 종료해야하기 때문이다.
			sc.close();
			System.out.println("어쨌거나 실행할 코드");
		}
	}
}
