package ex04_if;
import java.util.Scanner;
public class Ex03_if_elseif {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("좋아하는 숫자를 입력해주세요 : ");
		int favorite = scan.nextInt();
		
		if(favorite < 5) {
			System.out.println("좋아하는 숫자는 5보다 작습니다.");
		}else if(favorite > 5) {
			System.out.println("좋아하는 숫자는 5보다 큽니다.");
		}else {
			System.out.println("좋아하는 숫자는 5 입니다.");
		}
	}
}
