package day4;

public class Ex403 {
	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = 'A';
		System.out.println(c1==c2);  // 같으면 true, 다르면 false
		
		String s1 = "a";
		String s2 = "A";
		// System.out.println(s1==s2);  // 주의! 절대 이렇게 하지 마세요!!
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		
		// [암기]
		int n = Integer.parseInt("100");  // 문자열 "100"을 int타입에 대입
		System.out.println(n);  // 100
	}

}
