package test01;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("값 입력 : ");
		int num = sc.nextInt();
		System.out.println("조건문 사용");
		if(num >= 0) {
			System.out.println(num + "의 절대값은 : " + num);
		} else {
			System.out.println(num + "의 절대값은 : " + -num);
		}
		
		System.out.println("삼항연산자 사용");
		System.out.println(num + "의 절대값은 : " + (num>0 ? num : -num));
		
	}


		

}
