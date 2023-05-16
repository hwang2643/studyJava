package projectJdbc;

import java.util.Scanner;

public class SocialRun {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String myId = sc.next();
		System.out.print("비밀번호: ");
		String myPw = sc.next();
		boolean lb = true;
		SocialBoard sb = new SocialBoard(myId, myPw, lb);
		sb.login();
		if(sb.logCheck()) {
//			sb.mainBoard();
//			sb.socialWrite();
//			sb.socialAllSearch();
//			sb.socialWriterSearch();
//			sb.socialContentSearch();
//			sb.socialTitleSearch();
			sb.socialDetail();
		}
	}
}
