package day10;

import java.util.Scanner;

// Scanner클래스
public class Ex1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		//String s1 = sc.nextLine();  // 한 "문장"을 입력 : 오늘이 금요일이었다면
		String s1 = sc.next();  //  한 "단어'를 입력 : 오늘이 금요일이었다면
		System.out.println("입력받은 문자열 : " + s1);
		
		String s2 = sc.next();  // 입력?
		System.out.println("두 번째 입력받은 문자열 : " + s2);
	}
}
