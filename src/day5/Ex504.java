package day5;

import java.util.Scanner;

public class Ex504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100) : " );
		int score = sc.nextInt();
		
		// TODO : 코드를 작성해 보세요
		// ____점은 ___학점입니다.
		// -----> (90이상 A / 80-->B / 70--->C / 60--->D / F)
		
		System.out.print(score + "점은 ");
		if(score >= 90) {
			System.out.println("A학점 입니다");
		} else if(score >= 80) {
			System.out.println("B학점 입니다");
		} else if(score >= 70) {
			System.out.println("C학점 입니다");
		} else if(score >= 60) {
			System.out.println("D학점 입니다");
		} else {
			System.out.println("F학점 입니다");
		}
		
//		System.out.println(score + "점은 " + (score>=90 ? "A" : score>=80 ? "B" : score>=70 ? "C" : score>=60 ? "D" : "F"));
		
	}
}
