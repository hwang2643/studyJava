package day10;

import java.util.Scanner;

public class Q1005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; true; i++) {
			System.out.print("소수 입력 : ");
			int in = sc.nextInt();
			int cnt = 0;
			for(int j = 1; j<=in; j++) {
				if(in%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				sum += in;
			}else {
				System.out.println("지금까지 입력한 소수들의 합은 " + sum + "입니다");
				break;
			}
		}
	}
}
