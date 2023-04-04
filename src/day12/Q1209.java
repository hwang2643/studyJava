package day12;

import java.util.Arrays;

/*
 *Q1209. 다섯 과목의 점수를 난수발생(0점 ~ 100점. 단, 5의 배수일 것.)하여 크기가 5인 배열을 채우고 총점과 평균을 출력해보세요.
	(실행결과)
	생성된 점수 배열 : [80, 55, 90, 70, 45]
	총점 : 340점
	평균 : 68.0점 
 */
public class Q1209 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*21)*5;
		}
		System.out.println("생성된 점수 배열 : " + Arrays.toString(arr));
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		double avg = (double)sum/arr.length;
		System.out.println("총점 : " + sum + "점\n평균 : " + avg + "점");
	}
}
