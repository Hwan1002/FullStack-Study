package ex05_overriding;

public class CalMinus extends Calculator{
	public void getResult(int n1, int n2) {
		System.out.println("CalMinus : " + (n1 - n2));
	}
}
