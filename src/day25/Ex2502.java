package day25;

class A2{
	int num;
	A2(int num){
		this.num =num;
	}
}
public class Ex2502 {
	static boolean equals (A2 obj1,A2 obj2) {
		if(obj1.num == obj2.num) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		A2 obj1 = new A2(10);
		A2 obj2 = new A2(20);
		System.out.println(equals(obj1,obj2));
	} 
}
      