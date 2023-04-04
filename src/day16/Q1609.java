package day16;

import java.util.Scanner;

//Q1609) (실행결과) 정수 몇 개? 3 (엔터)
//		입력1 : 5 (엔터)
//		입력2 : 8 (엔터)
//		입력3 : 2 (엔터)
//		합계 = 15
//	(main메서드의 마지막 줄)
//		System.out.println("합계 = " + sum(arr));
public class Q1609 {
	static int sum(int[] arr) {
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 몇개? ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print("입력" + (i+1) + " : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("합계 = " + sum(arr));
	}
}
