package ex02_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("나이를 입력해주세요 : ");
//		int age = scan.nextInt(); //정수 입력받는 법
//		System.out.printf("제 나이는 %d 입니다.\n",age);
		System.out.println("-------------------------");
		
		System.out.print("이름을 입력해주세요 : \n"); 
		String name = scan.next(); // 문자열이면 "" string 한글자면 '' char
		
		System.out.print("나이를 입력해주세요 : \n");
		int ages = scan.nextInt();
		scan.nextLine();
		System.out.print("주소를 입력해주세요 : \n");
		String address = scan.nextLine();
		
		System.out.print("키를 입력해주세요 : \n");
		double height = scan.nextDouble();
		
		
		System.out.printf("제 이름은 %s 입니다.\n", name);
		System.out.printf("제 나이는 %d 입니다.\n", ages);
		System.out.printf("제 주소는 %s 입니다.\n", address);
		System.out.printf("제 키는 %f cm 입니다.\n", height);
		
	}
}
