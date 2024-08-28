package Ex03_method;

import java.util.Arrays;

public class MethodTest {
	//정수형 배열의 최대값을 찾아 출력하는 maxFinder 메서드 작성하기
	//작성하기 배열의 매개변수로 전달받는다.
	void maxFinder(int[] nums) {
//		int max = nums[0];
//		for(int i : nums) {
//			if(i > max) 
//				max = nums[i];			
//			
//		}
		Arrays.sort(nums);
		System.out.println("최댓값은 : " + nums[nums.length-1]);
	}
	
	//계산기 만들기
	//Main에서 숫자 두개랑, 산술 연산자를 전달 받아서 계산을 해서 반환하는
	//getResult()메서드 작성하기
	int getResult(int x,int y,String op) {
		int result = 0;
		if(op.equals("+")) {
			 result += x + y;
		}else if(op.equals("-")) {
			result -= x - y;
		}else if(op.equals("*")) {
			result -= x * y;
		}else if(op.equals("/")) {
			result -= x / y;
		}else {
			result = -1;
		}
		
		return result;
		
	}
}
