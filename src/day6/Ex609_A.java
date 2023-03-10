package day6;

public class Ex609_A {
	public static void main(String[] args) {
		for(int i = 2; i<=8; i+=3) {
			for(int j=1; j<=9; j++) {
				System.out.print(i + " * " + j + " = " + (i*j) + "\t");
				System.out.print((i+1) + " * " + j + " = " + ((i+1)*j) + "\t");
				if((i+2)<10) {
					System.out.print((i+2) + " * " + j + " = " + ((i+2)*j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
