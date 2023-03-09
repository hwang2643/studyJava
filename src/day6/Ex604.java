package day6;

import java.util.Scanner;

public class Ex604 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반복 횟수를 입력하세요 : ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.println(i + "번 반복");
		}
		System.out.println("반복끝");
	}
}
