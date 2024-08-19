package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*FileInputStream
 * 파일을 바이트 단위로 자료를 읽어들일 때 사용하는 스트림이다.
 * 이미지,동영상,텍스트 등 모든 타입의 파일을 읽어올 수 있다.*/
public class Ex01_FileInputStream {

	public static void main(String[] args) {
		String path = "D:\\web0900_jhs\\1.java\\작업메모/test.txt";
		File f = new File(path);
		//밖에서 생성해서 어느곳에서도 쓸 수 있게
		FileInputStream fis = null;
		//경로가 이상이 없는지, 존재하는지
		//검증을 하고 이상이 없으면 읽어와라
		if(f.exists()) {
			try {
				//파일 객체 생성한것을 넣어줘야함
				fis = new FileInputStream(f);
				//한바이트 씩 읽어와서 담아줄 변수
				int code = 0;
				
				//read()메서드가 글자를 읽어오는 작업을 한다.
				//read()메서드는 텍스트를 읽어올때 1byte씩 밖에 읽어올 수 없기 때문에
				//한글 데이터를 읽는게 불가능하다.(한글은 2~3byte이기 때문에)
				while((code = fis.read()) != -1) {
					//더이상 읽어올 단어가 없으면 문장의 끝(End Of File)인 -1을 반환한다.
					//아스키코드, 유니코드 어느곳에서도 -1의 의미를 가진곳이 없기때문이다.
					//이것을 int 자료형에 담아 char로 형변환하여 출력하면
					//아스키 코드값으로 변경되어 출력되기 때문.
					System.out.print((char)code);
				}
				//스트림은 사용이 완료된 이후 close를 통해 닫아주는 것이 좋다.
				//그래야 다음 작업을 하는데 문제가 생기지 않는다. 
				//close를 작성하지 않았을 때 아직도 할 작업이 남았으니까
				//화면에 띄우거나 파일을 만들면 안되겠구나 착각하는 경우가 있기 때문이다.
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					//잘 읽어오던, 읽지못하던 무조건 닫아야해서 finally로 선언
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
