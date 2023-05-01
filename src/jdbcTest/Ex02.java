package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "hr";
 		String dbPw = "hr";
 		
 		System.out.println("<< JDBC 오라클 테스트 >>");
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		
 		// 2) Statement 객체.
 		String sql = "SELECT * FROM jobs";  // [주의] 세미콜론(;) 없어야.
 		Statement stmt = conn.createStatement();
 		
 		// 3) ResultSet 객체.
 		ResultSet rs = stmt.executeQuery(sql);
 		while(rs.next()) {  // rs.next() : 다음 row가 있면 손가락 이동, true 리턴.
 			String jobId = rs.getNString("job_id");
 			String jobTitle = rs.getNString("job_title");
 			int minSalary = rs.getInt("min_salary");
 			int maxSalary = rs.getInt(4);
 			System.out.println(jobId + "/" + jobTitle + "/" + minSalary + "/" + maxSalary);
 		}
 		rs.close();
 		stmt.close();
 		conn.close();
 		
 		
	}
}
