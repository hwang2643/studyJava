package day23;
//생성자에서 다른 생성자를 호출하는 코드는 반드시 첫 번째 줄을 실행해야함
class A3{
	A3(){
		System.out.println("A3생성자 실행됨");
	}
}
class B3 extends A3{
	B3(){			//자식클래스 생성자에서는 반드시 부모클래스의 생성자를 호출함
		super();
		System.out.println("B3생성자 실행됨");
	}
}

public class Ex2303 {
	public static void main(String[] args) {
		B3 obj = new B3();
		
		
	}
}
