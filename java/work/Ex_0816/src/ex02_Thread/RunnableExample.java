package ex02_Thread;

class WhiteFlag implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println("백기올려");
		}
	}
	
}
public class RunnableExample {
	public static void main(String[] args) {
		WhiteFlag wf = new WhiteFlag();
		Thread t = new Thread(wf);
		
		//Runnable로 클래스를 만들면 스레드메서드 start를 사용하지 못해서
		//객체를 생성후에 실행해야함
		//wf.start();
		t.start();
		
		//Runnable 인터페이스를 익명클래스로 만들어서 람다식으로 표현할 수 있다.
		Runnable blue = () ->{
			while(true) {
				System.out.println("청기올려");
			}
		};
		
		Thread t2 = new Thread(blue);
		t2.start();
	}
}