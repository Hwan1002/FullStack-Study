package ex02_Thread;

import java.util.Random;
import java.util.Scanner;

//QuizThread클래스를 만들고 Thread를 상속 받는다.
//startGame()메서드를 만들고 1~100 사이의 난수 두개를 더하는 문제를 출제
//키보드에서 답을 입력하여 5문제가 정답처리 될때까지 반복한다.
//정답을 맞히고 난 후에 모든 문제를 맞추기 까지 몇초가 걸렸는지 화면에 출력하며 프로그램 종료

/*QuizMain클래스 에서는
QuizThread qt = new QuizThread();
qt.start();
qt.startGame();

위 세 줄 이외의 다른 코드는 추가하지 않는다.
단, 사용자가 문제의 정답으로 정수 이외의 문자를 입력했을 경우에
"정답은 정수로 입력하세요"라는 문장이 출력되도록 한다.
---------실행 결과----------- 
23 + 48 = 71
정답!!
66 + 100 = 166
정답!!
68 + 52 = 1
오답
61 + 51 = 112
정답!!
9 + 48 = 57
정답!!
53 + 28 = 81
정답!!
결과 : 24초...*/
public class QuizThread extends Thread{
	
	public void startGame() {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		int x = rnd.nextInt(101);
		int y = rnd.nextInt(101);
		int ans = sc.nextInt();
		System.out.print(x + "+" + y + "= " + ans);
		
		while(true){
		for(int i=0; i<5; i++){
			if((x+y).equals(ans)){
				System.out.println("정답!");
				continue;
			}else if(ans != (x+y)){
				System.out.println("오답!");
				break;
			}
		}
		}sw
		int ans = sc.nextInt();
		for(int i=0; i<=5; i++) {
			
			System.out.println(x +"+"+ y + "=" + "닶 : " + ans);
			
		}
	}
}
	
