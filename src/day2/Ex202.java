package day2;


// 자동 형변환 규칙 : b -> s -> int -> l -> f -> double
public class Ex202 {

	public static void main(String[] args) {
//		int n = 5.5;  // ERR
		double n2 = 5;
		// --> double n2 = 5.0; 으로 먼저 변환되어 실행됨!
	}

}
