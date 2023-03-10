package day7;

import java.util.Scanner;

public class Q7013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int in = sc.nextInt();
		int n;
		for(int i = 1; i<=in; i++) {
			for(int j = 1; j<=i; j++) {
				if(i%2==0 && j%2==0) {
					n=1;
				}else if(i%2!=0 && j%2!=0){
					n=1;
				} else {
					n=0;
				}
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
