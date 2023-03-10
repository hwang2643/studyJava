package day7;

import java.util.Scanner;

public class Q708 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int input = sc.nextInt();
		for(int i = 1; i<=input; i++) {
			for(int j = 1; j<=input-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
