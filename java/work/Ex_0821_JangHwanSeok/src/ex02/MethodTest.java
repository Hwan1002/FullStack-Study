package ex02;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTest{
	//배열의 최대값을 찾는 maxFinder메서드 작성하기
	public void maxFinder(int[] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("최대값은 : " + max);
	}
	//화씨를 섭씨로 바꾸는 fToc메서드
	//화씨를 섭씨로 바꾸는법 : (화씨-32)/1.8
	
	public void fToc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("섭씨온도를 입력하세요 : ");
		double faher = sc.nextInt();
		double cel = (faher-32)/1.8;
		System.out.println("섭씨로 변화된 온도는 : " + cel);
//			int change = (int) ((temper-32)/1.8);
//			System.out.printf("입력한 화씨%d를 섭씨로 바꾸면 %d이다. \n",temper,change);
	}
		
				
	//섭씨를 화씨로 바꾸는 cTof메서드
	//섭씨를 화씨로 바꾸는법 : 1.8 * 섭씨 + 32
	public void cTof() {
		Scanner sc = new Scanner(System.in);
		System.out.println("화씨온도를 입력하세요 : ");
		double cel = sc.nextInt();
		double faher = 1.8 * cel + 32;
		System.out.println("화씨로 변화된 온도는 : " + faher);
//		int change = (int) (temper*1.8+32);
//		System.out.printf("입력한 섭씨 %d를 화씨로 바꾸면 %d이다. \n",temper,change);
	}
	
}
