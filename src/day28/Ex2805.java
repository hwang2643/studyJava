package day28;

interface I3 {
	void m1();  // p.a.
}
interface I4 extends I3{
	void m2();  // p.a.
}
class AA implements I4 {
	@Override
	public void m1() {
		
	}
	@Override
	public void m2() {
		
	}
}

public class Ex2805 {
	public static void main(String[] args) {
		
	}
}
