package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// Ex03 : (첫 번째 게시판 연습) 전체 게시글 보기
public class Ex03 {
	public static void main(String[] args) throws Exception {
		System.out.println("첫 번째 게시판 연습 - 전체 게시글 보기");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "testw8";
 		String dbPw = "pass1234";
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		
 		// 2) Statement 객체.
 		String sql = "SELECT * FROM board ORDER BY bno DESC";  // [주의] 세미콜론(;) 없어야.
 		Statement stmt = conn.createStatement();
 		
 		// 3) 실행 후 ResultSet 객체.
 		ResultSet rs = stmt.executeQuery(sql);
 		while(rs.next()) {  // rs.next() : 다음 row가 있면 손가락 이동, true 리턴.
 			int bno = rs.getInt("bno");
 			String title = rs.getString("title");
 			String writer = rs.getString("writer");
 			System.out.println(bno + " / " + title + " / " + writer);
 		}
 		rs.close();
 		stmt.close();
 		conn.close();
	}
}
