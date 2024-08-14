package ex04_generic;
/*Gen 클래스를 정의하고 제네릭 타입 T를 같는 printArr 메서드 생성
 * printArr메서드 내부에서 배열을 순차적으로 출력하는 코드작성
 * GenMain 클래스를 작성하고 Integer[],Double[],Character[]배열을
 * 만든뒤 Gen 클래스의 printArr 메서드를 호출하여 각배열의 내용 출력하기
 * 
 * 결과
 * 1 2 3 4 5 //정수배열 출력했을때
 * 1.1 2.2 3.3 4.4 5.5 //실수 배열 출력했을때
 * A B C D E //문자열 배열 출력했을때*/
public class Gen {
	//제네릭 메서드
	//제네릭타입 배열을 파라미터로 받음 
	public <T> void printArr(T[] arr){
		for(int i=0; i<arr.length;i++) {
			System.out.print( arr[i]+" " );
		}
		System.out.println();
	}
}
