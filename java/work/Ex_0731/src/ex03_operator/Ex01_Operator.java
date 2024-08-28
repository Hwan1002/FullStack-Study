package ex03_operator;

public class Ex01_Operator {
	public static void main(String[] args) {
		//증감 연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자.
		//1을 증가시키는 연산자로 피연산자의 값을 1 증가시키는,
		//피연산자+1과 같은 연산이다.
		//1을 감소시키는 연산자로, 피연산자-1과 같은 연산이다.
		//++,--
		
		//선행증감
		int a = 10;
		System.out.println("a : " + ++a); //결과 11
		
		
		//후행증감
		//코드가 먼저 실행되고 1이 증감
		//다음에 다시 사용될 때 증감값을 반영한다.
		int b = 10; 
		System.out.println("b : " + b++); //결과 10
		System.out.println("b++ : " + ++b); //결과 11
		
		char alphabetA = 'A';
		System.out.println(alphabetA++); //아스키코드 65에서 증가 
		System.out.println(alphabetA);//아스키 66인 B가 나옴
		
		//오버플로우
		byte value = 127;
		value++;
		//언더플로우
		byte value1 = -128;
		value--;
		//정수 타입 연산에서 오버플로우 또는 언더플로우가 발생하면
		//실행에러가 발생할 것 같지만 해당 정수 타입의 최소값 또는
		//최대값으로 되돌아간다.
		System.out.println(value);
		System.out.println(value1);
		
		int x = 5;
		int y = x++;//5를 y에 대입을하고 +1일 시킴
		System.out.println(x);//6
		System.out.println(y);//5
		
		x=10;
		y=20;
		int z = (++x) + (y--); 
		System.out.println(z);
		System.out.println("y의 값 : " + y);
		
		//----------------------------------------
		//논리부정연산자
		//boolean값을 가지는 피연산자 앞에 !를 붙여서
		//값을 반대로 바꾸는 역할을 한다.
		//true를 false로, false를 true로 바꿔준다.
		
		boolean isHuman = false;
		System.out.println(isHuman);//false
		System.out.println(!isHuman);//true
		
		//주의할 점은 논리 부정 연산자를 사용하더라도 그 사용한 곳에서만 적용될 뿐
		//원래 변수에 들어있는 값은 바뀌지 않는다.
	}
}
