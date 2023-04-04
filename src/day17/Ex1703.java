package day17;

public class Ex1703 {
	static int fibo(int n) {
		if(n==1 ) 
			return 1;
		if(n==2) 
			return 1;
		return fibo(n-1) + fibo(n-2);
	}
		
	public static void main(String[] args) {
		for(int i=1; i<=20; i++) {
			System.out.print(fibo(i) + " ");
		}
	}
	
}
