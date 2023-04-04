package day18;

class Dog {		// 클래스 정의.
	String name;  // 이름
	void bark() {  // "멍멍!"
		System.out.println(name + "이가 짖었다. 멍멍!");
	}
}

public class Ex1801 {
	public static void main(String[] args) {
		Dog dog1; // Dog 객체를 가리킬 수 있는 변수 dog1의 선언
		dog1 = new Dog();  // Dog 객체를 생성해서 변수 dog1과 연결
		Dog dog2 = new Dog();
		// dog1, dog2 : 지역변수(main메서드 소속의)
		
		dog1.name = "맥스";
		dog2.name = "콩떡";
		
		dog2.bark();
		
	} 
}
