// "변수" : 값을 저장할 수 있는 그릇.
// ★ 변수를 사용하기 위해서는, "변수의 선언" + "초기화"가 필요함.
// 정수 : 소수점이 없는 숫자(ex. 5)
// 실수 : 소수점이 있는 숫자(ex. 3.14, 5.0)
// "변수의 초기화" : 선언된 변수에 처음으로 값을 담아줌.
//               그 때의 값을 "초기 값" 이라고 합니다.

public class Ex101 {
	public static void main(String[] args) {
		int num; // num이라는 변수 선언. (정수값을 저장)
		num = 5; // = ---> "대입 연산자"
		         //        "오른쪽을 정리해서 왼쪽에 담는다."
		System.out.println("num: " + num);
		                 // 문자열     + 무언가 ---> 문자열
		System.out.println("num : " + num + num);
		
		double num2;  // 실수값을 저장하는 변수 num2를 선언
		num2 = 3.14;
		System.out.println("num2 : " + num2);
		
		int num3;
		// System.out.println("num3 : " + num3);  // ERR. 이해
		
		// num4 = 5.15  // ERR. 이해
		
		// 연습1. 정수형 변수 a를 선언하고, 10 이라는 값으로 초기화.
		// "a : 10" 이렇게 출력
		int a;
		a = 10;
		System.out.println("a : " + a);
		// 연습2. 실수형 변수 b를 선언하고, 11.1이라는 값으로 초기화.
		// "b : 11.1" 이렇게 출력
		double b;
		b = 11.1;
		System.out.println("b : " + b);
	}

}
