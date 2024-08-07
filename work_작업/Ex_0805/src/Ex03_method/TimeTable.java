package Ex03_method;

public class TimeTable {
	//매개변수로 number를 전달 받는다.
	public void showTable(int number){
		System.out.println(number + "단");
		//구구단을 구하는코드
		for(int i=1; i<10; i++){
			System.out.printf("%d X %d = %d \n",number,i,number*i);
		}
	}
}
