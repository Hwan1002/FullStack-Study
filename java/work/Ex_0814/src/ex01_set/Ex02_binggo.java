package ex01_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ex02_binggo {
	public static void main(String[] args) {
		//HashSet과 ArrayList를 이용하여 5 * 5의 랜덤 빙고판 만들기
		//1 ~ 50 난수 중 25개를 넣기 
		//ArrayList<integer> list = new ArrayList<integer>();
		//Collection.shuffle(list);
		
		//중복으로 숫자가 들어가지 않게끔 HashSet사용
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; set.size() < 25; i++) {
			set.add(new Random().nextInt(50)+1);
		}
		//Iterator<Integer> iter = list.iterator();
		int count = 0;
		int[][] board = new int [5][5];
		ArrayList<Integer> list = new ArrayList<Integer>(set);
		Collections.shuffle(list);
		
		
		for(int i =0; i<board.length;i++) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j] = list.get(count++);
				System.out.printf("%02d ", board[i][j]);
			}
			System.out.println();
			
		}
	}
}
