package ex01_buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

public class Ex01_CopyImage {

	public static void main(String[] args) {
		//보조스트림을 이용해 이미지 복사
		//wall_copy3.jpg 이름으로 복사하기
		String path = "D:\\web0900_jhs\\1.java\\작업메모/wall.jpg";
		//기능들을 null로 초기화 하는 이유는 전체 영역에서 쓰기 위함
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		int read = 0;
		
		try { //읽어오는거에 버퍼 보조스트림에 삽입해서 성능향상
			  fis = new FileInputStream(path);
			  bis = new BufferedInputStream(fis);
			  
			  
			  fos = new FileOutputStream("D:\\\\web0900_jhs\\\\1.java\\\\작업메모/wall_copy3.jpg");
			  bos = new BufferedOutputStream(fos);
			  
			  while(bis.read() != -1) {
				bos.write(read);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {
					bos.close();
				}
				if(fos != null) {
					fos.close();
				}
				if(bis != null) {
					bis.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
