package day30;

public class Ex3002 {
	public static void main(String[] args) {
		try {
			Object arr = new int[10];  // 이해 - 다형성
			String s = (String)arr;
		} catch(ClassCastException e) {
			System.out.println("클래스 형 변환이 잘못됨!");
		}
		System.out.println("실행 끝.");
		
	}
}
