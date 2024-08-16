package ex02_Thread;

import java.util.Scanner;

public class ThreadCount extends Thread{
	private int n;
	public ThreadCount(int n){
		this.n = n;
	}
	@Override
	public void run() {
		for(int i=n; i>=0; i--) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("종료");
	}
}
