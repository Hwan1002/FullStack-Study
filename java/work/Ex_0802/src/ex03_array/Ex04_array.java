package ex03_array;
import java.util.Random;
import java.util.Scanner;
public class Ex04_array {

	public static void main(String[] args) {
		
		//10개의 정수를 담을수있는 배열의 생성
		//배열의 이름은 numbers
		int[] numbers = new int[10];
		//배열에 random 클래스를 이용하여 1~30 사이의 난수 넣기
		//nextInt(30)+1;
		Random rnd = new Random();
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rnd.nextInt(30)+1;
		}
				
		//배열의 모든 요소 출력하기(가로)
		for(int i=0; i<numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		//배열의 안에서 짝수의 합 구하기
		int sum = 0;
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]%2==0) {
				sum += numbers[i];
			}
		}
		System.out.println(sum);
		
		
		//배열에서 영문자만 추출하여 이어붙혀 출력하기
		char[] cards = {'1','L','2','O','2','V','E','3'};
		String myWord = "";
		
		for(int i=0; i<cards.length; i++) {
			if(cards[i] >='A'&& cards[i] <='Z') {
				myWord += cards[i];
			}else if(cards[i] >='a'&& cards[i] <='z') { //아스키코드를 이용해서 크기 비교
				myWord += cards[i];
			}
		}
		
//		for(int i=0; i<cards.length; i++) {
//			if(cards[i] != '1' && cards[i] != '2' && cards[i] != '3') {
//				myWord += cards[i];
//			}
//		}
		System.out.println(myWord);
		
		//배열 arr에 담겨있는 모든 값의 합을 구하세요
		int [] arr = {10,20,30,40,50};
		int sum1 = 0;
		for(int i=0; i<arr.length; i++) {
				sum1 += arr[i];
		}
		System.out.println(sum1);
		
		//키보드에서 배열의 길이를 입력받는다
		//입력받은 길이만큼 알파벳을넣고 출력한다.
		//ex 배열의 길이를 입력하세요 : 5
		//ABCDE
		System.out.print("배열의 길이를 입력 하세요 : ");
		Scanner scan = new Scanner(System.in);
		int arrlen = scan.nextInt();
		
		char[] alpha = new char[arrlen];
		
		for(int i=0; i<arrlen; i++) {
			alpha[i] += 'a'+i;
		}
		System.out.println(alpha);
		
		
		//동전 개수 구하기
		//10~5000 사이의 난수를 변수에 담는다.
		//1의 자리는 반드시 0이 되어야 합니다.
		//발생된 난수를 각 동전으로 바꾸면 몇개씩 필요한지 판단하는 코드 작성하기
		//가능한 적은 수의 동전을 사용하도록 한다.
		//4170
		//500원 : 8개
		//100원 : 1개
		//50원  : 1개
		//10원  : 2개
		int [] coin = {500,100,50,10};
		int number = (rnd.nextInt(500)+1)*10;
		System.out.println(number + "원");
		for(int i=0; i<coin.length; i++){
			int result = number / coin[i];
			number %= coin[i]; //나머지
			System.out.println(coin[i]+"원 : " + result + "개");
		}
		
		
		//로또 번호 생성하기
		//1~45사이의 난수를 발생시켜 로또번호를 배열에 저장하고 출력하기
		//난수 중복되는것을 막아야함
		int[] lotto = new int[6];
		outer:for(int i=0; i<lotto.length;) {
			lotto[i] = rnd.nextInt(45)+1; //배열 인덱스에 바로 랜덤 번호를 뿌리기
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					continue outer;
				}
			}//inner for문
			System.out.print(lotto[i] + " "); 
			i++;
		}
	}
}
	
		
		
		
	


