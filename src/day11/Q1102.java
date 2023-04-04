package day11;

import java.util.Scanner;

/* --------------------
	1 2 3 4 5 6 7 8 9 10
	. . . . . . . . . .           // . = 예약가능 / X = 예약불가능
	--------------------
	예약하시겠습니까? y (엔터)
	예약할 좌석 번호 입력: 7 (엔터)
	예약되었습니다.

	--------------------
	1 2 3 4 5 6 7 8 9 10
	. . . . . . X . . .           // . = 예약가능 / X = 예약불가능
	--------------------
	예약하시겠습니까? y (엔터)
	예약할 좌석 번호 입력: 7 (엔터)
	이미 예약된 좌석입니다. 다시 입력해주세요.
	예약할 좌석 번호 입력: 6 (엔터)
	예약되었습니다.

	--------------------
	1 2 3 4 5 6 7 8 9 10
	. . . . . X X . . .           // . = 예약가능 / X = 예약불가능
	--------------------
	예약하시겠습니까? n (엔터)
	끝.
 */
public class Q1102 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[10];
		char[] c = new char[10];
		int snum;
		for(int i=0; i<c.length; i++) {
			c[i] = '.';
		}
		for(int i=0; i<n.length; i++) {
			n[i] = i+1;
		}
		while(true) {
			System.out.println("---------------------");
			for(int i=0; i<n.length; i++) {
				System.out.print(n[i] + " ");
			}
			System.out.println();
			for(int i=0; i<c.length; i++) {
				System.out.print(c[i] + " ");
			}
			System.out.println();
			System.out.println("---------------------");
			System.out.print("예약하시겠습니까? ");
			String s = sc.next();
			if(s.equals("y")) {
				while(true) {
					System.out.print("예약할 좌석 번호 입력 : ");
					snum = sc.nextInt();
					if(c[snum-1]=='X') {
						System.out.println("이미 예약된 좌석입니다. 다시 입력해주세요");
					}else if(c[snum-1]!='X') {
						break;
					}
				}
				c[snum-1] = 'X';
				System.out.println("예약되었습니다.\n");
				
			}else if(s.equals("n")) {
				System.out.println("끝.");
				break;
			}
			
		}
	}
}
