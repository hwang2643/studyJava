package day5;

import java.util.Scanner;

public class Ex506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; true; i++) {
			System.out.print("점수를 입력하세요(0~100) : " );
			int score = sc.nextInt();
			
			if(score<=100 && score>=0) {
				switch(score/10) {
				case 10:
				case 9:
					System.out.println(score + "점은 A학점 입니다");
					break;
				case 8:
					System.out.println(score + "점은 B학점 입니다");
					break;
				case 7:
					System.out.println(score + "점은 C학점 입니다");
					break;
				case 6:
					System.out.println(score + "점은 D학점 입니다");
					break;
				default:
					System.out.println(score + "점은 F학점 입니다");
				}
				break;
			} else {
				System.out.println("0~100의 수를 입력해주세요");
			}
		}
		
		
		// TODO : 코드를 작성해 보세요
		// ____점은 ___학점입니다.
		// -----> (90이상 A / 80-->B / 70--->C / 60--->D / F)
		
		
//		if(score >= 90) {
//			System.out.println("A학점 입니다");
//		} else if(score >= 80) {
//			System.out.println("B학점 입니다");
//		} else if(score >= 70) {
//			System.out.println("C학점 입니다");
//		} else if(score >= 60) {
//			System.out.println("D학점 입니다");
//		} else {
//			System.out.println("F학점 입니다");
//		}
	}
}
