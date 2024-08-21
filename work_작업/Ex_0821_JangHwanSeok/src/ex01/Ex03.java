package ex01;
//동전의 개수 구하기
import java.util.Random;
public class Ex03 {
	public static void main(String[] args) {
		Random rnd = new Random();
		int money = (rnd.nextInt(500)+1)*10;
		int[] change = {500,100,50,10};
		System.out.println("총 "+money+"원");
		for(int i=0; i<change.length;i++) {
			int result = money/change[i];
		    System.out.println(change[i] + "원 : " + result + "개");
		    money %= change[i];
		}
		
	}
}
