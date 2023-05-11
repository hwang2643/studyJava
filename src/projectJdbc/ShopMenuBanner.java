package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ShopMenuBanner {
	public static void main(String[] args) throws Exception {
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
 					 " WHERE rownum<=16 AND best='Y'";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
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
}
