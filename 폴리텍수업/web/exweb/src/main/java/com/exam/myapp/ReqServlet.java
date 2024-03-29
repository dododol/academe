package com.exam.myapp;
// 웹 애플리케이션 서버(톰캣)을 통해서 실행되는
// 객체(클래스)를 만들 경우에는
//


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어떤 주소로 요청이 왔을 때, 현재 서블릿을 실행할지 설정
//(1)web.xml에 <servlet> 요소를 사용하여 설정
//(2)@WebServlet 애노테이션을 서블릿클래스에 적용하여 설정

//"/hello.do"로 요청이 오면 현재 서블릿 실행
@WebServlet("/req/*") 
public class ReqServlet  extends HttpServlet {

//	HelloServlet서블릿.service(요청객체, 응답객체)
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");	//브라우저가 보내준걸 읽을때 셋팅
//		String idVal = req.getParameter("id");	
		String reqUri = req.getRequestURI();		// 요청주소(경로만)
		StringBuffer reqUrl = req.getRequestURL();	// 요청주소(전체)
		String ctxPath = req.getContextPath();		// 웹앱 고유경로(컨텍스트패스)
		
		String ua = req.getHeader("User-Agent");	// 지정한 요청헤더값 읽기
		
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
		out.println("	<h3>요청 URI : " + reqUri + "</h3>	");
		out.println("	<h3>요청 URL : " + reqUrl + "</h3>	");
		out.println("	<h3>컨텍스트패스 : " + ctxPath + "</h3>	");
		out.println("	<h3>User-Agent 헤더값 : " + ua + "</h3>	");
		if(ua.contains("Edg/")) {
			out.println("	<h3>당신이 사용중인 브라우저 : MS Edge</h3>	");			
		}else if(ua.contains("OPR/")) {
			out.println("	<h3>당신이 사용중인 브라우저 : Opera</h3>	");			
		}else if(ua.contains("Firefox/")) {
			out.println("	<h3>당신이 사용중인 브라우저 : Firefox</h3>	");			
		}else if(ua.contains("Safari/") && !ua.contains("Chrome/")) {
			out.println("	<h3>당신이 사용중인 브라우저 : Safari</h3>	");			
		}else if(ua.contains("Chrome/")) {
			out.println("	<h3>당신이 사용중인 브라우저 : Chrome</h3>	");			
		}else {
			out.println("	<h3>당신이 사용중인 브라우저 : 알수없는 브라우저</h3>	");						
		}
		
		
		out.println("</body>                ");
		out.println("</html>                ");
		
	}
}