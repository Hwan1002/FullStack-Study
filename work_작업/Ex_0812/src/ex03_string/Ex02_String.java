package ex03_string;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex02_String {

	public static void main(String[] args) {
		//키보드에서 숫자와 특수 문자를 제외한 알파벳을 무작위로 입력받는다.
		//입력답은 문자열에 소문자 a가 몇개 있는지 판별하는 코드 작성하기
		//결과
		//입력 : asdfasdf
		//a의 개수
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하세요 : " );
		String val = sc.next();
		int count = 0;
		
		try {
			for(int i=0; i<val.length(); i++) {
				if(val.charAt(i) == 'a') {
					count++;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("입력 : " + val);
		System.out.println("a의 개수 : " + count);
		
	}

}
