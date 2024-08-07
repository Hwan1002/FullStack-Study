package Ex03_method;

import java.util.Scanner;

public class StartMain {
	public static void main(String[] args) {
		Start st = new Start();
		Scanner scan = new Scanner(System.in);
	   
		//정답을 맞출때까지 반복
		//for, while
		//몇번만에 맞출지 모르니 while사용 권장
		
	    while(true) {
			System.out.print("1 ~ 50사이의 번호를 입력하여 맞춰보세요");
			int num = scan.nextInt();
			
			if(st.check(num).equals("정답!")) {
				System.out.printf("%d번 만에 정답입니다.", st.count);
				break;
			}else {
				System.out.println(st.check(num));
				st.count++;
			}
	    }
	}
}
