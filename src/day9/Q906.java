package day9;

import java.util.Scanner;

public class Q906 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random()*100)+1;
		for(int i = 1; true; i++) {
			System.out.print("Guess(1~100) : ");
			int in = sc.nextInt();
			if(in > ran+10) {
				System.out.println("(10 이상 차이) 훨씬 더 작은 수를 입력하세요.");
			}else if(in < ran-10) {
				System.out.println("(10 이상 차이) 훨씬 더 큰 수를 입력하세요.");
			}else if(in > ran && in <= ran+10) {
				System.out.println("(10 미만 차이) 조금 더 작은 수를 입력하세요.");
			}else if(in < ran && in >= ran-10) {
				System.out.println("(10 미만 차이) 조금 더 큰 수를 입력하세요.");
			}else if(in == ran){
				System.out.println("맞췄음! " + i + "번의 시도끝에 맞췄습니다.");
				break;
			}
		}
	}
}
