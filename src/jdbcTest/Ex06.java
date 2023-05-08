package jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex06 {
	public static void main(String[] args) throws Exception {
		String driver = "oracle.jdbc.driver.OracleDriver";
 		String url = "jdbc:oracle:thin:@localhost:1521:xe";
 		String dbId = "hr";
 		String dbPw = "hr";
 		
 		Class.forName(driver);
 		// 1) Connection 객체.
 		Connection conn = DriverManager.getConnection(url, dbId, dbPw);
 		
 		//2) Statement 객체 얻기
 		String var1 = "St";
 		String var2 = "g";
 		int var3 = 7000;
 		String sql = " SELECT *" +
 					 " FROM employees" +
 					 " WHERE (first_name LIKE '"+var1+"%' OR last_name LIKE '%"+var2+"') AND salary>="+var3;
 		Statement stmt = conn.createStatement();
 		
 		// 3) ResultSet 객체로 실행결과 가져오기
 		ResultSet rs = stmt.executeQuery(sql);
 		while(rs.next()) {
 			int employeeId = rs.getInt("employee_id");
 			String firstName = rs.getString("first_name");
 			String lastName = rs.getString("last_name");
 			int salary = rs.getInt("salary");
 			System.out.println(employeeId + " : " + firstName + " " + lastName + " " + salary);
 		}
 		
 		rs.close();
 		stmt.close();
 		conn.close();
	}
}
