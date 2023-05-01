package jdbcTest;

import java.sql.DriverManager;

// Ex01 : JDBC test(접속테스트)
// 주어지는 정보 (문자열):
//		1. oracle.jdbc.driver.OracleDriver
// 		2. jdbc:oracle:thin:@localhost:1521:xe
public class Ex01 {
	public static void main(String[] args) throws Exception{
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "hr";
 		String dbPw = "hr";
 		
 		System.out.println("<< JDBC 오라클 접속 테스트 >>");
 		Class.forName(driver);
 		DriverManager.getConnection(url, dbId, dbPw);
 		System.out.println("성공.");
 		
	}
}
