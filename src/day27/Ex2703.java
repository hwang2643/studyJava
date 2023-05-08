package day27;

class A3 {
	void m() {
		System.out.println("m.");
	}
}
public class Ex2703 {
//	static A3 m() {	return new A3(); }
	static Object m() {	return new A3(); }
	public static void main(String[] args) {
//		A3 obj = m();  // ERR (이해)
		// 1) 
		A3 obj = (A3)m();  // downcasting(강제)
		obj.m();
		// 2)
		Object obj2 = m();
		if(obj2 instanceof A3) {
			((A3)obj2).m();  // downcasting필요. -> 강제 형 변환
		}
	}
}
