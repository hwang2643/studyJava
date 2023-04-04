package day15;
//showAdd(5, 3);    // "5 + 3 = 8"
//showSub(5, 3); 	  // "5 - 3 = 2"
//showMul(3, 4);    // "3 * 4 = 12"
//showDiv(5, 4);    // "5 / 4 = 1.25"

public class Q1502 {
	static void ShowAdd(int a, int b) {
		System.out.println(a +" + "+b+" = "+(a+b) );
	}
	static void ShowSub(int a, int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	static void ShowMul(int a, int b) {
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	static void ShowDiv(int a, int b) {
		System.out.println(a + " / " + b + " = " + (double)a/b);
	}
	public static void main(String[] args) {
		ShowAdd(5, 3);
		ShowSub(5, 3);
		ShowMul(3, 4);
		ShowDiv(5, 4);
	}

}
