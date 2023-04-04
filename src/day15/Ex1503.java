package day15;

import java.util.Scanner;
	
public class Ex1503 {
	static void showAllSum(int a, int b, int c) {
		System.out.println(a + "+" + b + "+" + c + "=" + (a+b+c));
	}
	static void showAllSum2(int[] parr) {
		System.out.println(parr[0] + "+" + parr[1] + "+" + parr[2] + "=" + (parr[0]+parr[1]+parr[2]));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.print("정수1 : ");
		arr[0] = sc.nextInt();
		System.out.print("정수2 : ");
		arr[1] = sc.nextInt();
		System.out.print("정수3 : ");
		arr[2] = sc.nextInt();
		showAllSum(arr[0],arr[1],arr[2]);
		showAllSum2(arr);
		}

}
