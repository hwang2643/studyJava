package day10;

import java.util.Scanner;

// (참고) 입력버퍼 문제
public class Ex1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이와 이름을 순서대로 입력하세요 : ");  
		int age = sc.nextInt();  // 19 (엔터)
		sc.nextLine();  // (입력버퍼 비움)
		String name = sc.nextLine();  // JW (엔터)
		System.out.println("입력된 내용 : 이름 = " + name);
		System.out.println("입력된 내용2 : 나이 = " + age);
	}
}
