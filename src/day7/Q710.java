package day7;

import java.util.Scanner;

public class Q710 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		int n = 0;
		for(int i = 1; i<=in; i++) {
			for(int j = in-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i+n; j++) {
				System.out.print("*");
			}
			n++;
			System.out.println();
			
		}
	}
}
