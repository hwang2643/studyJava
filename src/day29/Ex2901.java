package day29;

class A {  // --> "외부클래스(Outer Class)"
	private int num = 10;
	class B {  // --> "중첩클래스(Nested Class)" 중에서 "내부클래스(Inner Class)"
		void showNum() {
			System.out.println("num : " + num);
		}
	}
}
public class Ex2901 {
	public static void main(String[] args) {
		A a = new A();
		A.B obj = a.new B();  // ★(기억)
		obj.showNum();
	}
}
