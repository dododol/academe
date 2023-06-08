package teamProject01.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public abstract class ProjectParent {
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

	public void loadingScreen() { // 로딩화면 메소드
		List<String> loading = new ArrayList<String>();
		/* 로딩에 출력할 문자열을 하나씩 출력하기 위해 배열로 한글자씩 저장 */
		loading.add("[");
		loading.add("■");
		loading.add("■");
		loading.add("■");
		loading.add("■");
		loading.add("■");
		loading.add("]");
		loading.add("완료");
		System.out.print("로딩중입니다");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < loading.size(); i++) {
			System.out.print(loading.get(i));
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		clearConsole();

	}

	public void system() {
		loadingScreen();
		connectConn();
		systemRoop: while (true) {
			System.out.println("============================");
			System.out.println("메뉴");
			System.out.println("1. 로그인\t||\t2. 종료");
			System.out.print("========메뉴 선택:");
			
			
			
			loginRoop: while (true) {
				login();
				if (loginUser != null)
					break loginRoop;
			}
			if (loginUser.containsValue("관리자")) {
				managerMenuRoop: while (true) {
					System.out.println("============================");
					System.out.println();

					System.out.println("============================");

				}
			}else {
				studentRoop : while(true) {
					
				}
			}
		}

	}

	// 로그인에 필요한 메소드 로그인시 해당 학생의 정보를 Map으로 loginUser필드에 반환해준다.
	// 키는 등록코드, 밸류는 학생인지 관리자인지 여부
	protected abstract Map<String, String> login();

	protected abstract void logout();// 로그아웃

	// 도서검색(기능:도서명으로 검색, 출판사로 검색, 저자로검색)
	// 해당 애들은 sql문장을 구성하는 형식으로 구현.
	// 대출을 위한 도서검색
	protected abstract void bookSearch1();

	protected abstract void bookSearch2();

	protected abstract void bookSearch3();

	// 관리자가 책을 관리하기 위한 도서 검색 순전히 도서명으로만..?
	protected abstract void bookSearchForManage();

	// search의 바디..?
	protected abstract void bookSearchBody();

	// 책 대출
	protected abstract void lendingBooks();

	// 책 반납
	protected abstract void returnBooks();

	// 책 대출 예약 ( 기능 : 예약한 사람 이외에 사람이 대출하려할 때 대출불가)
	protected abstract void reserveBooks();

	// 대출or예약정보 조회
	protected abstract void checkInfo();

	// 관리자 신간도서 입력
	protected abstract void newBooks();

	// 관리자 도서 폐기
	protected abstract void discardBooks();

	// 관리자 학생 정지일 수정
	protected abstract void modifySuspended();

	/*
	 * 관리자 회원가입??
	 */

}

//class DAOConnection {
//			/* 방화벽 전까지는 localhost로 수정해서 사용해야함 확인요망 */
//	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//	private final String USER = "pc15"; // 방화벽 전까지..
//	private final String PASSWD = "java";
//
//	private static DAOConnection instance = null;
//
//	private DAOConnection() {
//	}
//
//	public static DAOConnection getInstance() {
//		if (instance == null)
//			instance = new DAOConnection();
//		return instance;
//	}
//
//	protected static Connection conn = null;
//	protected Statement stmt = null;
//	protected PreparedStatement pstmt = null;
//	protected ResultSet rs = null;
//
//	public void connectConn() {
//		/*
//		 * 여기서 clearConsole 호출하거나 connetConn 불러오기 전에 clearConsole 호출할것
//		 */
//
//		try {
//			conn = DriverManager.getConnection(URL, USER, PASSWD);
//			stmt = conn.createStatement();
//			System.out.println("연결되었습니다.");
//		} catch (SQLException e) {
//			System.out.println("아주 심각한 오류가 발생했어용");
//		}
//	}
//
//	public void disconectConn() {
//		if (rs != null)
//			try {
//				rs.close();
//			} catch (Exception e) {
//			}
//		if (stmt != null)
//			try {
//				stmt.close();
//			} catch (Exception e) {
//			}
//		if (pstmt != null)
//			try {
//				pstmt.close();
//			} catch (Exception e) {
//			}
//		if (conn != null)
//			try {
//				conn.close();
//			} catch (Exception e) {
//			}
//	}
//}
