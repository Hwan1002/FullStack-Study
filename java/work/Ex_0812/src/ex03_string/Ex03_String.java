package ex03_string;

import java.util.Scanner;

public class Ex03_String {
	public static void main(String[] args) {
		//회문 판별하기
		//회문이란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문장
		//기러기,토마토,스위스,별똥별
		//키보드에서 문장을 입력받고 해당 문장이 회문이면
		//xxx는 회문입니다 아니면 아닙니다 라고 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("회문을 입력해주세요 : ");
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);
		String reverse = sb.reverse().toString();
//		String reverse = "";
//		for(int i=str.length()-1; i >= 0; i--) {
//			reverse += str.charAt(i);
//		}
		if(str.equals(reverse)) {
			System.out.println(str + "는 회문입니다.");
		}else {
			System.out.println(str + "는 회문이 아닙니다.");
		}
		
	}
}
