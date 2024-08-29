package ex02_Thread;
/*<sleep(int mils)>
주어진 시간동안 스레드를 정지시키는 메서드
해당 기능은 모든 스레드를 대기 시키며,
주어진 시간이 지나면 풀리게 된다.*/
class TimeThread extends Thread{
	@Override
	public void run() {
		for(int i=0; i < 1000; i++) {
			System.out.println("스레드 출력 : " + (i+1));
			//중간에 발생할수 있는 예외가 있기때문에 꼭 try catch를 해야함
			try {
				//1초간 일시정지
				Thread.sleep(1000);
			} catch (Exception e) {
				//어떤 예외가 발생에서 에러가 나는지 나오게끔하는 메서드
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSleepExample {
	public static void main(String[] args) {
		TimeThread tt = new TimeThread();
		tt.start();
	}
}
