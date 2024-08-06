package ex05_overriding;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus(); 
		CalMinus cm = new CalMinus(); 
		cp.getResult(15, 15);
		cm.getResult(30, 15);
	}

}
