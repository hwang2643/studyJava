package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("세 번째 게시판 연습 - 게시글 쓰기");
		
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "testw8";
 		String dbPw = "pass1234";
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		
 		// 2.Statement 객체 얻기
 		System.out.print("글번호 입력 : ");
 		int bno = sc.nextInt();
 		System.out.print("제목 : ");
 		String title = sc.next();
 		System.out.print("내용 : ");
 		String content = sc.next();
 		System.out.print("작성자 : ");
 		String writer = sc.next();
 		
 		String sql = "INSERT INTO board(bno, title, content, writer)"
 					+ " VALUES("+bno+", '"+title+"', '"+content+"', '"+writer+"')";
 		Statement stmt = conn.createStatement();
 		
 		// 3. 실행. INSERT/UPDATE/DELETE ----> executeUpdate(sql)
 		stmt.executeUpdate(sql);
 		
 		stmt.close();
 		conn.close();
 		
	}
}
