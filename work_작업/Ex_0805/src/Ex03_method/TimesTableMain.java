package Ex03_method;
import java.util.Scanner;
public class TimesTableMain {

	public static void main(String[] args) {
		//TimesTable 객체 생성
		Scanner sc = new Scanner(System.in);
		TimeTable tt = new TimeTable();
		System.out.println("알고싶은 구구단의 정수를 입력하세요 : ");
		int x = sc.nextInt();
		tt.showTable(x);
;	}

}
