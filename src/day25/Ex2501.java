package day25;

class  A{
	int num =10;
	int a =11;
//	A(int num,int a){
//		this.num = num;
//		this.a =a;
//	}
}
class B{
	int num2=20;
}
class C{
	A obj1 ;
	B obj2;
	//A obj3;
	C(A obj1,B obj2){
		this.obj1 = obj1;
		this.obj2 = obj2;
		//this.obj3 = obj3;
	}
}
public class Ex2501 {
	public static void main(String[] args) {
//		int num =10 ;
//		int a =12;
		C obj = new C(new A(),new B());//A객체의 참조값 B객체의 참조값
		System.out.println(obj.obj1.num);
		System.out.println(obj.obj2.num2);
		//System.out.println(obj.obj3.a);
		System.out.println(obj.obj1.a);
	}
}
