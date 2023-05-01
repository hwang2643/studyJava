package day21;

import java.util.Scanner;

//Q2106.	Triangle2 클래스 작성.
//- 인스턴스변수 : 알아서
//- 인스턴스메서드 : 알아서
//main()에서,
//- 키보드로부터 밑변, 높이의 값을 정수로 입력받아서,
//- Triangle2 객체를 생성할 때 이를 이용하여 초기 값을 셋팅.
//- Triangle2 객체의 인스턴스메서드 중 넓이를 '리턴'하는 메서드가 있어서 
//- 이를 이용하여 이 삼각형의 넓이를 "밑변이 ___, 높이가 ___인 삼각형의 넓이는 ___이다."의 형식으로 출력.

class Triangle2 {
	int width;
	int height;
	Triangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	double area() {
		return width*height;
	}
}

public class Q2106 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 : ");
		int w = sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		Triangle2 t = new Triangle2(w, h);
		System.out.println("밑변이" + t.width + ", 높이가 " + t.height + "인 삼각형의 넓이는" + t.area() + "이다.");
	}
}
