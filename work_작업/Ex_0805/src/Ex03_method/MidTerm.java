package Ex03_method;

public class MidTerm {
	//학생들의 점수가 두개 들어 있는 배열을 전달 받아
	//총합을 구하여 반환하는 score 메서드 만들기
	int score(int[] scores) {
		int sum = 0;
		for(int i : scores) { //Main 에서 stu1,stu2 의 안에 점수들을 더한것을 sum변수에 대입
			sum += i;
		}
		return sum;
	}
	
}
