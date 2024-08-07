package Ex03_method;

public class Person {
	//이름과 나이를 전달받아 출력하는 Introduce 메서드 생성하기
	//결과
	//제 이름은 []이고, 나이는 []세 입니다.
	//PersonMain에서 메서드 호출하기
	void Introduce(String name, int age) {
		System.out.printf("제 이름은 %s이고 나이는 %d세 입니다" ,name, age );
	}
}
