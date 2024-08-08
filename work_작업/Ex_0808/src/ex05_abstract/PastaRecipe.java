package ex05_abstract;

public class PastaRecipe extends Recipe{
	public PastaRecipe (String chef) {
		super(chef);
	}

	void makeSource() {
		System.out.println("파스타 소스를 직접 만듭니다.");
	}
}
