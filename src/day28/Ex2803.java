package day28;
// 인터페이스(interface)
// - class 라는 키워드 대신에 interface 키워드 사용.
//		Ex) interface Inter1 { ... }
// - "본질" + 확장(JDK 1.8)
// - 본질 : 상수(public static final) + 추상메서드(public abstract)의 조합.
// (extends 대신) 'implements'
// [고급] '父-子'의 상황에서 '父'의 역할을 할 수있다.
// Ex) 2804
// - 인터페이스의 확장 :
//		1) 디폴트메서드 : 이 인터페이스를 구현한 클래스로 객체 생성시 기본적으로 껴들어가는 메서드.
//		2) 스태틱메서드 : static 키워드 붙었음.
// Ex)2805
// 1) 인터페이스가 인터페이스 상속 가능
// 2) 다중구현 됨. (자바에서는 클래스 다중상속은 안됨)
//				cf. 인터페이스의 다중상속은 됨.
interface Inter1 {
	int num = 5;  // 변수 ---> 사실은, 상수.(public static final 강제됨)
	void showNum(); // 사실은, 추상메서드.(public abstract 강제됨)
}
class AAAA implements Inter1 {
	@Override
	public void showNum() {
		System.out.println(num);
	}
}

public class Ex2803 {
	public static void main(String[] args) {
		System.out.println(Inter1.num);  // 5 -> static 확인
//		Inter1.num = 10;  // ERR. -> final 확인
		AAAA obj = new AAAA();
		obj.showNum();
	}
}
