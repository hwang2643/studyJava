package day9;

import java.util.Scanner;

// 세 정수 입력(a, b, c), 세 정수의 합계가 짝수 인지 아닌지 출력
// (고급) 세 정수의 합계가 홀수이면 다시 입력
public class Q902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; true; i++) {
			System.out.print("a : ");
			int a = sc.nextInt();
			System.out.print("b : ");
			int b = sc.nextInt();
			System.out.print("c : ");
			int c = sc.nextInt();
			sum = a + b + c;
			if(sum%2 == 0) {
				break;
			}else {
				System.out.println("세 정수의 합이 짝수가 아님!");
			}
		}
		System.out.println("세 정수의 합이 짝수임!");
	}
}
