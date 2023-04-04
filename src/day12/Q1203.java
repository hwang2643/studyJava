package day12;

import java.util.Arrays;

/*
 * 	Q1203. 배열 [10, 20, 30, 40, 50] 을 (수업시간에 배운) 3가지 방법으로 각각 만들어 보고,
	① Arrays.toString() 을 이용해서 출력하고
	② 반복문을 사용해서 출력하고
	③ for-each문을 사용해서 출력해보세요.
 */
public class Q1203 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = (i+1)*10;
		}
		int[] arr2 = new int[] {10, 20, 30, 40, 50};
		int[] arr3 = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr1));
		System.out.print("[");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]);
			if(i<arr2.length-1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		int i = 0;
		System.out.print("[");
		for(int tmp : arr3) {
			System.out.print(tmp);
			if(i<arr3.length-1) {
				System.out.print(", ");
				i++;
			}
		}
		System.out.print("]");
	}
}
