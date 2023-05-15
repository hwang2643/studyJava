package projectJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class MemberLogin {
	String myId;
	String myPw;
	boolean lb;
	MemberLogin(String myId, String myPw, boolean lb) {
		this.myId = myId;
		this.myPw = myPw;
		this.lb = lb;
	}
	public boolean logCheck() {
		return lb;
	}
	static Scanner sc = new Scanner(System.in);
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	public void login() throws Exception {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,dbId,dbPw);
//        System.out.print("아이디: ");
//        myId = sc.next();
//        System.out.print("비밀번호: ");
//        myPw = sc.next();            
        String sql = "SELECT * FROM member";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        boolean b = false;
        int n_o_log = 0;
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
                String id = rs.getString("id");
                String pass = rs.getString("pass");
                String secession = rs.getString("secession");
                int number_of_login = rs.getInt("number_of_login");
                if(myId.equals(id)&&myPw.equals(pass)&&secession.equals("N")) 
                                {
                                        n_o_log = ++number_of_login;
                                b =true;
                                break;
                        }
                }
        if(b==true){
                String usql = "UPDATE member SET number_of_login = ? WHERE id = ? AND pass = ?";
                PreparedStatement pstmt1 = conn.prepareStatement(usql);
                pstmt1.setInt(1, n_o_log);
                pstmt1.setString(2,myId);
                pstmt1.setString(3, myPw);
                pstmt1.executeUpdate();
                pstmt1.close();
                System.out.println("로그인 성공!!");
                System.out.println("로그인 횟수 : "+n_o_log);
        }
        else {
        	lb = false;
        	System.out.println("등록되지 않은 아이디이거나,아이디 또는 비밀번호를 잘못 입력하셨습니다.");
        }
        rs.close();
        pstmt.close();
        conn.close();
	}
}
