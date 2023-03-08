package day4;

import java.util.Scanner;

public class Ex402 {
	public static void main(String[] args) {
		// 스캐너 객체 생성
		Scanner sc = new Scanner(System.in);

		// 정수 값 하나를 입력받음.(a)  / 정수 값 하나를 더 입력받음(b)
		System.out.print("정수 a값 입력 : ");
		int a = sc.nextInt();
		System.out.print("정수 b값 입력 : ");
		int b = sc.nextInt();
		
		// TODO : 두 값들 중 큰 값, 작은 값을 출력.
		int max = a>b ? a:b;
		int min = a<b ? a:b;
		
		
		System.out.println("큰 값 : " + max);
		System.out.println("작은 값 : " + min);
		
		
		
	}

}
