package day33;

class Common {
	private  int n;
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	synchronized void add(int num) {
		n += num;
	}
}
class ThreadAdder extends Thread {
	
	Common common;
	int start, end;
	
	ThreadAdder(Common common, int start, int end) {
		this.common = common;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		// DO : Common 객체의 n 필드에 값을 더할거다...
		for(int i=start; i<=end; i++) {
			common.add(i);
		}
	}
}
public class Ex3301 {
	public static void main(String[] args) {
		Common obj = new Common();
		ThreadAdder t1 = new ThreadAdder(obj, 1, 50);  // 'new 상태'
		ThreadAdder t2 = new ThreadAdder(obj, 51, 100);  // 'new 상태'
		
		t1.start();  // 'new 상태 ---> 'runnable 상태'
		t2.start();  // 'new 상태 ---> 'runnable 상태'
		try {
			t1.join();  // "main-thread가 t1이 끝나기를 기다림"
			t2.join();  // "main-thread가 t2가 끝나기를 기다림"
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("n : " + obj.getN());
		
		
	}
}
