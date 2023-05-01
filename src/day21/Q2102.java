package day21;

import java.util.Scanner;

class Triangle {
	int a;
	int b;
	Triangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	double area() {
		return (a*b)/2;
	}
}

public class Q2102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		int a = sc.nextInt();
		System.out.print("높이 : ");
		int b = sc.nextInt();
		Triangle t = new Triangle(a, b);
		System.out.println("밑변이 " + t.a + ", 높이가 " + t.b + "인 직각삼각형의 넓이는 " + t.area() + "입니다.");
	}
}
