package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class NoticeSelect {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "project";
 		String dbPw = "p1234";
 		
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT *" +
 					 " FROM notice" + 
 					 " ORDER BY bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		// 3) ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int bno = rs.getInt("bno");
 			String title = rs.getString("title");
 			int w_date = rs.getInt("w_date");
 			String content = rs.getString("content");
 			System.out.println("글번호 : " + bno + "\n제목 : " + title + "\n작성일 : " 
 								+ w_date + "\n내용 : " + content + "\n");
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
}
