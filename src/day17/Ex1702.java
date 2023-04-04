package day17;

public class Ex1702 {
	static int f(int n) {
		if(n==0)
			return 1;  
		return n * f(n-1);
	}
	public static void main(String[] args) {
		System.out.println("4! = " + f(4));
		System.out.println("5! = " + f(5));
	}
}
