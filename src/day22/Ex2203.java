package day22;

class A2 {
	int a;
	void show() { System.out.println("a : " + a); }
}
class B2 extends A2 {
	int b;
//	void show2() {System.out.println("b : " + b); }
	@Override  // -------> '오버라이드 애노테이션'
	void show() {
		super.show();  // super --> 부모클래스의 객체
		System.out.println("a : " + a + ", b : " + b); 
	}
}

public class Ex2203 {
	public static void main(String[] args) {
		A2 obj1 = new A2();
		B2 obj2 = new B2();
		obj2.a = 10;
		obj2.b = 20;
		obj2.show();  // (이해) 부모클래스의. OR 자식클래스의 show() 실행?
//		obj2.show2();
		
		
		
	}
}
