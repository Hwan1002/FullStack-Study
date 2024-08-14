package ex02_Map;
/*Map
 * List,Set 과 달리 Map인터페이스가 별도로 존재하며
 * 데이터를 List계열 컬렉션과 다르게 처리한다.
 * 데이터를 Key와 Value로 구분하여 저장하는
 * key-value 방식을 사용한다.
 * index는 없지만 key를 통해서 값을 검색하기 때문에
 * 많은 양의 데이터를 조회하는데에 있어서
 * 매우 뛰어난 성능을 발휘한다.
 * */

import java.util.HashMap;
import java.util.Map;

/*HashMap
 * map을 구현하고 있는 자식 클래스에서
 * 가장 많이 사용하는 구현체이다
 * 
 * */
public class Ex01_Map {
	public static void main(String[] args) {
		Map<Integer, Character> map = new HashMap<Integer, Character>();
		
		//map에 데이터 추가하기
		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'D');
		System.out.println(map);
		
		//map에서 value는 중복이 될 수 있다.
		map.put(5, 'A');
		System.out.println(map);
		
		//map에서 key는 중복이 될 수 없다.(에러는 나지 않음)
		map.put(1, 'F');//기존에 같은 이름을 가진 key가 있다면 value를 갱신한다.
		System.out.println(map);
		
		//map에서 요소의 삭제는 key값을 통해서 한다.
		System.out.println("삭제한 값 : " + map.remove(3));
		
		//map의 크기
		System.out.println("맵의 크기 : " + map.size());
		
		//map에서 특정 value 꺼내오기
		//value를 꺼내올때도 key를 사용한다.
		char res = map.get(4);
		System.out.println(res);
	}
}
