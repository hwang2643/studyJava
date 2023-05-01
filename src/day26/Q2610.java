package day26;

class Circle2 {
	private double radius = 1.0;
	private String color = "red";
	public Circle2() {
		
	}
	public Circle2(double radius) {
		this.radius  = radius;
	}
	public Circle2(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		return "";
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
}
class Cylinder extends Circle2 {
	private double height = 1.0;
	public Cylinder() {
		
	}
	public Cylinder(double height) {
		this.height = height;
	}
	public Cylinder(double height, double radius) {
		super.setRadius(radius);
		this.height = height;
	}
	public Cylinder(double height, double radius, String color) {
		this.height = height;
		super.setRadius(radius);
		super.setColor(color);
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String toString() {
		return "";
	}
	public double getVolume() {
		return super.getArea()*height;
	}
}
public class Q2610 {
	public static void main(String[] args) {
		
	}
}
