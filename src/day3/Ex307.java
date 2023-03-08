package day3;

public class Ex307 {
	public static void main(String[] args) {
		byte b1 = 127;  // 64+32+16+8+4+2+1
		byte b2 = 0b01111111;
		byte b3 = 0x7F;
		byte b4 = 0177;
		System.out.println(b1 + "," + b2 + "," + b3 + "," + b4);
		
		b4++;
		System.out.println(b4);  // -128
		
		
	}

}
