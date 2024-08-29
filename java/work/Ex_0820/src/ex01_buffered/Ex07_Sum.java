package ex01_buffered;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ex07_Sum {
	public static void main(String[] args) throws IOException {
		//문제
		//N개의 숫자가 공백없이 쓰여있다. 이숫자를 모두 합해서 출력하는 프로그램을 작성하세요.
		
		//입력
		//N개의 숫자를 입력, 입력된 N개의 숫자만큼 숫자들이 공백없이 주어진다.
		
		//출력
		//입력으로 주어진 숫자 n개의 합을 출력
		
		//예시
		//1을 입력하면 1을 출력
		//5
		//54321 결과 15 
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * System.out.print("정수 입력 : "); 
		 * int n = Integer.parseInt(br.readLine()); 
		 * int sum = 0; 
		 * //입력받은 문자열을 미리 배열에 담는다.
		 * String[] arr = br.readLine().split("");
		 * //입력받은 숫자 만큼만 반복
		 * for(int i=0; i<n; i++) { 
		 *  sum += Integer.parseInt(arr[i]); 
		 * }
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자를 입력하세요 : ");
		String str = br.readLine();
		int sum = 0;
		for(String num : str.split("")) {
			sum += Integer.parseInt(num); 
		}
		System.out.println("입력한 숫자 : " + str);
		System.out.println("입력한 숫자들의 합 : " + sum);
	}


}
