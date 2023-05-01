package day21;

import java.util.Scanner;

class Circle {
	int r;
	Circle(int r) {
		this.r = r;
	}
	double area() {
		return Math.PI*r*r;
	}
}

public class Q2101Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 : ");
		int in = sc.nextInt();
		Circle c = new Circle(in);
		System.out.println("반지름이 " + c.r + "인 원의 넓이는 " + c.area() + "입니다.");
		
	}
}
