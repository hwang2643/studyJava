package day12;

import java.util.Arrays;

/*
 * Q1212. (고급) 위 Q1211을 네 번 돌렸을 때 ‘최대값-최소값’이 가장 크게 되는 경우의 ‘최대값-최소값’을 출력해보세요.
	(실행결과)
	'최대값-최소값'의 최대값 = 48
 */
public class Q1212 {
	public static void main(String[] args) {
		
		int[] totalArr = new int[4];
		for(int i=0; i<totalArr.length; i++) {
			int[] arr = new int[10];
			for(int j=0; j<arr.length; j++) {
				arr[j] = (int)(Math.random()*50)+51;
			}
			System.out.println("셍성된 배열 : " + Arrays.toString(arr));
			int max = arr[0];
			int min = arr[0];
			for(int j=0; j<arr.length; j++) {
				if(max<arr[j]) {
					max = arr[j];
				}
				if(min>arr[j]) {
					min = arr[j];
				}
			}
			totalArr[i] = max - min;
			System.out.println("최대 값 - 최소 값 = " + max + " - " + min + " = " + (max-min));
		}
		int totalMax = totalArr[0];
		for(int i=0; i<totalArr.length; i++) {
			if(totalMax<totalArr[i]) {
				totalMax = totalArr[i];
			}
		}
		System.out.println("\'최대 값 - 최소 값\'의 최대 값 = " + totalMax);
	}
}
