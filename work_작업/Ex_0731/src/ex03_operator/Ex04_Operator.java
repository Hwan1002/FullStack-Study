package ex03_operator;

public class Ex04_Operator {

	public static void main(String[] args) {
		//대입연산자
		//우변의 값을 좌변에 대입을 한다
		int n1 = 10;
		int n2 = 7;
		System.out.println("=연산자: n1 = " + n1 + ", n2 = " + n2);
		
		//복합대입연산자
		//산술연산자와 대입연산자가 합쳐진 형태, +=,-=,*=,/=,%=
		
		int x = 10;
		int y = 3;
		y += x; // y = y + x; -> y = 3 + 10;
		System.out.println(y); //13
		y *= x; // y = y * x -> y = 11 * 10;
		System.out.println(y); //130
		
		//관계(비교)연산자
		//변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자.
		//비교연산 후 연산 결과는 논리형으로 반환된다.
		//(반환을 받는다는건 연산식 자체가 반환값 데이터로 바뀌게 된다)
		
		int a = 10;
		int b = 20;
		boolean result = a > b;
		System.out.println(result);
		result = a <= b ;
		System.out.println(result);
		result = a == b ;
		System.out.println(result);
		result = a != b ;
		System.out.println(result);
		
		
		System.out.println(a > b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
	}

}
