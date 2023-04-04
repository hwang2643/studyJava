package day17;

public class Ex1701 {
	static void m() {
		System.out.println((int)(Math.random()*10));
		m();  // 재귀호출(recursive call) : 무한반복 + 탈출조건
	}
	public static void main(String[] args) {
		m();
	}
}
