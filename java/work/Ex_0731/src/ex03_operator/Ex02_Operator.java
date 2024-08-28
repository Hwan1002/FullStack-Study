package ex03_operator;

public class Ex02_Operator {
	public static void main(String[] args) {
		//단항연산자
		//피연산자가 한 개인 연산자를 말하며,
		//부호연산자(+,-), 중감연산자(++,--), 논리부정연산자(!)가 있다.
		
		int x = 100;
		int resultPlus = +x;//+부호 (더하기 의미가 아님)
		int resultMinus = -x; //-부호 (빼기 의미가 아님)
		
		System.out.println(resultPlus);
		System.out.println(resultMinus);
		
		double d = 1.11; //기본값이 +이기 때문에 생략 가능하다.
		double result = -d;
		
		System.out.println(-d);
		System.out.println(result);
		
	}
}
