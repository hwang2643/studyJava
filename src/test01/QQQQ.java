package test01;

import java.util.Arrays;

public class QQQQ {
	public static void main(String[] args) {
//		int[] arr = new int[100];
//		for(int i=0; i<=arr.length-1; i++) {
//			arr[i] = i+1;
//		}
//		System.out.print("[");
//		for(int i=1; i<=100; i++) {
//			int cnt = 0;
//			for(int j=2; j<=100; j++) {
//				if(i%j==0) {
//					cnt++;
//				}		
//			}
//			if(cnt==1) {
//				System.out.print(arr[i-1]);
//				if(i<97) {
//					System.out.print(", ");
//				}
//			}
//		}
//		System.out.println("]");
		
		// A
		// 배열의 사이즈 결정
		int size = 0;
		for(int loop=1; loop<=100; loop++) {
			int num = loop;
			int cnt = 0;
			for(int i=1; i <= num; i++) {
				if(num%i==0) {
					cnt++;
				}
			}
			if(cnt == 2) {
				size++;
			}
		}
		// 배열을 생성
		int[] arr = new int[size];
		// 1~100 소수를 배열에 담고\
		int idx = 0;  // 이번에 값이 들어갈 인덱스
		for(int loop=1; loop<=100; loop++) {
			int num = loop;
			int cnt = 0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				arr[idx++] = num;
			}
		}
		// 배열을 출력
		System.out.println(Arrays.toString(arr));
	}
}
