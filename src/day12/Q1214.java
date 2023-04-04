package day12;

import java.util.Arrays;

/*
 * Q1214. (고급) 크기가 10인 정수형 배열에 2 이상 100 이하의 정수 10개를 난수 발생하여 채우고 이 내용을 출력한 후, 이 배열의 모든 요소들을 ‘가까운 3의 배수’로 만든 배열의 내용을 출력해보세요.
	(실행결과)
	생성된 배열 : [59, 4, 82, 28, 98, 100, 37, 77, 19, 5]
	3의 배수로 조정된 배열 : [60, 3, 81, 27, 99, 99, 36, 78, 18, 6]

	(실행결과)
	생성된 배열 : [64, 31, 63, 62, 71, 11, 26, 99, 39, 13]
	3의 배수로 조정된 배열 : [63, 30, 63, 63, 72, 12, 27, 99, 39, 12]

	(실행결과)
	생성된 배열 : [12, 95, 70, 74, 67, 99, 12, 80, 95, 56]
	3의 배수로 조정된 배열 : [12, 96, 69, 75, 66, 99, 12, 81, 96, 57]
 */
public class Q1214 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = (int)(Math.random()*99)+2;
		}
		System.out.println("생성된 배열 : " + Arrays.toString(arr));
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%3!=0) {
				while(true) {
					arr[i] += 1;
					if(arr[i]%3!=0) {
						arr[i] -= 2;
						break;
					}
					break;
				}
			}
		}
		System.out.println("3의 배수로 조정된 배열 : " + Arrays.toString(arr));
		
	}
}
