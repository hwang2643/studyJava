package day26;

import java.util.Scanner;

//클래스 Rect를 아래와 같이 정의하세요.
//- 변수 : int w(밑변), int h(높이)
//- 메서드 : int area()   // (사각형의) 넓이를 리턴.
//
//main():
//- Scanner 객체 생성해서, 밑변과 높이를 입력 받고,
//- Rect 객체를 생성해서,
//- area() 호출해서 출력: "사각형의 넓이 : ___"

class Rect {
	int w;
	int h;
	Rect(int w, int h) {
		this.w = w;
		this.h = h;
	}
	int area() {
		return w*h;
	}
}
public class Q2601 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("밑변 입력 : ");
		int w = sc.nextInt();
		System.out.print("높이 입려 : ");
		int h = sc.nextInt();
		Rect rect = new Rect(w, h);
		System.out.println("사각형의 넓이 : " + rect.area());
		
	}

}
