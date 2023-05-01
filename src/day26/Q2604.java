package day26;

//클래스 Numbers를 아래와 같이 정의하세요.
//- 인스턴스변수 : int num1, num2    // 생성자 파라미터를 통해서 초기화하세요.
//- 인스턴스메서드 : void show()    // 출력 : "num1:___, num2:____"
//
//main():
//	Numbers numbers = new Numbers(5, 3);
//	numbers.show();    // 출력 : "num1:5, num2:3"

class Numbers {
	int num1, num2;
	Numbers(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	void show() {
		System.out.println("num1:" + num1 + ", num2:" + num2);
	}
}
public class Q2604 {
	public static void main(String[] args) {
		Numbers numbers = new Numbers(5, 3);
		numbers.show();
	}
}
