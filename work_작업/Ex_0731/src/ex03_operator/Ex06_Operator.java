package ex03_operator;

public class Ex06_Operator {
	public static void main(String[] args) {
		//비트연산자
		//논리 연산자와 유사하지만 bit단위("2진수")의 연산만 가능하다.
		//일반적으로 시프트 연산자와 더불어 암호화, 복호화 작업에 사용된다.
		// &	논리곱(AND)	두 항이 모두 참이면 true, 아니면 false)
		// |	논리합(OR)	두 항 중 하나라도 참이면 true, 아니면 false
		// ^	배타적논리합(XOR)	두 항이 다르면 true, 같으면 false
		// ~	부정(not)	참을 거짓으로, 거짓을 참으로 연산
		//EX)   1를 0으로 0을 1로 연산
		
		int a = 10; //1010
		int b = 7; //0111
		int c = a & b; //논리곱(and) - "2진수"로바꿨을 때 두값이모두1 일때만결과가1. 나머지는0
		System.out.println(c);
		
		c = a | b;
		System.out.println(c); // 2의3승 + 2의2승 + 2의1승 + 2의0승 더하면 15
		
		c = a ^ b;
		System.out.println(c);
		
		//~ (not연산)
		//2진수로는 음수를 표현할 수 없다.
		//비트의 맨 앞자리는 수의 표현이 아닌 부호의 표현으로 쓰기로 약속을 했다.
		//0이면 양수, 1이면 음수이다.
		
		int x = 7;//0111
		//-(x+1) 계산방법
		System.out.println("~x : " + ~x); //-8
		
	}
}
