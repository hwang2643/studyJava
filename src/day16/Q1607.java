package day16;

import java.util.Scanner;

//Q1607) (실행결과) 입력1 : 5 (엔터)
//입력2 : -10 (엔터)
//입력3 : 17 (엔터)
//최대 값 = 17
//(main메서드의 마지막 줄)
//System.out.println("최대 값 = " + max(a, b, c));
public class Q1607 {
	static int max(int a, int b, int c) {
		return a>b&&a>c ? a : (b>c ? b : c);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		System.out.println("최대 값 = " + max(a, b, c));
	}
}
