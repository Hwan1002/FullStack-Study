package ex01_interface;

public class ColorPoints extends Point{
	String s;
	public ColorPoints(int x, int y, String s) {
		super(x,y);
		this.s = s;
		//super x,y를 먼저하고 s초기화
	}
	public void setXY(int x, int y) {
		move(x,y);
	}
	public void setColor(String s) {
		this.s=s;
	}
	public String toString() {
		return s + "식의 (" +getX()+","+getY()+")의 점";
		//부모클래스에서 메서드들을 가져와서 사용
	}
}
