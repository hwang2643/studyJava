package day16;
//Q1601) plus10 메서드를 정의.
//- 파라미터로 정수 값 하나(n)를.
//- 리턴 : 정수 n에 10을 더한 값을.
//main():
//- int a = 5;
//  sysout( plus10(a) );   // 15
public class Q1601 {
	static int plus10(int n) {
		return n+10;
	}
	public static void main(String[] args) {
		int a = 5;
		System.out.println(plus10(a));
	}
}
