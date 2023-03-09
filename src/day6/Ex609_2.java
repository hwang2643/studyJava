package day6;
/*
 * (실행결과) 구구단
 * 		2*1=2      3         4
 * 		2*2=4
 * 		2*3=6
 * 		...
 * 		2*9=8
 * 
 *		5          6         7
 *
 *      8          9 
 */
public class Ex609_2 {
	public static void main(String[] args) {
		for(int i = 1; i<=9; i++) {
			for(int j = 2; j <= 4; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i<=9; i++) {
			for(int j = 5; j <= 7; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 1; i<=9; i++) {
			for(int j = 8; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j*i + "\t");
			}
			System.out.println();
		}
	}
}
