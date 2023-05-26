package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbExample01 {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";	// @localhost에 서버주소가 들어가야함.	xe는 오라클 버전.
	String user = "PC15";
	String passwd = "java";
	
	Connection conn = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public static void main(String[] args) {
	//	new DbExample01().dbConnection();
		int res = new DbExample01().dbInsert();
		if(res>0) {
			System.out.println("자료 입력 성공");
		}
		

	}

	public void dbConnection() {
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("DB 연결 성공");
			stmt=conn.createStatement();
			String sql ="select EMPNO, ENAME, JOB from TEMP";
			rs = stmt.executeQuery(sql);	// executeQuery : select문 실행  executeUpdate : 
			while (rs.next()) {
				String eid = rs.getNString("EMPNO");
				String eName = rs.getNString("ENAME");
				String job = rs.getNString(3);
				
				System.out.printf("%5s %7s %10s\n", eid, eName,job);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) 
				try {
					rs.close();
					}catch(Exception e) {}
			if(stmt != null) 
				try {
					stmt.close();
				}catch(Exception e) {}
			if(conn != null) 
				try {
					conn.close();
				}catch(Exception e) {}
		}

		
	}
	
	public int dbInsert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[사원정보 입력]");
		System.out.print("사원번호 : ");
		String eid=sc.nextLine();

		System.out.print("사원이름 : ");
		String name=sc.nextLine();
		
		System.out.print("직무코드 : ");
		String jid=sc.nextLine();
		
		System.out.print("부서번호 : ");
		int deptid=Integer.parseInt(sc.nextLine());
		int res = 0;		// 입력되어진 데이터베이스 행 체크해서 res에 넣어줌.
		
		
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			String sql ="insert into TEMP values(?,?,?,?) ";	// ?는 각 열에 대응되어짐(아직 입력 안도미.키보드로 입력받은걸 대응)
		
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, eid);
			pstmt.setString(2, name);
			pstmt.setString(3, jid);
			pstmt.setInt(4, deptid);
			
			res = pstmt.executeUpdate();		// 쿼리 x . 업데이트하면 입력되어짐.
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
			if(conn != null) try {conn.close();}catch(Exception e) {}
			
		}
		return res;
	}
	
	
}
