package ex03_string;

import java.util.Arrays;

/*String 클래스
 *String 클래스는 문자열을 처리하는 객체형 데이터 타입이다.
 *문자열을 처리하기 위한 다양한 기능들을 가지고 있다.
 *String 객체는 한번 생성되면 값을 변경할 수 없다.
 **/
public class Ex01_String {
	public static void main(String[] args) {
		String str = "Kim Mal ddong";
		
		//문자열의 길이
		//length()
		System.out.println("문자열 str의 길이 : " + str.length());
		
		//특정 문자의 위치
		//indexOf(char ch)
		System.out.println("문자 a의 위치 : " + str.indexOf('a'));
		
		//특정 문장의 위치
		//indexOf(String str)
		System.out.println("문장 Mal의 위치 : " + str.indexOf("Mal"));
		
		//마지막 인덱스를 반환
		//lastIndexOf(char ch)
		System.out.println("마지막 문자 d의 위치 : " + str.lastIndexOf('d'));
		
		//인덱스를 통해 문자 받아오기
		//charAt(int index)
		System.out.println("추출한 문자 : " + str.charAt(4));
		
		//특정 문자열만 잘라내기 5까지 보고싶으면 6으로 입력해야함
		//substring(int start, int end)
		System.out.println("0번부터 5번까지 잘라내기 : " + str.substring(0,6));
		
		//문자열을 특정 기준으로 잘라서 배열로 저장하기
		//split()
		System.out.println(Arrays.toString(str.split(" ")));
		
		//String replace(변경할 문자, 변경 문자)
		System.out.println(str.replace("Kim", "Jang"));
		
		//특정문자를 포함하고 있는지 판별
		//contains()
		System.out.println(str.contains("a"));
	}
}
