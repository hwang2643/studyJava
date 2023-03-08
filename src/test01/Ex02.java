package test01;

public class Ex02 {
	public static void main(String[] args){

		  int i = 0;
		  int j = 0;

		  i++;  // i = 1

		  System.out.println("1 : " + i); //1  i = 1출력
 
		  ++i;  // i = 2

		  System.out.println("2 : " + i); //2  i = 2출력

		  j = i++;  // j = 2, i = 3

		  System.out.println("3 : " + j); //3  j = 2출력

		  j = ++i; // j = 4, i = 4

		  System.out.println("4 : " + j); //4  j = 4출력

		  j = i++;  // j = 4, i = 5

		  System.out.println("5 : " + i++); //5  i = 5출력 -> i = 6
		  System.out.println("6 : " + ++j); //6  j = 5 -> 5출력

		  

		  

		  

		 }

}
