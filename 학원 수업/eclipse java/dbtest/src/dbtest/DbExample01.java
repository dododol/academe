package dbtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbExample01 {

	String url = "jdbc:oracle:thin:@localhost:1521:xe";	// @localhost�� �����ּҰ� ������.	xe�� ����Ŭ ����.
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
			System.out.println("�ڷ� �Է� ����");
		}
		

	}

	public void dbConnection() {
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			System.out.println("DB ���� ����");
			stmt=conn.createStatement();
			String sql ="select EMPNO, ENAME, JOB from TEMP";
			rs = stmt.executeQuery(sql);	// executeQuery : select�� ����  executeUpdate : 
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
		System.out.println("[������� �Է�]");
		System.out.print("�����ȣ : ");
		String eid=sc.nextLine();

		System.out.print("����̸� : ");
		String name=sc.nextLine();
		
		System.out.print("�����ڵ� : ");
		String jid=sc.nextLine();
		
		System.out.print("�μ���ȣ : ");
		int deptid=Integer.parseInt(sc.nextLine());
		int res = 0;		// �ԷµǾ��� �����ͺ��̽� �� üũ�ؼ� res�� �־���.
		
		
		try {
			conn = DriverManager.getConnection(url,user,passwd);
			String sql ="insert into TEMP values(?,?,?,?) ";	// ?�� �� ���� �����Ǿ���(���� �Է� �ȵ���.Ű����� �Է¹����� ����)
		
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, eid);
			pstmt.setString(2, name);
			pstmt.setString(3, jid);
			pstmt.setInt(4, deptid);
			
			res = pstmt.executeUpdate();		// ���� x . ������Ʈ�ϸ� �ԷµǾ���.
			
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
