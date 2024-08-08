package ex07_test;

public class CalRun {
	public static void main(String[] args) {
		Calculator calc = new GoodCalc();
		int [] a = {1,2,3,4,5};
		System.out.println("합 : " + calc.add(1,2));
		System.out.println("차 : " + calc.substract(1,2));
		System.out.println("평균 : " + calc.average(a));
	}
}
