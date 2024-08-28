package ex03_operator;

import java.util.Scanner;

public class Ex08_Operator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//과수원에서 배, 사과, 오렌지를 하루에 각각 5, 7, 5개씩 생산한다.
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int dayResult = pear + apple + orange;
		double hrResult = (double)dayResult / 24;
		//1. 과수원에서 하루에 생산되는 과일의 총 개수를 구하기
		System.out.println("하루에 생산되는 과일의 총 :" + dayResult + "개");
		//2. 시간당 총 생산량 구하기
		System.out.println("시간당 생산되는 총 과일의 수 :" + hrResult + "개");
		
		//----------------------------------------
		
		//상자 하나에는 농구공이 5개가 들어갈 수 있다.
		// 만일 농구공이 23개라면 몇개의 상자가 필요한가?
		// 공의 갯수가 5로 나누어 떨어지는지 안떨어지는지 먼저 확인
		int ball = 5;
		int totalBall = 23;
		int box = totalBall/ball;
		double result = totalBall % ball == 0? box:box+1; 
		System.out.println(box);
		System.out.print("총박스를 입력해주세요 : \n");
		int boxs = scan.nextInt();
		if(result == boxs) {
			System.out.println("정답입니다.");
		}else {
			System.out.println("오답입니다.");
		}
		
		//----------------------------------------
		
		//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
		//1. 세 과목에 대한 합계 출력하기
		//2. 평균 출력하기 (합계 / 3.0)
		
		//세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		//세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일때
		//합격 아니면 불합격
		System.out.print("국어 점수 : \n");
		int language = scan.nextInt();
		
		System.out.print("영어 점수 : \n");
		int english = scan.nextInt();
		
		System.out.print("수학 점수 : \n");
		int math = scan.nextInt();
		
		int plusAll = language + english + math;
		System.out.println("세 과목에 대한 합계 : " + plusAll );
		
		int average = plusAll / 3; 
		System.out.println("세 과목에 대한 평균 : " + average);
		
		
		if(language >= 40 && english >= 40 && math >= 40 && average >= 60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		
		
		
	}
}
