package day31;

// 첫 번째 방식 : "extends Thread 방식"
// 1) "extends Thread"를 하는 클래스를 정의
// 2) run() 메서드를 오버라이드
// 3) 객체 생성.
// 4) .start() 호출. (NOT .run())
class MyThread1 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print("A");
			try {
				sleep(1000);  // 1000 --> 1000ms --> 1s(1초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
}
class MyThread2 extends Thread {
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.print("B");
			try {
				sleep(1000);  // 1000 --> 1000ms --> 1s(1초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
		}
	}
}
public class Ex3102 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
//		t1.run();  // 생각.
//		t2.run();  // 생각.
		try {
			System.out.println();
			t1.join();  // main-thread가 t1(thread)가 끝날 때까지 기다림★
			t2.join();  // main-thread가 t2(thread)가 끝날 때까지 기다림★
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		System.out.println("\nmain() 실행 종료됨.");
		
	}
}
