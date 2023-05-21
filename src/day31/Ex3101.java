package day31;

class Point {
	int x, y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Line {
	Point p1;
	Point p2;
	Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	Line() {};
	@Override
	public String toString() {
		return "Line객체 : [("+p1.x+","+p1.y+") ~ ("+p2.x+","+p2.y+")]";
	}
}
public class Ex3101 {
	public static void main(String[] args) {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(5, 4);
		Line obj = new Line(p1, p2);
		Line obj2 = new Line();
//		obj2.p1 = obj.p1;  // Shallow-Copy
//		obj2.p2 = obj.p2;  // Shallow-Copy
		obj2.p1 = new Point(obj.p1.x, obj.p1.y);  // Deep-Copy
		obj2.p2 = new Point(obj.p2.x, obj.p2.y);  // Deep-Copy
		
		System.out.println("값을 변경하기 전");
		System.out.println(obj);
		System.out.println(obj2);
		
		obj2.p1.x = 11;
		obj2.p1.y = 11;
		obj2.p2.x = 15;
		obj2.p2.y = 14;
		
		System.out.println("값을 변경하기 후");
		System.out.println(obj);
		System.out.println(obj2);
		
	}
}
