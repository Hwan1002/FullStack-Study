package ex01_buffered;
/*OutputStreamWriter
 *  OutputStreamWriter는 바이트 기반 스트림 OutputStream을
 *  문자 기반의 스트림 Writer로 변환하는 보조스트림이다.*/
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Ex05_OutputStreamWriter {
	public static void main(String[] args) {
		FileOutputStream out = null;
		OutputStreamWriter os = null;
		
		try {
			out = new FileOutputStream("D:\\web0900_jhs\\1.java\\작업메모/out예제.txt");
			os = new OutputStreamWriter(out,"UTF-8");
			System.out.println("파일 생성 시작");
			String[] strArray = {"OutputStreamWriter에 대해 배웁니다.", "we are learning about OutputStreamWriter"};
			
			for(String str : strArray) {
				os.write(str+"\n");
			}
			System.out.println("파일 생성 완료");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(os != null)os.close();
				if(out != null)out.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
