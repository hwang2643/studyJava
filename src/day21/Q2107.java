package day21;

//Q2107.	Numbers 클래스 작성.
//- 인스턴스변수 : int num1, num2   // 생성자 파라미터를 통해서 초기화할 것.
//- 인스턴스메서드 : void show()  // 출력 : "num1 : ____, num2 : ____"
//main()에서,
//	Numbers numbers = new Numbers(5, 3);
//	numbers.show();   // 출력 : "num1 : 5, num2 : 3"

class Numbers {
	int num1, num2;
	Numbers(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	void show() {
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}
}

public class Q2107 {
	public static void main(String[] args) {
		Numbers numbers = new Numbers(5, 3);
		numbers.show();
	}
}
