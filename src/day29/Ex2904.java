package day29;

interface I1 {
	void m1();  // ....하는 메서드.  --> "public abstract"
}
// 익명클래스로 뭘 할까?
// 1. 인터페이스를 구현(implements) = 클래스가 완성.
//class I1Impl implements I1 {
//	@Override
//	public void m1() {
//		sysout("m1.");
//	}
//}
public class Ex2904 {
	public static void main(String[] args) {
		// "인터페이스는 부-자의 상황에서 주의 역할을 할 수 있다."(다형성에 적용할 수 있다)"
		I1 obj = new I1() {
			@Override
			public void m1() {
				System.out.println("m1.");
			}
		};
		obj.m1();
	}
}
