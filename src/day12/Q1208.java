package day12;

import java.util.Arrays;

/*
 * Q1208. 크기가 20인 배열을 만들고 여기에 1과 100 사이의 정수를 20개 난수 발생하여 배열을 채워넣은 후, 1) 배열의 내용 모두를 출력하고 2) 이 배열에서 홀수만 출력해보세요.
	(실행결과)
	[40, 61, 47, 84, 66, 2, 18, 17, 25, 65, 31, 53, 64, 11, 9, 66, 88, 54, 28, 89]
	[61 47 17 25 65 31 53 11 9 89 ]
 */
public class Q1208 {
	public static void main(String[] args) {
		int[] arr = new int[20];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.print("]");
	}
}
