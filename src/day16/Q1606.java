package day16;

//Q1606) isPrime 메서드를 정의.
//- 파라미터 : 정수 1개.
//- 리턴 : true(소수인 경우) / false(소수가 아닌 경우)
//main():
//- for(int i=1; i<=100; i++) {
//-    if(isPrime(i)) 
//-        System.out.print(i + " ");
//- }
public class Q1606 {
	static boolean isPrime(int n) {
		int cnt = 0;
		boolean b = true;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				cnt++;
			}
		}
		if(cnt==2) {
			return b;
		}
		return false;
	}
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
