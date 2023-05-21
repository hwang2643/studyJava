package day32;

// 두 번째 방식 : "implements Runnable" 방식.
// 1) implements Runnable 하는 클래스를 정의
// 2) run()메서드 오버라이드
// 3) 객체생성
// 4) Thread 객체 생성, 생성자 파라미터에 3) 의 참조값을.
class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.print("안녕!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.print("Hi!");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
public class Ex3202 {
	public static void main(String[] args) {
		MyRunnable1 r1 = new MyRunnable1();
		MyRunnable2 r2 = new MyRunnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
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
