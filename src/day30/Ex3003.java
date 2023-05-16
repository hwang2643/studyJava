package day30;

class Ex3003 {
	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println("이 문자열의 길이 : " + s.length());
		} catch(NullPointerException e) {
			System.out.println("참조값이 null임!");
		}
		System.out.println("실행 끝.");
	}
}
