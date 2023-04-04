package day15;

// void ---> (리턴하는 값이 없을 때 사용하는)
public class Ex1504 {
	static void m1() { // void  --> (비어있음) --> "리턴 값이 없는" 메서드
		System.out.println("m1.");
	} 
	static int m2() {
		return 10;  // "return 리턴값;"  --> 리턴문
	}
	static int m3() {
		return 100;
	}
	static double m4() {
		return 200;
	}
	public static void main(String[] args) {
		m1();
		int n = m2();
		System.out.println(n);
		double n2 = m3();
		double n3 = m4();
		System.out.println(n2);
		System.out.println(n3);
	}
}
