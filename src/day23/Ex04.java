package day23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

//게시글 상세보기
public class Ex04 {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);
		String driver= "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbId = "testw8";
		String dbPw = "pass1234";
		Class.forName(driver);
		//1. Connection 객체얻기
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		
		//2. Statement 객체얻기
		System.out.println("첫번째fsdfsd");
		int bno  =sc. nextInt();
		
		String sql = "SELECT * FROM board WHERE bno= "+bno; 
		Statement stmt = conn.createStatement();
		
		//3.실행후 ResultSet 객체얻기
		ResultSet rs = stmt.executeQuery(sql);
		if(rs.next()){
			String title = rs.getString("title");
			String content = rs.getString("content");
			String writer = rs. getString("writer");
			System.out.println("계시글 번호 "+bno);
			System.out.println("계시글 제목 "+title);
			System.out.println("계시글 내용 "+content);
			System.out.println("계시글 작성자"+writer);
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
