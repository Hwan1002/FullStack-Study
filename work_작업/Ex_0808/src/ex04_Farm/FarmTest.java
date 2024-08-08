package ex04_Farm;
//애니멀 클래스를 만든다
class Animal{
	//오버라이드하기 위해 만든 메서드
	public void cry() {
		
	}
}
//피그 클래스를 만들고 애니멀 클래스를 부모로 매서드를 받게한다
class Pig extends Animal{
	@Override
	public void cry() {
		System.out.println("꿀꿀");
	}
}
class Cow extends Animal{
	@Override
	public void cry() {
		System.out.println("음메");
	}
}



class Farm{
	public void sound(Animal animal) {
//		if(animal instanceof Pig) {
//			System.out.println("꿀꿀");
//		}else {
//			System.out.println("음메");
//		}
//		System.out.println("꿀꿀");
		animal.cry();
	}
//	public void sound(Cow cow) {
//		System.out.println("음메");
//	}
	
}
public class FarmTest {
	public static void main(String[] args) {
		Farm f = new Farm();
		Pig p = new Pig();
		Cow c = new Cow();
		f.sound(p);
		f.sound(c);
	}
	
}

//instanceof 와 '==' 차이
// A instanceof B : 객체 변수 A가 B타입으로 생성 된것인지 확인
// A ==B : 객체 A와 객체 B가 같은 주소를 참조하고 있는지 확인






