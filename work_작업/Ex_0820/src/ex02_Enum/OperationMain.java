package ex02_Enum;

public class OperationMain {
	public static void main(String[] args) {
		//Operation이라는 enum의 값들을 op라는 변수 배열을 만들고 거기에 넣는다
		Operation[] op = Operation.values();
		for(Operation s : op) {
			System.out.println("결과 2.5 " +s.getS()+ " 5.0 = " + s.apply(2.5, 5.0));
		}
	}

}
