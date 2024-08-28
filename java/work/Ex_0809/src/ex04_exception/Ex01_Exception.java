package ex04_exception;

public class Ex01_Exception {
	public static void main(String[] args) {
		//NullPointerException
		
		//배열 변수만 만들고 생성하지 않음
		String[] strArray = null;
		
		//생성하지 않은 배열을 호출하려고 하니 에러발생
		//NullPointerException 에러 메모리에 저장이안된 에러
		System.out.println("strArray[0]" + strArray[0]);
		
	}
}
