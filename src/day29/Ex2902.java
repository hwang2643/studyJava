package day29;

class A2 {  // 외부클래스(Outer Class)
	private static int num = 10;
	static class B2 {  // 중첩클래스 중 "스태틱클래스(Static Class)"
		void showNum() {
			System.out.println("num : " + num);
		}
	}
}
public class Ex2902 {
	public static void main(String[] args) {
		A2.B2 obj = new A2.B2();  // ★(기억)
		obj.showNum();
		
	}
}
