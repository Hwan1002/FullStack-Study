package ex04_generic;

public class GenMain {
	public static void main(String[] args) {
			Gen gen = new Gen();
			
			Integer[] arr1 = {1,2,3,4,5};
			Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
			Character[] arr3 = {'A','B','C','D','E'}; 
			
			//제네릭 메서드 사용시 장점
			//객체를 매 타입에 맞게 만들어줄 필요가 없음
			gen.printArr(arr1);
			gen.printArr(arr2);
			gen.printArr(arr3);
	}

}
