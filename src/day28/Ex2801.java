package day28;

// "메서드 오버라이딩 할 때, 접근제어자를 만약에 변경하려거든, 가시성(Visibility)의 범위가 넓어지는 방향으로만 변경가능!
class A {
	void m() { }
}
class B extends A {
	@Override
	void m() { }
}
public class Ex2801 {

}
