package day22;

// 객체지향 프로그래밍 언어의  4대 특성
class A {  // A : "부모클래스" / "상위클래스" / 기본(base)클래스
	void m1() {	}
	void m2() {	}
}

class B extends A{  // B : "자식클래스" / "하위클래스" / 파생(derived)클래스
//	void m1() {	}
//	void m2() {	}
	void m3() { }
}

public class Ex2201 {
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj.m2();
		B obj2 = new B();
		obj2.m1();
		obj2.m2();
		obj2.m3();
	}
}
