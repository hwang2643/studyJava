package day10;

import java.util.Scanner;

public class Q1004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numArr = new int[1000];
		int sum = 0;
		for(int i = 0; true; i++) {
			System.out.print("입력 : ");
			int num = sc.nextInt();
			for(int j = 0; j<=i; j++) {
				if(numArr[j] == num) {
					System.out.println("중복된 값입니다.");
					System.out.print("입력 : ");
					num = sc.nextInt();
					j=-1;
					continue;
				}if(num==0) {
					break;
				}
			}
			numArr[i] = num;
			sum += num;
			
			if(num == 0) {
				System.out.println("지금까지 입력한 값들의 합은 ");
				for(int j = 0; j<i; j++) {
					System.out.print(numArr[j]);
					if(j <= i-2) {
						System.out.print(" + ");
					}
				}
				System.out.println(" = " + sum + "입니다.");
				break;
			}
		}
		
	}
}
