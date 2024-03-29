package com.exam.myapp.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/list.do")	
public class MemListServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");//응답내용 출력에 사용할 문자인코딩 방식 설정(내가 보낸걸 브라우저가 읽을때의 셋팅)
		PrintWriter out = resp.getWriter();	//응답객체에 응답내용을 쓸 수 있는 객체 가져오기.사이트에 표시
//		out.println("Hello");	//응답객체에 응답내용 쓰기(응답내용은 웹브라우저에게 전송. 사이트에 표시됨.)
		
		out.println("<!DOCTYPE html>        ");
		out.println("<html>                 ");
		out.println("<head>                 ");
		out.println("<meta charset='UTF-8'> ");
		out.println("<title>회원관리</title>   ");
		out.println("</head>                ");
		out.println("<body>                 ");
		out.println("	<h1>회원목록</h1>	");
		out.println("	<a href='" + req.getContextPath() + "/member/addform.do'>회원추가</a><br>	");
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");	// 지정한 클래스를 메모리에 로드
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		String url="jdbc:oracle:thin:@//localhost:1521/xe";	//데이터베이스 주소
		String user="com";		//데이터베이스 아이디
		String password="COM01";		//데이터베이스 비밀번호

		String sql = "SELECT mem_id, mem_pass, mem_name, mem_point FROM member";
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);				
		) {
			//?에 주입할 값의 타입에 따라서 .set타입명() 메서드 사용
			// 명령문 객체에 담겨있는 SQL문 실행
			// 반환데이터가 없는 SQL문(INSERT, UPDATE, DELETE)은 executeUpdate()로 실행
			// 반환데이터가 있는 SQL문(SELECT)은 executeQuery()로 실행
			ResultSet rs = pstmt.executeQuery();	// 영향받은 레코드(row)수 반환
			while (rs.next()) {// ResultSet이 다음행을 가르키도록(다음행이 있으면 true, 없으면 false 반환)
				//컬럼값의 타입에 따라서 get타입명() 메서드로 컬럼값 읽기
				String memId = rs.getString("mem_id"); // 현재 카리키는 행에서 지정한 이름의 컬럼값 읽기
				String memPass = rs.getString("mem_pass"); // 현재 카리키는 행에서 지정한 이름의 컬럼값 읽기
				String memName = rs.getString("mem_name"); // 현재 카리키는 행에서 지정한 이름의 컬럼값 읽기
				String memPoint = rs.getString("mem_point"); // 현재 카리키는 행에서 지정한 이름의 컬럼값 읽기
				out.println(memId + " : " + memPass + " : " + memName + " : " + memPoint + "<br>");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		out.println("</body>                ");
		out.println("</html>                ");
	}
}
