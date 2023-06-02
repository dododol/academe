package utill;

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

// JDBC�� ����Ͽ� CRUD�� ȿ�������� ����� �� �ִ� �޼��带 ������ CLASS
public class JDBCUtill {	// Ŀ��, �ѹ� JDBCUtill�� ���
// �̱������� ����
	private static JDBCUtill instance = null;	// �ڱ��ڽ��� Ÿ���� ������  ����
	private JDBCUtill() {}
	// �� ������ ������ �޼ҵ�
	
	public static JDBCUtill getInstance() {
		if(instance == null) instance = new JDBCUtill();
		return instance;
	}
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "PC15";
	private String passwd = "java";
	
	private Connection conn;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	
	public Map<String, Object> selectOne(String sql){
		// �������� ����� ���
		// sql = "SELECT * FROM MEMBER WHERE MEM_ID='a001' AND
		//		  MEM_PASS='1234'"
		Map<String, Object> row = null;
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();	// �÷��� ��, �÷���
			
			int columnCount=rsmd.getColumnCount();
			while(rs.next()) {							// �� ������� �����͸� ó���� �� �ִ� selectOne
				row = new HashMap<>();
				for(int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i);
			//or	String key = rsme.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);
				}
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if(conn != null) try {conn.close();} catch(Exception e) {}
		}
		return row;
	}
	
	public Map<String, Object> selectOne(String sql, List<Object>param) {
		// sql = "SELECT * FROM tbl_member WHERE mem_id = ? and
		//	 mem_pass = ? "
		Map<String, Object> row = null;
		try {
		conn = DriverManager.getConnection(url,user,passwd);
		pstmt = conn.prepareStatement(sql);
		// sql�� �����ϴ� ?�� �����Ǵ� ������ mapping =>
				// 	pstmt.setŸ�Ը�(?����,������)
		for(int i = 0; i < param.size(); i++) {
			pstmt.setObject(i+1, param.get(i));
		}
		
		rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		int columnCount = rsmd.getColumnCount();
		while(rs.next()) {
			row = new HashMap<> ();
			for(int i = 0; i < columnCount; i++) {
				String key = rsmd.getColumnLabel(i+1);
				Object value = rs.getObject(i+1);
				row.put(key, value);
			}
		}
		
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if(conn != null) try {conn.close();} catch(Exception e) {}
		}
		return row;
}
}