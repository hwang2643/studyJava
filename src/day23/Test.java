package day23;

class A6{
	int a=10;
}
class B6 extends A6{
	int a=20;
	void m() {
		System.out.println(a);			//20
		System.out.println(this.a);		//20
		System.out.println(super.a);	//10
	}
}

public class Test {
	public static void main(String[] args) {
		B6 obj = new B6();
		obj.m();
		//참조변수의 타입따라
		A6 obj2 =new B6();
		System.out.println(obj.a);	//20
		System.out.println(obj2.a); //10
	}
}
