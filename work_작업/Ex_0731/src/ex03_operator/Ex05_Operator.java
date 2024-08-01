package ex03_operator;

public class Ex05_Operator {

	public static void main(String[] args) {
		//논리연산자
		//피연산자를 두개 필요로 하는 연산자이다.
		//피연산자로 논리(boolean)형 데이터만 사용가능하다.
		
		//&&은 And의 의미를 가지고 있다.
		//앞 뒤의 연산이 모두 True면 True를 반환한다.
		System.out.println(true && true);
		
		//참 && 참 = 참 (둘다 참일때만 참을 반환)
		//참 && 거짓 = 거짓 (하나라도 거짓이면 거짓을 반환)
		//거짓 && 참 = 거짓
		//거짓 && 거짓 = 거짓
		
		int myAge = 30;
		int limit = 35;
		boolean result = (limit - myAge) >= 5 && myAge > 30;
		System.out.println("&&연산결과: " + result);
		System.out.println(myAge);
		
		//||(또는) or 의 의미를 가지고있다.
		//앞 뒤의 피연산자중 하나라도 true면 true를 반환한다.
		
		//참 || 참 = 참 (하나라도 참이면 참을 반환)
		//참 || 거짓 = 참
		//거짓 || 참 = 참
		//거짓 || 거짓 = 거짓
		int n1 = 10;
		int n2 = 20;
		//논리연산자 앞뒤로 비교연산자가 많이 온다
		boolean result2 = (n1 += 10) > 20 || n2 - 10 == 11;
		System.out.println("||연산결과: " + result2);
	}

}
