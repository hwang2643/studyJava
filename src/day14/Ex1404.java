package day14;

import java.util.Arrays;


public class Ex1404 {
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,3},
				{4,5,6,7},
				{8,9}
		};
		// 출력1 : Arrays.toString()
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		// 출력2 : for문
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {  // arr[i].length : 각 행의 열 사이즈
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
