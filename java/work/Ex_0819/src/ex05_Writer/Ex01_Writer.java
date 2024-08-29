package ex05_Writer;

import java.io.FileWriter;

public class Ex01_Writer {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\web0900_jhs\\1.java\\작업메모/fileWriter_예제.txt", true);
			fw.write("첫번재 줄 작성");
			fw.write("\n");
			fw.write("두번재 줄 작성");
			fw.write("\n");
			System.out.println("작성완료");
			fw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
