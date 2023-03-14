package day9;

import java.util.Scanner;

/*숫자야구
 * 스캐너 사용시 문자열 입력  : 
 * Ex) String s = sc.next();  //520(엔터)
 *     s는 "520" (문자열임.)
 *     s.charAt(0) ---> '5'
 *     s.charAt(1) ---> '2'
 *     s.charAt(2) ---> '0'
 *     
 */
public class Q907 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char[] numArr = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		for(int i = 0; i<numArr.length; i++) {
			int ran = (char)(Math.random()*numArr.length);
			char tmp;
			tmp = numArr[i];
			numArr[i] = numArr[ran];
			numArr[ran] = tmp;
		}
		for(int i = 0; true; i++) {
			System.out.print("문자열 입력 : ");
			String s = sc.next();
			int strike = 0;
			int ball = 0;
			int out = 0;
			if(s.charAt(0)==numArr[0] || s.charAt(0)==numArr[1] || s.charAt(0)==numArr[2]) {
				if(s.charAt(0)==numArr[0]) {
					strike++;
				}
				else {
					ball++;
				}
			}
			else {
				out++;
			}
			if(s.charAt(1)==numArr[0] || s.charAt(1)==numArr[1] || s.charAt(1)==numArr[2]) {
				if(s.charAt(1)==numArr[1]) {
					strike++;
				}
				else {
					ball++;
				}
			}
			else {
				out++;
			}
			if(s.charAt(2)==numArr[0] || s.charAt(2)==numArr[1] || s.charAt(2)==numArr[2]) {
				if(s.charAt(2)==numArr[2]) {
					strike++;
				}
				else {
					ball++;
				}
			}
			else {
				out++;
			}
			System.out.println(strike + "스트라이크 " + ball + "볼 " + out + "아웃");
			if(strike == 3) {
				System.out.println("3스트라이크");
				break;
			}
		}
	}
}
