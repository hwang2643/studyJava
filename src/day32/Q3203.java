package day32;

class ThreadPractice4 extends Thread {
	int in;
	ThreadPractice4(int in) {
		this.in = in;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			char[] c = {'+', '-', '*', '/'};
			int n = (int)(Math.random()*4);
			int ran1 = (int)(Math.random()*10)+1;
			int ran2 = (int)(Math.random()*10)+1;
			int sum, sub, mul, dev;
			switch(c[n]) {
				case('+') :
					System.out.print(ran1 + c[n] + ran2 + "\n>>");
					sum = ran1 + ran2;
					break;
				case('-') :
					System.out.print(ran1 + c[n] + ran2 + "\n>>");
					sub = ran1 - ran2;
					break;
				case('*') :
					System.out.print(ran1 + c[n] + ran2 + "\n>>");
					mul = ran1 * ran2;
					break;
				case('/') :
					System.out.print(ran1 + c[n] + ran2 + "\n>>");
					dev = ran1 / ran2;
					break;
			}
					
			try {
				sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Q3203 {
	public static void main(String[] args) {
		
	}
}
