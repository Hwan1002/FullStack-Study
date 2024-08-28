package Ex03_method;
import java.util.Random;
public class Start{
		Random rnd = new Random();
		//1~50사이의 난수 생성
		int rnum = rnd.nextInt(50)+1;
		int count = 1;
		//1적게 나오니 반드시 +1
	public String check(int number) {
		
		if(number == rnum) {
			return "정답!";
		}else if(number > rnum) {
			return "DOWN!";
		}else {
			return "UP!";
		}
		
	}
	
		
}
	
