package ex01_interface;
//2차원 상의 한점을 표현하는 Point클래스
public  class Point {
	private int x,y;
	String s;
	public Point(int x, int y) {
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	protected void move(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
