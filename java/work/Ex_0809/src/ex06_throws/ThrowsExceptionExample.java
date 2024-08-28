package ex06_throws;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
<예외 던지기(throws)>
- 메서드 내부에서 예외를 처리하지않고 미룬후, 해당메서드를 호출한 쪽에서
  예외를 처리하는 방법을 칭한다.
- 메서드 뒤에 throws 키워드를 사용하여 던지기 할 예외 객체를 붙여주면 된다.
- 예외 객체는 여러개를 던질 수 있으며, 여러 개를 던질 시 콤마로 구분하여 나열해준다.
 **/
public class ThrowsExceptionExample {
	public static void checkYourSelf(Scanner sc) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는것이 좋다. 2.혼자 있는것이 좋다.");
		System.out.println("선택 : ");
		int check = sc.nextInt();
		if( check==1 ) {
			System.out.println("당신은 E");
		}else if(check == 2){
			
			System.out.println("당신은 I");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("===성격 유형 검사를 시작합니다.===");
			//메서드 호출
			ThrowsExceptionExample.checkYourSelf(sc);
		} catch (Exception e) {
			System.out.println("키보드 입력이 잘못되었습니다.");
		}
	}
	
}


