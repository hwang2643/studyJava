package day6;

public class Ex606 {
	public static void main(String[] args) {
		// 1. 누적합 : 2+3+4+5 = 14
		int sum = 0;
		for(int i = 2; i<=5; i++) {
			sum += i;
		}
		System.out.println("sum : " + sum);
		
		// 2. 누적곱 : 3*4*5*6 = 360
		int mul = 1;
		for(int i = 3; i<=6; i++) {
			mul *= i;
		}
		System.out.println("mul : " + mul);
		
	}
}
