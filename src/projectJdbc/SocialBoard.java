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
	
	public void socialWrite() throws Exception {
         Class.forName(driver);
         Connection conn = DriverManager.getConnection(url, dbId, dbPw);
         System.out.print("제목 : ");
         String title = sc.next();
         System.out.print("내용 : ");
         String content = sc.next();
         String sql = "select bno from social_board ORDER BY bno";
         PreparedStatement pstmt = conn.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery();
         String sql2 = " INSERT INTO social_board(bno, writer, title, content, w_date, r_num, good, bad)"
                     + " VALUES(seq_social.nextval, ?, ?, ?, sysdate, 0, 0, 0)";
         PreparedStatement pstmt2 = conn.prepareStatement(sql2);
         pstmt2.setString(1, myId);
         pstmt2.setString(2, title);
         pstmt2.setString(3, content);
         pstmt2.executeUpdate(); 
         pstmt2.close();
         rs.close();
         pstmt.close();
         conn.close();
	}
	public void socialCommentWrite() throws Exception {
		Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, dbId, dbPw);
        String sql = "";
	}
	public void socialAllSearch() throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		System.out.print("작성자 검색 : ");
		String search = sc.next();
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
	public void socialWriterSearch() throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		System.out.print("작성자 검색 : ");
		String search = sc.next();
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
	public void socialContentSearch() throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		System.out.print("내용 검색 : ");
		String search = sc.nextLine();
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
	public void socialTitleSearch() throws Exception {
		Class.forName(driver);					
		Connection conn = DriverManager.getConnection(url,dbId,dbPw);
		System.out.print("제목 검색 : ");
		String search = sc.nextLine();
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
	public void socialDetail() throws Exception {
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
		System.out.print("게시판 번호 입력 : ");
		int bnoNum = sc.nextInt();
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
