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
		System.out.print("정수1 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("연산자 입력 : ");
		String s = sc.next();
		char c = s.charAt(0);  // 연산자.
		System.out.print("정수2 입력 : ");
		int n2 = sc.nextInt();
		int result = 0;
		switch(c) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/' :
			result = n1 / n2;
			break;
		}
		System.out.println(n1 + " " + c + " " + n2 + " = " + result);
	}
}
