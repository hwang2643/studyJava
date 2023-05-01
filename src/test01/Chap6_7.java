package test01;

class MyPoint {
	int x;
	int y;
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		int w = x1 - x;
		int h = y1 - y;
		return Math.sqrt(w*w+h*h);
	}
}

public class Chap6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		// p와 의 거리를 구한다 (2,2) . 
		System.out.println(p.getDistance(2,2));
	}
}
