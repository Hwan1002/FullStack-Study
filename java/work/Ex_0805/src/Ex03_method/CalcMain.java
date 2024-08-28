package Ex03_method;

public class CalcMain {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.sum(1,3);
		
		int[] nums = {100,200,300,400,500 };
		int n = calc.sum(nums);
		//OverLoading : 함수의 이름이 같아도 파라미터가 다르면 다른것이 자동으로 실행이됌
		System.out.println(n);
		//Calc sum에서 return한 값을 가져와서 보여줌
		//필요에 따라서 리턴을 사용하여 값을 가져와서 사용할수 있다.
	} 

}
