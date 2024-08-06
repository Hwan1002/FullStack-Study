package ex05_overriding;

public class CalPlus extends Calculator{
	
	public void getResult(int n1, int n2) {
		System.out.print("CalPlus : " + (n1 + n2) + "\n");
	}
}
