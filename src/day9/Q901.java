package day9;

// 1부터 100 까지의 정수중 일의자리가 3 또는6 또는9 수를 출력
public class Q901 {
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
			if(i%10 != 3 && i%10 !=6 && i%10 !=9) {  // if(!(i%10==3 || i%10==6 || i%10==9))
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
