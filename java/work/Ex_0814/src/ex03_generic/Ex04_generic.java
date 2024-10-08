package ex03_generic;

import java.util.ArrayList;
import java.util.LinkedList;

/*중첩타입 파라미터
 * 제네릭 객체를 제네릭 타입 파라미터로 받는 형식으로 표현할 수 있다.
 * ArrayList자체도 하나의 타입으로서
 * 제네릭 타입 파라미터가 될 수 있기 때문에
 * 중첩 형식으로 사용할 수 있다.*/
public class Ex04_generic {
	public static void main(String[] args) {
		
		//문자열 데이터를 저장하는 
		//LinkedList 객체를 저장할 수 있는 ArrayList
		ArrayList<LinkedList<String>> list = new ArrayList<>();
		
		//LinkedList 객체 생성
		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("aa");
		link1.add("bb");
		LinkedList<String> link2 = new LinkedList<String>();
		link2.add("11");
		link2.add("22");
		
		//ArrayList에 ArrayList 객체 추가
		list.add(link1);
		list.add(link2);
		System.out.println(list);
	}
}
