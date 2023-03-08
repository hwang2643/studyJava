package day4;

public class Q402 {
	public static void main(String[] args) {
		int a = 17;
		int b = 25;
		int c = 8;
		
		
//		int max = 0;
//		if(a>b && a>c) {
//			max = a;
//		} else if(b>a && b>c) {
//			max = b;
//		} else {
//			max = c;
//		}
		
		int max = a > b ? a : b > c ? b : c;
		System.out.println("max : " + max);
		
	}
}
