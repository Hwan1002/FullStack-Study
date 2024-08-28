package ex03_anonymous;

interface buttonClickListener{
	public void click();
}

public class AnonymousExample {
	public class Button{
		private buttonClickListener listener;
		
		public void setButtonListener(buttonClickListener listener) {
			this.listener = listener;
		}
		public void click() {
			if(listener != null) {
				this.listener.click();
			}
		}
	}
	public static void main(String[] args) {
		AnonymousExample exam = new AnonymousExample();
		AnonymousExample.Button button = exam.new Button();
		
		button.setButtonListener(new buttonClickListener() 
		//익명으로 인터페이스를 구현한 클래스 implements 한것과 같음
		{
			
			@Override
			public void click() {
				System.out.println("버튼을 눌렀습니다.");
				
			}
		});
		button.click();
	}
	
}
