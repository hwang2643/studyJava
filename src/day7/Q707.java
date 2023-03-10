package day7;

import java.util.Scanner;

public class Q707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		int n = 1;
		for(int i = 1; i<=in; i++) {
			for(int j = in; j>=i; j--) {
				System.out.print(n + " ");
				n += 1;
			}
			System.out.println();
		}
	}
}
