package ex06_Buffered;
/*보조스트림
 * 혼자 읽거나 쓸수는 없지만 기반 스트림을 도와 성능을 향상시켜준다.
 * BufferedInputStream
 * BufferedOutStream
 * BufferedReader
 * BufferedWriter
 * */
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex01_BufferedInput {

	public static void main(String[] args) {
		FileInputStream in = null;
		BufferedInputStream bis = null;
		
		try {
			in = new FileInputStream("D:\\web0900_jhs\\1.java\\작업메모/reader.txt");
			//읽어오는일을 보조스트림에게 위임함
			bis = new BufferedInputStream(in);
			
			int code = 0;
			//보조스트림이 읽다가 -1이될때까지 
			while((code = bis.read()) != -1){
				System.out.println((char)code);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bis != null) {
					bis.close();
				}
				if(in != null) {
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
