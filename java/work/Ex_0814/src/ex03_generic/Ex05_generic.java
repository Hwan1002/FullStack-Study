package ex03_generic;
/*제네릭 인터페이스
 * 인터페이스를 구현(implements)한 클래스에서도
 * 오버라이딩한 메서드를 제네릭 타입에 맞춰서
 * 똑같이 구현해야 한다.*/

interface ISample<T>{
	//자료구조에 데이터를 추가하는 메서드
	public void addElement(T t, int index);
	
	//index에 따라 Value를 반환하는 메서드
	public T getElement(int index);
}

//인터페이스를 구현한 클래스에도 타입 파라미터를 추가해야한다
class Sample<T> implements ISample<T>{
	private T[] array;
	public Sample() {
		array = (T[])new Object[10];
	}
	@Override
	public void addElement(T element, int index) {
		array[index] = element;
	}
	@Override
	public T getElement(int index) {
		return array[index];
	}
	
	
}

public class Ex05_generic {
	public static void main(String[] args) {
		Sample<String> sample = new Sample<>();
		sample.addElement("This is String", 5);
		System.out.println(sample.getElement(5));
	}
}
