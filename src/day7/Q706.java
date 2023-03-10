package day7;

import java.util.Scanner;

public class Q706 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		char c = 'A';
		for(int i = 1; i<=in; i++) {
			for(int j = in; j>=i; j--) {
				System.out.print(c + " ");
			}
			c = (char)(c + 1);
			System.out.println();
		}
	}
}
