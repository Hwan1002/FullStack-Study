package ex03_OutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_CopyTest {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("D:\\web0900_jhs\\1.java\\작업메모/Switzerland.jpg");
			out = new FileOutputStream("D:\\web0900_jhs\\1.java\\작업메모/Switzerland_copy.jpg");
			//바이트배열을 넣으면 읽는 속도가 훨씬 빨라진다
			//읽자마자 쓰는것보다 중간에 버퍼라는 공간을 두는것이 속도가 훨씬 빠르다.
			byte[] buffer = new byte[512];
			long start = System.currentTimeMillis();
			System.out.println("이미지 읽기 시작");
			
			int read = 0;
			System.out.println(in.read(buffer));
			while((read = in.read(buffer)) != -1) {
				//byte배열의 0부터 끝까지
				out.write(buffer,0,read);
			}
			System.out.println("이미지 읽기 종료");
			long end = System.currentTimeMillis();
			double time = (double)(end-start)/1000;
			System.out.println(time+"초");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				//아웃을 먼저 닫는 이유는 인을 먼저닫으면 쓰다가 닫힐 수 있기때문에 역순으로 닫아야한다.
				if(out != null) {
					out.close();
				}
				if(in != null){
					in.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
