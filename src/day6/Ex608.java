package day6;

import java.util.Scanner;

/*
 * (실행결과) 단 입력 : 7(엔터)
 * 			7 x 1 = 7
 * 			7 x 2 = 14
 *			... 
 *			7 x 8 = 56
 *			7 x 9 = 63
 */
public class Ex608 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int n = sc.nextInt();
		for(int i = 1; i<=9; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
	}
}
