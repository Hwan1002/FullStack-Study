package ex05_abstract;

public class RecipeMain {

	public static void main(String[] args) {
		//추상 클래스는 직접 객체를 생성할 수 없다.
		//Recipe r = new Recipe();
		
		PastaRecipe pr = new PastaRecipe("최연석");
		pr.info();//자식 객체를 통해 추상클래스의 매서드를 호출할 수 있다.
		pr.makeSource();
		
		StakeRecipe sr = new StakeRecipe("이연복");
		sr.info();
		sr.grillStake();
	}
	
}
