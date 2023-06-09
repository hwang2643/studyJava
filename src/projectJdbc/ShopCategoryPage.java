package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class EShopasd {
	public void searchCategory(String type) throws Exception {
		Scanner sc = new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "project";
 		String dbPw = "p1234";
 		
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
	public void typeSearch(String type) throws Exception {
		Scanner sc = new Scanner(System.in);
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "project";
		String dbPw = "p1234";
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
	public void recentGoods() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "project";
 		String dbPw = "p1234";
 		
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
	public void newGoods() throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "project";
 		String dbPw = "p1234";
 		
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
	
}
public class ShopCategoryPage {
	public static void main(String[] args) throws Exception {
		
	}
}
