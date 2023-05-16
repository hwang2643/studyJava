package day30;  // package 선언. = 이 파일이 속한 패키지를 명시. (첫줄에)

import java.util.Scanner;  // import 선언.
// java.lang.* --> 자동으로 껴들어가는 문장

public class Ex3001 {
	static void m() throws ArrayIndexOutOfBoundsException {
		int[] arr = new int[3];
			arr[1] = 10;
			arr[2] = 20;
			arr[3] = 30;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("m() 호출 전.");
			m();
			System.out.println("m() 호출 후.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("!");
		} catch(NullPointerException e) {
			System.out.println("n");
		} catch(ClassCastException e) {
			System.out.println("c");
		} catch (Exception e) {
			System.out.println("안전빵");
		}
		System.out.println("실행 끝.");
	}
}
