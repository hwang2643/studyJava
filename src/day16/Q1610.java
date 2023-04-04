package day16;

import java.util.Scanner;

//고급. Q1610) [파라미터로 정수 값을 하나 받아서,
//   	     각 자릿수의 합을 리턴하는 메서드]
//   	(실행결과) 정수 입력 : 356 (엔터)
//   		 각 자릿수의 합 = 14
//   	(실행결과) 정수 입력 : 3156 (엔터)
//   		 각 자릿수의 합 = 15
public class Q1610 {
	static int add(String s) {
		int sum = 0;
		for(int i=0; i<=s.length()-1; i++) {
			sum += s.charAt(i)-'0';
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String s = sc.next();
		System.out.println("각 자릿수의 합 = " + add(s));
	}
}
