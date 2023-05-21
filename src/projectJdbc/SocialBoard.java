package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SocialBoard extends MemberLogin{
	SocialBoard(String myId, String myPw, boolean lb) {
		super(myId, myPw, lb);
	}
	static Scanner sc = new Scanner(System.in);
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	static int bnoNum;
	
	public void socialWrite(String title, String content) throws Exception {
         Class.forName(driver);
         Connection conn = DriverManager.getConnection(url, dbId, dbPw);
         String sql = " INSERT INTO social_board(bno, writer, title, content, w_date, r_num, good, bad)"
                     + " VALUES(seq_social.nextval, ?, ?, ?, sysdate, 0, 0, 0)";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, myId);
         pstmt.setString(2, title);
         pstmt.setString(3, content);
         pstmt.executeUpdate(); 
         pstmt.close();
         conn.close();
	}
	public void socialCommentWrite(String content, int bnoNum) throws Exception {
		Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, dbId, dbPw);
        String insert = " INSERT INTO social_comment(rno, bno, content, writer, step, r_order, ref, w_date)" +
        				" VALUES(seq_social_comment.nextval, ?, ?, ?, ?, ?, ?, sysdate)";
        PreparedStatement pstmt = conn.prepareStatement(insert);
        int step = 0;
        int rOrder = 0;
        int ref = 0;
        pstmt.setInt(1, bnoNum);
        pstmt.setString(2, content);
        pstmt.setString(3, myId);
        String sqlStep = "SELECT rno FROM social_comment WHERE bno=?";
        PreparedStatement pstmt2 = conn.prepareStatement(sqlStep);
        ResultSet rs2 = pstmt2.executeQuery();
        pstmt.setInt(4, step);
        pstmt.setInt(5, rOrder);
        pstmt.setInt(6, ref);
        pstmt.close();
        conn.close();
        
        
	}
	public void socialAllSearch(String search) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sql = " SELECT rownum, sb.bno, sb.title, m.name, m.nick_name, sb.w_date, sb.r_num"
				   + " FROM member m, social_board sb, (SELECT rownum, sb.bno, m.id FROM social_board sb, member m WHERE sb.writer=m.id ORDER BY bno) rn"
				   + " WHERE m.id=sb.writer AND rn.bno=sb.bno AND m.id=sb.writer AND rn.id=m.id AND (m.name LIKE ? OR m.nick_name LIKE ? OR sb.title LIKE ? OR sb.content LIKE ?)"
				   + " ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+search+"%");
		pstmt.setString(2, "%"+search+"%");
		pstmt.setString(3, "%"+search+"%");
		pstmt.setString(4, "%"+search+"%");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int rownum = rs.getInt("rownum");
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String name = rs.getString("name");
			String nickName = rs.getString("nick_name");
			String wDate = rs.getString("w_date");
			int rNum = rs.getInt("r_num");
			System.out.println(rownum + " " + bno + " " + title + " " + name+"/"+nickName + " " + wDate + " " + rNum);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void socialWriterSearch(String search) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sql = " SELECT rownum, sb.bno, sb.title, m.name, m.nick_name, sb.w_date, sb.r_num"
				   + " FROM member m, social_board sb, (SELECT rownum, sb.bno, m.id FROM social_board sb, member m WHERE sb.writer=m.id ORDER BY bno) rn"
				   + " WHERE m.id=sb.writer AND rn.bno=sb.bno AND m.id=sb.writer AND rn.id=m.id AND (m.name LIKE ? OR m.nick_name LIKE ?)"
				   + " ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+search+"%");
		pstmt.setString(2, "%"+search+"%");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int rownum = rs.getInt("rownum");
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String name = rs.getString("name");
			String nickName = rs.getString("nick_name");
			String wDate = rs.getString("w_date");
			int rNum = rs.getInt("r_num");
			System.out.println(rownum + " " + bno + " " + title + " " + name+"/"+nickName + " " + wDate + " " + rNum);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void socialContentSearch(String search) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		System.out.print("내용 검색 : ");
		String sql = " SELECT rownum, sb.bno, sb.title, m.name, m.nick_name, sb.w_date, sb.r_num" +
					 " FROM social_board sb, member m, (SELECT rownum, bno FROM social_board ORDER BY bno) rn" +
					 " WHERE sb.writer=m.id AND rn.bno=sb.bno AND sb.content LIKE ?" +
					 " ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+search+"%");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int rownum = rs.getInt("rownum");
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String name = rs.getString("name");
			String nickName = rs.getString("nick_name");
			String wDate = rs.getString("w_date");
			int rNum = rs.getInt("r_num");
			System.out.println(rownum + " " + bno + " " + title + " " + name+"/"+nickName + " " + wDate + " " + rNum);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void socialTitleSearch(String search) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sql = " SELECT rownum, sb.bno, sb.title, m.name, m.nick_name, sb.w_date, sb.r_num" +
					 " FROM social_board sb, member m, (SELECT rownum, bno FROM social_board ORDER BY bno) rn" +
					 " WHERE sb.writer=m.id AND rn.bno=sb.bno AND sb.title LIKE ?" +
					 " ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "%"+search+"%");
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int rownum = rs.getInt("rownum");
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String name = rs.getString("name");
			String nickName = rs.getString("nick_name");
			String wDate = rs.getString("w_date");
			int rNum = rs.getInt("r_num");
			System.out.println(rownum + " " + bno + " " + title + " " + name+"/"+nickName + " " + wDate + " " + rNum);
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void mainBoard() throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		// 2) PreparedStatement
		String sql = " SELECT rownum, sb.bno, sb.title, m.name, m.nick_name, sb.w_date, sb.r_num"
				   + " FROM member m, social_board sb, (SELECT rownum, bno FROM social_board ORDER BY bno) rn"
			   	   + " WHERE m.id=sb.writer AND rn.bno(+)=sb.bno"
				   + " ORDER BY bno DESC";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		// 3) ResultSet
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			int rownum = rs.getInt("rownum");
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String name = rs.getString("name");
			String nickName = rs.getString("nick_name");
			String wDate = rs.getString("w_date");
			int rNum = rs.getInt("r_num");
			System.out.println(rownum + " " + bno + " " + title + " " + name+"/"+nickName + " " + wDate + " " + rNum);
			
		}
		rs.close();
		pstmt.close();
		conn.close();
	}
	public void socialDetail(int bnoNum) throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		String sql = " SELECT sb.title, m.name, m.nick_name, sb.w_date, sb.content, sb.good, sb.bad" +
					 " FROM social_board sb, member m" +
					 " WHERE sb.writer=m.id AND bno=?";
		String sqlC = " SELECT m.name, m.nick_name, sc.w_date, sc.content, sc.step" +
					  " FROM member m, social_comment sc" + 
					  " WHERE m.id=sc.writer AND bno=?" + 
					  " ORDER BY sc.r_order";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		PreparedStatement pstmt2 = conn.prepareStatement(sqlC);
		pstmt.setInt(1, bnoNum);
		pstmt2.setInt(1, bnoNum);
		ResultSet rs = pstmt.executeQuery();
		ResultSet rs2 = pstmt2.executeQuery();
		while(rs.next()) {
			String title = rs.getString("title");
			String name = rs.getString("name");
			String nickName = rs.getString("nick_name");
			String wDate = rs.getString("w_date");
			String content = rs.getString("content");
			int good = rs.getInt("good");
			int bad = rs.getInt("bad");
			System.out.println(title + " " + name + "/" + nickName + " " + wDate + " " + content + " " + good + " " + bad + "\n");
		}
		while(rs2.next()) {
			String name = rs2.getString("name");
			String nickName = rs2.getString("nick_name");
			String wDate = rs2.getString("w_date");
			String content = rs2.getString("content");
			int step = rs2.getInt("step");
			if(step==1) {
				System.out.println("\t" + name + "/" + nickName + " " + wDate + " " + content + "\n");
			}else {
				System.out.println(name + "/" + nickName + " " + wDate + " " + content + "\n");
			}
		}
		rs2.close();
		rs.close();
		pstmt2.close();
		pstmt.close();
		conn.close();
	}
}
