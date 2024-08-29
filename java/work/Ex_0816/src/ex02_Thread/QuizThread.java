package ex02_Thread;

import java.util.InputMismatchException;
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
	//난수를 받기 위한 변수
	int x;
	int y;
	
	//정답을 맞춘 횟수를 저장하기 위한변수
	int playCount = 0;
	
	//시간을 세서 담기위한 변수
	int timer = 0;
	
	//반복문을 멈추기 위한 변수
	boolean isCheck = true;
	
	//맞춰야하는 문제의 개수 (변하지 않는 숫자변수)
	final int FINISH = 5;

	public void startGame() {
		while(isCheck) {
			try {
				//난수 두개 받기
				x = new Random().nextInt(101);
				y = new Random().nextInt(101);
				//틀렷을때 틀린문제를 다시 풀기 위한 while문
				while(true) {
					//두개의 난수를 더하는 문제를 콘솔에 출력하기
					System.out.printf("%d + %d = ", x,y);
					//정답 입력받기
					Scanner sc = new Scanner(System.in);
					//정답을 입력할때 정수 이외의 것을 입력하면 예외발생시키기
					int ans = sc.nextInt();
					if(ans == (x+y)) {
						System.out.println("정답!");
						//정답이면 빠져나와야함
						break;
					}else {
						System.out.println("오답!");
						//오답일경우 다시 올라가서 실행해야하기 때문에
						continue;
					}
				}
			//정답을 맞추는 if문을 나오면 맞춘숫자 카운트하기
			playCount++;
				
				//5개를 맞추면 멈추기
				if(playCount == FINISH) {
					System.out.println("결과 : " + timer + "초");
					//isCheck를 false로 변경하여 반복문을 빠져나간다.
					isCheck = false;
				}
			} catch (Exception e) {
				System.out.println("정답은 정수로 입력하세요.");
				e.printStackTrace();
			}
			
		}//while
	}//startGame
	
	//시간초를 세기위한 스레드
	//startGame()메서드가 실행되는 동안 별도로 작동하는 스레드
	@Override
	public void run() {
		//isCheck가 false가 되는 순간 반복문이 같이 멈춘다.
		while(isCheck) {
			try {
				//1초씩 세야하기때문에 sleep 사용한다.
				Thread.sleep(1000);
				timer++;
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
	}
}
	
