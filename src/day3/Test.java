package day3;

public class Test {
	public static void main(String[] args) {
		int n = 125;
		String binary = Integer.toBinaryString(n);
		String octal = Integer.toOctalString(n);
		String hex = Integer.toHexString(n);
		
		System.out.println(binary);
		System.out.println(octal);
		System.out.println(hex);
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
			s16 = Integer.toString(h16) + s16;
			if(h16 == 10) {
				String a = "a";
				s16 = a + s16;;
			} else if(h16 == 11) {
				s16 = "b";
			} else if(h16 == 12) {
				s16 = "c";
			} else if(h16 == 13) {
				String d = "d";
				s16 = d + s16;
			} else if(h16 == 14) {
				s16 = "e";
			} else if(h16 == 15) {
				s16 = "f";
			} else {
				s16 = Integer.toString(h16) + s16;
			}
			if(tmp == 0) {
				break;
			}
		}
		String d = "d";
		s16 = d + s16;
		System.out.println("16진법 : " + h16);
		
		
		
		
	}

}
