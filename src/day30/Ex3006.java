package day30;

// finally : try 영역으로 진입한 이상, 무조건적인 실행이 보장되는 영역
public class Ex3006 {
	static int m() {
		try {
			return 10;
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally 실행됨.");
		}
		return 0;
	}
	public static void main(String[] args) {
		int n = m();
		System.out.println("n : " + n);
	}
}
