package ex01_interface;

public class MicMain {
	public static void main(String[] args) {
		System.out.println("----TjMic 객체");
		Tjmic tj = new Tjmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		//인터페이스들도 타입변환이 가능하다
		System.out.println("----TjMic 객체를 BluetoothMic 타입으로  변환");
		BluetoothMic bm = tj; 
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("----TjMic 객체를 MicroPhone 타입으로 변환");
		MicroPhone m = tj;
		m.sing();
		//connect, music은 안됌
		
		System.out.println("-----Tjmic 객체를 Speaker 타입으로 변환");
		Speaker s = tj;
		s.music();
		//connect, sing은 안됌
		
	}
}
