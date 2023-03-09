package day3;

public class Test {
	public static void main(String[] args) {
		int n = 552;
		String binary = Integer.toBinaryString(n);
		String octal = Integer.toOctalString(n);
		String hex = Integer.toHexString(n);
		
		System.out.println(binary);
		System.out.println(octal);
//		System.out.printf("%o\n", n);  // 8진법 출력문
		System.out.println(hex);
//		System.out.printf("%x\n", n);  // 16진법 출력문
		int tmp = n;
		int b2 = 0;
		int o8 = 0;
		int h16 = 0;
		String s2 = "";
		String s8 = "";
		String s16 = "";
		// 2진법 출력 코드
		for(int i = 0; true; i++) {
			b2 = tmp%2;
			tmp/= 2;
			s2 = Integer.toString(b2) + s2;
			if(tmp == 0) {
				break;
			}
		}
		System.out.println("2진법 : " + s2);
		// 8진법 출력 코드
		tmp = n;
		for(int i = 0; true; i++) {
			o8 = tmp%8;
			tmp /= 8;
			s8 = Integer.toString(o8) + s8;
			if(tmp == 0) {
				break;
			}
		}
		System.out.println("8진법 : " + s8);
		// 16진법 출력 코드
		tmp = n;
		for(int i = 0; true; i++) {
			h16 = tmp%16;
			tmp /= 16;
			if(s16.equals("10")) {
				s16 = Integer.toString(h16) + "a";
			} else if(s16.equals("11")) {
				s16 = Integer.toString(h16) + "b"; 
			} else if(s16.equals("12")) {
				s16 = Integer.toString(h16) + "c";
			} else if(s16.equals("13")) {
				s16 = Integer.toString(h16) + "d";
			} else if(s16.equals("14")) {
				s16 = Integer.toString(h16) + "e";
			} else {
				s16 = Integer.toString(h16) + s16;
			}
			if(tmp == 0) {
				break;
			}
		}
		System.out.println("16진법 : " + s16);
		
		
		
		
	}

}
