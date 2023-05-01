package day26;

import java.util.Scanner;

//클래스 Triangle을 정의해보세요.
//- 인스턴스변수 및 인스턴스메서드 : 알아서.
//키보드로부터 밑변, 높이의 값을 정수로 입력 받아서, Triangle 객체를 생성하세요.
//Triangle 객체 생성시 호출된 생성자에서 이 두 값들(밑변, 높이)을 파라미터로 받아서 두 변수(밑변, 높이)의 값을 셋팅하고, Triangle 객체에 삼각형의 넓이를 리턴하는 인스턴스메서드를 만들고, main()에서 이 메서드를 호출하여 삼각형의 넓이를 출력해보세요.
//
//(실행결과의 예)
//	삼각형의 밑변 입력 : 5 (엔터)
//	삼각형의 높이 입력 : 20 (엔터)
//	밑변이 5, 높이가 20인 삼각형의 넓이는 50.0입니다.
class Triangle {
	int w;
	int h;
	Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	double tArea() {
		double tArea = (w*h)/2;
		return (int)tArea;
	}
}
public class Q2605 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 밑변 입력 : ");
		int w = sc.nextInt();
		System.out.print("삼각형의 높이 입력 : ");
		int h = sc.nextInt();
		Triangle t = new Triangle(w, h);
		System.out.println("밑변이 " + t.w + ", 높이가 " + t.h + "인 삼각형의 넓이는 " + t.tArea() + "입니다.");
		
	}
}
