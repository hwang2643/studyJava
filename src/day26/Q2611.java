package day26;

class Point2D {
	private int x = 0;
	private int y = 0;
	public Point2D() {
		
	}
	public Point2D(int x , int y) {
		this.x = x;
		this.y = y;
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
		return "{" + x + "," + y + ")";
	}
}
class Point3D extends Point2D{
	private int z = 0;
	public Point3D() {
		
	}
	public Point3D(int x, int y, int z) {
		super.setX(x);
		super.setY(y);
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public void setX(int z) {
		this.z = z;
	}
	public String toString() {
		return "(" + super.getX() + "," + super.getY() + "," + z + ")";
 	}
}
public class Q2611 {
	public static void main(String[] args) {
		
	}
}
