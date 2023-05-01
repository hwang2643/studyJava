package day22;

// (고급)
class A3 {

	@Override
	public String toString() {
		return "A3객체";
	}
	
}

public class Ex2204 {
	public static void main(String[] args) {
		A3 obj = new A3();
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}
