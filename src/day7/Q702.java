package day7;

import java.util.Scanner;

public class Q702 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇의 배수를 출력할까요? : ");
		int n = sc.nextInt();
		for(int i = 1; i<=100; i++) {
			if(i%n == 0) {
				System.out.print(i + " ");
			}
			
		}
		
		
		
		
	}
}
