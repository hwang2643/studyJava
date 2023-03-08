package day5;

import java.util.Scanner;

public class Q502 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 : ");
		int year = sc.nextInt();
		if(year%400==0) {
			System.out.println(year + "년은 윤년임");
		} else if(year%4 == 0 && year%100 != 0){
			System.out.println(year + "년은 윤년임");
		}
		else {
			System.out.println(year + "년은 윤년이 아님");
		}
	}
}
