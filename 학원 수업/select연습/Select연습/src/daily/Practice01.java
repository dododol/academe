package daily;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Practice01 {
	private static Scanner sc = new Scanner(System.in);
	
	static MemberService  memberService=MemberService.getInstance();
	public static void main(String[] args) {
		Practice01 pr01=new Practice01();
		searchAll();
	}

	public static void searchAll() {
		List<Map<String, Object>> result=memberService.searchAll();
		System.out.println("            [[ 회원  LIST ]]");
		System.out.println(" ID \t회원명 \t  주민번호 \t\t  마일리지");
		System.out.println("-----------------------------------------");
		for(int i=0; i<result.size(); i++) {
			String mid=(String)result.get(i).get("MEM_ID");
			String name=(String)result.get(i).get("MEM_NAME");
			String jumin=(String)result.get(i).get("MEM_JUMIN");
		    int mileage=Integer.parseInt(String.valueOf(result.get(i).get("MEM_MILEAGE")));
		System.out.print(mid+"\t"+name+" \t "+jumin+"  ");	
		System.out.printf("%5d\n", mileage);
		}
	}
}

// main에서 호출되어 dao를 호출하는 통로
class MemberService{
	private static MemberService instance;

	private MemberService() {
	}

	public static MemberService getInstance() {
		if (instance == null)
			instance = new MemberService();
		return instance;
	}
	
	Scanner sc=new Scanner(System.in);
	MemberDAO dao=MemberDAO.getInstance();
	
	public List<Map<String, Object>> searchAll(){
		return dao.searchAll();
	}
}

// dao 입력받은 sql과 함께 호출되어짐(sql문 수정에 따른 결과 변경이 가능)
class MemberDAO{
	private static MemberDAO instance=null;
	private MemberDAO() {}
	public static MemberDAO getInstance() {
		if(instance==null)instance=new MemberDAO();
		return instance;
	}
	
	JDBCUtil jdbc=JDBCUtil.getInstance();
	
	public List<Map<String, Object>> searchAll(){
		String sql="SELECT * FROM tbl_member ";
		return jdbc.selectList(sql);
	}	
}

//오라클 서버 연결, dao selectList절에서 끌어온 데이터를 sql코드로 풀어 실행
class JDBCUtil{
	private static JDBCUtil instance=null;
	private JDBCUtil() {}
	public static JDBCUtil getInstance() {
		if(instance==null) instance=new JDBCUtil();
		return instance;
	}
	
	private String url="jdbc:oracle:thin:@localhost:1521:xe";
	private String user="temp_project";
	private String passwd="java";
	
	private Connection conn;
	private PreparedStatement pstmt=null;
	private Statement stmt=null;
	private ResultSet rs=null;
	
	public List<Map<String, Object>> selectList(String sql){
		//SELECT * FROM tbl_member
		List<Map<String, Object>> list=null;
	    try {
	    	conn=DriverManager.getConnection(url,user,passwd);
	    	pstmt=conn.prepareStatement(sql);
	    	rs=pstmt.executeQuery();
	    	//컬럼의 수, 컬럼명
	    	ResultSetMetaData rsmd=rs.getMetaData();
	    	int columnCount=rsmd.getColumnCount();
	    	while(rs.next()) {
	    		if(list==null) list=new ArrayList<>();
	    		Map<String, Object> row=new HashMap<>();
	    		for(int i=0; i<columnCount; i++) {
	    			String key=rsmd.getColumnLabel(i+1);
	    	//or	String key=rsmd.getColumnName(i);
	    			Object value=rs.getObject(i+1);
	    			row.put(key, value);
	    		}
	    		list.add(row);
	    	}
	    }catch(SQLException e) {
	    	e.printStackTrace();
	    }finally {
	    	if(rs!=null) try{rs.close();}catch(Exception e) {}
	    	if(pstmt!=null) try{pstmt.close();}catch(Exception e) {}
	    	if(conn!=null) try{conn.close();}catch(Exception e) {}    	
	    }
	    return list;
	}
}