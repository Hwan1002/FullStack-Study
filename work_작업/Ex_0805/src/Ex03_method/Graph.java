package Ex03_method;
import java.util.Random;
public class Graph {

	public static void main(String[] args) {
		
		int[] rndArray = new int[100];//난수를 담을 배열
		int[] count = new int[10]; //발생한 각 난수가 몇개씩 나왔는지 세는 배열
		
		Random rnd = new Random();
		
		for(int i=0; i<rndArray.length; i++) {
			rndArray[i] = rnd.nextInt(10);
		}
		
		PrintGraph pg = new PrintGraph();
		//100개의 난수를 각 숫자별로 몇개씩 나왔는지 count배열에 저장
		for(int i : rndArray) {
			count[i]++;
			
		}
		for(int i=0; i<count.length; i++ ) {
			System.out.println(i+"의 개수 : " + pg.print('#',count[i])+" "+ count[i]);
		}
	}

}
