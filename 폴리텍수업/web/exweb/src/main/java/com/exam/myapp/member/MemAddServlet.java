package com.exam.myapp.member;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/add.do")	
public class MemAddServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String url="jdbc:oracle:thin:@//localhost:1521/xe";	//데이터베이스 주소
		String user="com";		//데이터베이스 아이디
		String password="COM01";		//데이터베이스 비밀번호
		
//		req.setCharacterEncoding("UTF-8");
		String memId = req.getParameter("memId");
		String memPass = req.getParameter("memPass");
		String memName = req.getParameter("memName");
		int memPoint = Integer.parseInt(req.getParameter("memPoint")) ;

		String sql = "INSERT INTO member "
				+ "(MEM_ID, MEM_PASS, MEM_NAME, MEM_POINT)"
				+ "VALUES( ?,?,?,? )";
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);				
		) {
			//?에 주입할 값의 타입에 따라서 .set타입명() 메서드 사용
			pstmt.setString(1, memId);		//1번째 ?에 memId 변수값 주입
			pstmt.setString(2, memPass);	//2번째 ?에 memPass 변수값 주입
			pstmt.setString(3, memName);	//3번째 ?에 memName 변수값 주입
			pstmt.setInt(4, memPoint);		//4번째 ?에 memPoint 변수값 주입
			// 명령문 객체에 담겨있는 SQL문 실행
			// 반환데이터가 없는 SQL문(INSERT, UPDATE, DELETE)은 executeUpdate()로 실행
			// 반환데이터가 있는 SQL문(SELECT)은 executeQuery()로 실행
			int num = pstmt.executeUpdate();	// 영향받은 레코드(row)수 반환
			System.out.println(num + " 명의 회원정보 추가");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		// 다른 서블릿을 실행하는 방법
		//(1) 리디렉션
		//웹브라우저에게 지정한 주소로 이동(요청전송)하라는
		//명령을 담은 응답 메시지를 전송
		resp.sendRedirect(req.getContextPath() + "/member/list.do");
		
		//(2) 포워드, 인클루드
		//서블릿에서 서버(톰캣)에게 요청을 보내서 다른 서블릿을 실행
		//(서버 내에서 이동하므로, 클라이언트(브라우저)는 알지 못함)
//		RequestDispatcher rd = req.getRequestDispatcher("/member/list.do");
//		rd.forward(req, resp);	// 다른 서블릿을 실행하여 응답을 전송하도록 
//		rd.include(req, resp);	// 다른 서블릿을 실행하여 응답을 출력한 후
		//현재 서블릿으로 돌아와서 응답 출력을 계속하도록
	}
}
























