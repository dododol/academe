package teamProject01.sec01;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class JDBCUtil{
	
	Scanner sc = new Scanner(System.in);
	DAOConnection daoConn = DAOConnection.getInstance();
	
	private static JDBCUtil instance=null;
	private JDBCUtil() {}
	
	public static JDBCUtil getInstance() {
		if(instance==null) instance=new JDBCUtil();
		return instance;
	}
	
	
	static Map<String, Object> loginUser = null;
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


	

	
	public Map<String, Object> selectOneRow(String sql, List<Object> param) {
		//튜플 하나를 선택해서 모든 컬럼을 가져오는 메소드
		Map<String, Object> info=null;
		try {
			daoConn.pstmt=daoConn.conn.prepareStatement(sql);
			
			for(int i=0; i<param.size(); i++) {
				daoConn.pstmt.setObject(i+1, param.get(i));
			}
			
			daoConn.rs=daoConn.pstmt.executeQuery();
			
			ResultSetMetaData rsmd=daoConn.rs.getMetaData();
			int columnCount=rsmd.getColumnCount();
			
			while(daoConn.rs.next()) {
				info=new HashMap<>();
				for(int i=0; i<columnCount; i++) {
					info.put(rsmd.getColumnName(i+1), daoConn.rs.getObject(i+1));
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return info;
	}
	
	public Object selectOneValue(String sql, Object param, String columnName) {
		//튜플의 한 컬럼 값만 가져오는 메소드, 컬럼에 값이 있는지 확인할 때 사용(isDuplicate와 함께 사용)
		//where절 조건 하나만 달 수 있음(pk 가져와서 사용, 조건 더 달고싶으면 param-List로 선언해서 다시만들어야함)
		Object result=null;
		try {
			daoConn.pstmt=daoConn.conn.prepareStatement(sql);
			daoConn.pstmt.setObject(1, param);
			daoConn.rs=daoConn.pstmt.executeQuery();
			
			while(daoConn.rs.next()) {
				result=daoConn.rs.getObject(columnName);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	public int update(String sql, List<Object> param) {
		//sql=" insert into emp(empno, ename, job, sal, deptno)
	   // 		values (?, ?, ?, ?, ?) "
		//리스트 param 안에 있는 갯수만큼 ?갯수 설정가능
		int ret=0;
		try {
			
			daoConn.pstmt = daoConn.conn.prepareStatement(sql);
			for(int i=0; i<param.size(); i++) {
				daoConn.pstmt.setObject(i+1, param.get(i));
			}
			ret=daoConn.pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public int procedureUpdate(String sql, List<Object> param) {
		//sql=" insert into emp(empno, ename, job, sal, deptno)
	   // 		values (?, ?, ?, ?, ?) "
		//리스트 param 안에 있는 갯수만큼 ?갯수 설정가능
		int ret=0;
		try {
			
			daoConn.cstmt = daoConn.conn.prepareCall(sql);
			for(int i=0; i<param.size(); i++) {
				daoConn.cstmt.setString(i+1, (String)param.get(i));
			}
			ret=daoConn.cstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public Object isDuplicateSTD(Object param, String columnName) {
		//STDENT테이블의 매개변수의 값과 같은 값이 매개변수의 컬럼에 있는지 확인하는 메소드
		// DAO 패키지임-> 쿼리 수정해서 사용(테이블, where절 컬럼명 수정)
		//상속받아 쓰는것보다 만드는 클래스 안에 메소드 가져가서 쓰는거 추천!
		String sql = "select * from STUDENT where STD_NO=? ";
		
		return selectOneValue(sql, param, columnName);

	}
	
	public Object isDuplicateBK(Object param, String columnName) {
		//STDENT테이블의 매개변수의 값과 같은 값이 매개변수의 컬럼에 있는지 확인하는 메소드
		// DAO 패키지임-> 쿼리 수정해서 사용(테이블, where절 컬럼명 수정)
		//상속받아 쓰는것보다 만드는 클래스 안에 메소드 가져가서 쓰는거 추천!
		String sql = "select * from BOOK where BK_NO=? ";
		
		return selectOneValue(sql, param, columnName);

	}
}

class DAOConnection {
<<<<<<< HEAD
	/* 방화벽 전까지는 localhost로 수정해서 사용해야함 확인요망 */
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "project1"; // 방화벽 전까지..
=======
	/* ��ȭ�� �������� localhost�� �����ؼ� ����ؾ��� Ȯ�ο�� */
	private final String URL = "jdbc:oracle:thin:@192.168.35.55:1521:xe";
	private final String USER = "pc13_p2"; // ��ȭ�� ������..
>>>>>>> 8295353958db8875a3eb702491b3b6e88674d3d3
	private final String PASSWD = "java";

	private static DAOConnection instance = null;

	private DAOConnection() {}

	public static DAOConnection getInstance() {
		if (instance == null)
			instance = new DAOConnection();
		return instance;
	}

	protected static Connection conn = null;
	protected Statement stmt = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	protected CallableStatement cstmt = null;
	
	public void connectConn() {
		/*
		 * 여기서 clearConsole 호출하거나 connetConn 불러오기 전에 clearConsole 호출할것
		 */

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			stmt = conn.createStatement();
			stmt.execute(" select ascii_seq.nextval from dual ");
			stmt.execute(" alter sequence ascii_seq increment by -1 ");
			stmt.execute(" select ascii_seq.nextval from dual ");
			stmt.execute(" alter sequence ascii_seq increment by 1 ");
			
			System.out.println("연결되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("아주 심각한 오류가 발생했어용");
		}
	}

	public void disconectConn() {
		if (rs != null)	try {rs.close();} catch (Exception e) {}
		if (stmt != null)try {stmt.close();} catch (Exception e) {}
		if (pstmt != null)try {pstmt.close();} catch (Exception e) {}
		if (conn != null)try {conn.close();} catch (Exception e) {}
		System.out.println("연결 해지되었습니다.");
	}
}