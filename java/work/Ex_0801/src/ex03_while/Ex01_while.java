package ex03_while;
import java.util.Scanner;
public class Ex01_while {
	public static void main(String[] args) {
		
//		int num = 1;//초기식
//		while(num <= 10) {
//			System.out.println(num);
//			num++;//증감식
//		}
//		System.out.println("\n-----------------------");
//		
		Scanner scan = new Scanner(System.in);
//		int n = 0;
//		
//		while(n!=-1) {
//			System.out.println("정수 입력 : ");
//			n = scan.nextInt();
//			System.out.println("입력된 정수 : " + n);
//		}
		//for문으로 만드는 강제루프
//		for(;;) {
//			
//		}
		System.out.println("\n-----------------------");
		
		//각자리 수 의 합 구하기
		//정수형 변수 n이 있을때, 각 자리의 합을 더한 결과를 출력하세요.
		//n의 값이 12345라면, 1+2+3+4+5의 결과인 15를 출력하세요.
		System.out.print("n의 값을 입력해 주세요");
		int n = scan.nextInt();
		int sum = 0;
		while(n > 0) {
			sum += n % 10;
			n = n/10;
		}
		System.out.println("각자리수 의 합 : " + sum);
		
		System.out.println("\n-----------------------");
		//두개의 주사위를 던져졌을 때, 눈의 합이 6이되는 모든 경우의 수 출력하기
		
		int xdice = 1;
		while(xdice <=6 ) {
			int ydice = 1;
			while(ydice <=6) {
				if(xdice + ydice == 6) {
					System.out.println(xdice + "," + ydice);
				}
				ydice++;
			}
		xdice++;
			
		}
		
		
		
		
//		int x = 1;
//		
//		while(x <= 6) {
//			int y = 1;
//			while(y <= 6) {
//				if(x+y==6) {
//					System.out.println(x+","+y);
//				}
//			y++;
//			}
//		x++;
//		}
		
	
	
	
	
	}
	
}
