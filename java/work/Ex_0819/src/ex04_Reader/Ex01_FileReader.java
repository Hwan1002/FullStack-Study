package ex04_Reader;

import java.io.FileReader;

/*
문자 기반 스트림
자바에서는 기본 자료형은 char형을 통해 문자를 저장할 수 있다.
1byte 단위로 처리하는 바이트 기반 스트림은 모든 파일을 다룰 수 있으나 문자를 처리하는 char형의 크기는 2byte로 별도의 처리를 하지 않으면 정상적으로 읽지 못하는 경우가 있다.
택스트의 경우 문자기반의 스트림을 이용하여 읽는 경우가 많다.
이때, 문자 기반의 스트림을 사용하면 간단하게 문자를 처리할 수 있다.*/

/*Reader : 문자 입력 스트림
문자 기반 입력 스트림은 최상위 클래스인 Reader를 상속해 다양한 클래스를 제공한다.

<문자기반 스트림에서 제공하는 메서드>
int read() -> 1개의 문자를 읽고 반환
더 이상 읽을 문자가 없으면 -1를 반환
int read(char[] buf) -> 매개변수로 주어진 배열에 읽은 문자를 저장하고 읽은 수만큼 반환
더 이상 읽을 문자가 없으면 -1를 반환
int read(char[] cbuf,int offset,int len) -> 매개변수로 주어진 배열에 정해진 범위만큼 읽어서 저장 시작위치(offset),길이(len)
close() -> 스트림 사용을 종료하고 자원을 반환
*/
public class Ex01_FileReader {
	public static void main(String[] args) {
		FileReader fr = null;
		//이미지, 음악, 동영상 전송할 때는 바이트 기반의 스트림을 이용하는것이 좋다.
		//텍스트,문자열일 경우에만 reader를 사용하는것이 좋다.
		try {
			 fr = new FileReader("D:\\web0900_jhs\\1.java\\작업메모/test.txt");
			 int code = 0;
			 
			 while((code = fr.read()) != -1) {
				 System.out.print((char)code);
			 }
			 
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
