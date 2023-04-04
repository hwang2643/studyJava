package day11;

import java.util.Arrays;

/*
 * 연습(최고급).
	크기가 5인 정수형 배열을 난수 발생(1~9)해서 채우고,
	1) 배열 전체의 내용을 출력.
	2) "버블정렬 알고리즘"을 적용해서, 오름차순 정렬 후 출력.

 */
public class Q1106 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		while(true) {
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*9)+1;
			}
			boolean b = true;
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						b = false;
					}
				}
			}
			if(b) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
