package day5;

import java.util.Scanner;

// 알파벳 하나 입력받고 대문자 여부 출력
// (참고) 문자 입력 --------> String s = sc.next();, char c = s.charAt(0);
// Ex) A (엔터) -------> 변수 C에는 'A'에 해당 하는 65가 저장되어 있음
// (실행결과) 알파벳 입력 : A
// 			  A는 대문자임
//(고급화) --> 알파벳을 입력하지 않았으면 알파벳을 입력할 때까지 반복해서 입력받도록 하세요
public class Q504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; true; i++) {
			System.out.print("알파벳 입력 : ");
			String s = sc.next();
			char c = s.charAt(0);
			
			if(c>='A' && c<='Z') {
				System.out.println(c + "는 대문자임");
				break;
			} else if(c>='a' && c<='z'){
				System.out.println(c + "는 소문자임");
				break;
			} else {
				System.out.println("알파벳을 입력하세요");
			}
		
		}
		
	}
}
