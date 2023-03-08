package test01;

public class Ex03 {
	public static void main(String[] args) {


		 //1. 다음내용을 조건식으로 나타내어 보세요.
		 //a = 0 또는 a = 1이 아니다. (a
		 //a > 0 이고 a > 1이다.
		 //a = 0 이 아니고 a = 1도 아니다.
		System.out.println("1번 : a!=0 || a!=1");
		System.out.println("2번 : a>0 && a>1");
		System.out.println("2번 : a!=0 && a!=1");
		
		

		//2. 다음 x,y값을 구해보세요.
		 int a = 25;
		 int b = 24;
		 boolean x,y;

		 x = a > b;  // x =  true
		 y = a == b++;  // y = false

		 System.out.println(x);
		 System.out.println(y);


		//3.다음 출력물의 결과를 생각해 보세요.

		 int high = 100;
		 int low = 20;

		 System.out.println(high > low);  // true
		 System.out.println((high>=100) && (high >= 200));  // false
		 System.out.println((low >= 50) || (low <= 20));  // true
		 System.out.println(( -high % 3 <= 0));  // true 
		 System.out.println((  high % -7 <= 0));  // false


		}

}
