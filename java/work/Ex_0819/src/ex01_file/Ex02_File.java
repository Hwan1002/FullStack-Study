package ex01_file;

import java.io.File;
import java.util.Arrays;

public class Ex02_File {
	public static void main(String[] args) {
		String path = "D:\\web0900_jhs\\1.java\\작업메모";
		
		File f = new File(path);
		//파일클래스의 두번째 기능
		//폴더인지 파악하는 기능 -> isDirectory()
		//폴더 == 디렉토리
		//폴더의 하위 목록의 이름을 가져올 수 있다. -> list()
		
		//경로의 최종 목적지가 폴더면 true
		if(f.isDirectory()) {
			//f경로의 하위요소(파일)들을 문자열 배열로 반환
			//list() -> 최종목적지 아래의 목록을 String 배열로 반환
			String[] names = f.list();
			
			for(String s : names) {
				System.out.println(s);
			}
		}
		
		
	}
}
