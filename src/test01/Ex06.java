package test01;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int score = sc.nextInt();
		
		if(score == 100) {
			System.out.println("점수 : A++");
		} else if(score >= 90) {
			System.out.println("점수 : A");
		} else if(score >=80) {
			System.out.println("점수 : B");
		} else if (score >= 70) {
			System.out.println("점수 : C");
		} else if(score >= 60) {
			System.out.println("점수 : D");
		} else {
			System.out.println("점수 : F");
		}
		
		String s;
		s = (score == 100 ? "A++" : "오류");
		s = (score >= 90 ? "A" : "오류");
		s = (score >= 80 ? "B" : "오류");
		s = (score >= 70 ? "C" : "오류");
		s = (score >= 60 ? "D" : "오류");
		s = (score < 60 ? "F" : "오류");
		System.out.println("점수 : " + s);
		
		char grade2 = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'E' : 'F' ;
		System.out.println("점수 : " + grade2);
	}
}
