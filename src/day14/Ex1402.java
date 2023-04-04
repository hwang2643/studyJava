package day14;

import java.util.Arrays;

public class Ex1402 {
	public static void main(String[] args) {
		//int[] arr = {10, 20, 30};  // 1차원 배열의 (간편법)
		int[][] arr = {
				{10, 20, 30},
				{40, 50, 60}
		};
		
		// 출력 ---> "행"별로 Arrays.toString()을 사용
		// 이해) Arrays.toString() 의 괄호() 안에는 '1차원 배열의 이름'을
		// 이해) arr[0]은 (행#0인) '1차원 배열'을 의미
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		
		// 연습.
		// [10 20]
		// [30 40]
		// [50 60]
		int[][] arr2 = new int[3][2];
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[1][0] = 30;
		arr2[1][1] = 40;
		arr2[2][0] = 50;
		arr2[2][1] = 60;
		// TODO : ...(간편법 사용금지)
		for(int i=0; i<=arr2.length-1; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}
