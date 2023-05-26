package projectJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EShopEx {
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String dbId = "project";
	static String dbPw = "p1234";
	 public static void goodsSelect(int goods_id) throws Exception {
         Scanner sc = new Scanner(System.in);
          Class.forName(driver);
          Connection conn = DriverManager.getConnection(url, dbId, dbPw);
        
//          System.out.print("검색할 상품 번호 : ");
//          int y = sc.nextInt();
          
          String sql  = " SELECT goods_img, goods_name, price, price"
                                    + " FROM goods g"
                      + " WHERE goods_id=?";
          PreparedStatement pstmt = conn.prepareStatement(sql);
          pstmt.setInt(1, goods_id);
          
          ResultSet rs = pstmt.executeQuery();
          
          String goods_img ="";
          String goods_name= "";
          while(rs.next()) {
                  goods_img = rs.getString("goods_img");
                  goods_name = rs.getString("goods_name");
                  int price = rs.getInt("price");
                  int price2 = rs.getInt("price");
                  System.out.println(goods_img+"\n"+goods_name+" / 가격 : "+price+" / 금액 : "+price2);
          }
          rs.close();
          pstmt.close();
          
          String sql2 = " SELECT goods_size, inventory"
                      + " FROM goods_size "
                      + " WHERE goods_id = ?";
          PreparedStatement pstmt2 = conn.prepareStatement(sql2);
          pstmt2.setInt(1, goods_id);
         
          ResultSet rs2 = pstmt2.executeQuery();
          while(rs2.next()) {
                  String goods_size = rs2.getString("goods_size");
              int inventory = rs2.getInt("inventory");
              System.out.println(goods_size+" (재고수량 "+inventory+"개)");
          }
          rs2.close();
          pstmt2.close();

          System.out.println("사이즈선택");
          String goods_size = sc.next();
          String sql3 = "SELECT goods_size,inventory FROM goods_size WHERE goods_id = ? AND goods_size = ?";
          PreparedStatement pstmt3 = conn.prepareStatement(sql3);
          pstmt3.setInt(1, goods_id);
          pstmt3.setString(2, goods_size);
          
          ResultSet rs3 = pstmt3.executeQuery();
          String goods_size1 = "";
          int inventory1 = 0;
          if(rs3.next()) {
                  goods_size1 = rs3.getString("goods_size");
                  inventory1 = rs3.getInt("inventory");
                  System.out.println(goods_size1+" (재고수량 "+inventory1+"개)");
          }
//          cart(goods_size,inventory1);
          rs3.close();
          pstmt3.close();
          
          System.out.print("수량: ");
          int quantity = sc.nextInt();
          
          int price = 0;
          String sql4 ="SELECT price FROM goods WHERE goods_id = ?";
          PreparedStatement pstmt4 = conn.prepareStatement(sql4);
          pstmt4.setInt(1, goods_id);
          
          ResultSet rs4 = pstmt4.executeQuery();
          if(rs4.next()) {
                  price = rs4.getInt("price");
          }
          int price2 = price*quantity;
          System.out.println("수량: "+quantity);
          System.out.println("금액: "+price2+"원");
          rs4.close();
          pstmt4.close();
          
          System.out.println("장바구니?:");                // 들어가는지
          String y = sc.next();
          if(y.equals("y"))
          insertCart("ecoeye", goods_id, goods_img, goods_name, goods_size1, inventory1, quantity, price2);
          
          rs.close();
          pstmt.close();
          conn.close();
         
     }
//장바구니 추가
	 static void insertCart(String id,int goods_id,String goods_img,String goods_name,String goods_size1,int inventory1,int quantity,int price2)throws Exception {
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,dbId,dbPw);

        String sql = " INSERT INTO cart(id,goods_id,goods_img,goods_name,goods_size,inventory,o_quantity,price, c_date)"
                                + " VALUES(?,?,?,?,?,?,?,?,sysdate)";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1,id);
        pstmt.setInt(2, goods_id);
        pstmt.setString(3, goods_img);
        pstmt.setString(4, goods_name);
        pstmt.setString(5, goods_size1);
        pstmt.setInt(6, inventory1);
        pstmt.setInt(7,quantity);
        pstmt.setInt(8,price2);
        
        String sql1 = " SELECT count(*) "
                                + " FROM cart "
                                + "        WHERE goods_id =? AND goods_size = ? ";
        PreparedStatement pstmt1 = conn.prepareStatement(sql1);
        pstmt1.setInt(1, goods_id);
        pstmt1.setString(2, goods_size1);
        
        int cnt =0;
        ResultSet rs = pstmt1.executeQuery();
        while(rs.next()) {
                cnt = rs.getInt("count(*)"); 
        }
        if(cnt==0) {
                pstmt.executeUpdate();
                System.out.println("장바구니성공");
        }else {
                cartDuplication(goods_id, goods_size1, quantity, "ecoeye");
        }
        rs.close();
        pstmt1.close();
        
        
        pstmt.close();
        conn.close();
        
	}
	static void cartDuplication(int goods_id,String goods_size1,int quantity,String id)throws Exception { //수량변경
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url,dbId,dbPw);
        
        String sql = "SELECT o_quantity FROM cart WHERE goods_id = ? AND goods_size = ? ";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1, goods_id);
        pstmt.setString(2,goods_size1);
        
        int o_quantity =0;
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
                o_quantity = rs.getInt("o_quantity");
        }
        
        String sql1 = "UPDATE cart SET o_quantity = ? WHERE id= ? AND goods_id =? AND goods_size = ? ";
        PreparedStatement pstmt1 = conn.prepareStatement(sql1);
        pstmt1.setInt(1, quantity);
        pstmt1.setString(2, id);        
        pstmt1.setInt(3, goods_id);
        pstmt1.setString(4, goods_size1);
        
        if(o_quantity!=quantity) {
                pstmt1.executeUpdate();
                System.out.println("수량변경");
        }else {
                System.out.println("그대로");
        }
        rs.close();
        pstmt.close();

        pstmt1.close();
        conn.close();
}
}
