package day5;

import java.util.Scanner;

public class Q501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		if(num > 10 && num <30) {
			System.out.println(num + "은(는) 10보다 크고 30보다 작은 수임!");
		} else {
			System.out.println(num + "은(는) 10보다 크고 30보다 작은 수가 아님!");
		}
		
		System.out.print(num + "은(는) 10보다 크고 30 보다 작은 수" + (num > 10 && num <30 ? "임" : "가 아님"));
	}
}
