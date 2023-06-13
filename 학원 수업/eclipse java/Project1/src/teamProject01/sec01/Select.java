package teamProject01.sec01;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Select {
	public static void main(String[] args) {
		Sel sl = new Sel();
		sl.selectBKNO();
	}
}
class Sel{
	JDBCUtil jdbc = JDBCUtil.getInstance();
	public void selectBKNO() {
	      String sql="SELECT b2.BK_NO, b2.BK_SHFCODE, b2.BK_TITLE, b2.BK_WRITER, b2.BK_PUB, NVL2(b2.BK_LDSNO,'대출중','대출가능') A, NVL2(b2.BK_RSVSNO,'예약중','예약없음') B\r\n" + 
	               "FROM (select REPLACE(BK_TITLE, ' ','') TITLE, bk_no FROM BOOK) b1, book b2\r\n" + 
	               "where b1.bk_no=b2.bk_no and b1.title like replace( ? , ' ', '') order by b2.bk_title asc \r\n";
	      Map<String ,Object> search = null;
	      List<Map<String, Object>> searchList=null;
	      try {
	         
	         
	        jdbc.connectConn();
	         
	         jdbc.daoConn.pstmt = jdbc.daoConn.conn.prepareStatement(sql);
	         
	         System.out.print("검색할 도서 입력 : ");
	         String a = jdbc.sc.nextLine();
	         
	         jdbc.daoConn.pstmt.setString(1, "%"+a+"%");
	         
	         jdbc.daoConn.rs = jdbc.daoConn.pstmt.executeQuery();
	         
	         printResultSet(jdbc.daoConn.rs);
	         searchList= new ArrayList<Map<String, Object>>();
	         
	         while (jdbc.daoConn.rs.next()) {
	           search = new HashMap<>();
	           ResultSetMetaData rsmd = jdbc.daoConn.rs.getMetaData();
	           int cnt= rsmd.getColumnCount();
	           for(int i=0; i<cnt; i++){
	              search.put(rsmd.getColumnName(i+1), jdbc.daoConn.rs.getObject(i+1));
	           }
	           searchList.add(search);
//	           System.out.println(search);
	         }
	         //책번호 서가코드 대출자 예약자
	         //제목 저자 출판사
	         if(searchList.size()>0 && searchList.size()<10) {
	            for(int i=0; i < searchList.size(); i++) {
	               System.out.print("책번호 : " + searchList.get(i).get("BK_NO") + "   |   ");
	               System.out.print("서가코드 : " + searchList.get(i).get("BK_SHFCODE") + "   |   ");
	               System.out.print("대출자 : " + searchList.get(i).get("A") + "   |   ");
	               System.out.print("예약자 : " + searchList.get(i).get("B") + "   |   ");
	               System.out.println();
	               System.out.print("제목 : " + searchList.get(i).get("BK_TITLE")+"   |   ");
	               System.out.print("저자 : " + searchList.get(i).get("BK_WRITER")+"   |   ");
	               System.out.print("출판사 : " + searchList.get(i).get("BK_PUB")+"   |   ");
	               System.out.println();
	               System.out.println("----------------------------------------------");
	            }
	         }else if(searchList.size()==0) {
	            System.out.println("검색된 도서가 없습니다.");
	         }else if(searchList.size()>10) {
	            System.out.println("검색된 자료가 너무 많습니다. ");
	         }
	      
	      } catch (SQLException e) {
	         e.printStackTrace();

	   }
	}
	
	public void printResultSet(ResultSet rs) throws SQLException{
	      Scanner scc = new Scanner(System.in);
	      int a = 0;
	      int count = 10;
	      Loop1: while (true) {

	         for (; a < count; a++) {
	            if (rs.next()) {
	               String no = String.valueOf(rs.getObject("BK_NO"));
	               String shf = String.valueOf(rs.getObject("BK_SHFCODE"));
	               String lds = String.valueOf(rs.getObject("A"));
	               String rsv = String.valueOf(rs.getObject("B"));
	               String title = String.valueOf(rs.getObject("BK_TITLE"));
	               String wri = String.valueOf(rs.getObject("BK_WRITER"));
	               String pub = String.valueOf(rs.getObject("BK_PUB"));
	               System.out.print("책번호 : "+ no + "   |   ");
	               System.out.print("서가코드 : "+ shf + "   |   ");
	               System.out.print("대출자 : "+ lds + "   |   ");
	               System.out.print("예약자 : "+ rsv + "   |   ");
	               System.out.println();
	               System.out.print("제목 : "+ title + "   |   ");
	               System.out.print("저자 : "+ wri + "   |   ");
	               System.out.print("출판사 : "+ pub + "   |   ");
	               System.out.println();
	               System.out.println();
	               
	            } else {
	               return;
	            }
	         }

	         inputLoop: while (true) {
	        	System.out.println("----------------------");
	            System.out.println("1. 다음페이지 | 2. 되돌아가기");
	        	System.out.println("----------------------");
	        	System.out.println();
	        	System.out.println("----------------------");
	            System.out.print("입력 : ");
	            String input = scc.nextLine();
	        	System.out.println("----------------------");

	        	switch (input) {
	            case "1":
	               count += 10;
	               jdbc.clearConsole();
	               break inputLoop;
	            case "2":
	               return;
	            default:
	               System.out.println("잘못된 입력입니다.");
	               continue inputLoop;
	            }// 스위치 문 끝
	         }

	      } // while문 끝

	   }
}