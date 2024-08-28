package ex01_generic;

public class DataListExample {
	public static void main(String[] args) {
		//DataList객체 생성하기 변수명은 list
		
		//제네릭타입은 기본자료형을 인식하지 않는다.
		//따라서 int,double등의 기본자료형을 제네릭타입으로 이용하려면
		//Integer,Double등의 Wrapper클래스를 이용해야 한다.
		DataList<Integer> list = new DataList<Integer>();
		
		//정수입력
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		//문자열저장
		//list.add("문자열");
		
		//실수저장
		//list.add(13.45);
		
		//문자형저장
		//list.add('B');
		
		//데이터 출력
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("총합 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
