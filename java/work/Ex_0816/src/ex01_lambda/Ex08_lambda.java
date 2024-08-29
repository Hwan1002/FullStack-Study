package ex01_lambda;

@FunctionalInterface
interface IAdd{
	int add(int x, int y);
}

class MathUtils{
	public static int AddElement(int x, int y) {
		return x + y;
	}
}
public class Ex08_lambda {
	public static void main(String[] args) {
		//IAdd addlamda = (x,y) -> MathUtils.AddElement(x, y);
		//참조식을 사용하면 람다식을 극단적으로 짧게 줄일 수 있다.
		IAdd addlamda = MathUtils::AddElement;
		System.out.println(addlamda.add(10,20));
	}
}
