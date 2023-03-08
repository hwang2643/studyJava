package day4;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// 문자열  뒤집기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String s = sc.next();
		String reverse = "";
		for(int i = s.length()-1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.print("거꾸로 하면 : " + reverse);
	}
}
