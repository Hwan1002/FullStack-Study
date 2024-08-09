package ex01_interface;

public interface BluetoothMic extends MicroPhone, Speaker{
	//인터페이스끼리의 상속은 상수나 추상메서드밖에 못들어가니깐
	public abstract void connect();
} 
