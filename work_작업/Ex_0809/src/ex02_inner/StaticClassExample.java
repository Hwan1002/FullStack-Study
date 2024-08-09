package ex02_inner;

class PrintOut{
	public static class Out{
		public void println(String a) {
			System.out.println(a);
		}
	}
}


public class StaticClassExample {
	public static void main(String[] args) {
		String str =  "정적 내부 클래스 테스트";
		PrintOut.Out out = new PrintOut.Out();
		out.println(str);
	}
}
