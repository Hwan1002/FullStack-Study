package ex01_file;
/*<파일 입출력>
- 프로그램은 데이터를 외부에서 입력받아 처리하고 출력하는 구조로 되어있다.
- 프로그램으로 들어오는 모든 값을 input이라고 한다.
- 프로그램을 나가는 모든 값을 Output이라고 한다.
- 자바에서는 입출력을 처리하기 위해 별도의 I/O(input,output)라는 패키지를 제공  한다
- 데이터는 자바에서 처리할 수 있는 모든것을 의미한다.
- 디스크상에 존재하는 데이터일수도 있고, 키보드나 마우스와 같은 
  외부 입력장치에서 입력되는 데이터일수 도 있고, 인터넷을 통해 전송되는 
  데이터일수도 있다.
- 자바가 디스크에 접근해 데이터를 주고받는 작업을 도와주는 통로를 '스트림' 이라고 한다.

<File 클래스>
- 파일 또는 폴더에 대한 정보를 제공하는 클래스
- 경로명, 파일 크기, 타입, 날짜 등의 속성 정보를 제공한다.
- 파일 생성, 삭제, 이름변경 등 파일 관리 작업을 지원하기 위한 메서드로 구성되어있다*/
import java.io.File;

public class Ex01_File {
	public static void main(String[] args) {
		//외부에서 읽어올 파일의 경로
		String path = "D:\\web0900_jhs\\1.java\\작업메모/test.txt";
		
		File f = new File(path);
		//isFile() -> 파일클래스가 접근한 최종목적지가 파일 형태일 경우 true
		if(f.isFile()) {
			//f.length() -> 목적지의 크기
			System.out.println(f.length() + "byte");
			/*File 클래스의 첫번째 기능
			 * 용량을 알 수 있다.*/
		}
		
		
	}
}
