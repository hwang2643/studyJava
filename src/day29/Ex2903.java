package day29;

class A3 {
	void m() {
		int n = 5;  // 지역변수
		class B3 {  // "로컬클래스(Local Class)"
			void showNum() {
				System.out.println("n : "+ n);
			}
		}
		B3 obj = new B3();
		obj.showNum();
	}
}
public class Ex2903 {
	public static void main(String[] args) {
		A3 obj = new A3();
		obj.m();
	}
}
