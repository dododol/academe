package com.exam.myapp.member;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member/addform.do")	
public class MemAddFormServlet extends HttpServlet{

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
		out.println("	<h1>회원추가</h1>	");
		
		out.println("<form action='" + req.getContextPath() + "/member/add.do' method='post'> ");
		out.println("아이디 : <input type='text' name='memId'>		<br>");
		out.println("비밀번호 : <input type='password' name='memPass'>	<br>");
		out.println("이름 : <input type='text' name='memName'>		<br>");
		out.println("포인트 : <input type='number' name='memPoint'>	<br>");
		out.println("<input type='submit'>                              ");
		out.println("</form>                                            ");
		
		out.println("</body>                ");
		out.println("</html>                ");
	}
}
