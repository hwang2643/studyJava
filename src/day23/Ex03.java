package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

//전체 게시글보기 
public class Ex03 {
	public static void main(String[] args) throws Exception {
		String driver= "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "testw8";
		String dbPw = "pass1234";
		Class.forName(driver);
		//1. Connection 객체얻기
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		
		//2. Statement 객체얻기
		String sql = "SELECT * FROM board order by bno desc ";
		Statement stmt = conn.createStatement();
		
		//3. 실행후 ResultSet 객체 얻기
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int bno = rs.getInt("bno");
			String title  = rs.getString("title");
			String writer = rs.getString("writer");
			System.out.println(bno+" / "+title+" / "+writer);
		}
		rs.close();
		stmt.close();
		conn.close();

	}
}
