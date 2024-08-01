package ex03_variable;

public class Ex_Variable02 {
	public static void main(String[] args) {
		//논리형
		//헝가리안 표기법 
		//변수 명앞에 데이터 타입을 붙히는 방법
		boolean b = true;
		System.out.println("b의 값 : "+ b);
		
		b = false;
		System.out.println("b의 값 : "+ b);
		
		//b = 1; 자료형의 값이 올바르지 않아 오류가 발생
		
		
		//문자형
		char ch = 'A';
		System.out.println("ch 의 값 : " + ch);
		
		ch = 66; //숫자인데도 에러가 안남 대신 답이 B가 나옴 (66이 아스키 코드로 변환되어 B라는 값이 나옴) 65 -> A | 97 -> a
		System.out.println("ch 의 값 : " + ch);
		
		
		//---------------------------------------------------
		
		//정수형
		//byte b1 = 128; byte 자료형의 표현범위를 벗어나서 오류 발생
		
		byte b1 = 127;
		short s  = 32767;
		int n = 550;
		
		System.out.println("b1의 값 : " + b1);
		System.out.println("s의 값 : " + s);
		System.out.println("n의 값 : " + n);
		
		//---------------------------------------------------
		
		//실수형
		//자바에서 실수는 기본적으로 double형으로 인식하기 때문에 
		//float 자료형을 사용한다는 것을 명시해줘야 한다.
		float  f = 3.14f;
		
		//내가 만드려는 변수의 타입이 어차피 같다면
		//한번에 여러개를 선언하는것도 가능
		//초기화도 됌
		float f1=3.14f,f2 = 4.15f;
		
		//변수를 이용해 다른 변수에 값 복사하기
		int myAge = 20;
		int yourAge = myAge;
		System.out.println("나의 나이 : " + myAge);
		System.out.println("친구 나이 : " + yourAge);
		
		//---------------------------------------------------
		
		//두 변수에 들어있는 값을 바꾸려면 어떻게 해야할까
		int su1 = 20, su2 = 30;
		System.out.println("변경전");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		//내용물을 임시로 담아놓을 컵이 필요하다.
		int temp = su1; //temp 에 20이 대입됌
		su1 = su2; //su1에 30이 대입됌
		su2 = temp;//su2에 20이 대입됌
		System.out.println("변경후");
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
	
	}
}
