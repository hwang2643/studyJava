package day14;

import java.util.Arrays;

/*
 * 1) 만들어 출력
 * 	1 2 3
 * 	4 5 6
 * 	7 8 9
 * 2) 
 * 	[1, 2, 3]
 *  [4, 5, 6]
 *  [7, 8, 9]
 * 3)
 * 	모든 요소의 값을 10배(값을 변결)한 후 출력
 * 	[10, 20, 30]
 *  [40, 50, 60]
 *  [70, 80, 90]
 * 4)
 * 	모든 요소의 합 = 
 * 5)
 * 	모든 요소의 평균 =  
 * 
 */
public class Ex1403 {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		System.out.println("1)");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("2)");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println("3)");
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				arr[i][j] *= 10;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int sum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("4) 모든 요소의 합 = " + sum);
		
		double avg = (double)sum/(arr.length*arr[0].length);
		System.out.println("5) 모든 요소의 평균 = " + avg);
		
		int max = arr[0][0];
		int min = arr[0][0];
		for(int i=0; i<=arr.length-1; i++) {
			for(int j=0; j<=arr[i].length-1; j++) {
				if(arr[i][j]>max) {
					max = arr[i][j];
				}
				if(arr[i][j]<min) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("6) 최대 값 = " + max);
		System.out.println("7) 최소 값 = " + min);
		
		
	}
}
