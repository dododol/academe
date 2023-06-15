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
	      String sql="SELECT b2.BK_NO, b2.BK_SHFCODE, b2.BK_TITLE, b2.BK_WRITER, b2.BK_PUB, NVL2(b2.BK_LDSNO,'������','���Ⱑ��') A, NVL2(b2.BK_RSVSNO,'������','�������') B\r\n" + 
	               "FROM (select REPLACE(BK_TITLE, ' ','') TITLE, bk_no FROM BOOK) b1, book b2\r\n" + 
	               "where b1.bk_no=b2.bk_no and b1.title like replace( ? , ' ', '') order by b2.bk_title asc \r\n";
	      Map<String ,Object> search = null;
	      List<Map<String, Object>> searchList=null;
	      try {
	         
	         
	        jdbc.connectConn();
	         
	         jdbc.daoConn.pstmt = jdbc.daoConn.conn.prepareStatement(sql);
	         
	         System.out.print("�˻��� ���� �Է� : ");
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
	         //å��ȣ �����ڵ� ������ ������
	         //���� ���� ���ǻ�
	         if(searchList.size()>0 && searchList.size()<10) {
	            for(int i=0; i < searchList.size(); i++) {
	               System.out.print("å��ȣ : " + searchList.get(i).get("BK_NO") + "   |   ");
	               System.out.print("�����ڵ� : " + searchList.get(i).get("BK_SHFCODE") + "   |   ");
	               System.out.print("������ : " + searchList.get(i).get("A") + "   |   ");
	               System.out.print("������ : " + searchList.get(i).get("B") + "   |   ");
	               System.out.println();
	               System.out.print("���� : " + searchList.get(i).get("BK_TITLE")+"   |   ");
	               System.out.print("���� : " + searchList.get(i).get("BK_WRITER")+"   |   ");
	               System.out.print("���ǻ� : " + searchList.get(i).get("BK_PUB")+"   |   ");
	               System.out.println();
	               System.out.println("----------------------------------------------");
	            }
	         }else if(searchList.size()==0) {
	            System.out.println("�˻��� ������ �����ϴ�.");
	         }else if(searchList.size()>10) {
	            System.out.println("�˻��� �ڷᰡ �ʹ� �����ϴ�. ");
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
	               System.out.print("å��ȣ : "+ no + "   |   ");
	               System.out.print("�����ڵ� : "+ shf + "   |   ");
	               System.out.print("������ : "+ lds + "   |   ");
	               System.out.print("������ : "+ rsv + "   |   ");
	               System.out.println();
	               System.out.print("���� : "+ title + "   |   ");
	               System.out.print("���� : "+ wri + "   |   ");
	               System.out.print("���ǻ� : "+ pub + "   |   ");
	               System.out.println();
	               System.out.println();
	               
	            } else {
	               return;
	            }
	         }

	         inputLoop: while (true) {
	        	System.out.println("----------------------");
	            System.out.println("1. ���������� | 2. �ǵ��ư���");
	        	System.out.println("----------------------");
	        	System.out.println();
	        	System.out.println("----------------------");
	            System.out.print("�Է� : ");
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
	               System.out.println("�߸��� �Է��Դϴ�.");
	               continue inputLoop;
	            }// ����ġ �� ��
	         }

	      } // while�� ��

	   }
}