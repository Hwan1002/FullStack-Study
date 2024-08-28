package ex02_for;
import java.util.Scanner;
public class Ex01_for {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			System.out.println(i);
			System.out.println("ㅎㅇ");
		}
		
		 System.out.println("--------------------");
		 //1~10
		 for(int i=1; i<=10; i++) {
			 System.out.print(i+" ");
		 }
		 
		 System.out.println();
		 
		 for(int i=10; i>0; i--) {
			 System.out.print(i+" ");
		 }
		 
		 System.out.println();
		 
		 for(int i=0; i<20;i++) {
			 if(i%2 == 1) {
				 System.out.print(i+" ");
			 }
		 }
		 
		 System.out.println();
		 
		 for(int i=1; i<10; i++) {
			 if(i%3==0) {
				 System.out.print(i+" ");
			 }
		 }
		 
		 System.out.println();
		 int result = 0;
		 for(int i=1; i<11; i++) {
		 	result += i; //누적합계 복합대입 연산자 += -= *= /=
	 	}
		 System.out.println(result);
		 
		 System.out.println("--------------------");
		 
		 int dan = 6;
		 for(int i=1; i<=9; i++) {
			 System.out.printf("%d X %d = %d \n",dan,i,(dan*i));
		 }
		 
		 System.out.println("--------------------");
		 
		 System.out.println("정수를 입력하세요 : ");
		 
	 	 Scanner scan = new Scanner(System.in);
		 int ndan= scan.nextInt();
		 int result1 =0;
		 for(int i=1; i<=ndan; i++) {
			 	result1 += i; //누적합계 복합대입 연산자 += -= *= /=
		 	}
		 System.out.print(result1);
		 
		 System.out.println("\n--------------------");
		 
		 //10개의 정수를 입력받아 그 중에 짝수가 몇개인지 
		 //개수를 출력해주세요 
		 
//		 int result2 = 0;
//		 for(int i=1; i<=10; i++) {
//			 System.out.println("1~10까지의 정수를 입력하세요 : ");
//			 int even = scan.nextInt();
//			 if(even % 2 ==0) {
//				 result2 ++;
//			 }
//		 }
//		 System.out.println(result2);
//		 
		 System.out.println("\n--------------------");
		 //키보드로부터 정수를 두개 입력받는다
		 //입력받은 x부터 y까지의 총합을 출력하세요
		 //예를들어 2와 5를 입력받으면
		 //2+3+4+5를 한 14가 출력되야한다.
		 //단, x가 y보다 큰경우 
		 //x와 y값을 바꿔서 총합을 구한다
		 System.out.println("x를 입력하세요 : ");
		 int x = scan.nextInt();
		 System.out.println("y를 입력하세요 : ");
		 int y = scan.nextInt();
		 if(x>y) {
			 int z =x;
			 x=y;
			 y=z;
		 }
		 int sum = 0;
		 for(int i=x; i<=y; i++) {
			 sum += i;
		 }
		 
		
		 System.out.println("총합 : " + sum);
		 
		 
	}	
}