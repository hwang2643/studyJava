package day9;

import java.util.Scanner;

public class Q909 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] op = {'+', '-', '*', '/'};
		
		int co = 0;
		int result = 0;
		for(int i = 1; i<=5; i++) {
			int a = (int)(Math.random()*9)+1;
			int b = (int)(Math.random()*9)+1;
			int ran = (int)(Math.random()*op.length);
			if(op[ran] == '/') {
				if(a%b!=0) {
					i--;
					continue;
				}
			}
			System.out.print(i + "번 문제. " + a + op[ran] + b +" = ");
			int in = sc.nextInt();
			if(op[ran] == '+' ) {
				result = a + b;
				if(result == in) {
					co++;
				}
			}else if(op[ran] == '-') {
				result = a - b;
				if(result == in) {
					co++;
				}
			}else if(op[ran] == '*') {
				result = a * b;
				if(result == in) {
					co++;
				}
			}else if(op[ran] == '/') {
				result = a / b;
				if(result == in) {
					co++;
				}
			}
		}
		System.out.println("5문제 중 " + co + "문제를 맞췄습니다.");
	}
}
