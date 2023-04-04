package day16;

import java.util.Scanner;

//Q1608) (실행결과) 입력1 : 15 (엔터)
//입력2 : 7 (엔터)
//입력3 : 29 (엔터)
//평균값 = 17.0
//(main메서드의 마지막 줄)
//System.out.println("평균값 = " + avg(a, b, c));
public class Q1608 {
	static double avg(double a, double b, double c) {
		return (a+b+c)/3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		double a = sc.nextInt();
		System.out.print("입력2 : ");
		double b = sc.nextInt();
		System.out.print("입력3 : ");
		double c = sc.nextInt();
		System.out.println("평균값 = " + avg(a, b, c));
	}
}
