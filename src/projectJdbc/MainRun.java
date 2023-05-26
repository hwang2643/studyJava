package projectJdbc;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRun {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String myId = sc.next();
		System.out.print("비밀번호 : ");
		String myPw = sc.next();
		boolean lb = true;
		
//		System.out.print("게시글 번호 : ");
//		int bno = sc.nextInt();
//		SocialBoard sb = new SocialBoard(myId, myPw, lb);
//		sb.socialDetail(bno);
//		System.out.print("내용 : ");
//		String content = sc.next();
//		System.out.print("답글 번호 : ");
//		int rowNum = sc.nextInt();
//		try {
//		sb.socialCommentWrite(content, bno, rowNum);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
		
		
//		System.out.print("1.주문/배송조회 2.취소/교환/반품 조회");
//		int checkNum = sc.nextInt();
//		String[] check = {"delivery", "cancel"};
		EShop eShop = new EShop(myId, myPw, lb);
//		EShopEx eShopEx = new EShopEx();
//		eShopEx.goodsSelect(1);
		System.out.print("삭제열 선택 : ");
		int rNum = sc.nextInt();
		eShop.myCartDelete(rNum);

//		eShop.myOrderHistory(check[checkNum-1]);
//		eShop.myCart();
		
	}
}
