package ex02_Thread;

import java.util.Scanner;
//스캐너를 통해 숫자를 입력받고
//스레드에서 입력받은 숫자부터 1씩 감소하다가 0이 되었을때
//"종료"라는 메시지와 함께 스레드 종료
//ThreadCount 클래스에 스레드 정의하기
public class ThreadCountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		ThreadCount tc = new ThreadCount(sc.nextInt());
		tc.start();
	}
	
	
}
