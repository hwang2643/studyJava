package day7;

import java.util.Scanner;

public class Q701 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int n = sc.nextInt();
		int n2=1;
		for(int i = 1; i<=n; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print(n2 + " ");
				n2++;
			}
			System.out.println();
		}
	}
}
