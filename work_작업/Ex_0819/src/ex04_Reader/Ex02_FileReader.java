package ex04_Reader;
import java.io.FileReader;
public class Ex02_FileReader {

	public static void main(String[] args) {
		//특정경로에 reader.txt파일을 만들고 아무 내용이나 적는다.
		//reader.txt파일을 읽어서
		//알파벳 대문자와 소문자의 개수를 출력하세요.
		//대문자 : x개 , 소문자 : x개
		
		FileReader fr = null;
		try {
			fr = new FileReader("D:\\web0900_jhs\\1.java\\작업메모/reader.txt");
			int code = 0;
			int upper = 0;
			int lower = 0;
			 while((code = fr.read()) != -1) {
				 System.out.println(code);
				 if((char)code >= 65 && (char)code <= 90){
					 upper++;
				 }else if((char)code >= 97 && (char)code <= 122){
					 lower++;
				 }
				 System.out.println((char)code);
//				 if(Character.isUpperCase((char)code)) {
//					 upper++;
//				 }else if(Character.isLowerCase((char)code)){
//					 lower++;
//				 }
			 }
			 System.out.print("대문자 : " + upper + "개\n" + "소문자 : " + lower + "개");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
