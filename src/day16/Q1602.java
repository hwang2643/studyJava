package day16;
//Q1602) add 메서드를 정의.
//- 파라미터 : 두 개의 정수 값(a, b)
//- 리턴 : 더 파라미터 정수 값을 더한 값.
//main():
//- sysout( add(3, 5) );
public class Q1602 {
	static int add(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		System.out.println(add(3, 5));
	}
}
