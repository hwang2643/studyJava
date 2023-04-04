package test01;

import java.util.Scanner;

public class JavaPractice_4Chap {
	public static void main(String[] args) {
//		[4-1] 다음의 문장들을 조건식으로 표현하라.
//		1.
//		int x = 15;
//		boolean b2 = (x > 10 && x < 20 ? true : false);
//		System.out.println(b2);
//		2.
//		char ch3 = ' ';
//		if(ch3 != ' ' || ch3 != '	') {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		3.
//		char ch4 = 'a';
//		if(ch4 == 'x' || ch4 == 'X') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		4. 
//		char ch5 = '4';
//		if((int)ch5 >= (int)'0' && (int)ch5 <= (int)'9') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		5.
//		char ch6 = ' ';
//		if((int)ch6 >= (int)'a'&& (int)ch6 <=(int)'z' || (int)ch6 >= (int)'A'&& (int)ch6 <=(int)'Z') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		char ch6 = 'c';
//		if(ch6 >= 'a'&& ch6 <='z' || ch6 >= 'A'&& ch6 <='Z') {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		6. 
//		int year = 4000;
//		if((year%400==0 || year%4==0) && year%100!=0) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
//		7. 
//		boolean powerOn = false;
//		if(powerOn == false) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
//		8. 
//		String str = "";
//		if(str == "yes") {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
		// 4-2
//		int sum = 0;
//		for(int i = 1; i <= 20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		// 4-3
//		int sum1 = 0;
//		int sum2 = 0;
//		for(int i = 1; i <= 10; i++) {
//			for(int j = 2; j <= i; j++) {
//				sum2 = sum2 +   j;
//			}
//			sum1 = i + sum2;
//		}
//		System.out.println(sum1);
		
		// 4-4
		
		//4-5
//		for(int i=0; i<=10; i++) {
//			for(int j=0; j<=i; j++)
//			System.out.print("*");
//			System.out.println();
//			}
//		int i = 0;
//		
//		while(i <= 10) {
//			int j = 0;
//			while(j <= i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//			
//		}
		
		
		// 4-6
//		int n1;
//		int n2;
//		for(n1 = 1; n1<=6; n1++) {
//			for(n2 = 1; n2<=6; n2++) {
//				
//				if(n1+n2==6) {
//					System.out.println("첫 번째 주사위 : " + n1);
//					System.out.println("두 번째 주사위 : " + n2);
//					break;
//				}
//			}
//		}
		
		// 4-7
//		int value = (int)(Math.random()*6)+1;
//		System.out.println("value:"+value);
//		
//		// 4-8
//		int x;
//		int y;
//		for(x = 0; x <= 10; x++) {
//			for(y = 0; y <= 10; y++) {
//				if((2*x) + (4*y) == 10) {
//					System.out.println("x=" + x + ", y=" + y);
//					break;
//				}
//			}
//		}
		
		// 4-9
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i < str.length(); i++) {
//			sum += (str.charAt(i)-'0');
//		}
//		System.out.println("sum="+sum);
//		
//		// 4-10
//		int num = 12345;
//		int sum1 = 0;
//		int nSum = num%10;
//		System.out.println(nSum);
//		for(int i = 0; true; i++) {
//			sum1 += nSum;
//			num /= 10;
//			if(num==0) {
//				break;
//			}
//		}
//		System.out.println("sum="+sum);
		
		// 4-11
		// Fibonnaci 1, 1 . 수열의 시작의 첫 두 숫자를 로 한다
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0; // 세번째 값
//		System.out.print(num1+","+num2);
//		for (int i = 0 ; i < 8 ; i++ ) {
//			num3 = num1 + num2;
//			num1 = num2;
//			num2 = num3;
//			System.out.print("," + num3);
//		}
		
		// 4-12
//		for(int i = 2; i <= 9; i++) {
//			for(int j = 1; j <= 3; j++) {
//				System.out.println(i + "*" + j + "=" + i*j);
//			}
//			System.out.println();
//		}
		
		// 4-13
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		for(int i=0; i < value.length() ;i++) {
//			if(0 <= value.charAt(i) && 9 >= value.charAt(i)) {
//				isNumber = true;
//			} else {
//				isNumber = false;
//			}
//		}
//		if (isNumber) {
//		System.out.println(value+"는 숫자입니다.");
//		} else {
//		System.out.println(value+"는 숫자가 아닙니다.");
//		}
		
		// 4-14
		// 1~100 answer . 사이의 임의의 값을 얻어서 에 저장한다
		
//		int answer = (int)(Math.random()*100);
//		int input = 0; // 사용자입력을 저장할 공간
//		int count = 0; // 시도횟수를 세기위한 변수
//		System.out.println(answer);
//		Scanner sc = new Scanner(System.in); 
//		do {
//			count++;
//			System.out.print("1 과 100 사이의 값을 입력하세요 :"); 
//			input = sc.nextInt(); // input . 입력받은 값을 변수 에 저장한다
//			if(input == answer) {
//				System.out.println("정답!");
//				System.out.println("시도 횟수는 " + count + "번 입니다.");
//				break;
//			}
//			} while(true); // 무한반복문
		
		// 4-15
//		int number = 13531;
//		int tmp = number;
//		int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
//		while(tmp !=0) {
//			result = result * 10 + tmp%10;  // number의 값을 뒤집어서 result값에 담음
//			tmp /= 10;  // tmp의 자릿수를 줄임
//		}
//		if(number == result)
//		System.out.println( number + "는 회문수 입니다."); 
//		else
//		System.out.println( number + "는 회문수가 아닙니다."); 

		
	}

}


