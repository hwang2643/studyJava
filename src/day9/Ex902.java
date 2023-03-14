package day9;

import java.util.Scanner;

public class Ex902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		boolean b = false;
		for(int i = 2; i<num; i++) {
			if(num%i == 0) {
				b = !b;
				break;
			}
		}
		if(b == false) {
			System.out.println(num + "은 소수(prime number)입니다");
		}else {
			System.out.println(num + "은 소수(prime number)가 아닙니다.");
		}
	}
}
