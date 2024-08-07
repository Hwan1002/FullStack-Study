package ex03_array;
import java.util.Arrays;
import java.util.Scanner;
public class Ex10_multi_array {
	public static void main(String[] args) {
		// 1 ~25까지 2차원 배열 arr에 순차적으로 넣고
		// 한줄에 다섯개 씩 출력하기
		// 01 02 03 04 05~
		// 21 22 23 24 25
		int[][] iArr = new int[5][5];
		int count = 1;
		for(int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr[i].length; j++) {
				System.out.printf("%02d ", iArr[i][j] = count++);
				//%02d 두자리를 만들고 앞이 비엇으면 0을 끼워줌
			}System.out.println();
		}
		
		System.out.println("---------------------------------------");
		//로또 번호 맞추기
		int[][] lotto = {{2,6,11,33,42,44},
						 {1,6,17,22,24,33},
						 {7,16,24,33,42,44},
						 {11,27,32,34,43,46},
						 {6,17,22,24,33,41}};
		//키보드에서 당첨숫자를 연속으로 6개를 입력받아 myNum에 넣는다.
		Scanner scan = new Scanner(System.in);
		String myNum = "";
		
		boolean isWin = false;
		for(int i=1; i<7; i++) {
			System.out.printf("%d번째 로또 번호를 입력해주세요.", i);
			int lottoNum = scan.nextInt();
			myNum += lottoNum;
		}
		//2차원 배열에 들어있는 1차원배열 5개중 하나라도
		//완전히 일치하는 곳이 있으면 당첨!, 아니면 당첨되지 못했습니다 출력하기.
		//문자열끼리 비교할때는 myNum.equals();
		for(int i=0; i<lotto.length;i++) {
			String cpNum = ""; //기존에 배열의 데이터를 문자형으로 변환하기 위해 
			for(int j=0; j<lotto[i].length; j++) {
				cpNum += lotto[i][j];
				
			}
			if(myNum.equals(cpNum)) {
				isWin = true;
				break;
			}
		}
		if(isWin) {
			System.out.println(myNum+"번호 당첨");
		}else {
			System.out.println(myNum+"번호는 당첨되지 못했습니다.");
		}
		
		
		
		
		
	}
}
