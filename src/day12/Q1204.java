package day12;

import java.util.Arrays;

/*
 * Q1204. 크기가 3인 정수형 배열을 만들고, 여기에 1 이상 5 이하의 정수를 난수 발생하여 채워넣습니다.
	그런 후에 ①이 배열을 출력하고 ②이 배열의 중앙값(median)을 출력해보세요.
	(실행결과)
		생성된 배열은 [1, 5, 3] 입니다.
		이 배열의 중앙값은 3 입니다.
	
	(실행결과)
		생성된 배열은 [7, 6, 2] 입니다.
		이 배열의 중앙값은 6 입니다.
 */
public class Q1204 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		while(true) {
			for(int i=0; i<=arr.length-1; i++) {
				arr[i] = (int)(Math.random()*5)+1;
			}
			boolean b = true;
			for(int i=0; i<=arr.length-2; i++) {
				for(int j=i+1; j<=arr.length-1; j++) {
					if(arr[i]==arr[j]) {
						b = false;
					}
				}
			}
			if(b) {
				break;
			}
		}
		System.out.println("생성된 배열은 " + Arrays.toString(arr) + " 입니다.");
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		int med = arr[arr.length/2];
		System.out.println("이 배열의 중앙값은 " + med + " 입니다.");
		
		
		
	}
}
