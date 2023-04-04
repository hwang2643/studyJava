package day12;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Q1213. (고급) 정수 하나를 입력 받아서, 각 자릿수별로 ‘짝수인지’ 여부를 판단하여 boolean 타입의 배열을 채워서 아래와 같이 출력해보세요. 예를 들어, 697은 6이 짝수이고, 9와 7은 짝수가 아니므로 [true, false, false] 를 출력합니다.
	(실행결과)
	정수 입력 : 1443
	[false, true, true, false]

	(실행결과)
	정수 입력 : 1499207
	[false, true, false, false, true, true, false]

	(실행결과)
	정수 입력 : 697
	[true, false, false]
 */
public class Q1213 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		String s = sc.next();
		boolean[] b = new boolean[s.length()];
		for(int i=0; i<=b.length-1; i++) {
			if((s.charAt(i)-'0')%2==0) {
				b[i] = true;
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
