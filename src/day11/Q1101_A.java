package day11;

import java.util.Arrays;

public class Q1101_A {
	public static void main(String[] args) {
		int[] arr = new int[4];
		while(true) {
			for(int i=0; i<arr.length; i++) {
				arr[i] = (int)(Math.random()*10)+1;
			}
			boolean b = true;
			for(int i=0; i<arr.length-1; i++) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i]==arr[j]) {
						b = false;
					}
				}
			}
			if(b) {
				break;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		boolean asc = true;
		boolean desc = true;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				asc = false;
			}
			if(arr[i]<arr[i+1]) {
				desc = false;
			}
		}
		if(asc) {
			System.out.println("오름차순O");
		}else if(desc) {
			System.out.println("내림차순X");
		}else {
			System.out.println("오름차순X 내림차순X");
		}
		
		
	}
}
