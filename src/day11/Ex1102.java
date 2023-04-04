package day11;

import java.util.Arrays;

public class Ex1102 {
	public static void main(String[] args) {
		int[] arr = new int[10];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = (i+1)*10;
//		}
		for(int i=1; i<=10; i++) {
			arr[i-1] = i*10;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("[");
			}
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(", ");
			}
			if(i==arr.length-1) {
				System.out.print("]");
			}
		}
		System.out.println();
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i]/10%10)%2==0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i]/10%10)%2==0) {
				arr[i] = -arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
