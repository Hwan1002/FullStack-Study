package ex02_Thread;
/*스레드의 동기화
- 멀티 스레드 프로그램이 실행될 때 다수의 스레드가 하나의 데이터를
  공유하면서 스레드 간의 경쟁이 일어날 수 있다.
- 경쟁이 정상적으로 이루어진다면 문제가 없겠지만,
  간혹 스레드 사이에서 자원 소유의 순서가 잘못되어 예상치 못한 결과가 나타날 수 도있다.*/

/*
<스레드 동기화 처리>
하나의 스레드가 이영역에 진입할때 락을 걸어서
다른 스레드가 수행되지 못하도록 하고 작업이 종료되면
락을 풀어 다른 스레드가 작업하도록 하는것.
블록 또는 메서드 단위로 synchronized키워드를 붙여 사용한다.

<메서드 동기화 처리>
메서드 이름 앞에 synchronized키워드를 사용하면 해당 메서드 전체를 동기화 처리할 수 있다.
public synchronized void add(){...}
*/
public class Bank {
	private int money;
	
	public int getMoney() {
		return money;
	}
	
	public void addMoney(int money) {
		this.money += money;
	}
	
	
}
