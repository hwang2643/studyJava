package day8;

public class Q804 {
	public static void main(String[] args) {
		int num = 7;
		int cnt = 0;
		for(int i = 2; i<=num-1; i++) {
			if(num%i != 0) {
				cnt++;
			}
		}
		if(cnt == (num-2)) {
			System.out.println(" 중에서 나누어 떨어지는 수가 없으므로\n--->"+num + "은 소수(prime number)");
		}else {
			System.out.println(num + "은(는) 소수(prime number)가 아님");
		}
	}
}
