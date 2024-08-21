package ex04;
//컬렉션 문제 모름
import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		
		outer:while(true){
			System.out.println("아이디 생성 : ");
			Scanner sc = new Scanner(System.in);
			UserInfo user = new UserInfo();
			user.setId(sc.next());
			
			//ArrayList 에 중복되는 아이디가 있는지 검사
			for(int i=0; i< list.size(); i++) {
				if(user.getId().equals(list.get(i).getId())) {
					System.out.println("중복된 아이디입니다.");
					continue outer;
				}
			}
			System.out.println("패스워드 입력 : ");
			user.setPwd(sc.nextInt());
			
			//리스트에 추가
			list.add(user);
			//list에 들어있는 내용 출력하기
			for(UserInfo u : list) {
				System.out.println(u.getId());
				System.out.println(u.getPwd());
				System.out.println("----------------");
			}
		}
		
		
	}

}
