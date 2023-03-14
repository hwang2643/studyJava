package day9;

//  ★피보나치 수열(분석 중요)
public class Ex905 {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		System.out.print(a + " ");  // 첫 번째 항 출력
		System.out.print(b + " ");  // 두 번째 항 출력
		for(int i = 1; i<=8; i++) {
			int c = a + b;
			System.out.print(c + " ");  // 세 번째 항 부터 출력
			a = b;
			b = c;
		}
	}
}

