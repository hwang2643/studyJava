package day16;

public class Ex1602 {
	static void sayHello(String param) {
		System.out.println(param + "님, Hi~");
	}
	static String sayHello2(String param) {
		return param + "님, Hi~";
	}
	public static void main(String[] args) {
		sayHello("YG");  // 출력 : YG님, Hi~
		System.out.println(sayHello2("YG"));  // 출력 : YG님, Hi~
	}
}
