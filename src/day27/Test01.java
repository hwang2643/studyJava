package day27;

class AA {
	void m() {
		System.out.println("m.");
	}
}
class BB extends AA {
	void m() {
		System.out.println("child-m.");
	}
}
public class Test01 {
	public static void main(String[] args) {
		AA obj = new BB();
		BB obj2 = new BB();
		obj.m();
		obj2.m();
	}
	
}
