package ex01_switch;
import java.util.Scanner;
public class Ex05_switch {
	public static void main(String[] args) {
		//10이하의 숫자를 키보드에서 입력받는다.
		//해당 숫자가 짝수인지 홀수인지 판별하는 출력하는 코드를
		//switch로 작성해주세요
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		String result = "a";
		
		switch(num) {
		case 1,3,5,9->result = "홀수입니다.";
		case 2,4,6,8,10->result = "짝수입니다.";
		default->result="잘못 입력하였습니다.";
		}
		System.out.println(result);
		
		switch(num % 2) {
		case 0-> result="짝수입니다.";
		case 1-> result="홀수입니다.";
		default->result="잘못 입력하였습니다.";
		}
		System.out.println(result);
		
		//키보드에서 달(Month)를 입력받아
		//해당 달이 몇일까지 있는지 switch문을 이용해 작성해 주세요.
		//결과
		//x월은 x일까지 있습니다.
		
		System.out.println("궁금하신 달월을 입력하세요 : ");
		int month = scan.nextInt();
		switch(month) {
		case 1,3,5,7,8,10,12 -> System.out.printf("%d월은 31일까지 있습니다.",month);
		case 4,6,9,11 -> System.out.printf("%d월은 30일까지 있습니다.",month);
		case 2 -> System.out.println("2월은 28일 혹은 29일까지 있습니다");
		default -> System.out.println("잘못입력하였습니다.");
		}
		//------------------------------------------------------
		
		//계산기프로그램 만들기
		//두개의 정수를 입력받는다
		//산술 연산자도 입력받아서 문자열에 담는다 
		//switch문을 이용하여 정수의 연산을 수행하는 코드 작성하기
		System.out.println("정수를 입력하세요 : ");
		int a = scan.nextInt();
		System.out.println("산술을 대입할 정수를 입력하세요 : ");
		int b = scan.nextInt();
		
		System.out.println("산술연산자를 입력하세요 : ");
		String cal = scan.next();
		
		System.out.println(cal);
		
		switch(cal){
			case "+" ->
				System.out.printf("%d + %d 의 값은 = %d\n",a,b,(a+b));
			case "-" ->
				System.out.printf("%d - %d 의 값은 = %d\n",a,b,(a-b));
			case "*" ->
				System.out.printf("%d * %d 의 값은 = %d\n",a,b,(a*b));
				//수학적인 나누기를 하려면 숫자 하나를 (double)로 형변환을 하면된다.
			case "/" ->
				System.out.printf("%d / %d 의 값은 = %d\n",a,b,(a/b));
			default->
				System.out.println("잘못입력하였습니다.");
		}
		
		
		
		
		
		
		
		
		
	}
}
