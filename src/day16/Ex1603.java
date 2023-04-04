package day16;

public class Ex1603 {
	static int ret10() {
		return 10;
	}
	public static void main(String[] args) {
		int num = ret10() + ret10();
		int num2 = ret10() * ret10() + ret10();
		System.out.println(num + ", " + num2);
	}
}
