package day2;

public class Ex204 {
	public static void main(String[] args) {
		double a = 3;
		int b = 2;
		System.out.println(a + b); // 5
		System.out.println(a - b); // 1
		System.out.println(a * b); // 6
		System.out.println(a / b); // 1 (몫)
		
		System.out.println(5 % 3); // 2 (나머지)
		
		// num : 37 ---> 237
		int num = 237;
		// 1. 십의자리수  (3)
		System.out.println(num/10%10);
		// 2. 일의 자리수 (7)
		System.out.println(num%10);
		
	}

}
