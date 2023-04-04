package day15;

import java.util.Scanner;

public class Ex1502 {
	static void ShowAllSum(int a, int b, int c) {
		System.out.print(a + " + ");
		System.out.print(b + " + ");
		System.out.print(c + " = ");
		a += b;
		a += c;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int a = sc.nextInt();
		System.out.print("정수2 : ");
		int b = sc.nextInt();
		System.out.print("정수3 : ");
		int c = sc.nextInt();
		ShowAllSum(a,b,c);
		
		System.out.println("a : "+ a);
	}

}
