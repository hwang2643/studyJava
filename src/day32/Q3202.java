package day32;

import java.util.Scanner;

class ThreadPractice2 extends Thread {
	String input1;
	ThreadPractice2(String input1) {
		this.input1 = input1;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print(input1);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class ThreadPractice3 extends Thread {
	String input2;
	ThreadPractice3(String input2) {
		this.input2 = input2;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print(input2);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Q3202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열1 입력 : ");
		String input1 = sc.next();
		System.out.print("문자열2 입력 : ");
		String input2 = sc.next();
		ThreadPractice2 t1 = new ThreadPractice2(input1);
		ThreadPractice2 t2 = new ThreadPractice2(input2);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n실행종료");
	}
}
