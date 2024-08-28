package Ex03_method;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		//메서드에 매개변수(파라미터가) 선언되어 있다면
		//호출할때 값을 전달하지 않으면 에러
		book.count(5);
	}

}
