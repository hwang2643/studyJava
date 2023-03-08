package day5;

import java.util.Scanner;

//물은 0도 얼고 100 끓는다. 온도를 의미하는 변수 temp 정수 입력 받아, 물이 앵체상태이면 '액체상태'라고 출력
//(실행 결과) 온도입력 : 
//			액체 상태임
public class Q503 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("온도 입력 : ");
		int temp = sc.nextInt();
		if(temp>0 && temp<100) {
			System.out.println("액체 상태임");
		} else if(temp >= 100) {
			System.out.println("기체 상태임");
		} else {
			System.out.println("고체 상태임");
		}
	}
}
