package day12;

import java.util.Arrays;

/*
 *Q1211. 크기가 10인 정수형 배열을 만들고 난수발생(51~100 사이의 정수)해서 배열을 채운 후, 1) 이 배열의 내용을 출력하고 2) 이 배열의 최대 값과 최소 값의 차이를 출력.
	(실행결과)
	생성된 배열 : [90, 73, 60, 63, 94, 88, 93, 66, 73, 93]
	최대값 - 최소값 = 94 - 60 = 34 
 */
public class Q1211 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+51;
		}
		System.out.println("셍성된 배열 : " + Arrays.toString(arr));
		int max = arr[0];
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대 값 - 최소 값 = " + max + " - " + min + " = " + (max-min));
	}
}
