package day15;

public class Q1501 {
	static void printstar(int a, char b) {
		for(int i = 0; i<a; i++) {
			System.out.print(b);			
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printstar(4,'*');
		printstar(6,'*');
	}
}
