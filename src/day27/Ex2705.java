package day27;

class A5 {
	private int num = 111;
	void m() {
		System.out.println(num);
	}
}
class B5 extends A5 {
	void showNum() {
//		System.out.println(num);
		m();
	}
}
public class Ex2705 {
	public static void main(String[] args) {
		B5 obj = new B5();
		obj.m();
	}
}