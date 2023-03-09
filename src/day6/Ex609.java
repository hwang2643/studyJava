package day6;

import java.util.Scanner;

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
public class Ex609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int i;
		for(i = 1; n<=30; i++, n++) {
			int j;
			if(n >=0 && n<9) {
				for(j = 2; j<=4; j++) {
					System.out.print(j + " * " + i + " = " + (j*i) + "\t");
				}
				System.out.println();
			} else if(n==9) System.out.println(); 
			else if(n >= 10 && n<19) {
				int i2 = i - 10;
				for(j = 5; j<=7; j++) {
					System.out.print(j + " * " + i2 + " = " + (j*i2) + "\t");
				}
				System.out.println();
			} else if(n == 19) System.out.println(); 
			else if(n >= 19 && n<29) {
				int i3 = i - 20;
				for(j = 8; j<=9; j++) {
					System.out.print(j + " * " + i3 + " = " + (j*i3) + "\t");
				}
				System.out.println();
			}
			
		}
	}
}
