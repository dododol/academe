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
		 * daoConn�� ���� ���� protected static Connection conn = null; protected Statement
		 * stmt = null; protected PreparedStatement pstmt = null; protected ResultSet rs
		 * = null; �� ���� ����..? daoConn. ���� �����ؼ� ���
		 */

		protected void connectConn() {
			daoConn.connectConn();
			
		}

		protected void disconnectConn() {
			daoConn.disconectConn();
		}

		public void clearConsole() { // �ܼ�â�� ���� 80�� �Է��ؼ� ����ִ� �޼ҵ�
			for (int i = 0; i < 80; i++)
				System.out.println();
		}


	

	
	public Map<String, Object> selectOneRow(String sql, List<Object> param) {
		//Ʃ�� �ϳ��� �����ؼ� ��� �÷��� �������� �޼ҵ�
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
		//Ʃ���� �� �÷� ���� �������� �޼ҵ�, �÷��� ���� �ִ��� Ȯ���� �� ���(isDuplicate�� �Բ� ���)
		//where�� ���� �ϳ��� �� �� ����(pk �����ͼ� ���, ���� �� �ް������ param-List�� �����ؼ� �ٽø�������)
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
		//����Ʈ param �ȿ� �ִ� ������ŭ ?���� ��������
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
		//����Ʈ param �ȿ� �ִ� ������ŭ ?���� ��������
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
		//STDENT���̺��� �Ű������� ���� ���� ���� �Ű������� �÷��� �ִ��� Ȯ���ϴ� �޼ҵ�
		// DAO ��Ű����-> ���� �����ؼ� ���(���̺�, where�� �÷��� ����)
		//��ӹ޾� ���°ͺ��� ����� Ŭ���� �ȿ� �޼ҵ� �������� ���°� ��õ!
		String sql = "select * from STUDENT where STD_NO=? ";
		
		return selectOneValue(sql, param, columnName);

	}
	
	public Object isDuplicateBK(Object param, String columnName) {
		//STDENT���̺��� �Ű������� ���� ���� ���� �Ű������� �÷��� �ִ��� Ȯ���ϴ� �޼ҵ�
		// DAO ��Ű����-> ���� �����ؼ� ���(���̺�, where�� �÷��� ����)
		//��ӹ޾� ���°ͺ��� ����� Ŭ���� �ȿ� �޼ҵ� �������� ���°� ��õ!
		String sql = "select * from BOOK where BK_NO=? ";
		
		return selectOneValue(sql, param, columnName);

	}
}

class DAOConnection {
	/* ��ȭ�� �������� localhost�� �����ؼ� ����ؾ��� Ȯ�ο�� */
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String USER = "PC15"; // ��ȭ�� ������..
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
		 * ���⼭ clearConsole ȣ���ϰų� connetConn �ҷ����� ���� clearConsole ȣ���Ұ�
		 */

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWD);
			stmt = conn.createStatement();
			stmt.execute(" select ascii_seq.nextval from dual ");
			stmt.execute(" alter sequence ascii_seq increment by -1 ");
			stmt.execute(" select ascii_seq.nextval from dual ");
			stmt.execute(" alter sequence ascii_seq increment by 1 ");
			
			System.out.println("����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���� �ɰ��� ������ �߻��߾��");
		}
	}

	public void disconectConn() {
		if (rs != null)	try {rs.close();} catch (Exception e) {}
		if (stmt != null)try {stmt.close();} catch (Exception e) {}
		if (pstmt != null)try {pstmt.close();} catch (Exception e) {}
		if (conn != null)try {conn.close();} catch (Exception e) {}
		System.out.println("���� �����Ǿ����ϴ�.");
	}
}