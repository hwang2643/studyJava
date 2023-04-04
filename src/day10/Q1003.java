package day10;

import java.util.Scanner;

public class Q1003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력 : ");
		String s = sc.next();
		char c = s.charAt(0);
		if(c>='A' && c<='Z') {
			for(char i = c; i<='Z'; i++) {
				System.out.print(i);
			}
		}else if(c>='a' && c<='z') {
			for(int i = c; i<='z'; i++) {
				System.out.print((char)i);
			}
		}else {
			System.out.println("알파벳이 아니네요");
		}
	}
}
