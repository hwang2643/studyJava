package day16;

//Q1604) max3 메서드를 정의.
//- 파라미터 : 3개의 정수 값(a, b, c)    // 중복이 있을 수도 있어요.
//- 리턴 : a, b, c 중 가장 큰 값.
//main():
//- 난수발생(1~9)	--> 3개의 정수를 난수발생해서 n1,n2,n3
//- sysout( max3(n1,n2,n3) );
public class Q1604 {
	static int max3(int a, int b, int c) {
		return (a>b&&a>c ? a : (b>c ? b : c));
	}
	public static void main(String[] args) {
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*9)+1;
		int n3 = (int)(Math.random()*9)+1;
		System.out.println(n1 + " " + n2 + " " + n3);
		System.out.println(max3(n1, n2, n3));
	}
}
