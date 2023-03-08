package day2;

import java.util.Scanner;

public class Ex211 {
	public static void main(String[] args) {
		// 스캐너 객체생성 문장: 
		Scanner sc = new Scanner(System.in);
		
		// 정수 값을 입력받아서, 양수/ 음수
		System.out.print("정수 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num>0) {
			System.out.println("양수입니다.");
		} else if(num<0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		
		
		
		// TODO : 정수 값을 하나 입력받아서, 홀/짝 여부 판별
//		System.out.print("정수를 입력 하세요 : ");
//		int num = sc.nextInt();
//		System.out.println(num%2==0 ? "짝수" : "홀수");
//		if (num%2==0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
	
	}

}
