package test01;

import java.util.Scanner;

public class JavaPractice_5Chap {
	public static void main(String[] args) {
		// 5-3
//		int[] arr = {10, 20, 30, 40, 50};
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		System.out.println("sum="+sum);
		
		// 5-4
//		int[][] arr = {
//				{ 5, 5, 5, 5, 5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//				};
//		int total = 0;
//		float average = 0;
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				total += arr[i][j];
//				}
//			}
//		average = (float)total/(arr.length*arr[0].length);
//		System.out.println("total="+total);
//		System.out.println("average="+average);
		
		// 5-5
//		int[] ballArr = {1,2,3,4,5,6,7,8,9};
//		int[] ball3 = new int[3];
//		for(int i=0; i<ballArr.length; i++) {
//			int j = (int)(Math.random() * ballArr.length);
//			int tmp = 0;
//			tmp = ballArr[i];
//			ballArr[i] = ballArr[j];
//			ballArr[j] = tmp;
//		}
//		for(int i=0;i<ball3.length;i++) {
//			ball3[i] = ballArr[i];
//			System.out.print(ball3[i] + " ");
//		}
		
		// 5-6
//		 . 큰 금액의 동전을 우선적으로 거슬러 줘야한다
//		int[] coinUnit = {500, 100, 50, 10};
//		int money = 2680;
//		System.out.println("money="+money);
//		for(int i=0;i<coinUnit.length;i++) {
//			System.out.print(coinUnit[i] + "원 : " + (money/coinUnit[i]) + "\n");
//			money%=coinUnit[i];
//		}
		
		// 5-7 (X)
//		if(args.length!=1) {
//			System.out.println("USAGE: java Exercise5_7 3120");
//			System.exit(0);
//			}
			// . . 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
//			int money = Integer.parseInt(args[0]);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("money=");
		int money = sc.nextInt();
		int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
		int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
		for(int i=0;i<coinUnit.length;i++) {
			int coinNum = 0;
			coinNum = money/coinUnit[i];
			if(coin[i]>=coinNum) {
				break;
			}else if(coin[i]<coinNum){
				coinNum = coin[i];
				money -= (coinUnit[i]*coin[i]);
			}
			/* (1) 아래의 로직에 맞게 코드를 작성하시오. 
			1. 금액 (money) 을 동전단위로 나눠서 필요한 동전의 개수(coinNum) 를 구한다. 
			2.배열 coin 에서 coinNum 만큼의 동전을 뺀다
			(만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.)
			3.금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			*/
			System.out.println(coinUnit[i]+"원 : "+coinNum); 
		}
		if(money > 0) {
			System.out.println(" 거스름돈이 부족합니다."); 
			System.exit(0); //프로그램을 종료한다
		}
		System.out.println("=남은 동전의 개수 ="); 
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+"원 :"+coin[i]); 
		}
		
		// 5-8
//		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
//		int[] counter = new int[4];
//		for(int i=0; i < answer.length;i++) {
//			if(answer[i]==1) {
//				counter[0]++;
//			}else if(answer[i]==2) {
//				counter[1]++;
//			}else if(answer[i]==3) {
//				counter[2]++;
//			}else {
//				counter[3]++;
//			}
//		/* (1) 알맞은 코드를 넣어 완성하시오. */ 
//		}
//		for(int i=0; i < counter.length;i++) {
//			System.out.print(counter[i]);
//			for(int j=1; j<=counter[i]; j++) {
//				System.out.print("*");
//			}
//		/*
//		(2) 알맞은 코드를 넣어 완성하시오. 
//		*/
//		System.out.println();
//		}
		
		// 5-9 (△)
//		char[][] star = {
//				{'*','*',' ',' ',' '},
//				{'*','*',' ',' ',' '},
//				{'*','*','*','*','*'},
//				{'*','*','*','*','*'}
//				};
//		char[][] result = new char[star[0].length][star.length];
//		for(int i=0; i < star.length;i++) {
//			for(int j=0; j < star[i].length;j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//		System.out.println();
//		
//		for(int i=0; i < star[0].length;i++) {
//			int n = star.length-1;
//			for(int j=0; j < star.length;j++) {
//				result[i][j] = star[n][i];
//				n--;
//			/*
//			(1) 알맞은 코드를 넣어 완성하시오. 
//			*/
//			}
//		}
//		for(int i=0; i < result.length;i++) {
//			for(int j=0; j < result[i].length;j++) {
//				System.out.print(result[i][j]);
//			}
//			System.out.println();
//		}
		
		// 5-10
//		char[] abcCode =
//			{ '`','~','!','@','#','$','%','^','&','*',
//			'(',')','-','_','+','=','|','[',']','{',
//			'}',';',':',',','.','/'};
//		// 0 1 2 3 4 5 6 7 8 9
//		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
//		String src = "abc123";
//		String result = "";
//		// src charAt() result 문자열 의 문자를 으로 하나씩 읽어서 변환 후 에 저장
//		for(int i=0; i < src.length();i++) {
//			char ch = src.charAt(i);
//			for(int j=0; j<=abcCode.length-1; j++) {
//				if(ch-'a'==j) {
//					result += abcCode[j];
//				}
//			}
//			for(int j=0; j<=numCode.length-1; j++) {
//				if(ch-'0'==j) {
//					result += numCode[j];
//				}
//			}
//			/*
//			(1) . 알맞은 코드를 넣어 완성하시오
//			*/
//		}
//		System.out.println("src:"+src);
//		System.out.println("result:"+result);
		
		// 5-11
//		int[][] score = {
//				{100, 100, 100}
//				, {20, 20, 20}
//				, {30, 30, 30}
//				, {40, 40, 40}
//				, {50, 50, 50}
//				};
//		int[][] result = new int[score.length+1][score[0].length+1];
//		for(int i=0; i < score.length;i++) {
//			for(int j=0; j < score[i].length;j++) {
//				result[i][score[i].length] += score[i][j];
//				result[i][j] = score[i][j];
//				result[score.length][j] += score[i][j];
//				result[score.length][score[i].length] += result[i][j];
//				/*
//				(1) . 알맞은 코드를 넣어 완성하시오
//				*/
//			}
//		}
//		for(int i=0; i < result.length;i++) {
//			for(int j=0; j < result[i].length;j++) {
//				System.out.printf("%4d",result[i][j]);
//			}
//			System.out.println();
//		}
		
		// 5-12
//		String[] words = { "television", "computer", "mouse", "phone" };
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0;i<words.length;i++) {
//			char[] question = words[i].toCharArray(); // String을 char[]로 변환
//			
//			for(int j=0; j<=question.length-1; j++) {
//				int ran = (int)(Math.random()*(question.length));
//				char tmp = question[j];
//				question[j] = question[ran];
//				question[ran] = tmp;
//			}
//			/*
//			(1) . 알맞은 코드를 넣어 완성하시오
//			char question . 배열 에 담긴 문자의 위치를 임의로 바꾼다
//			 */
//			System.out.printf("Q%d. %s 의 정답을 입력하세요.>", i+1, new String(question));
//			String answer = scanner.nextLine();
//			// trim() answer , equals word[i] 으로 의 좌우 공백을 제거한 후 로 와 비교
//			if(words[i].equals(answer.trim()))
//					System.out.printf(" 맞았습니다.%n%n"); 
//			else
//					System.out.printf(" 틀렸습니다.%n%n"); 
//		}






		
		
		
		
		
		
		
		
		
		
		
		
	}
}
