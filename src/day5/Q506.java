package day5;

import java.util.Scanner;

/*
 * 요일을 한글로 입력받아서, 영어로 출력
 *	SUN / MON / TUE / WED / THU / FRI / SAT
 *	(실행결과) 요일 입력 : 일 (엔터)
 *			 일요일은 SUN 
 */
public class Q506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일 입력 : ");
		String s = sc.next();
		char c = s.charAt(0);
		System.out.print(s + "요일은 ");
		if(c == '일') {
			System.out.println("SUN");
		} else if(c == '월') {
			System.out.println("MON");
		} else if(c == '화') {
			System.out.println("TUE");
		} else if(c == '수') {
			System.out.println("WED");
		} else if(c == '목') {
			System.out.println("THU");
		} else if(c == '금') {
			System.out.println("FRI");
		} else if(c == '토') {
			System.out.println("SAT");
		} else {
			System.out.println("요일을 입력하세요");
		}
	}
}
