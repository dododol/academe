package teamProject01.sec01;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;




class Select {
   
   public static void main(String[] args) {
      SS s1=new SS();
      
      s1.selectBKNO();
      
   }
}
   
class SS {
	JDBCUtil jdbc = JDBCUtil.getInstance();
	public void selectBKNO() {
		String sql=" select BK_NO 책번호, BK_SHFCODE 서가코드, BK_LDSNO 대출자, BK_RSVSNO 예약자 FROM BOOK WHERE BK_TITLE LIKE ? ";
		
		Map<String ,Object> search = null;
		List<Map<String, Object>> searchList=null;
      try {
    	 jdbc.connectConn();
         
         jdbc.daoConn.pstmt = jdbc.daoConn.conn.prepareStatement(sql);
         
         String a=jdbc.sc.next();
         
         jdbc.daoConn.pstmt.setString(1, "%"+a+"%");
         
         jdbc.daoConn.rs = jdbc.daoConn.pstmt.executeQuery();
         
         while (jdbc.daoConn.rs.next()) {
        	search = new HashMap<>();
        	searchList= new ArrayList<>();
        	ResultSetMetaData rsmd = null;
        	int cnt=rsmd.getColumnCount();
        	for(int i=0; i<cnt; i++){
        		search.put(rsmd.getColumnName(i+1), jdbc.daoConn.rs.getObject(i+1));
        		searchList.add(search);
        	}
            System.out.println("----------------------------------------------------------------------------------");
            for(int i=0; i<searchList.size(); i++) {
            	System.out.print(searchList.get(i));
            }
            
            
            
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
    	 jdbc.disconnectConn();
      }

   }
}

//1 정상  2 폐기