package test01;

public class Ex01 {
	 public static void main(String[] args){
		  int i = 3;
		  int j = 0;
		  
		  j = i++;  // j = 3

		  System.out.println("1 : " + i ); //1  i = 4 -> 4출력
		  System.out.println("2 : " + j ); //2  j = 3 -> 3출력

		  j = i - j;  // j = 1

		  System.out.println("3 : " + -i);  //3  i = -4  -> -4출력
		  System.out.println("4 : " + (j=-j));  //4  j = -1 -> -1출력

		  i++;  // i = 5
		  
		  ++j;  // j = 0

		  System.out.println("5 : " + i++); //5  i = 5출력 -> 6
		  System.out.println("6 : " + ++j); //6  j = 1 -> 1출력
		  System.out.println("7 : " + -i); //7  i = -6 -> -6출력
		  System.out.println("8 : " + -++j); //8  j = -2 -> -2출력

		  
		 }

}
