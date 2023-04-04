package day18;

import java.util.Arrays;

class Point {
	int x;
	int y;
//	Point() { }  // "디폴트생성자"(default constructor)
	Point(int p1, int p2) {
		x = p1;
		y = p2;
	}
	double dist(int x2, int y2) {
		// TODO : (x,y) ~ (x2,y2) 의 거리를 리턴.
		int dx = x2 - x;  // dx : x축방향의 거리
		int dy = y2 - y;  // dy : y축 방향의 거리
		
		return Math.sqrt(dx*dx + dy*dy); 
	}
}
public class Ex1802 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		//  ---> p1은 "참조변수인 동시에 지역변수"
		p1.x = 1;
		p1.y = 1;
		Point p2 = new Point(5, 4);
		p2.x = 5;
		p2.y = 4;
//		Point p3 = new Point(); 
		
		
		System.out.println("거리 : " + p1.dist(p2.x, p2.y));
		System.out.println("거리 : " + p2.dist(p1.x, p1.y));
		
//		// 기본값(default value)으로 초기화 확인:
//		System.out.println(p1.x + " " + p1.y);
//		System.out.println(p2.x + " " + p2.y);
//		
//		// 참고
//		int[] arr = new int[3];
//		System.out.println(Arrays.toString(arr));
		
	}
}
