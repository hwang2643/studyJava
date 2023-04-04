package day12;

import java.util.Scanner;

/*
 * Q1207. (고급) 크기가 5인 정수형 배열에 담긴 값들의 합을 맞추는 게임을 만들어보세요.
	요구사항1. 이 배열에는 0 이상 9 이하의 정수가 랜덤하게 들어갑니다.
	요구사항2. 게임은 플레이어가 정답을 맞추지 못할 때까지 반복합니다.
	요구사항3. 플레이어가 정답을 맞추지 못하면 그때까지 몇 번 맞췄는지 출력하고 게임을 종료합니다.
	(실행결과)
		(#1) 1+5+7+0+3=? 16 (엔터)
		정답입니다.
		(#2) 2+0+9+9+8=? 28 (엔터)
		정답입니다.
		(#3) 3+9+1+1+2=? 16 (엔터)
		정답입니다.
		(#4) 1+7+1+0+9=? 117 (엔터)
		틀렸습니다. 총 3문제를 맞췄습니다.
 */
public class Q1207 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int qn = 1;
		int[] arr = new int[5];
		while(true) {
			for(int i=0; i<=arr.length-1; i++) {
				arr[i] = (int)(Math.random()*10);
			}
			int sum = 0;
			System.out.print("(#" + qn + ")");
			for(int i=0; i<=arr.length-1; i++) {
				System.out.print(arr[i]);
				sum += arr[i];
				if(i<=arr.length-2) {
					System.out.print("+");
				}
			}
			System.out.print("=? ");
			int in =sc.nextInt();
			if(in == sum) {
				System.out.println("정답입니다.");
				qn++;
				n++;
			}else {
				System.out.println("틀렸습니다. 총 " + n + "문제를 맞췄습니다.");
				break;
			}
		}
		
		
		
	}
}
