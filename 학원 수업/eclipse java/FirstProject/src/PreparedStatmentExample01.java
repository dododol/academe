

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 동적 query 명령어 객체
//	-> 자바의 실행시간에 필요한 데이터를 입력받아 쿼리 실행
//	1) 변수에 할당될 값 대신 ?를 기술하여 쿼리 구성
//	ex) tbl_member에 신규회원등록
//		sql = "insert into tbl_member values(?,?,?,?,?)"
//	2) query의 ?에 대응하는 데이터 mapping(setter메소드:
//		명령어객체변수.set데이터타입(?순번, 값)
//	  ex) PreparedStatement ps = conn.preparedStatement(sql)
//		  ps.setString(1, "a002") -> mem_id
//		  ps.setString(2, "09876") -> mem_pass
//		  ps.setString(3, "정몽주") -> mem_name
//		  ps.setString(4, "951230-1234567") -> mem_jumin
//		  ps.setInt(5, 1000) -> mem_mileage
//	3) 쿼리 실행
//		. select 문 : executeQuery()
//		. 그 이외의 query : executeUpdate()
//	4) 실행결과
//		. select 문 : ResultSet 객체에 저장
//		ex) ResultSet rs = executeQuery();
//			while(rs.next()) {
//				String mid = rs.getString)"MEM_ID");
//								:
//				int mileage = rs.getInt("MEM_MILEAGE");
//			}
//		. 그 이외의 query : 커서(쿼리로 영향받은 행(row)의 집합)의 행의 수(정수)
public class PreparedStatmentExample01 {
	static Scanner sc = new Scanner(System.in);
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "PC15";
	private String passwd = "java";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int rowCount = 0;
			
	public static void main(String[] args) {
		
		String sql = " INSERT INTO tbl_member VALUES(?,?,?,?,?) ";
		int result = new PreparedStatmentExample01().insert(sql);
		if(result != 0) {
			System.out.println("자료가 성공적으로 저장되었습니다. ");
		}else {
			System.out.println("자료 저장에 실패했습니다. ");
		}
	}

	public int insert(String sql) {

		List<Object> param = new ArrayList<Object>();
		System.out.print("회원 아이디 : ");
		String mid = sc.nextLine();
		param.add(mid);
		
		
		System.out.print("회원명 : ");
		String mname = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		System.out.print("주민등록번호 : ");
		String jumin = sc.nextLine();
		
		System.out.print("마일리지 : ");
		int mileage = Integer.parseInt(sc.nextLine());
		
		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setNString(1, mid);
			pstmt.setNString(2, pw);
			pstmt.setNString(3, mname);
			pstmt.setNString(4, jumin);
			pstmt.setInt(5, mileage);
			
			rowCount = pstmt.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(rs != null) try {rs.close();}catch(Exception e) {}
			if(pstmt != null) try {pstmt.close();}catch(Exception e) {}
			if(conn != null) try {conn.close();}catch(Exception e) {}
		}
		return rowCount;
	}
}
