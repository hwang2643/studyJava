package test01;

class Student {
	String name;
	int n1;
	int n2;
	int n3;
	int n4;
	int n5;
	Student(String name, int n1, int n2, int n3, int n4, int n5) {
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
	}
	String info() {
		int total = n3 + n4 + n5;
		float avg = (float)(n3 + n4 + n5)/3;
		return name+","+n1+","+n2+","+n3+","+n4+","+n5+","+total+","+String.format("%.1f", avg);
	}
}

public class Chap6_5 {
	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		System.out.println(s.info());
	}
}
