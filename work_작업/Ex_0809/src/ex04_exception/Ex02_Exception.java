package ex04_exception;

public class Ex02_Exception {
	public static void main(String[] args) {
		//NumberForamtException
		//잘못된 문자열을 숫자로 형 변환할 때 발생한다.
		//숫자 형태("111")의 문자열은 정수 타입으로 변환할 수 있으나
		//문자가 포함되거나 실수 형태 ("11.11")의 문자열은 변환할 수 없다.
		
		String str01 = "11";
		String str02 = "11.2";
		
		//정수 형태의 문자열을 정수로 변환
		//Integer.parseInt("정수형태의 문자열");
		int num01 = Integer.parseInt(str01);
		
		System.out.println("String to int" + num01);
		
		int num02 = Integer.parseInt(str02);//실수여서 NumberFormatException 에러발생
	}
}
