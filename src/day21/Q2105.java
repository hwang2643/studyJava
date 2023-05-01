package day21;

//Q2105.	Circle2 클래스 작성.
//- 인스턴스변수 : int radius;   // 반지름
//- 인스턴스메서드 : void setRadius(int r)  // 파라미터 r을 인스턴스변수 radius에 대입.
//		double getArea()     // 원의 넓이를 리턴
//main()에서,
//	Circle2 circle;
//	circle = new Circle();
//	circle.setRadius(10);   // 반지름을 10으로 셋팅.
//	sysout("원의 넓이 : " + circle.getArea());  // "원의 넓이 : 314..."

class Circle2 {
	int radius;
	void setRadius(int r) {
		this.radius = r;
	}
	double getArea() {
		return Math.PI*radius*radius;
	}
}

public class Q2105 {
	public static void main(String[] args) {
		Circle2 circle;
		circle = new Circle2();
		circle.setRadius(10);
		System.out.println("원의 넓이 : " + circle.getArea());
	}
}
