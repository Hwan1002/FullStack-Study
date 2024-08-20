package ex01_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex06_BufferedReader {
	//try-catch대신 예외던지기 throws IOExecption
	public static void main(String[] args) throws IOException {
		//Scanner는 무겁고 느리다
		//보조스트림으로 BufferedReader를 사용하면 더 빠르지 않을까?
		
		//System.in 키보드에서 입력받는 객체
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력 : ");
		String str = buffer.readLine();
		System.out.println("입력된 문자열 : " + str);
		
		//정수 입력받기
		System.out.println("정수 입력 : ");
		int num = Integer.parseInt(buffer.readLine());
		System.out.println( num+1);
		
		//공백으로 구분된 정수 입력받기
		System.out.println("여러개 정수 입력 : ");
		String[] iArr = buffer.readLine().split(" ");
		System.out.println(Arrays.toString(iArr));
	}

}
