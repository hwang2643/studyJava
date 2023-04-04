package day10;

import java.util.Arrays;

public class Ex1005 {
	public static void main(String[] args) {
		int[] arr;  // 'int형 배열'을 가리킬 변수 arr을 선언
		arr = new int[3];  // 크기가 3인 'int형 배열'을 생성해서 변수 arr과 연결함
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		// 출력 Don't
		System.out.println(arr);
		
		// 출력1. Array.toString(배열이름)
		System.out.println(Arrays.toString(arr));
		
		// 출력2. for문 : i에 인덱스.
		for(int i = 0; i<=2; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		// 출력3. '향상된 for문'("for-each문")
		// for(변수선언 : 집단)
		for(int element : arr) {
			System.out.print(element + " ");
		}
	}
}
