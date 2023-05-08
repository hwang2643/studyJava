package day28;

import java.util.Arrays;

abstract class Parent {
	abstract void message();
}
class Child1 extends Parent {
	@Override
	void message() {
		System.out.println("첫 번째 클래스");
	}
}
class Child2 extends Parent {
	@Override
	void message() {
		System.out.println("두 번째 클래스");
	}
}
public class Q2801 {
	public static void main(String[] args) {
		Parent[] arr = new Parent[5];
		for(int i = 0; i<=arr.length-1; i++) {
			int num = (int)(Math.random()*2);
			if(num==0) {
				arr[i] = new Child1();
			}else {
				arr[i] = new Child2();
			}
		}
		for(int i=0; i<=arr.length-1; i++) {
			arr[i].message();
		}
		
		
//		Parent obj = new Child1();
//		Parent obj2 = new Child2();
//		obj.message();
//		obj2.message();
	}
}
