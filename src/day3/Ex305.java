package day3;

public class Ex305 {
	public static void main(String[] args) {
		byte b = 3;
		byte b2 = 5;
//		byte b3 = (b + b2);  // ERR.
		byte b3 = (byte)(b + b2);  // 강제 형 변환이 필요하다.(이해)
		System.out.println(b3);
		
		char ch = 'A';
		char ch2 = (char)(ch + 32);  // 강제 형 변환 필요
		System.out.println(ch2);  // 'a'
		
	}

}
