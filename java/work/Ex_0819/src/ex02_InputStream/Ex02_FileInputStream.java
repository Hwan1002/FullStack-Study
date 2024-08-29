package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInputStream {
	public static void main(String[] args) {
		String path = "D:\\web0900_jhs\\1.java\\작업메모/test.txt";
		File f = new File(path);
		System.out.println(f.length());
		//파일의 크기만큼만 배열의 크기를 만들고싶다.
		//f.length(); length는 반환형이 long이기 때문에 배열에 들어갈 수 있는 int로 형변환해야한다
		byte[] read = new byte[(int) f.length()];
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				
				fis = new FileInputStream(f);
				//내용을 읽어와서 바이트배열 read에 저장
				fis.read(read);
				
				//현재 바이트배열 read에는 test.txt에서 읽어온 데이터들이 저장되어있다.
				//이를 문자열 형태로 재조립하여 출력할 수 있다.
				String res = new String(read);
				System.out.println(res);
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
			}finally {
				try {
					//잘 읽어오던, 읽지못하던 무조건 닫아야해서 finally로 선언
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//finally
		}
	}
}
