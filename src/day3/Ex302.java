package day3;

public class Ex302 {
	public static void main(String[] args) {
		byte b = 3;
		short s = b;  // 자동 형 변환 O : byte -> short
		int i = s;  // 자동 형 변환 O : short -> int
		long lo = i;  // int -> long
		float f = lo;  // long -> float(정수 -> 실수) ".0"
		double d = f;  // float -> double
		
		System.out.println(d);  // 3.0
		
		char ch = 'A';
		System.out.println(ch);
		char ch2 = 65;				// "아스키 코드표"
		System.out.println(ch2);
		int i2 = ch;  // 자동 형 변환 O : char -> int
		System.out.println(i2);  // 65
		
		
//		char ch3 = 'ABC';  // ERR.
//		char ch4 = '';  // ERR.
		// (참고)
		String s3 = "ABC";
		String s4 = "";  // '빈(empty) 문자열'
		
		byte b2 = 65;
//		char ch5 = b2;  // 자동 형 변환 X
		
		System.out.println(d);
		int num = (int)d;  // 강제 형 변환. (주의 : 변수의 타입이 바뀌는 게 아님!)
		System.out.println(num);
		
		int num2 = (int)d * 3;
		int num3 = (int)(d * 3);
		
		
		
		
	}

}
