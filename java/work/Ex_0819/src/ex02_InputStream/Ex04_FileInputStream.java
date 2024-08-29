package ex02_InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Ex04_FileInputStream {
	public static void main(String[] args) {
		//특정 경로에 file.txt 문서를 만들고 아무문장이나 입력해둔다.
		//file.txt의 내용을 읽어온 뒤, 회문인지 아닌지 판별해서 출력하시오
		String path = "D:\\web0900_jhs\\1.java\\작업메모/file.txt";
		File f = new File(path);
		byte[] read = new byte[(int) f.length()];
		FileInputStream fis = null;
		
		if(f.exists()) {
			try {
				fis = new FileInputStream(f);
				
				fis.read(read);
				//위에서 배열에 유니코드를 넣어줌
				//더이상 읽어올 단어가 없으면 문장의 끝(End Of File)인 -1을 반환한다.
				//아스키코드, 유니코드 어느곳에서도 -1의 의미를 가진곳이 없기때문이다.
				//이것을 int 자료형에 담아 char로 형변환하여 출력하면
				//아스키 코드값으로 변경되어 출력되기 때문.
				System.out.println(Arrays.toString(read));
				System.out.println(fis.read(read));
				String res = new String(read);
				System.out.println(res);
				//String rev = "";
				// for(int i = res.length()-1; i >=0; i--) 
				//{ rev += res.charAt(i);
				//}
				 
				StringBuffer sb = new StringBuffer(res);
				String reverse = sb.reverse().toString();
				
				if(res.equals(reverse)) {
					System.out.println(res+"는 회문입니다.");
				}else {
					System.out.println(res+"는 회문이 아닙니다.");
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					//잘 읽어오던, 읽지못하던 무조건 닫아야해서 finally로 선언
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//finally
		}
	}
}
