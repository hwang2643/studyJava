package day26;

class A4 {
	int num;
	void showNum() {
		System.out.println("num : " + num);
	}
}
class B4 extends A4 {
	int num2;
	void showNum2() {
		System.out.println("num2 : " + num2);
	}
}

public class Ex2602 {
	public static void main(String[] args) {
		A4 obj = new B4();  // 다형성
		obj.num = 100;
		obj.showNum();
		((B4)obj).num2 = 200;
		((B4)obj).showNum2();
		// 업캐스팅은 자동으로 되지만, 다운캐스팅은 자동으로 안 된다.
		
		
//		B4 obj2 = new A4();  // X
//		obj2.num = 10;
//		obj2.num2 = 20;  // X
//		obj2.showNum();
//		obj2.showNum2();  // X
		
		
	}
}
