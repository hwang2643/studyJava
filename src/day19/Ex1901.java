package day19;

class Point {
	int x, y;
	Point(int x, int y){
		this.x = x;  // "this" : "객체 자기자신(의 참조 값)"
		this.y = y;
	}
	void showInfo() {
		System.out.println("점(" + x + ", " + y + ") 객체입니다.");
	}
}

public class Ex1901 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		p1.showInfo();
	}
}
