package day4;

import java.util.Scanner;

public class Q403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력  : ");
		int num = sc.nextInt();
		int sum = 0;
		
		System.out.print("거꾸로 하면 : ");
		for(int i = 1; i < num; i*=10) {
			int reverse = num%(i*10)/i;
			System.out.print(reverse);
			sum += reverse;
		}
		
		System.out.println("\n모든 자리수의 합 : " + sum);
		
		
	}
}
