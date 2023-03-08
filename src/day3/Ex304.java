package day3;


public class Ex304 {
	public static void main(String[] args) {
		int num = 2_100_000_000;  // 2100000000(21억)
		System.out.println(num);
		
//		int num2 = 2_200_000_000;  // ERR. int 표현범위를 벗어남
		
//		long num3 = 2_200_000_000;  // ERR. (이해) 
		long num3 = 2_200_000_000L;   
		System.out.println(num3);
		
	}

}
