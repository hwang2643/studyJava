package day27;

class A {
	int a = 10;
	void showA() {
		System.out.println("a : " + a);
	}
}
class B extends A {
	int b = 20;
	void showB() {
		System.out.println("b : " + b);
	}
}
class C extends A {
	int c = 30;
	void showC() {
		System.out.println("c : " + c);
	}
}
public class Ex2701 {
	public static void main(String[] args) {
		A obj = new B();  // 자(B)->부(A) 자동 형 변환 "upcasting"
//		obj.a = 200;
//		obj.showA();
//		((B)obj).b = 400;  // 부(A)->자(B) 강제 형 변환 "downcasting"
//		((B)obj).showB();
		
		// 안전한 코드로 만들기 위해, instanceof연산자를 사용.
		A obj2 = new C();
		// obj2가 B클래스로 형변환 될 수 있을까?
		if(obj2 instanceof B) {
			((B)obj2).b = 100;
			((B)obj2).showB();
		}
		
		A obj3 = new B();
		if(obj3 instanceof C) {
			((C)obj3).c = 10;  // ERR. 이렇게 쓸 일이 없으니까 막아놨음. B와 C는 전혀 연관(상속)관계가 없기 때문에
		}
		
		if(obj3 instanceof A) {
			obj3.showA();
		}
		
		
	}
}
