package day28;
// -class 앞에 'abstract' 키워드를.
// - '추상(abstract)' means '미완성'
// - 미완성설계도 --> 'new' 키워드의 사용이 불가능!
// - "extends 추상클래스"
// [고급] '부-자'의 상황에서 '부'의 역할을 할 수있다.
// 추상메서드가 있는 클래스는 '(완성된) 클래스' 일 수 없다. (O)
// 추상클래스는 추상메서드가 1개 이상있다. (x)
// 추상클래스를 상속받는 클래스에서는 반드시 추상메서드를 구현(body를 완성)해야 한다. ( )
abstract class AC1 {  // '추상클래스' : 미완성 내용(메서드)을 포함할 수 있음.
	void m1() { System.out.println("m1"); }
	abstract void m2();  // '추상메서드'
}
class B2 extends AC1 {
	@Override
	void m2() {
		System.out.println("m2.");
	}
}

public class Ex2802 {
	public static void main(String[] args) {
//		AC1 obj = new AC1();  // ERR. (이해)
		B2 obj = new B2();
		obj.m1();
		obj.m2();
	}
}
