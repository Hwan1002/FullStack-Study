package ex01_buffered;
/*문자변환보조스트림
- 바이트 기반 스트림으로 텍스트 파일을 읽거나 쓸 경우, 한글을 포함한 비영어권 문자들이
  정상적으로 출력이 되지 않는 모습을 보았다.
- 소스 스트림이 바이트 기반이고, 입출력 데이터 문자라면 Reader로 변환하여 사용하는것을
  고려해봐야한다.

 InputStreamReader
- 바이트 기반 스트림 InputStream을 문자 기반의 스트림 Reader로 변환하는 보조 스트림이다.*/
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Ex04_InputStreamReader {

	public static void main(String[] args) {
		FileInputStream in = null;
		InputStreamReader is = null;
		
		try {
			in = new FileInputStream("D:\\web0900_jhs\\1.java\\작업메모/test.txt");
			is = new InputStreamReader(in,"UTF-8");
			int read = 0;
			
			while((read = is.read()) != -1) {
				System.out.print((char)read);
			}
			//finally에 close하는것이 안전하다
			//예외가 발생했을 때 catch로 가기 때문에 close가 안된다.
			//is.close();
			//in.close();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(is != null) is.close();
				if(in != null) is.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
