package teamProject01.sec01;

public class BookSearch {
	
	public static void main(String[] args) {
		BookSearch1 bk=new BookSearch1();
//		bk.connectConn();
		
	}

}

class BookSearch1 extends Parent {
	
	public void select() {
		
	}
}


/*
package teamProject01.sec01;

import java.sql.SQLException;




public class Select {
   
   public static void main(String[] args) {
      SS s1=new SS();
      s1.select();
      
   }
}
   
class SS extends Parent{
   public void select() {

      try {
         connectConn();
         String sql = " select * from emp where empno=? and deptno=? ";
         daoConn.pstmt = daoConn.conn.prepareStatement(sql);
         
         String a=sc.next();
         String b=sc.next();
         
         daoConn.pstmt.setString(1, a);
         daoConn.pstmt.setString(2, b);
         
         daoConn.rs = daoConn.pstmt.executeQuery();
         
         while (daoConn.rs.next()) {
            System.out.print("사원번호 : "+daoConn.rs.getString("EMPNO")+"\t");
            System.out.print("사원이름 : "+daoConn.rs.getString(2)+"\t");
            System.out.print("업무 : "+daoConn.rs.getString(3)+"\t");
            System.out.print("급여 : "+daoConn.rs.getInt(4)+"\t");
            System.out.print("부서번호 : "+daoConn.rs.getString("DEPTNO")+"\t");
            System.out.println();
            System.out.println("----------------------------------------------------------------------------------");
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         disconnectConn();
      }

   }
}

*/