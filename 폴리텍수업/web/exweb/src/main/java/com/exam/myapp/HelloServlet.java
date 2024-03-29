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
@WebServlet("/hello.do") 
public class HelloServlet  extends HttpServlet {

//	HelloServlet서블릿.service(요청객체, 응답객체)
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Hello Servlet");
		//현재 서블릿에 연결된 주소로 요청이 올때마다 1번씩 실행
		//실행시 요청객체와 응답객체를 인자로 전달받는다
		//요청객체(req) : 웹브라우저가 보낸 요청의 모든 정보를 담고 있는 객체
		//응답객체(resp) : 웹브라우저에게 응답으로 보낼 정보를 담는 객체
		
		//요청 메시지 본문을 읽기 전에 요청객체의 문자인코딩 설정
		//POST방식으로 전송된 한글 파라미터 값을 읽기 위해 필요
		req.setCharacterEncoding("UTF-8");	//브라우저가 보내준걸 읽을때 셋팅
		//파라미터 이름이 "id"인 파라미터의 값 읽기
		String idVal = req.getParameter("id");	
		System.out.println(idVal);
		// 브라우저 화면에 "안녕 서블릿" 이라고 출럭
		// "id파라미터값 님 환영합니다"라고 출력
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");//응답내용 출력에 사용할 문자인코딩 방식 설정(내가 보낸걸 브라우저가 읽을때의 셋팅)
		PrintWriter out = resp.getWriter();	//응답객체에 응답내용을 쓸 수 있는 객체 가져오기.사이트에 표시
//		out.println("Hello");	//응답객체에 응답내용 쓰기(응답내용은 웹브라우저에게 전송. 사이트에 표시됨.)
		
		out.println("<!DOCTYPE html>        ");
		out.println("<html>                 ");
		out.println("<head>                 ");
		out.println("<meta charset='UTF-8'> ");
		out.println("<title>안녕 서블릿</title>   ");
		out.println("</head>                ");
		out.println("<body>                 ");
		out.println("	<h1>안녕 서블릿</h1>");
		out.println("<h1>" + idVal + " 님 환영합니다</h1>");
		out.println("</body>                ");
		out.println("</html>                ");
		
	}
}