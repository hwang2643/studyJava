package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Photo {
	static Scanner sc = new Scanner(System.in);
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	public void photoAll() throws Exception  {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT *" +
 					 " FROM photo" +
 					 " ORDER BY r_date DESC, bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String title = rs.getString("title");
 			String img = rs.getString("image");
 			String date = rs.getString("r_date");
 			System.out.println(img + " " + title + " " + date);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void photoAllSearch(String search) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT *" +
 					 " FROM photo" +
 					 " WHERE title LIKE ?" +
 					 " ORDER BY r_date DESC, bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, "%"+search+"%");
 		pstmt.setString(2, "%"+search+"%");
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String title = rs.getString("title");
 			String img = rs.getString("image");
 			String date = rs.getString("r_date");
 			System.out.println(img + " " + title + " " + date);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void photoCategory(String category) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT" +
 					 " FROM" +
 					 " WHERE category=?";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, category);
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			String title = rs.getString("title");
 			String img = rs.getString("image");
 			String date = rs.getString("r_date");
 			System.out.println(img + " " + title + " " + date);
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
 		
 		
	}
}
