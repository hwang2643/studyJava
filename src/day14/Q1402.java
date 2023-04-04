package day14;

import java.util.Arrays;

/*
 * (실행결과)
		arr2 : [1, 3, 4, 5]
 */
public class Q1402 {
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int d = 2;   // 삭제할 요소의 인덱스번호
		/* 여기에 코드를 작성 */
		int[] arr2 = new int[4];
		int n = arr1.length;
		for(int i=0; i<=arr1.length-1; i++) {
			if(arr1[i] == d) {
				n = i;
				continue;
			}else if(i>n) {
				arr2[n] = arr1[i];
				n++;
			}else {
				arr2[i] = arr1[i];
			}
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
	}
}
