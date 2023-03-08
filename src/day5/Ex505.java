package day5;

// 키워드 4가지 암기 : switch / case / break / default
public class Ex505 {
	public static void main(String[] args) {
		int num = 4;
		switch(num) {
		case 1:		// num이 1일 때
			System.out.println("하나");
			break;  // Sitch문을 탈출
		case 2:		// num이 2일 때
			System.out.println("둘");
			break;
		case 3:		// num이 3일 때
			System.out.println("셋");
			break;
		default:		// 그 외의 경우 모두 다
			System.out.println("(그 밖의 값...)");
		}
	}
}
