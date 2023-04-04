package day16;

import java.util.Arrays;

//Q1605) max4 메서드를 정의.
//- 파라미터 : 정수형 배열.
//- 리턴 : 배열의 요소들 중 최대 값을 리턴.
//main():
//- 난수발생(1~9) 4개의 정수 ---> 정수형 배열(size:4)에 채워주세요.
//- sysout( max4(arr) );
public class Q1605 {
	static int max4(int arr[]) {
		int max = arr[0];
		for(int i=0; i<=arr.length-1; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int size = 4;
		int[]  arr = new int[size];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*9)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(max4(arr));
		
	}
}
