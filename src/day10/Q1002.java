package day10;

import java.util.Scanner;

public class Q1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int cnt = 0;
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			System.out.println(num + "은 소수임");
		}else {
			System.out.println(num + "은 소수가 아님");
		}
	}
}
