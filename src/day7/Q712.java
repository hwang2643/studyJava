package day7;

import java.util.Scanner;

public class Q712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		int n = 1;
		for(int i = 1; i<=in; i++) {
			for(int j = in-n; j>=0; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print(i + " ");
			}
			n++;
			System.out.println();
		}
	}
}
