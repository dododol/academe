package teamProject01.sec01;

import java.sql.SQLException;




class Select {
   
   public static void main(String[] args) {
      SS s1=new SS();
      String sql="insert ~~~";
      s1.select(sql);
      
   }
}
   
class SS {
	JDBCUtil jdbc = JDBCUtil.getInstance();
	public void select(String sql) {

      try {
    	 jdbc.connectConn();
         
         jdbc.daoConn.pstmt = jdbc.daoConn.conn.prepareStatement(sql);
         
         
         String a=jdbc.sc.next();
         String b=jdbc.sc.next();
         
         jdbc.daoConn.pstmt.setString(1, a);
         jdbc.daoConn.pstmt.setString(2, b);
         
         jdbc.daoConn.rs = jdbc.daoConn.pstmt.executeQuery();
         
         while (jdbc.daoConn.rs.next()) {
            System.out.print("사원번호 : "+jdbc.daoConn.rs.getString("EMPNO")+"\t");
            System.out.print("사원이름 : "+jdbc.daoConn.rs.getString(2)+"\t");
            System.out.print("업무 : "+jdbc.daoConn.rs.getString(3)+"\t");
            System.out.print("급여 : "+jdbc.daoConn.rs.getInt(4)+"\t");
            System.out.print("부서번호 : "+jdbc.daoConn.rs.getString("DEPTNO")+"\t");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
    	 jdbc.disconnectConn();
      }

   }
}

//1 정상  2 폐기