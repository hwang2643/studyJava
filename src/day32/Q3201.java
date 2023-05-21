package day32;

import java.util.Scanner;

class ThreadPractice1 extends Thread{
	String input;
	ThreadPractice1(String input) {
		this.input = input;
	}
	@Override 
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print(input);
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Q3201 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String input = sc.next();
		ThreadPractice1 t = new ThreadPractice1(input);
		t.start();
		try {
			t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n실행종료");
	}
}
