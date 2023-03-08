package day4;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 정수 값 거꾸로, 모든 수 합
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 값 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		int reverse = 0;
		int tmp = num;
		System.out.print("거꾸로 : ");
		for(int i = 0; true; i++) {
			reverse = tmp%10;
			tmp /= 10;
			System.out.print(reverse);
			sum += reverse;
			if(tmp == 0) {
				break;
			}
		}
		System.out.println("\n모든 자리수의 합 : " + sum);
	}

}
