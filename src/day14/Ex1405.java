package day14;

// 메서드의 정리와 호출.
public class Ex1405 {
	static void methodA() {  // ---> 메서드 methodA()를 "정의"
		System.out.println("메서드 A가 실행됨.");
	}
	static void methodB() {
		System.out.println("메서드B 실행됨!");
	}
	public static void main(String[] args) {
		System.out.println("main메서드가 시작됨.");
		methodA();  // --------> methodA라는 이름의 메서드를 "호출".
		methodA();
		methodB();  // 실행결과 ---> 출력 : "메서드B 실행됨!"
		
	}
}
