package ex02_Enum;

/*Operation 이라는 Enum을 만들고 PLUS,MINUS,MULTI,DIVIDE 상수객체를 갖는다.
각각의 상수 객체는 산술 연산자를 문자열 형태로 갖고
//다음의 추상 메서드를 갖는다
public abstract double apply(double x, double y);

추상메서드를 구현하여 두수의 연산을 한 값을 반환하도록 한다.

main에서 호출하여 연산결과를 출력하세요.
//double x = 2.5;
//double y = 5.0;
결과 2.5 + 5.0 = 7.5;*/
public enum Operation {
	
	//public static final Opertaion PLUS  = new Operation();
	//과같다
	PLUS("+") {
		//아래의 추상 메서드 public abstract double apply(double x, double y);
		//가 정의되면 상수객체에서 반드시 재정의 해야한다.
		@Override
		public double apply(double x, double y) {
			return x+y;
		}
	},
	MINUS("-") {
		@Override
		public double apply(double x, double y) {
			return x-y;
		}
	},
	MULTI("*") {
		@Override
		public double apply(double x, double y) {
			return x*y;
		}
	},
	DIVIDE("/") {
		@Override
		public double apply(double x, double y) {
			return x/y;
		}
	};
	
	private String s;
	//PLUS,MINUS,MULTI,DIVIDE 옆 문자열이 밑으로 들어와서 s에 값을 넣음
	Operation(String string) {
		this.s= string; 
	}
	
	//산술연산자를 받아오기 위한 메서드 string으로 받아 와야하니까 반환형을 맞춰서 작성
		//private으로 설정된 필드의 값을 외부에서 보기 위해 메서드를 사용한다.
		//바로 getter를 사용 
	public String getS() {
		return s;
	}
		
	public abstract double apply(double x, double y);
	
	
	
	
	
	
}
