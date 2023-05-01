package day20;

public class Ex2002 {
	public static void main(String[] args) {
		String s1 = "정처산기";
		String s2 = "웹개발";
		System.out.println(s1 + s2);  // '문자열의 결합'(Concatenation)
		
		String s3 = "웹";  // 문자열 리터럴 --> 문자열 객체 생성.
		String s4 = "웹";  // '경제성'을 고려해 --> 새롭게 생성하지 않음 : 이해.
		s3 = "WEB";
		
		String s5 = new String("웹");
		System.out.println(s5 );
		System.out.println(s4.equals(s5));  // 문자열 동등 비교 : .equals
		System.out.println(s4 == s5);  // 참조값의 비교임
		
	}
}
