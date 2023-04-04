package day14;

import java.util.Arrays;

/*
 * 연습4(고급). 2차원 배열(3x3)을 난수발생(1~9) 해서 채운 후,
		1) 출력. (형식은 자유)
		2) (위 배열을) 시계방향으로 90도 회전해서 출력.
		3) (위 1)의 배열을) 반시계방향으로 90도 회전해서 출력.

 */
public class Q1404 {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][3];
		for(int i=0; i<=arr1.length-1; i++) {
			for(int j=0; j<=arr1[i].length-1; j++) {
				arr1[i][j] = (int)(Math.random()*9)+1;
			}
		}
		for(int i=0; i<=arr1.length-1; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		System.out.println();
		int[][] arr2 = new int[3][3];
		for(int i=0; i<=arr2.length-1; i++) {
			int n = arr1.length-1;
			for(int j=0; j<=arr2[i].length-1; j++) {
				arr2[i][j] = arr1[n][i];
				n--;
			}
		}
		for(int i=0; i<=arr2.length-1; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		System.out.println();
		int[][] arr3 = new int[3][3];
		int n = arr1.length-1;
		for(int i=0; i<=arr3.length-1; i++) {
			for(int j=0; j<=arr3[i].length-1; j++) {
				arr3[i][j] = arr1[j][n];
			}
			n--;
		}
		for(int i=0; i<=arr3.length-1; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
	}
	
}
