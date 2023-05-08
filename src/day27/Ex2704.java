package day27;

// 접근제어자(Access Modifier. 접근제한자. 접근제어지시자)
//		- '어디까지 접근을 허용할건지'를 지정함.
// ★ 4가지 : public > protected > (default) > private
//		- public = 접근을 제한하지 않음.
//		- private = "해당 클래스 안에서만 접근 가능".
//		- "protected = default + child" (공식)
class A4 {
	int num;  // --> 접근제어자가 없는게 아니라, (default) 접근제어자!
			  // (default) : 같은 패키지 안에서만 접근 가능.
	private int num2;
	
	void m() { }
	private void m2() { }
}
public class Ex2704 {
	public static void main(String[] args) {
		A4 obj = new A4();
		obj.num = 10;
//		obj.num2 = 20;  // ERR. (이해)
		obj.m();
//		obj.m2();  // ERR. (이해)
	}
}
