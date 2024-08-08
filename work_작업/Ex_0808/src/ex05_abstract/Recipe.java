package ex05_abstract;
//추상클래스 
public abstract class Recipe {
	//필드
	String chef;
	
	public Recipe(String chef) {
		this.chef=chef;
	}
	
	void info() {
		System.out.println("이 레시피는 " + chef + "님의 레시피입니다.");
	}
}
