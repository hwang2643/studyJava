package day14;

import java.util.Arrays;

public class Ex1401 {
	public static void main(String[] args) {
		int[] arr = {3, 4, -1, 2, 5};
		for(int n : arr) {
			if(n<0) {
				n = -n;
			}
		}
		System.out.println(Arrays.toString(arr));

		
	}
}
