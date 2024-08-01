
package ex02_for;

public class Ex02_for {
	public static void main(String[] args) {
		for(int i=1; i<4; i++) {
			for(int j=1; j<4; j++) {
				System.out.println(i+" "+j);
			}
		}
		System.out.println();
		
		for(int i=1; i<5; i++) { //바깥쪽 포문 행
			for(int j=1; j<4;j++) { //안쪽 포문 열
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println("\n--------------------");
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4
		for(int i=1; i<4; i++) {//바깥쪽 포문 행
			for(int j=1; j<5; j++) {//안쪽 포문 열
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------");
		//01 02 03 04
		//05 06 07 08
		//09 10 11 12
		int count = 0;
		for(int i=1; i<4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.printf( "%02d ", ++count);//count를 위에서 0으로 초기화했기때문에 선행증감
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------");
		// A B C D 
		// E F G H 
		// I J K L
		char alpha = 'A';
		for(int i=1; i<4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(alpha++ + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------");
//		*
//		**
//		***
//		****
//		*****
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; ++j) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("\n--------------------");
//		1 2 3 4 5 6 7 8 9 10 
//		2 3 4 5 6 7 8 9 10 1 
//		3 4 5 6 7 8 9 10 1 2 
//		4 5 6 7 8 9 10 1 2 3 
//		5 6 7 8 9 10 1 2 3 4 
//		6 7 8 9 10 1 2 3 4 5 
//		7 8 9 10 1 2 3 4 5 6 
//		8 9 10 1 2 3 4 5 6 7 
//		9 10 1 2 3 4 5 6 7 8 
//		10 1 2 3 4 5 6 7 8 9 
		for(int i=1; i<=10; i++) {
			for(int j=0; j<10; j++) {
				int num = i+j;
				if(num > 10) {
					num -= 10;
				}
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}
}
