package day12;

import java.util.Arrays;

/*
 * Q1205. 크기가 3인 정수형 배열 arr1과 크기가 3인 정수형 배열 arr2를 만들고, 두 배열을 1 이상 9 이하의 정수들로 난수 발생하여 채워넣습니다.
	① 각 배열의 내용을 출력한 후
	② 모든 요소의 합이 더 큰 배열의 이름(arr1 또는 arr2)과 그 배열의 모든 요소의 합을 출력해보세요.
	(실행결과)
		생성된 배열 arr1 : [1, 3, 2]
		생성된 배열 arr2 : [2, 1, 4]
		둘 중 더 큰 배열의 이름은 arr2 입니다.
		배열 arr2의 모든 요소의 합은 7 입니다.
 */
public class Q1205 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		for(int i=0; i<=arr1.length-1; i++) {
			arr1[i] = (int)(Math.random()*9)+1;
			arr2[i] = (int)(Math.random()*9)+1;
		}
		System.out.println("생성된 배열 arr1 : " + Arrays.toString(arr1));
		System.out.println("생성된 배열 arr1 : " + Arrays.toString(arr2));
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i<=arr1.length-1; i++) {
			sum1 += arr1[i];
			sum2 += arr2[i];
		}
		System.out.println("둘 중 더 큰 배열의 이름은 " + (sum1>sum2 ? "arr1" : "arr2") + " 입니다.");
		System.out.println("배열 " + (sum1>sum2 ? "arr1" : "arr2") + "의 모든 요소의 합은 " + (sum1>sum2 ? sum1 : sum2) + " 입니다.");
		
	}
}
