package ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex03_BufferedWriter {

	public static void main(String[] args) {
		FileReader reader = null;
		BufferedReader br = null;
		
		FileWriter writer = null;
		BufferedWriter bw = null;
		
		try {
			
			reader = new FileReader("D:\\web0900_jhs\\1.java\\작업메모/lorem_ipsum.txt");
			br = new BufferedReader(reader);
			//보조스트림 생성하기 
			writer = new FileWriter("D:\\web0900_jhs\\1.java\\작업메모/lorem_ipsumCopy.txt");
			bw = new BufferedWriter(writer);
			
			//문장을 저장할 변수
			String str = "";
			
			//메모장에 있는 내용을 읽어와서 복사하기
			//readline(), write()
			while((str = br.readLine()) != null) {
				bw.write(str);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bw != null)bw.close();
				if(writer != null)writer.close();
				if(br != null)br.close();
				if(reader != null)reader.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
