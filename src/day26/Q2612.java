package day26;

import java.util.Arrays;

class Person{
	private String name;
	private String address;
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return name + "(" + address + ")";
	}
}
class Student extends Person {
	private int numCourses = 0;
	private String[] courses = new String[30];
	private int[] grades = new int[30];
	public Student(String name, String address) {
		super(name, address);
	}
	public void addCourseGrade(String[] course, int[] grade) {
		this.courses = course;
		this.grades = grade;
	}
	public void printGrades() {
		System.out.println(Arrays.toString(grades));
	}
	public double getAverageGrade() {
		int sum = 0;
		for(int i=0; i<=grades.length-1; i++) {
			sum += grades[i];
		}
		double avg = (double)sum/grades.length;
		return avg;
	}
	public String toString() {
		return "Student: " + super.getName() + "(" + super.getAddress() + ")";
	}
}
class Teacher extends Person{
	private int numCourses = 0;
	private String[] courses = new String[5];
	public Teacher(String name, String address) {
		super(name, address);
	}
	public boolean addCourse(String course) {
		boolean b = true;
		for(int i=0; i<=courses.length-1; i++) {
			if(course.equals(courses[i])) {
				b =  false;
			}
		}
		return b;
	}
	public boolean removeCourse(String course) {
		boolean b = true;
		for(int i=0; i<=courses.length-1; i++) {
			if(course.equals(courses[i])) {
				b = false;
			}
		}
		return b;
	}
	public String toString() {
		return "Teacher : " + super.getName() + "(" + super.getAddress() + ")";
	}
	
}
public class Q2612 {
	public static void main(String[] args) {
		
	}
}
