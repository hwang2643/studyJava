package day26;

class Point {
	private int x = 0;
	private int y = 0;
	public Point() {
		
	}
	public Point(int x, int y) {
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	public int[] getXY() {
		int[] array = {x, y};
		return array;
	}
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public double distance(int x, int y) {
		double nx = (x-this.x)*(x-this.x);
		double ny = (y-this.y)*(y-this.y);
		return Math.sqrt(nx+ny);
	}
	public double diatance(Point another) {
		double nx = (another.x-this.x)*(another.x-this.x);
		double ny = (another.y-this.y)*(another.y-this.y);
		return Math.sqrt(nx+ny);
	}
	public double distance() {
		return Math.sqrt((this.x*this.x)+(this.y*this.y));
	}
}

class Line {
	private Point begin;
	private Point end;
	public Line(int x1, int y1, int x2, int y2) {
			begin.setX(x1);
			begin.setY(y2);
			end.setX(x2);
			end.setY(y2);
	}
	public Line(Point begin, Point end) {
		this.begin = begin;
		this.end = end;
	}
	public Point getBegin() {
		return begin;
	}
	public void setBegin(Point begin) {
		this.begin = begin;
	}
	public Point getEnd() {
		return end;
	}
	public void setEnd(Point end) {
		this.end = end;
	}
	public int getBeginX() {
		return begin.getX();
	}
	public void setBeginX(int x) {
		begin.setX(x);
	}
	public int getBeginY() {
		return begin.getY();
	}
	public void setBeginY(int y) {
		begin.setY(y);
	}
	public int[] getBeginXY() {
		return begin.getXY();
	}
	public void setBeginXY(int x, int y) {
		begin.setXY(x, y);
	}
	public int getEndX() {
		return end.getX();
	}
	public void setEndX(int x) {
		end.setX(x);
	}
	public int getEndY() {
		return end.getY();
	}
	public void setEndY(int y) {
		end.setY(y);
	}
	public int[] getEndXY() {
		return end.getXY();
	}
	public void setEndXY(int x, int y) {
		end.setXY(x, y);
	}
	public String toString() {
		return "line[begin=(" + begin.getX() + "," + begin.getY() + "), end=(" + end.getX() + "," + end.getY() + ")]";
	}
	public double getLength() {
		double x = (begin.getX()-begin.getY())*(begin.getX()-begin.getY());
		double y = (end.getX()-end.getY())*(end.getX()-end.getY());
		return Math.sqrt(x+y);
	}
}

public class Q2608 {
	public static void main(String[] args) {
		
	}
}
