package projectJdbc;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디: ");
		String myId = sc.next();
		System.out.print("비밀번호: ");
		String myPw = sc.next();
		boolean lb = true;
		MemberUpdate mem = new MemberUpdate(myId, myPw, lb);
		mem.login();
		if(mem.logCheck()) {
			System.out.print("수정 / 삭제 입력 : ");
			String s = sc.next();
			if(s.equals("수정")) {
				boolean b = mem.Check();
				if(b) {
					mem.PwUpdate();
					mem.NickNameUpdate();
					mem.EmailUpdate();
					mem.EmailReceive();
					mem.PhoneUpdate();
					mem.smsReceive();
					mem.phoneOwnerUpdate();
					mem.detailAddressUpdate();
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else if(s.equals("삭제")) {
				mem.delete();
			}
		}
	}
}
