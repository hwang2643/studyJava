package test01;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력 하세요 : ");
		int a = sc.nextInt();

		if(a > 1) {
			System.out.println("a는 정수이다.");
		} else if(a < -1) {
		    System.out.println("a는 음수이다.");
		} else if(a == 0) {
			System.out.println("a는 0이다");
		}   
	}



}
