package sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import service.LoginService;
import service.MemberService;

//���� query��ɾ� ��ü
//  ->�ڹ��� ����ð��� �ʿ��� �����͸� �Է¹޾� ���� ����
// 1)������ �Ҵ�� �� ��� ?�� ����Ͽ� ���� ����
// ex) tbl_member�� �ű�ȸ�����
//   sql="insert into tbl_member values(?, ?, ?, ?, ?)"
// 2)query�� ?�� �����ϴ� ������ mapping(setter�޼���:
//   ��ɾü����.set������Ÿ��(?����, ��) 
//  ex) PreparedStatement ps=conn.preparedStatement(sql);
//      ps.setString(1, "a002") ->mem_id
//      ps.setString(2, "09876") ->mem_pass
//      ps.setString(3, "������") ->mem_name
//      ps.setString(4, "951230-1234567") ->mem_jumin
//      ps.setInt(5, 1000) ->mem_mileage
//  3)���� ����
//    . select �� : executeQuery()
//    . �� �̿��� query : executeUpdate() 
//  4)������ 
//    . select �� : ResultSet ��ü�� ����
//    ex) ResultSet rs=executeQuery();
//        while(rs.next()){
//              String mid=rs.getString("MEM_ID");
//                              :
//              int mileage=rs.getInt("MEM_MILEAGE");
//        }
//    . �� �̿��� query : Ŀ��(������ ������� ��(row)�� ����)�� ���� ��(����)
public class PreparedStatmentExample01 {
	private static Scanner sc = new Scanner(System.in);

	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "SEM";
	private String passwd = "java";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	private int rowCount = 0;
	
	static MemberService  memberService=MemberService.getInstance();

	public static void main(String[] args) {
		PreparedStatmentExample01 ps01=new PreparedStatmentExample01();
		/*
		String sql = " INSERT INTO tbl_member VALUES(?, ?, ?, ?, ?) ";
		PreparedStatmentExample01 ps01=new PreparedStatmentExample01();
		int result = ps01.insert(sql);
		if (result != 0) {
			System.out.println("�ڷᰡ ���������� ����Ǿ����ϴ�. ");
		} else {
			System.out.println("�ڷᰡ ������� �ʾҽ��ϴ�. ");
			System.out.println("�ڷᰡ ������� �ʾҽ��ϴ�. ");
		}
		*/
		//ps01.update();
		while(true) {
			System.out.println("[1. ��ü��ȸ]");
			System.out.println("[2. ������ȸ]");
			System.out.println("--------------");
			System.out.print("����-> : ");
			int choice = sc.nextInt();
		
			switch (choice) {
				case 1 : searchAll(); break;
				case 2 : searchOne(); break;
				default : System.out.println("���ù�ȣ�� �߸� �Է� �߽��ϴ�");
			} 
		}
	}

	public int insert(String sql) {
		String mid ="";
		while (true) {
			System.out.print("ȸ�� ���̵� : ");
			mid = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object>map = loginService.isDuplicate(mid);
			if (map != null) {
				System.out.println("���̵� �ߺ��Ǿ����ϴ�...");
			}else {
				break;
			}
		}
		System.out.print("ȸ���� : ");
		String mname = sc.next();

		System.out.print("��й�ȣ : ");
		String pw = sc.next();

		System.out.print("�ֹε�Ϲ�ȣ : ");
		String jumin = sc.next();

		System.out.print("���ϸ��� : ");
		int mileage = sc.nextInt();

		try {
			conn = DriverManager.getConnection(url, user, passwd);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mid);
			pstmt.setString(2, pw);
			pstmt.setString(3, mname);
			pstmt.setString(4, jumin);
			pstmt.setInt(5, mileage);

			rowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {if(rs!=null)try{rs.close();}catch(Exception e) {}
		           if(pstmt!=null)try{pstmt.close();}catch(Exception e) {}
		           if(conn!=null)try{conn.close();}catch(Exception e) {}
		}
		return rowCount;
	}
	
	public void update() {	
		int res=memberService.update();
		if (res>0) {
			System.out.println("�ڷᰡ ���������� ���ŵǾ����ϴ�");
		}else {
			System.out.println("�ڷ� ���ſ� �����߽��ϴ�");
		}
	}
	
	public static void searchAll() {
		List<Map<String, Object>> result=memberService.searchAll();
		System.out.println("            [[ ȸ��  LIST ]]");
		System.out.println(" ID \tȸ���� \t  �ֹι�ȣ \t\t  ���ϸ���");
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
	
	public static void searchOne() {
		Map<String, Object> result=memberService.searchOne();
		if(result!=null) {
			System.out.println("            [[ ȸ��  LIST ]]");
			System.out.println(" ID \tȸ���� \t  �ֹι�ȣ \t\t  ���ϸ���");
			System.out.println("-----------------------------------------");
			String mid=(String)result.get("MEM_ID");
			String name=(String)result.get("MEM_NAME");
			String jumin=(String)result.get("MEM_JUMIN");
		    int mileage=Integer.parseInt(String.valueOf(result.get("MEM_MILEAGE")));
		    System.out.print(mid+"\t"+name+" \t "+jumin+"  ");	
		    System.out.printf("%5d\n", mileage);
		}else {
			System.out.println("�ش� ȸ���� ��ϵ��� ���� ȸ���Դϴ�.. ");
		}
	}
}
