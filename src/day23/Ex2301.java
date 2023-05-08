package day23;

class A{
	void m() {
		System.out.println("부모-m");
	}
}
class B extends A{
	@Override
	void m() {
		//super.m();
		System.out.println("자식-m");
	}
	void m2() {
		//m();		---> 부모m? 자식m?
		super.m();//	---> 부모m? 자식m?
	}
}

public class Ex2301 {
	public static void main(String[] args) {
		B obj = new B();
		obj.m2();
		obj.m();
	}
}
