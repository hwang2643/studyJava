package day7;

import java.util.Scanner;

public class Q714 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		int n = 1;
		int total = 0;
		for(int i = 1; i<=in; i++) {
			for(int j = 1; j<=i; j++) {
				total += n;
				n++;
			}
		}
		for(int i = 1; i<=in; i++) {
			System.out.print(" ");
		}
		System.out.println(total);
		n = 1;
		for(int i = 1; i<=in; i++) {
			for(int j = in - i; j>=0; j--) {
				System.out.print(" ");
			}
			int sum = 0;
			for(int j = 1; j<=i; j++) {
				System.out.print(n + " ");
				sum+=n;
				n++;
			}
			System.out.print(sum);
			System.out.println();
		}
	}
}
