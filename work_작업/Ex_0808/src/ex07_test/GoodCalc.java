package ex07_test;
//GoodCalc클래스를 만들고 Calculator를 상속받아;
	//두수를 더하여 반환하는 add();
	//두수를 빼서 반환하는 substract;
	//배열의 평균을 구하는 average();
	//구현하기
	
public class GoodCalc extends Calculator{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int substract(int a, int b) {
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i:a) {
			sum += i;
		}
		double avg = (double)sum / a.length;
		return avg;
		
	}
}