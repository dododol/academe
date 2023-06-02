

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ���� query ��ɾ� ��ü
//	-> �ڹ��� ����ð��� �ʿ��� �����͸� �Է¹޾� ���� ����
//	1) ������ �Ҵ�� �� ��� ?�� ����Ͽ� ���� ����
//	ex) tbl_member�� �ű�ȸ�����
//		sql = "insert into tbl_member values(?,?,?,?,?)"
//	2) query�� ?�� �����ϴ� ������ mapping(setter�޼ҵ�:
//		��ɾü����.set������Ÿ��(?����, ��)
//	  ex) PreparedStatement ps = conn.preparedStatement(sql)
//		  ps.setString(1, "a002") -> mem_id
//		  ps.setString(2, "09876") -> mem_pass
//		  ps.setString(3, "������") -> mem_name
//		  ps.setString(4, "951230-1234567") -> mem_jumin
//		  ps.setInt(5, 1000) -> mem_mileage
//	3) ���� ����
//		. select �� : executeQuery()
//		. �� �̿��� query : executeUpdate()
//	4) ������
//		. select �� : ResultSet ��ü�� ����
//		ex) ResultSet rs = executeQuery();
//			while(rs.next()) {
//				String mid = rs.getString)"MEM_ID");
//								:
//				int mileage = rs.getInt("MEM_MILEAGE");
//			}
//		. �� �̿��� query : Ŀ��(������ ������� ��(row)�� ����)�� ���� ��(����)
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
			System.out.println("�ڷᰡ ���������� ����Ǿ����ϴ�. ");
		}else {
			System.out.println("�ڷ� ���忡 �����߽��ϴ�. ");
		}
	}

	public int insert(String sql) {

		List<Object> param = new ArrayList<Object>();
		System.out.print("ȸ�� ���̵� : ");
		String mid = sc.nextLine();
		param.add(mid);
		
		
		System.out.print("ȸ���� : ");
		String mname = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pw = sc.nextLine();
		
		System.out.print("�ֹε�Ϲ�ȣ : ");
		String jumin = sc.nextLine();
		
		System.out.print("���ϸ��� : ");
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
