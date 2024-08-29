package ex01;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d",n,sum);
		int x = 5;
		int y = x++;

		System.out.println("x의 값 : " +x); // x : ?
		System.out.println("y의 값 : " +y); // y : ?
	}
}
