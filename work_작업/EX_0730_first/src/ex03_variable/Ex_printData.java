package ex03_variable;

public class Ex_printData {

	public static void main(String[] args) {
		//정수형 데이터 : 소수점이 없는 숫자 1, 24, 100, -50, -189 ...
		//실수형 데이터 : 소수점이 있는 숫자 1.23, 3.14 ...
		//문자형 데이터 : 홑따옴표('')로 감싼 한글자 'a', 'f', 'e', 'u'...
		//문자열 데이터 : 쌍따옴표("")로 감싼 글자 "안녕하세요"...
		System.out.println(100);
		System.out.println(100+50);
		//문자열 앞뒤에 오는 더하기는 "연결"의 의미를 가지고 있다.
		System.out.println("안녕하세요" + 50);
		System.out.println(5 + 10 + ":" + 5+10 );//15:510 앞은 숫자로 인식하나 뒤에 문자열이 들어가있으면서 나오는 숫자들을 문자로 인식한다.
		//괄호로 우선순위를 정하면 숫자로 인식하여 덧셈을 진행한다.
		System.out.println("2 + 2 = " + 2 + 2);
		System.out.println("2 + 2 = " + (2 + 2));
		
		
		//변수
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
	}

}
