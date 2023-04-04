package day12;

import java.util.Random;

/*
 * Q1206. (고급) 크기가 100,000인 배열을 생성하고 int의 표현범위 내의 값을 100,000개 난수 발생하여 이 배열을 채운 후 이 배열의 홀수와 짝수의 개수를 파악하여, 
 * ①홀수가 몇 개이고 이게 전체 중 몇 퍼센트에 해당하는지 ②짝수는 몇 개이고 이게 전체 중 몇 퍼센트에 해당하는지를 출력해보세요.
 */
public class Q1206 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[100000];
		for(int i=0; i<=arr.length-1; i++) {
			arr[i] = rd.nextInt();
		}
		int odd = 0;
		int even = 0;
		for(int i=0; i<=arr.length-1; i++) {
			if(arr[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
//		double oddP = (double)(int)(((double)odd/arr.length)*10000)/100;
		double oddP = (double)odd/(arr.length/100);
		double evenP = (double)even/(arr.length/100);
//		double evenP = (double)(int)(((double)even/arr.length)*10000)/100;
		System.out.println("홀수의 개수 : " + odd + " 배열 전체 중 홀수의 퍼센트 : " + oddP + "%");
		System.out.println("짝수의 개수 : " + even + " 배열 전체 중 짝수의 퍼센트 : " + evenP + "%");
	}
}
