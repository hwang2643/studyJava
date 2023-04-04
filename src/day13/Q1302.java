package day13;

import java.util.Arrays;

public class Q1302 {
	public static void main(String[] args) {
		int[] arr = new int[6];
		while(true) {
			for(int i=0; i<=arr.length-1; i++) {
				arr[i] = (int)(Math.random()*45) + 1;
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
		
		for(int i=0; i<=arr.length-2; i++) {
			for(int j=i+1; j<=arr.length-1; j++) {
				if(arr[i]>arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
