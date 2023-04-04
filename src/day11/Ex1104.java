package day11;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1104 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목수 입력 : ");
		int in = sc.nextInt();
		int[] arr = new int[in];
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("점수" + (i+1) + " : ");
			int score = sc.nextInt();
			arr[i] = score;
			sum += arr[i];
		}
		System.out.println("-> 입력한 점수 : " + Arrays.toString(arr));
		System.out.println("-> 총점 : " + sum + "점");
		System.out.println("-> 평균 : " + (sum/arr.length) + "점");
	}
}
