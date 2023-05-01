package day20;

class Point {
	int x, y;  // 인스턴스변수
	static int cnt;  // 변수선언 앞에 'static' ---> "클래스변수"
	Point(int x, int y) {
		this.x = x;
		this.y = y;
		cnt++;
	}
	double dist(Point p2) {  // 인스턴스메서드
		int dx = x - p2.x;
		int dy = y - p2.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	static void showCnt() {  // 리턴타입 앞에 'static' ---> "클래스메서드"
		System.out.println("지금까지 생성된 쩜 객체의 수 : " + cnt);
	}
	
}
 
public class Ex2004 {
	public static void main(String[] args) {  // static -> "클래스" 메서드
		Point.showCnt();  // 클래스메서드 호출 ---> "클래스이름." 으로.
		Point p1 = new Point(1,1);
		Point.showCnt();  // 클래스메서드 호출 ---> "클래스이름." 으로.
		Point p2 = new Point(5,4);
		System.out.println("두 정수 사이의 거리 : " + p1.dist(p2));
		Point.showCnt();  // 클래스메서드 호출 ---> "클래스이름." 으로.
		
		
	}
}
