package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Notice extends MemberLogin{
	Notice(String myId, String myPw, boolean lb) {
		super(myId, myPw, lb);
	}
	static Scanner sc = new Scanner(System.in);
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	public void noticeOperatorWriter(String title, String content) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
        String sql = "INSERT INTO notice(bno, title, content, w_date)" +
        			  "VALUES(seq_notice.nextval, ?, ?, sysdate)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, title);
        pstmt.setString(2, content);
        if(myId.equals("operator")) {
        	pstmt.executeUpdate();
        }
        pstmt.close();
        conn.close();
        
	}
	public void noticeMain() throws Exception {
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		// 2) PreparedStatement
 		String sql = " SELECT rownum, n.bno, n.title, n.w_date, n.content" +
 					 " FROM notice n, (SELECT rownum, bno FROM notice ORDER BY bno) rn" + 
 					 " WHERE n.bno=rn.bno" +
 					 " ORDER BY bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		// 3) ResultSet
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int rownum = rs.getInt("rownum");
 			String title = rs.getString("title");
 			int w_date = rs.getInt("w_date");
 			String content = rs.getString("content");
 			System.out.println("글번호 : " + rownum + "\n제목 : " + title + "\n작성일 : " 
 								+ w_date + "\n내용 : " + content + "\n");
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void noticeAllSearch(String search) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT rownum, n.bno, n.title, n.w_date, n.content" +
 					 " FROM notice n, (SELECT rownum, bno FROM notice ORDER BY bno) rn" +
 					 " WHERE n.bno=rn.bno AND (n.title LIKE ? OR n.content LIKE ?)" +
 					 " ORDER BY bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, "%"+search+"%");
 		pstmt.setString(2, "%"+search+"%");
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int rownum = rs.getInt("rownum");
 			String title = rs.getString("title");
 			int w_date = rs.getInt("w_date");
 			String content = rs.getString("content");
 			System.out.println("글번호 : " + rownum + "\n제목 : " + title + "\n작성일 : " 
 								+ w_date + "\n내용 : " + content + "\n");
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void noticeTitleSearch(String search) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT rownum, n.bno, n.title, n.w_date, n.content" +
 					 " FROM notice n, (SELECT rownum, bno FROM notice ORDER BY bno) rn" +
 					 " WHERE n.bno=rn.bno AND n.title LIKE ?" +
 					 " ORDER BY bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, "%"+search+"%");
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int rownum = rs.getInt("rownum");
 			String title = rs.getString("title");
 			int w_date = rs.getInt("w_date");
 			String content = rs.getString("content");
 			System.out.println("글번호 : " + rownum + "\n제목 : " + title + "\n작성일 : " 
 								+ w_date + "\n내용 : " + content + "\n");
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
	public void noticeContentSearch(String search) throws Exception {
		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		String sql = " SELECT rownum, n.bno, n.title, n.w_date, n.content" +
 					 " FROM notice n, (SELECT rownum, bno FROM notice ORDER BY bno) rn" +
 					 " WHERE n.bno=rn.bno AND n.content LIKE ?" +
 					 " ORDER BY bno DESC";
 		PreparedStatement pstmt = conn.prepareStatement(sql);
 		pstmt.setString(1, "%"+search+"%");
 		ResultSet rs = pstmt.executeQuery();
 		while(rs.next()) {
 			int rownum = rs.getInt("rownum");
 			String title = rs.getString("title");
 			int w_date = rs.getInt("w_date");
 			String content = rs.getString("content");
 			System.out.println("글번호 : " + rownum + "\n제목 : " + title + "\n작성일 : " 
 								+ w_date + "\n내용 : " + content + "\n");
 		}
 		rs.close();
 		pstmt.close();
 		conn.close();
	}
}
