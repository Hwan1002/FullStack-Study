package ex01_do_while;

public class Ex01_dowhile {

	public static void main(String[] args) {
		
		//do-while문
		//while문과 같이 조건을 만족할 동안 계속 반복힌다.
		//다만, while문과 다른 점은 먼저 루프를 한 번 실행한 후 조건식을 검사한다는 점이다.
		//즉, 조건식의 결과와 상관없이 무조건 한 번은 실행을 한다.
	
		//do{
		//	반복하고자 하는 명령;
		//}while(조건식);
	
		int i = 11;
		do {
			System.out.println(i);
		}while(i <= 10);
		
		int sum = 0;
		int n = 1;
		do {
			sum+=n;
			n++;
		}while(n<=10);
		System.out.println("합 : " + sum);
		//상황에 따라 반복문 사용하기
		//반복횟수가 지정되는 경우 -> 횟수를 만족할때까지 반복
		//ex) 물통에 물을 10번 부어라 -> for 문
		//특정 조건이 부여되는 경우 -> 조건이 만족될때까지 반복한다.
		//ex)물통에 물이 가득찰때까지 부어라 -> while
		//특정 조건과 옵션이 부여되는경우 -> 한번 실행한후 반복
		//ex) 물통에 물을 따라보고 새지않으면 끝까지 채워라. -> do while문
		
	}

}
