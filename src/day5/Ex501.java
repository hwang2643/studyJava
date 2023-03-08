package day5;

import java.util.Scanner;

public class Ex501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		int num = (n >= 0 ? n : -n);
		System.out.println(n + "의 절대 값 = " + num);
	}
}
