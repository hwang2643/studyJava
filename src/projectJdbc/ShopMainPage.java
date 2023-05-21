package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

class EShop extends MemberLogin{
	EShop(String myId, String myPw, boolean lb) {
		super(myId, myPw, lb);
	}
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	public void myPageOrderHistory() throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT oh.o_num, oh.pay_way, oh.pay_date, p.delivery_way" +
 					 " FROM order_history oh, member m, payment p" +
 					 " WHERE m.id=oh.id AND m.id=p.id AND oh.id=?" +
 					 " ORDER BY oh.pay_date DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, myId);
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String oNum = rs.getString("o_num");
 			String payWay = rs.getString("pay_way");
 			String payDate = rs.getString("w_date");
 			String deliveryWay = rs.getString("delivery_way");
 			System.out.println(oNum + " " + payWay + " " + payDate + " " + deliveryWay);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void myPageWishList() throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT wl.goods_img, wl.goods_name, wl.price, wl.w_date" +
 					 " FROM wish_list wl, member m" +
 					 " WHERE m.id=wl.id AND wl.id=?" + 
 					 " ORDER BY wl.w_date DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, myId);
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsImg = rs.getString("goods_img");
 			String goodsName = rs.getString("goods_name");
 			int price = rs.getInt("price");
 			String wDate = rs.getString("w_date");
 			System.out.println(goodsImg + " " + goodsName + " " + price + " " + wDate);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void myPageGoodsQaReview() throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT gqr.bno, gqr.title, m.name, gqr.w_date, gqr.answer" +
 					 " FROM goods_qa_review gqr, member m" +
 					 " WHERE m.id=gqr.writer AND gqr.category='Q&A' AND gqr.writer=?" + 
 					 " ORDER BY gqr.w_date DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, myId);
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int bno = rs.getInt("bno");
 			String title = rs.getString("title");
 			String name = rs.getString("name");
 			String wDate = rs.getString("w_date");
 			String answer = rs.getString("answer");
 			System.out.println(bno + " " + title + " " + name + " " + wDate + " " + answer);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void myOrderHistory(String check) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT oh.o_num, oh.pay_way, oh.pay_date, oh.d_state, oh.c_state, oh.cancel" +
 					 " FROM order_history oh, member m" +
 					 " WHERE oh.id=m.id AND m.id=? AND o_check=?";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, myId);
 		if(check.equals("delivery")) {
 			pstmt.setString(2, check);
 		}else if(check.equals("cancel")) {
 			pstmt.setString(2, check);
 		}
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int oNum = rs.getInt("o_num");
 			String payWay = rs.getString("pay_way");
 			String payDate = rs.getString("pay_date");
 			String state = "";
 			if(check.equals("delivery")) {
 				state = rs.getString("d_state");
 			}else if(check.equals("cancel")) {
 				state = rs.getString("c_state");
 			}
 			String cancel = rs.getString("cancel");
 			System.out.println(oNum + " " +payWay + " " + payDate + " " + state + " " + cancel);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
 		
	}
	public void myCart() throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT c.goods_img, c.goods_name, gs.inventory, c.price" +
 					 " FROM member m, cart c, goods_size gs" +
 					 " WHERE m.id=c.id AND c.goods_id=gs.goods_id AND m.id=?";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, myId);
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsImg = rs.getString("goods_img");
 			String goodsName = rs.getString("goods_name");
 			int inventory = rs.getInt("inventory");
 			int price = rs.getInt("price");
 			System.out.println(goodsImg + " " + goodsName + " " + inventory + " " + price);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void searchType(String type) throws Exception {
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT goods_img, goods_name, price, new, best, sale" + 
 					 " FROM goods" +
 					 " WHERE type=?" + 
 					 " ORDER BY goods_id";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, type);
 		// ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsImg = rs.getString("goods_img");
 			String goodsName = rs.getString("goods_name");
 			int price = rs.getInt("price");
 			String cNew = rs.getString("new");
 			String best = rs.getString("best");
 			String sale = rs.getString("sale");
 			System.out.println(goodsImg + " " + goodsName + " " + price + " " +
 							   cNew + " " + best + " " + sale);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void searchNewBest(String newType, String bestType) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT goods_img, goods_name, price, new, best, sale" +
 					 " FROM goods" +
 					 " WHERE new=? OR best=?";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		if(newType.equals("Y")) {
 			pstmt.setString(1, newType);
 			pstmt.setString(2, "N");
 		}else if(bestType.equals("Y")) {
 			pstmt.setString(1, "N");
 			pstmt.setString(2, bestType);
 		}
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsImg = rs.getString("goods_img");
 			String goodsName = rs.getString("goods_name");
 			int price = rs.getInt("price");
 			String cNew = rs.getString("new");
 			String best = rs.getString("best");
 			String sale = rs.getString("sale");
 			System.out.println(goodsImg + " " + goodsName + " " + price + " " +
 							   cNew + " " + best + " " + sale);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void typeBanner(String type) throws Exception {
		Class.forName(driver);
		// 1) Connection 객체.
		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT goods_img, goods_name, price" +
 					 " FROM goods" +
 					 " WHERE rownum<=3 AND type = ? AND best='Y'"; 
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, type);
 		// 3) ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsImg = rs.getString("goods_img");
 			String goodsName = rs.getString("goods_name");
 			int price = rs.getInt("price");
 			System.out.println(goodsImg + " / " + goodsName + " / " + price + "\n");
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void recentGoodsBanner() throws Exception {
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT goods_img" + 
 					 " FROM recent_goods" +
 					 " ORDER BY bno";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		// ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsImg = rs.getString("goods_img");
 			System.out.println(goodsImg);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void newGoodsBanner() throws Exception {
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT goods_name, goods_img, price" +
 					 " FROM goods" +
 					 " WHERE rownum<=5 AND new='Y'";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		// 3) ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsName = rs.getString("goods_name");
 			String goodsImg = rs.getString("goods_img");
 			int price = rs.getInt("price");
 			System.out.println(goodsName + " " + goodsImg + " " + price);
 		}
 		
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void recommendGoodsBanner() throws Exception {
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT goods_name, goods_img, price" +
 					 " FROM goods" +
 					 " WHERE rownum<=5 AND recommend='Y'";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		// 3) ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String goodsName = rs.getString("goods_name");
 			String goodsImg = rs.getString("goods_img");
 			int price = rs.getInt("price");
 			System.out.println(goodsName + " " + goodsImg + " " + price);
 		}
 		
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
}

public class ShopMainPage {
	public static void main(String[] args) throws Exception {
		
	}
}
