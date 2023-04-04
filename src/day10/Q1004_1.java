package day10;

import java.util.Scanner;

public class Q1004_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[1000];
		int sum = 0;
		for(int i = 0; true; i++) {
			System.out.print("정수 입력 : ");
			int in = sc.nextInt();
			
			for(int j = 0; j<=i; j++) {
				if(numArr[j] == in) {
					System.out.println("중복된 수를 입력하였습니다.");
					System.out.print("정수 입력 : ");
					in = sc.nextInt();
					j = -1;
					continue;
				}
				if(in == 0) {
					break;
				}
			}
			
			numArr[i] = in;
			sum += in;
			
			if(in == 0) {
				System.out.print("지금까지 입력한 모든 정수의 합은 \n");
				for(int j = 0; j<i; j++) {
					System.out.print(numArr[j]);
					if(j<=i-2) {
						System.out.print(" + ");
					}
				}
				System.out.print(" = " + sum + "입니다");
				break;
			}
		}
	}
}
