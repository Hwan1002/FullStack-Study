package ex05_try_catch;
//키보드에서 정수를 입력받도록하고, 정수 이외의 값이 입력되엇다면
//"정수만 입력가능 "이라는 메세지 출력하지

import java.util.InputMismatchException;
import java.util.Scanner;

//정수 : 100
//입력 받은수 : 100

//정수 : aaa
//정수만 입력 가능

public class Ex03_try_catch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String num = "";
		try {
			System.out.print("정수 : ");
			num = sc.next();
			int n = Integer.parseInt(num);//예외 발생 가능성 있음
			System.out.println("입력받은수 : " + n);
		} catch (Exception e) {
				System.out.println(num  + "은 정수가 아닙니다.");
			
		}
	}
}
