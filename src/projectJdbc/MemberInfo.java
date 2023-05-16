package projectJdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;							

	
class MemberUpdate extends MemberLogin {
	MemberUpdate(String myId, String myPw, boolean lb) {
		super(myId, myPw, lb);
	}
	static Scanner sc = new Scanner(System.in);
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	public void myPageShow() throws Exception {
		System.out.println("마이페이지");
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,dbId,dbPw);
        String sql = "SELECT * FROM member where id = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,myId);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()) {
                String name = rs.getString("name");
                String nick_name = rs.getString("nick_name");
                String id = rs.getString("id");
                String pass = rs.getString("pass");
                int number_of_login = rs.getInt("number_of_login");
                if(id.equals(myId)&& pass.equals(myPw)) {
                        System.out.println(name+"("+nick_name+") "+id+" "+ number_of_login);
                }
        }
        rs.close();
        pstmt.close();
        conn.close();
    }

	public boolean Check() throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		// PreparedStatement
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		System.out.print("비밀번호 입력 : ");
		String myPw = sc.next();
		boolean b = false;
		while(rs.next()) {
			String allId = rs.getString("id");
			String allPass = rs.getString("pass");
			if(myId.equals(allId) && myPw.equals(allPass)) {
				b = true;
				break;
			}
		}
		rs.close();
		pstmt.close();
		conn.close();
		return b;
	}
	public void PwUpdate(String newPw, String newPwCheck) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		// PreparedStatement
		if(newPw.equals(newPwCheck)) {
			String sql = " UPDATE member SET pass = ? WHERE pass = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPwCheck);
			pstmt.setString(2, myPw);
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("비밀번호가 수정되었습니다.");
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		conn.close();
	}
	public void NickNameUpdate(String newNickName) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		// PreparedStatement
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		String NickName = "";
		while(rs.next()) {
			String id = rs.getString("id");
			NickName = rs.getString("nick_name");
			if(myId.equals(id)) {
				System.out.println("닉네임 : " + NickName);
				break;
			}
		}
		boolean b = true;
		while(rs.next()) {
			String allNickName = rs.getString("nick_name");
			if(newNickName.equals(allNickName)) {
				System.out.println("중복된 아이디가 있습니다.");
				b = false;
				break;
			}
		}
		if(b) {
			String sqlNickUpdate = " UPDATE member SET nick_name = ?" + 
								   " WHERE nick_name = ?";
			PreparedStatement pstmt2 = conn.prepareStatement(sqlNickUpdate);
			pstmt2.setString(1, newNickName);
			pstmt2.setString(2, NickName);
			pstmt2.executeUpdate();
			System.out.println("수정 완료");
			pstmt2.close();
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void EmailUpdate(String newEmail) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		// PreparedStatement
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		String email = "";
		while(rs.next()) {
			String id = rs.getString("id");
			email = rs.getString("email");
			if(myId.equals(id)) {
				System.out.println("이메일 : " + email);
				break;
			}
		}
		String sqlEmailUpdate = " UPDATE member SET email = ?" + 
							    " WHERE email = ?";
		PreparedStatement pstmt2 = conn.prepareStatement(sqlEmailUpdate);
		pstmt2.setString(1, newEmail);
		pstmt2.setString(2, email);
		pstmt2.executeUpdate();
		System.out.println("수정 완료");
		pstmt2.close();
		
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void EmailReceive(String eReceiveChange) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String eReceive = rs.getString("email_receive");
			if(myId.equals(id)) {
				System.out.println("이메일 수신 : " + eReceive);
				break;
			}
		}
		String sql = " UPDATE member SET email_receive=?" +
					 " WHERE id = ?";
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, eReceiveChange);
		pstmt2.setString(2, myId);
		pstmt2.executeUpdate();
		System.out.println("수정 완료");
		pstmt2.close();
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void PhoneUpdate(String newTel, String newPhone) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		String phone = "";
		String telecom = "";
		while(rs.next()) {
			String id = rs.getString("id");
			phone = rs.getString("phone");
			telecom = rs.getString("telecom");
			if(myId.equals(id)) {
				System.out.println(telecom + " " + phone);
				break;
			}
		}
		String sql = "UPDATE member SET telecom=?, phone=? WHERE id=?";
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, newTel);
		pstmt2.setString(2, newPhone);
		pstmt2.setString(3, myId);
		pstmt2.executeUpdate();
		System.out.println("수정완료");
		pstmt2.close();
		rs.close();
		pstmt.close();
		conn.close();
		
	}
	public void smsReceive(String smsReceiveChange) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String smsReceive = rs.getString("sms_receive");
			if(myId.equals(id)) {
				System.out.println("sms수신 : " + smsReceive);
				break;
			}
		}
		String sql = " UPDATE member SET sms_receive=?" +
					 " WHERE id = ?";
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, smsReceiveChange);
		pstmt2.setString(2, myId);
		pstmt2.executeUpdate();
		System.out.println("수정 완료");
		pstmt2.close();
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void phoneOwnerUpdate(String phoneOwnerChange) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String phoneOwner = rs.getString("phone_owner");
			if(myId.equals(id)) {
				System.out.println("휴대폰 소유 : " + phoneOwner);
				break;
			}
		}
		String sql = " UPDATE member SET phone_owner=?" +
					 " WHERE id = ?";
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, phoneOwnerChange);
		pstmt2.setString(2, myId);
		pstmt2.executeUpdate();
		System.out.println("수정 완료");
		pstmt2.close();
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void detailAddressUpdate(String detailAddressChange) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sqlA = "SELECT * FROM member";
		PreparedStatement pstmt = conn.prepareStatement(sqlA);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			String id = rs.getString("id");
			String detailAddress = rs.getString("detail_address");
			if(myId.equals(id)) {
				System.out.println("상세주소 : " + detailAddress);
				break;
			}
		}
		String sql = " UPDATE member SET detail_address=?" +
					 " WHERE id = ?";
		PreparedStatement pstmt2 = conn.prepareStatement(sql);
		pstmt2.setString(1, detailAddressChange);
		pstmt2.setString(2, myId);
		pstmt2.executeUpdate();
		System.out.println("수정 완료");
		pstmt2.close();
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void delete(String myPw) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);										
		String sql1 = "SELECT * FROM member ";					
		PreparedStatement pstmt1 = conn.prepareStatement(sql1);					
		ResultSet rs = pstmt1.executeQuery();					
		boolean b = false;					
		String secession = "";					
		while(rs.next()) {					
			String id = rs.getString("id");				
			String pw = rs.getString("pass");				
			secession = rs.getString("secession");				
			if(id.equals(myId) && pw.equals(myPw))				
				{			
					b = true;		
					break;		
				}			
		}					
		if (!b) {					
				System.out.println("비밀번호가 틀렸습니다");			
			}				
		if(secession.equals("N")&&b) {					
				String sql = "UPDATE member SET secession = 'Y' WHERE id = ? and pass = ? AND secession = 'N'";			
				PreparedStatement pstmt = conn.prepareStatement(sql);			
				pstmt.setString(1, myId);			
				pstmt.setString(2, myPw);			
				pstmt.executeUpdate();			
				pstmt.close();			
				System.out.println("탈퇴가 되었습니다");			
			}				
		else if (secession.equals("Y")&&b){					
				System.out.println("이미 탈퇴한 id입니다");			
			}				
		rs.close();
		pstmt1.close();
		conn.close();	
	}
}

public class MemberInfo {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
//		MemberUpdate mem = new MemberUpdate();
//		System.out.print("비밀번호 입력 : ");
//		String myPw = sc.next();
//		boolean b = mem.Check();
//		if(b) {
//			mem.PwUpdate();
//			mem.NickNameUpdate();
//			mem.EmailUpdate();
//			mem.EmailReceive();
//			mem.PhoneUpdate();
//			mem.smsReceive();
//			mem.phoneOwnerUpdate();
//			mem.detailAddressUpdate();
//		}else {
//			System.out.println("비밀번호가 일치하지 않습니다.");
//		}
	}
}
