package day16;

import java.util.Arrays;
import java.util.Scanner;

//고급. Q1612) [파라미터로 int형 배열(a)과 int값(b)을 받아서,
//   	     이 배열의 끝에 b를 추가해주는 메서드]
//   	(실행결과) 배열 = [10, 20, 30] ---> showArray(arr);
//   		 추가할 정수 : 45 (엔터)
//   		 메서드 호출 후, 배열 = [10, 20, 30, 45]
//   				---> sysout("메서드 호출 후, ");
//   				     showArray(arr);
public class Q1612 {
	static int[] addNum(int[] a, int b) {
		int[] newArr = new int[a.length+1];
		for(int i=0; i<=a.length-1; i++) {
			newArr[i] = a[i];
		}
		newArr[newArr.length-1] = b;
		return newArr;
	}
	static void showArray(int[] arr) {
		System.out.println("배열 = " + Arrays.toString(arr));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (i+1)*10;
		}
		showArray(arr);
		System.out.print("추가할 정수 : ");
		int in = sc.nextInt();
		arr = addNum(arr, in);
		System.out.print("메서드 호출 후, ");
		showArray(arr);
	}
}
