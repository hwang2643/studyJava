package day11;

import java.util.Scanner;

/*
 * 연습. 난수 발생(-5 ~ +5) 값을 크기가 6인 배열에 채운 후,
	1) 배열의 내용을 출력. (단, Arrays.toString() 사용X)
	2) 정수 하나(n)를 입력받고 그 값이 이 배열에 존재하는지 여부를 출력.
	(실행결과) 정수(n) 입력 : 3 (엔터)
		 배열 : [-2, 3, 4, 4, -5, -1] -> 3 있음!
	(실행결과) 정수(n) 입력 : 4 (엔터)
		 배열 : [2, 0, -4, -4, 5, 3] -> 4 없음!
 */
public class Q1104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*11) - 5;
		}
		System.out.print("정수(n) 입력 : ");
		int n = sc.nextInt();
		System.out.print("배열 : [");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
		boolean b = false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==n) {
				b = true;
			}
		}
		if(b) {
			System.out.println(" -> " + n + " 있음!");
		}else {
			System.out.println(" -> " + n + " 없음!");
		}
		
	}
}
