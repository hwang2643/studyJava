package day23;

// "왜 자바에서는, 부모클래스의 생성자가 실행(호출)되도록 할까?"
class A5{
	int num1;
	A5(int num1){
		this.num1 = num1;
	}
}
class B5 extends A5{
	int num2;
	B5(int num1,int num2){
		super(num1);
		this.num2 =num2;
	}
}

public class Ex2305 {
	public static void main(String[] args) {
		B5 obj = new B5(10,20);
	}
}
