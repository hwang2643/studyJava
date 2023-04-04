package day11;

import java.util.Arrays;

/*
 * 연습. 크기가 5인 int형 배열을 난수 발생(1~9)해서 채우고,
				(중복된 값이 없다고 가정):고급.
	1) 배열 전체의 내용을 출력.
	2) (배열 요소들 중) 최대 값, 최소 값을 출력.
	3) (고급) 두 번째로 큰 수 출력.
 */
public class Q1105 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		while(true) {
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*9)+1;
			}
			boolean dup = true;
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						dup = false;
					}
				}
			}
			if(dup) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		int max = arr[0];  // 최대 값이라고 가정하고 있는 수
		int idx = 0;  // 최대 값이라고 가정하고 있는 수의 위치
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
				idx = i;  // 최대 값의 위치를 idx에 저장
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		// 두 번째로 큰 값 구하기
		arr[idx] = 0;  // 최대 값 위치의 수를 0으로 바꿈
		System.out.println("최대 값 : " + max + " 최소 값 : " + min);
		max = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("두 번째로 큰 값 : " + max);
	}
}
