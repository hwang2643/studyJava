package test01;

import java.util.Scanner;

public class MultiArrayEx1Re {
	public static void main(String[] args) {
		final int SIZE = 10;
		int x = 0;
		int y = 0;
		char[][] board = new char[SIZE][SIZE];
		byte[][] shipBoard = new byte[SIZE-1][SIZE-1];
		int n = 0;
		String[] s = new String[81];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<SIZE-1; i++) {
			for(int j=0; j<SIZE-1; j++) {
				shipBoard[i][j] = (byte)(Math.random()*2);
			}
		}
		
		for(int i=0; i<SIZE; i++) {
			board[0][i] = board[i][0] = (char)(i+'0');
		}
		
		while(true) {
			System.out.print("\"좌표를 입력하세요. (종료는 00)>\"");
			String input = sc.next();
			s[n] = input;
			n++;
			for(int i=0; i<s.length; i++) {
				System.out.print(s[i] + " ");
			}
			for(int i=0; i<s.length; i++) {
				if(s[i].equals(input)) {
					System.out.print("\"중복된 값입니다. 다른좌표를 입력하세요. (종료는 00)>\"");
					input = sc.next();
					i = -1;
					continue;
				}
			}
			System.out.println();
			if(input.length()==2) {
				x = input.charAt(0)-'0';
				y = input.charAt(1)-'0';
				if(x==0 && y==0) {
					for(int i=0; i<SIZE-1; i++) {
						for(int j=0; j<SIZE-1; j++) {
							System.out.print(shipBoard[i][j] + " ");
						}
						System.out.println();
					}
					break;
				}
			}
			
			if(input.length()!=2 || x<=0 || x>=SIZE || y<=0 || y>=SIZE) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
				continue;
			}
			
			if(shipBoard[x-1][y-1]==1) {
				board[x][y] = 'O';
			}else {
				board[x][y] = 'X';
			}
//			board[x][y] = shipBoard[x-1][y-1]==1 ? 'O' : 'X';
			
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println();
			
		}
	}
}
