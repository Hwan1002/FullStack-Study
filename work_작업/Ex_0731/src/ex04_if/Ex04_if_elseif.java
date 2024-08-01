package ex04_if;
import java.util.Scanner;
public class Ex04_if_elseif {

	public static void main(String[] args) {
		int favorite = 7;
		if(favorite > 5){
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		}else if(favorite == 7) {
			System.out.println("좋아하는 숫자는 7입니다.");
		}//조건의 위치를 잘 생각해야한다.
		
		//------------------------------------------------
		//나이를 키보드에서 입력받는다.
		//20살 이상이면 성인입니다.
		//14살 이상이면 청소년입니다.
		//7살 이상이면 어린이입니다.
		//그 이외에는 유아입니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
			//객체명.메서드명(); 해당 클래스에 있는 메서드의 호출
		if(age >= 7 && age < 14) {
			System.out.println("어린이 입니다.");
		}else if(age >= 14 && age < 20 ) {
			System.out.println("청소년입니다.");
		}
		else if(age >= 20 ) {
			System.out.println("성인입니다.");
		}else {
			System.out.println("유아입니다.");
		}
		//키보드에서 성적을 입력받는다
		//100~90 = A
		//89~80=B
		//79 ~70=C
		//69~60=D
		//59~0=F
		System.out.println("점수를 입력하세요 : ");
		int score = scan.nextInt();
			//객체명.메서드명(); 해당 클래스에 있는 메서드의 호출
		char grade = 'a';
		
		if(score >= 90) {
			if(score > 100) {
				System.out.println("점수를 초과하였습니다.");
				return;
			}
			 grade = 'A';
		}else if(score >= 80) {
			 grade = 'B';
		}else if(score >= 70) {
			 grade = 'C';
		}else if(score >= 60) {
			 grade = 'D';
		}else {
			 grade = 'F';
		}
		System.out.printf("점수는 %d이고 성적은 %c입니다.",score, grade);
	}
}
