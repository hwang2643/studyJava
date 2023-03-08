package day5;

import java.util.Scanner;

/*
 * 계산기
 * 정수 입력 : 3
 * 연산자 입력 : +
 * 정수 입력 : 5
 * 3 + 5 = 8
 * 
 */
public class Q507 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int n1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String s = sc.next();
		char c = s.charAt(0);
		System.out.print("정수입력 : ");
		int n2 = sc.nextInt();
		if(c == 43) {
			System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
		} else if(c == 45) {
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
		} else if(c == 42) {
			System.out.println(n1 + " * " + n2 + " = " + (n1*n2));
		} else if(c == 47) {
			System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
		}
	}
}
