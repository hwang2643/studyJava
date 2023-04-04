package day16;

import java.util.Arrays;

//고급. Q1611) [파라미터로 int형 배열을 전달 받아서,
//   	     모든 요소를 절대 값(absolute value)으로 만들어주는 메서드]
//   	-10 ~ +10 사이의 정수 5개(난수 발생)를 배열에 담아서,
//   	아래와 같이 출력.
//   	(실행결과) 배열 = [-8, 5, -2, -1, 7]
//   		 배열 = [8, 5, 2, 1, 7]
//   	(main메서드)	...
//   			showArray(arr); //배열 = [-8, 5, -2, -1, 7]
//   			toAbsolute(arr);
//   			showArray(arr); // 배열 = [8, 5, 2, 1, 7]
public class Q1611 {
	static void showArray(int arr[]) {
		System.out.println(Arrays.toString(arr));
	}
	
	static int[] toAbsolute(int arr[]) {
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]<0) {
				arr[i] = -arr[i];
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*21)-10;
		}
		showArray(arr);
		toAbsolute(arr);
		showArray(arr);
		
	}
}
