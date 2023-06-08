package teamProject01.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;
import java.util.Scanner;

public class Parent  {
	Scanner sc = new Scanner(System.in);
	DAOConnection daoConn = DAOConnection.getInstance();
	Map<String, String> loginUser = null;
	String sql;
	/*
	 * daoConn을 만든 순간 protected static Connection conn = null; protected Statement
	 * stmt = null; protected PreparedStatement pstmt = null; protected ResultSet rs
	 * = null; 에 접근 가능..? daoConn. 으로 접근해서 사용
	 */

	protected void connectConn() {
		daoConn.connectConn();
	}

	protected void disconnectConn() {
		daoConn.disconectConn();
	}

	public void clearConsole() { // 콘솔창에 공백 80줄 입력해서 비워주는 메소드
		for (int i = 0; i < 80; i++)
			System.out.println();
	}


}

class DAOConnection {
	/* 방화벽 전까지는 localhost로 수정해서 사용해야함 확인요망 */
	private final String URL = "jdbc:oracle:thin:@192.168.35.55:1521:xe";
	private final String USER = "pc13"; // 방화벽 전까지..
	private final String PASSWD = "java";

	private static DAOConnection instance = null;

	private DAOConnection() {}

	public static DAOConnection getInstance() {
		if (instance == null)
			instance = new DAOConnection();
		return instance;
	}			//45~53 싱글톤

	protected static Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;

	public void connectConn() {
		/*
		 * 여기서 clearConsole 호출하거나 connetConn 불러오기 전에 clearConsole 호출할것
		 */

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			stmt = conn.createStatement();
			System.out.println("연결되었습니다.");
		} catch (SQLException e) {
			System.out.println("아주 심각한 오류가 발생했어용");
		}
	}

	public void disconectConn() {
		if (rs != null)	try {rs.close();} catch (Exception e) {}
		if (stmt != null)try {stmt.close();} catch (Exception e) {}
		if (pstmt != null)try {pstmt.close();} catch (Exception e) {}
		if (conn != null)try {conn.close();} catch (Exception e) {}
	}
}