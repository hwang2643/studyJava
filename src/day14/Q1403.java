package day14;

import java.util.Arrays;
import java.util.Scanner;
/*
 * arr1 : [1, 3, 2, 4, 5]
		  사용자로부터 입력받은 값을 네 번째 요소에 추가.
		  아래와 같은 실행결과가 되도록 코드를 채워보세요.
 * (실행결과)
		네 번째 요소에 추가할 숫자 입력 : 7 (엔터)
		arr2 : [1, 3, 2, 7, 4, 5]
		arr1 : [1, 3, 2, 7, 4, 5]
 */
public class Q1403 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr1 = {1, 3, 2, 4, 5};
		/* 여기에 코드를 작성 */
		int[] arr2 = new int[arr1.length+1];
		System.out.print("네 번째 요소에 추가할 숫자 입력 : ");
		int in = sc.nextInt();
		for(int i=0; i<=arr2.length-1; i++) {
			if(i<=2) {
				arr2[i] = arr1[i];
			}else if(i==3) {
				arr2[i] = in;
			}else {
				arr2[i] = arr1[i-1];
			}
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		/* 여기에 코드를 작성 */
		arr1 = new int[arr2.length];
		arr1 = arr2;
		System.out.println("arr1 : " + Arrays.toString(arr1));
	}
}
