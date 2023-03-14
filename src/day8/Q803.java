package day8;

import java.util.Scanner;

public class Q803 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 입력 : ");
		int b = sc.nextInt();
		System.out.print("정수 입력 : ");
		int c = sc.nextInt();
		System.out.print("정수 입력 : ");
		int d = sc.nextInt();
		int i = a;
//		while(true){
//			if(i>b) {
//				break;
//			}
//			if(i>=c && i<=d) {
//				i++;
//				continue;
//			}
//			System.out.print(i + " ");
//			i++;
//		}
//		System.out.println();
//		for(i = a; true; i++) {
//			if(i>b) {
//				break;
//			}
//			if(i>=c && i<=d) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
//		System.out.println();
		for(i = a; i<=b; i++) {
			if(i>=c && i<=d) {
				continue;
			}
			System.out.print(i + " ");
		}
		
		
	}
}
