package day4;

import java.util.Scanner;
// 자동 임포트 [Crtl] + [Shift] + [O]

// 화씨온도 -> 섭씨온도 공식 : C = 5 / 9 X ( F - 32 )
public class Ex401 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // "스캐너 객체 생성" 문장
		System.out.print("화씨 온도를 입력하세요 : ");
		int f = sc.nextInt();  // 스캐너 객체 이용해서 정수 값 입력
		
		// 화씨 100도 -> 섭씨_______도 
		float c = 5.0f / 9 * (f - 32);  // 5.0f 라고 안하면 0이 나옴
		c *= 10;
		c = (int)c;
		c = (float)c/10;
		System.out.println("화씨 " + f +"도 -> 섭씨 " + c + "도");
		
		
	}
}
