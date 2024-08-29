package ex03_annotation;
//실제로 만들일이 많이 없을거다.
import java.lang.annotation.Annotation;

@TestInfo(value="테스트 정보")
//value=을 통해 TestInfo의 value()메서드에 정보가 저장된다.
public class Ex02_annotation {
	public static void main(String[] args) {
		//.class는 클래스 리터럴이라고 한다.
		//해당 클래스자체에 대한 정보를 얻을 수 있다.
		//클래스의 이름이 뭐냐
		//메서드는 뭐가 있냐
		//적용된 어노테이션은 뭐가 있냐
		//등 정보등을 얻을 수 있다.
		Annotation[] annos = Ex02_annotation.class.getAnnotations();
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		//어노테이션 내용을 강제로 보기위한 코드
		TestInfo testInfo = (TestInfo)Ex02_annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testInfo.value());
	}
	

}
