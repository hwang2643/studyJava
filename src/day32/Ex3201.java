package day32;

// 안녕! Hi!
class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.print("안녕!");
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class MyThread2 extends Thread {
	@Override 
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.print("Hi!");
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex3201 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
		try { 
			t1.join();
			t2.join();
		}catch(InterruptedException e ) {
			e.printStackTrace();
		}
		System.out.println("\n실행종료");
		
		
	}
}
