package day11;

import java.util.Arrays;

public class Q1101 {
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
		int asc = 0;
		int desc = 0;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					desc++;
				}else if(arr[i]<arr[j]) {
					asc++;
				}
			}
		}
		int sum = 0;
		for(int i=1; i<arr.length; i++) {
			sum += i;
		}
		if(desc==sum) {
			System.out.println("-> 내림차순O");
		}else if(asc==sum) {
			System.out.println("-> 오름차순O");
		}else {
			System.out.println("-> 오름차순X 내림차순X");
		}
		
	}
}
