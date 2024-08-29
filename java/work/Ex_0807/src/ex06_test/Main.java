package ex06_test;

class Parent{
	int x = 100;
	
	Parent(){
		this(500);
	}
	Parent(int x){
		this.x = x;
	}
	int getX() {
		return x;
	}
}


class Child extends Parent{
	int x = 4000;
	
	Child(){
		//super()가 숨어있음
		this(5000);
	}
	Child(int x){
		this.x = x;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		Child obj = new Child(250);
		System.out.println(obj.getX()); //답:500
		System.out.println(obj.x);
	}

	
	
}