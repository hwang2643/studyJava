package day10;

import java.util.Arrays;

/*
 * 1) String[] arr;
 * 2) arr = new String[3];
 * 3) arr[0] = "YG";. . .
 * 4) 출력, 3가지 방법중 하나로.
 * 
 * (실행결과)[이름, 이름, 이름]
 */
public class Q1006 {
	public static void main(String[] args) {
		String[] arr;
		arr = new String[] {"남태원", "김하진", "최진혁", "황재웅"};
//		arr[0] = "남태원";
//		arr[1] = "김하진";
//		arr[2] = "최진혁";
//		arr[3] = "황재웅";
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				System.out.print("[");
			}
			System.out.print(arr[i]);
			if(i<=arr.length-i) {
				System.out.print(", ");
			}
			if(i==arr.length-1) {
				System.out.print("]");
			}
			
		}
		
		System.out.println();
		
		for(String tmp : arr) {
			if(tmp.equals(arr[0])) {
				System.out.print("[");
			}
			System.out.print(tmp);
			for(int i = 0; i<arr.length-1; i++) {
				if(tmp.equals(arr[i])) {
					System.out.print(", ");
				}
			}
			if(tmp.equals(arr[arr.length-1])) {
				System.out.print("]");
			}
		}
	}
}
