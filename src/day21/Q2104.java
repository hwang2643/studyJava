package day21;

class Rectangle2 {
	int width;
	int  height;
	Rectangle2(int width, int height) {
		this.width = width;
		this.height = height;
	}
	void showWidth() {
		System.out.println("가로 : " + width);
	}
	void showHeight() {
		System.out.println("세로 : " + height);
	}
	void showArea() {
		System.out.println("넓이 : " + width*height);
	}
}

public class Q2104 {
	public static void main(String[] args) {
		Rectangle2 rect = new Rectangle2(10, 5);
		rect.showWidth();
		rect.showHeight();
		rect.showArea();
	}
}
