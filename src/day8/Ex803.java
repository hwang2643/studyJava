package day8;

import java.util.Scanner;

// 코테 ------> '소수(prime number)구하는 문제...'
public class Ex803 {
	public static void main(String[] args) {
		// TODO : 스캐너 사용을 추가
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();  // 소수(prime number)인지 아닌지 테스트할 숫자
		int count = 0;
		for(int i = 1; i<=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(num + "은 소수(prime number)임.");
		}else {
			System.out.println(num + "은 소수(prime number)가 아님");
		}
	}
}
