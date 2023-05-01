package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Ex04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 번째 게시판 연습 - 게시글 상세보기");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "testw8";
 		String dbPw = "pass1234";
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		
 		// 2). statement
 		System.out.println("조회할 게시글 번호 입력 : ");
 		int bno = sc.nextInt();
 		String sql = "SELECT * FROM board WHERE bno=" + bno;
 		Statement stmt = conn.createStatement();
 		
 		// 3). 실행 후 ResultSet 
 		ResultSet rs = stmt.executeQuery(sql);
 		if(rs.next()) {
 			String title = rs.getNString("title");
 			String content = rs.getNString("content");
 			String writer = rs.getNString("writer");
 			System.out.println("게시글 번호 : " + bno);
 			System.out.println("게시글 제목 : " + title);
 			System.out.println("게시글 내용 : " + content);
 			System.out.println("게시글 작성자 : " + writer);
 		}
 		rs.close();
 		stmt.close();
 		conn.close();
	}
}
