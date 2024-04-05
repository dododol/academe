package com.exam.myapp;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/read.do") 
public class ReadServlet  extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String reqUser = (String) req.getAttribute("user");
		
		HttpSession session = req.getSession();	//현재 요청을 보낸 사용자의 세션객체 가져오기
		String sessionUser = (String) session.getAttribute("user");	
		//"user" 라는 이름으로세션객체에 조장되어있는 속성값 읽기
		
		ServletContext context = getServletContext();	//현재 웹앱의 서블릿컨텍스트 가져오기
		String contextUser = (String) context.getAttribute("user");	
		//"user"라는 이름으로 서블릿 컨텍스트객체에 저장되어 있던 속성값
		
		String cookUser = null;
		Cookie[] cookies = req.getCookies();	// 요청메시지(헤더)에 포함된 쿠키정보 읽기
		for (Cookie c : cookies) {
			if ( "user".equals( c.getName() ) ) {
				cookUser = URLDecoder.decode(c.getValue(), "UTF-8");
			}
		}
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");//응답내용 출력에 사용할 문자인코딩 방식 설정(내가 보낸걸 브라우저가 읽을때의 셋팅)
		PrintWriter out = resp.getWriter();	//응답객체에 응답내용을 쓸 수 있는 객체 가져오기.사이트에 표시
		
		out.println("<!DOCTYPE html>        ");
		out.println("<html>                 ");
		out.println("<head>                 ");
		out.println("<meta charset='UTF-8'> ");
		out.println("<title>안녕 서블릿</title>   ");
		out.println("</head>                ");
		out.println("<body>                 ");
		out.println("	<h1>안녕 서블릿</h1>");
		out.println("<h1>요청객체 : " + reqUser + " 님</h1>");
		out.println("<h1>세션객체 : " + sessionUser + " 님</h1>");
		out.println("<h1>서블릿컨텍스트객체 : " + contextUser + " 님</h1>");
		out.println("<h1>쿠키 : " + cookUser + " 님</h1>");
		out.println("</body>                ");
		out.println("</html>                ");
		
	}
}