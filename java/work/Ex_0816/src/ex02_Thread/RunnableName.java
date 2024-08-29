package ex02_Thread;
/*Thread에 이름 부여하기
- 현재 진행중인 스레드가 어떤 작업을 하는지 알기 위해 스레드의 이름을 부여할 수 있다.
- 우리가 생선한 스레드는 'Thread-N'이라는 이름으로 자동으로 설정되는데
다른 이름으로 설정하고 싶다면 Thread클래스의 setName()메서드를 사용한다.*/
public class RunnableName {
	public static void main(String[] args) {
		Runnable task = () -> {
			
		};
		
		Thread myThread = new Thread(task);
		myThread.setName("러너블 스레드");
		String name = myThread.getName();
		System.out.println(name);
		myThread.start();
	}
}
