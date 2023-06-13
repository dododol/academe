package teamProject01.sec01;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




public class BookSearch {
   
   public static void main(String[] args) {
      SS s1=new SS();
      
      s1.selectBKNO();
      
   }
}
   
class SS {
   JDBCUtil jdbc = JDBCUtil.getInstance();
   public void selectBKNO() {
      String sql="SELECT b2.*\r\n" + 
            "FROM (select REPLACE(BK_TITLE, ' ','') TITLE, bk_no FROM BOOK) b1, book b2\r\n" + 
            "where b1.bk_no=b2.bk_no and b1.title like replace(?, ' ', '')\r\n";
      Map<String ,Object> search = null;
      List<Map<String, Object>> searchList=null;
      try {
         
         
        jdbc.connectConn();
         
         jdbc.daoConn.pstmt = jdbc.daoConn.conn.prepareStatement(sql);
         
         System.out.print("�˻��� ���� �Է� : ");
         String a = jdbc.sc.nextLine();
         
         jdbc.daoConn.pstmt.setString(1, "%"+a+"%");
         
         jdbc.daoConn.rs = jdbc.daoConn.pstmt.executeQuery();
         
         searchList= new ArrayList<Map<String, Object>>();
         
         while (jdbc.daoConn.rs.next()) {
            search = new HashMap<>();
           ResultSetMetaData rsmd = jdbc.daoConn.rs.getMetaData();
           int cnt= rsmd.getColumnCount();
           for(int i=0; i<cnt; i++){
              search.put(rsmd.getColumnName(i+1), jdbc.daoConn.rs.getObject(i+1));
           }
           searchList.add(search);
//           System.out.println(search);
         }
         //å��ȣ �����ڵ� ������ ������
         //���� ���� ���ǻ�
         if(searchList.size()>0 && searchList.size()<10) {
            for(int i=0; i < searchList.size(); i++) {
               System.out.print("å��ȣ : " + searchList.get(i).get("BK_NO") + "   |   ");
               System.out.print("�����ڵ� : " + searchList.get(i).get("BK_SHFCODE") + "   |   ");
               System.out.print("������ : " + searchList.get(i).get("BK_LDSNO") + "   |   ");
               System.out.print("������ : " + searchList.get(i).get("BK_RSVSNO") + "   |   ");
               System.out.println();
               System.out.print("���� : " + searchList.get(i).get("BK_TITLE")+"   |   ");
               System.out.print("���� : " + searchList.get(i).get("BK_WRITER")+"   |   ");
               System.out.print("���ǻ� : " + searchList.get(i).get("BK_PUB")+"   |   ");
               System.out.println();
               System.out.println("----------------------------------------------");
            }
         }else if(searchList.size()==0) {
            System.out.println("�˻��� ������ �����ϴ�.");
         }else if(searchList.size()>1000) {
            System.out.println("�˻��� �ڷᰡ �ʹ� �����ϴ�. ");
         }
      
      } catch (SQLException e) {
         e.printStackTrace();

   }
}
}


