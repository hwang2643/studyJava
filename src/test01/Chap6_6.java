package test01;

public class Chap6_6 {
	static double getDistance(int x, int y, int x1, int y1) {
		int w = x1 - x;
		int h = y1 - y;
		return Math.sqrt(w*w+h*h);
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));

	}
}
