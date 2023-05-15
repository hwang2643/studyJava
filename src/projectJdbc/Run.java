package projectJdbc;

import java.util.Arrays;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String myId = sc.next();
		System.out.print("비밀번호: ");
		String myPw = sc.next();
		boolean lb = true;
		MemberUpdate memUp = new MemberUpdate(myId, myPw, lb);
		SocialBoard sb = new SocialBoard(myId, myPw, lb);
		String[] category = {"1.마이페이지", "2.소셜게시판", "3.로그아웃"};
		memUp.login();
		if(memUp.logCheck()) {
			while(true) {
				System.out.println(Arrays.toString(category));
				int onClick = sc.nextInt();
				if(category[onClick-1].equals(category[0])) {
					if(memUp.logCheck()) {
						memUp.myPageShow();
						System.out.print("수정 / 삭제 입력 : ");
						String s = sc.next();
						if(s.equals("수정")) {
							boolean b = memUp.Check();
							if(b) {
								memUp.PwUpdate();
								memUp.NickNameUpdate();
								memUp.EmailUpdate();
								memUp.EmailReceive();
								memUp.PhoneUpdate();
								memUp.smsReceive();
								memUp.phoneOwnerUpdate();
								memUp.detailAddressUpdate();
							}else {
								System.out.println("비밀번호가 일치하지 않습니다.");
							}
						}else if(s.equals("삭제")) {
							memUp.delete();
						}
					}
				}else if(category[onClick-1].equals(category[1])) {
					if(sb.logCheck()) {
						String[] socialCategory = {"1.글쓰기", "2.전체검색", "3.제목검색", "4.내용검색", "5.작성자검색", "6.게시글선택"};
						sb.mainBoard();
						System.out.println(Arrays.toString(socialCategory));
						int SCSelect = sc.nextInt();
						if(socialCategory[SCSelect-1].equals(socialCategory[0])) {
							sb.socialWrite();
						}else if(socialCategory[SCSelect-1].equals(socialCategory[1])) {
							sb.socialAllSearch();
						}else if(socialCategory[SCSelect-1].equals(socialCategory[2])) {
							sb.socialTitleSearch();
						}else if(socialCategory[SCSelect-1].equals(socialCategory[3])) {
							sb.socialContentSearch();
						}else if(socialCategory[SCSelect-1].equals(socialCategory[4])) {
							sb.socialWriterSearch();
						}else if(socialCategory[SCSelect-1].equals(socialCategory[5])) {
							sb.socialDetail();
						}else {
							System.out.println("해당 없음");
						}
					}
				}else if(category[onClick-1].equals(category[2])) {
					System.out.println("로그아웃 하셨습니다");
					break;
				}
			}
		}
	}
}
