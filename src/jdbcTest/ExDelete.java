package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ExDelete {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("세 번째 게시판 연습 - 게시글 삭제");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "testw8";
 		String dbPw = "pass1234";
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		
 		// 2) Statement
 		System.out.print("삭제할 게시글 번호 입력 : ");
 		int bno = sc.nextInt();
 		String sql = "DELETE FROM board WHERE bno=" + bno;
 		Statement stmt = conn.createStatement();
 		
 		// 3) 실행
 		stmt.executeUpdate(sql);
 		
 		stmt.close();
 		conn.close();
	}
}
