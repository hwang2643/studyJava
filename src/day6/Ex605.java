package day6;
/*
 * 1~100 까지의 정수들 중에서 짝수만 출력
 */
public class Ex605 {
	public static void main(String[] args) {
		//1.
		for(int i = 1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//2. 
		for(int i = 1; i<=100; i++) {
			if(i%2==0 || i%3==0 || i%7==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//3.
		for(int i = 1; i<=100; i++) {
			if(i%10==6) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		//4.
		for(int i = 1; i<=100; i++) {
			if(i/10%10 == i%10) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
	}

}
