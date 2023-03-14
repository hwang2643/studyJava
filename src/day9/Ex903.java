package day9;

import java.util.Arrays;
import java.util.Scanner;

/*
 * (실행결과) 홀수만 입력 : 3
 * 			홀수만 입력 : 7
 * 			홀수만 입력 ; 12
 * 			짝수가 입력되었음! 끝!
 * 			지금까지 입력한 모든 홀수의 합 = 10
 * 			지금까지 입력한 모든 홀수의 합 : 3 + 7 = 10
 * 			---> 단, ArrayList 등의 사용금지 ---> 배열을 사용 
 */
public class Ex903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int[] arr = new int[1000];
		int index = 0;
		for(int i = 0; true; i++) {
			System.out.print("홀수만 입력 : ");
			int in = sc.nextInt();
			if(in%2==0) {
				System.out.print("짝수가 입력되었음! 끝!\n지금까지 입력한 모든 홀수의 합 : ");
				for(int j = 0; j<index; j++) {
					System.out.print(arr[j] + " ");
				}
				break;
			}
			arr[index] = in;
			index++;
			sum += in;
			
		}
		
		System.out.println(sum);
	}
}

