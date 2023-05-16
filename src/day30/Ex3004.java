package day30;

public class Ex3004 {
	static void m() throws Exception {
//		try {
			throw new Exception("무언가 메시지");
//		} catch(Exception e) {
//			System.out.println("예외를 처리함!");
//		}
	}
	public static void main(String[] args) throws Exception {
		System.out.println("실행 시작.");
//		try {
			m();
//		} catch(Exception e) {
//			System.out.println("main()에서 처리함.");
//		}
		System.out.println("실행 끝!");
	}

}
