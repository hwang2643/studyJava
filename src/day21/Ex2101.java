package day21;

import java.util.Arrays;

class A {
	static int a;
	int b;
}

public class Ex2101 {
	public static void main(String[] args) {
		// 자동 초기화
		int c;
		A obj = new A();
		System.out.println(A.a);
		System.out.println(obj.b);
//		System.out.println(c);  // ERR.
		
		int[] arr = new int[3];
		System.out.println(Arrays.toString(arr));
	}
}
