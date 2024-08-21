package ex02;

import java.util.Arrays;

import java.util.Scanner;
public class MethodMain {
	public static void main(String[] args) {
		//배열의 최댓값구하기
		MethodTest mt = new MethodTest();
		int[] arr = {4,1,2,10,7,9,5,6,3,8};
		mt.maxFinder(arr);
		
		//온도구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("1 혹은 2 를 입력하세요 : ");
		int temper = sc.nextInt();
		if(temper == 1) {
			mt.fToc();
		}else if(temper == 2){
			mt.cTof();
		}
	
		
		
	}

}
