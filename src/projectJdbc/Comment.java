package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Comment {
        static Scanner sc = new Scanner(System.in);
    static String driver = "oracle.jdbc.driver.OracleDriver";
    static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    static String dbId = "project";
    static String dbPw = "p1234";
    // 게시글, 댓글, 답글 체크
    static void comment_Check(String id) throws Exception {
            System.out.print("게시글 번호를 입력하세요(게시글을 선택하세요) >>");
            int bno = sc.nextInt();
            System.out.print("댓글은 C 답글은 CC를 입력하세요 >>");
            String awnser = sc.next();
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            if(awnser.equals("C")) {
                    insert_comment(id,bno);
                    }
            if(awnser.equals("CC")) {
                    insert_nested_comment(id,bno);
            }
            conn.close();
    }
    // 댓글 입력
    static void insert_comment(String id,int bno) throws Exception {
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            System.out.print("내용을 입력하세요 >>");
                String content = sc.next();
                String sql = "INSERT INTO social_comment(rno,bno,content,writer,step,r_order,w_date,ref) VALUES(seq_social_r.nextval,?,?,?,0,?,sysdate,seq_social_r.currval)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, bno);
                pstmt.setString(2, content);
                pstmt.setString(3, id);
                pstmt.setInt(4, comment_num_Check(bno)+1);
                pstmt.executeQuery();
                r_num_Update(bno,comment_num_Check(bno)+1);
                pstmt.close();
                conn.close();
    }
    // 대댓글 입력
    static void insert_nested_comment(String id,int bno) throws Exception {
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            System.out.print("답글을 작성하려는 댓글의 번호를 입력하세요 >>");
                int awnserNum = sc.nextInt();
                System.out.print("내용을 입력하세요 >>");
                String content = sc.next();
                String sql = "INSERT INTO social_comment(rno,bno,content,writer,step,r_order,w_date,ref) VALUES(seq_social_r.nextval,?,?,?,?,?,sysdate,?)";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, bno);
                pstmt.setString(2, content);
                pstmt.setString(3, id);
                pstmt.setInt(4,step_Check(awnserNum));
                pstmt.setInt(5,order_num_Check(awnserNum));
                pstmt.setInt(6, awnserNum);
                r_order_Update(bno,order_num_Check(awnserNum));
                pstmt.executeQuery();
                r_num_Update(bno,comment_num_Check(bno)+1);
                pstmt.close();
                conn.close();
    }
    // 댓글 순서 확인
    static int order_num_Check(int awnserNum) throws Exception {
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            String sql = "SELECT MAX(r_order) FROM social_comment WHERE ref = ?";
            String sql1 = "SELECT r_order FROM social_comment WHERE rno = ?";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                PreparedStatement pstmt1 = conn.prepareStatement(sql1);
                pstmt.setInt(1, awnserNum);
                pstmt1.setInt(1, awnserNum);
                ResultSet rs = pstmt.executeQuery();
                ResultSet rs1 = pstmt1.executeQuery();
                int order_num = 0;
                if(rs.next()) {
                        order_num = rs.getInt("MAX(r_order)")+1;
                        }
                if(order_num == 1){
                        if(rs1.next()) {
                                order_num = rs1.getInt("r_order")+1;
                        }
                }
                rs1.close();
                rs.close();
                pstmt1.close();
                pstmt.close();
                conn.close();
                return order_num;
    }
    // 들여쓰기 확인
    static int step_Check(int awnserNum) throws Exception{
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            String sql = "SELECT step FROM social_comment WHERE rno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, awnserNum);
            ResultSet rs = pstmt.executeQuery();
            int step = 0;
            if(rs.next()) {
                    step = rs.getInt("step")+1;
            }
            rs.close();
            pstmt.close();
            conn.close();
            return step;
    }
    // 댓글 갯수 확인
    static int comment_num_Check(int bno) throws Exception{
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            String sql = "SELECT r_num FROM social_board WHERE bno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bno);
            ResultSet rs = pstmt.executeQuery();
            int r_num = 0;
            if(rs.next()) {
                    r_num = rs.getInt("r_num");
            }
            rs.close();
            pstmt.close();
            conn.close();
            return r_num;
    }
    // 댓글 갯수 업데이트
    static void r_num_Update(int bno, int r_num) throws Exception{
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            String sql = "UPDATE social_board SET r_num = ? WHERE bno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, r_num);
            pstmt.setInt(2, bno);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
    }
    // 순서 업데이트
    static void r_order_Update(int bno,int orderNum) throws Exception{
            Connection conn = DriverManager.getConnection(url, dbId, dbPw);
            Class.forName(driver);
            String sql = "UPDATE social_comment SET r_order = r_order + 1 WHERE r_order >= ? AND bno = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, orderNum);
            pstmt.setInt(2, bno);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
    }
    // 아이디 확인
        public static void main(String[] args) {
                System.out.print("아이디를 입력하세요 >>");
                String id = sc.next();
                try {
                        comment_Check(id);
                } catch (Exception e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }
}
