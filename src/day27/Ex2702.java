package day27;

// "Variable Hiding"
class A2 {
	int num = 10;
}
class B2 extends A2 {
	int num = 20;
}
public class Ex2702 {
	public static void main(String[] args) {
		A2 obj = new B2();
		B2 obj2 = new B2();
		System.out.println(obj.num);  // 10  변수는 참조형 타입을 따라간다.
		System.out.println(((B2)obj).num);  // 20
		System.out.println(obj2.num); // 20
		System.out.println(((A2)obj2).num); // 10
		
	}
}
