package day8;

import java.util.Scanner;

public class Ex802 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		for(int i = 1; true; i++) {
//			
//			System.out.print("가위/ 바위 /보 입력 : ");
//			String player = sc.next();
//			String com = new String[] {"가위", "바위", "보"}[(int)(Math.random()*3)];  // Math.random() --> 0.0이상 1.0미만 ---> Math.random()*3 --> 0.0 ~ 2.999...
//			System.out.println("플레이어 : " + player + ", 컴 : " + com);
//			if(player.equals("가위")&&com.equals("보") || player.equals("바위")&&com.equals("가위") || player.equals("보")&&com.equals("바위")) {
//				System.out.println("--->플레이어 승!");
//				break;
//			}else if(player.equals("가위")&&com.equals("바위") || player.equals("바위")&&com.equals("보") || player.equals("보")&&com.equals("가위")) {
//				System.out.println("--->플레이어 패.");
//				break;
//			}else if(player.equals("가위")&&com.equals("가위") || player.equals("바위")&&com.equals("바위") || player.equals("보")&&com.equals("보")) {
//				System.out.println("--->비김.");
//				break;
//			}else {
//				System.out.println("잘못 입력하셨습니다.");
//			}
//		}
		System.out.print("가위 / 바위 / 보 입력 : ");
		String player1 = sc.next();
		String com1 = new String[] {"가위", "바위", "보"}[(int)(Math.random()*3)];
		
		while(true) {
			if(player1.equals("가위") || player1.equals("바위") || player1.equals("보")) {
				break;
			}
			System.out.println("잘못 입력하셨습니다. 가위 / 바위 / 보 입력 : ");
			player1 = sc.next();
		}
		System.out.println("플레이어 : " + player1 + ", 컴 : " + com1);
//		while((!player1.equals("가위")) && (!player1.equals("바위")) && (!player1.equals("보"))) {
//			System.out.println("잘못 입력하셨습니다. 가위 / 바위 / 보 입력 : ");
//			player1 = sc.next();
//		}
		if(player1.equals("가위")&&com1.equals("보") || player1.equals("바위")&&com1.equals("가위") || player1.equals("보")&&com1.equals("바위")) {
			System.out.println("--->플레이어 승!");
		}else if(player1.equals("가위")&&com1.equals("바위") || player1.equals("바위")&&com1.equals("보") || player1.equals("보")&&com1.equals("가위")) {
			System.out.println("--->플레이어 패.");
		}else {
			System.out.println("--->비김.");
		}
	}
}
