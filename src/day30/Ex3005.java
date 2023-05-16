package day30;

public class Ex3005 {
	public static void main(String[] args) {
		try {
			int a = 5;
			int b = 0;
			System.out.println(a+"를 "+b+"로 나누면: "+(a/b));
		} catch(ArithmeticException e) {
			e.printStackTrace();  // 내가 '빨간글' 띄움.
			System.out.println(e.getMessage());
		} finally {  // (마지막으로 "무조건" 실행하는 영역)
			System.out.println("finally");
		}
		System.out.println("실행 끝.");
	}
}
