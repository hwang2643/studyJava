package day21;

class AA {
	static int a;
	int b;
	void m1() {
		System.out.println("클래스변수 a : " + a);
		System.out.println("인스턴스변수 b : " + b);
	}
	static void m2() {
		System.out.println("클래스변수 a : " + a);
//		System.out.println("인스턴스변수 b : " + b);  // ERR. ★★★★★★★★★
	}
}

public class Ex2102 {
	public static void main(String[] args) {
		AA.a = 10;  // 클래스변수 --> "클래스이름."으로 접근.
		AA.m2();
		AA obj = new AA();
		AA obj2 = new AA();
		
		obj.b = 30;
		obj.m1();
		
		obj.a++;  // 클래스변수를"참조변수."으로 접근 가능. (권장X)
		obj.m2();  // 클래스메서드를"참조변수."으로 접근 가능. (권장X)
		System.out.println(AA.a);
		
	}
}
