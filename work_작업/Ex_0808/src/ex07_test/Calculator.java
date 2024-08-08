package ex07_test;

public abstract class Calculator {
	//추상형 메서드는 중괄호를 포함시키지않는다X
	//정수형 변수 2개를 매개변수로 가지는 추상메서드 add();
	//반환형 int
	abstract public int add(int a, int b);
	
	//정수형 변수 2개를 매개변수로 가지는 추상메서드 substract();
	//반환형 int
	abstract public int substract(int a, int b);
	
	//정수형 배열을 매개변수로 가지는 average() 추상 메서드;
	//반환형 double
	abstract public double average(int[] avg);
	
	
}
