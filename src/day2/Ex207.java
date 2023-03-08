package day2;

public class Ex207 {
	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		// 1) a가 5 이거나 6이냐? ---> true
		System.out.println(a==5 || a==6);
//		System.out.println(a==5 || 6);  // ERR. (이해)
		// 2) a가 5이거나 6이거나 7이냐?
		System.out.println(a==5 || a==6 || a==7);
		System.out.println(a==5 && a==6 || a==7);
		
		System.out.println((a==1 || a==4 || a==7) && (b>0));
		
	}

}
