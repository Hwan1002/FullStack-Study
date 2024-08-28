package Ex03_method;

public class MidTermMain {

	public static void main(String[] args) {
		//MidTermMain 에서 두 학생의 성적을 비교하여
		//누가 더 점수가 높은지 출력하기
		int[] stu1 = {89,90};
		int[] stu2 = {48,12};
		MidTerm mid = new MidTerm();
		
		int sumA = mid.score(stu1);
		int sumB = mid.score(stu2);
		if(sumA > sumB) {
			System.out.println("A의 학생이 B학생보다 성적이 좋습니다.");
		}else if(sumA < sumB) {
			System.out.println("B의 학생이 A학생보다 성적이 좋습니다.");
		}else {
			System.out.println("성적이 같습니다");
		}
		
	}

}
