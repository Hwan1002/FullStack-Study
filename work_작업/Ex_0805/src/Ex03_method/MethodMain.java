package Ex03_method;
import java.util.Scanner;
public class MethodMain {
	public static void main(String[] args) {
		MethodTest mtt = new MethodTest();
		int[] nums = {1,2,3,4,5};
		mtt.maxFinder(nums);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 번호를 입력하시오 : ");
		int x = scan.nextInt();
		
		System.out.println("두번째 번호를 입력하시오 : ");
		int y = scan.nextInt();
		
		System.out.println("연산 기호 입력 : ");
		String op  = scan.next();
		int result = mtt.getResult(x, y, op);
		System.out.println("결과 : "+ result);
	}
}
