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

//"/d2w.do"로 요청이 오면 현재 서블릿 실행
@WebServlet("/param.do") 
public class ParamServlet  extends HttpServlet {

//	HelloServlet서블릿.service(요청객체, 응답객체)
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");	//브라우저가 보내준걸 읽을때 셋팅
		
		String imgPath = "/exweb/img";
		String mgval = req.getParameter("mangom");
		
		switch (mgval) {
		case "1":
			imgPath = "/exweb/img/1.png";
			break;
		case "2":
			imgPath = "/exweb/img/2.png";
			break;
		case "3":
			imgPath = "/exweb/img/3.png";
			break;
		case "4":
			imgPath = "/exweb/img/4.png";
			break;
		case "5":
			imgPath = "/exweb/img/5.png";
			break;
		}
		
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");//응답내용 출력에 사용할 문자인코딩 방식 설정(내가 보낸걸 브라우저가 읽을때의 셋팅)
		PrintWriter out = resp.getWriter();	//응답객체에 응답내용을 쓸 수 있는 객체 가져오기.사이트에 표시
		
		out.println("<!DOCTYPE html>        ");
		out.println("<html>                 ");
		out.println("<head>                 ");
		out.println("<meta charset='UTF-8'> ");
		out.println("<title>망곰&춘식</title>   ");
		out.println("</head>                ");
		out.println("<body>                 ");
		out.println("	<h1>받은 파라미터 값</h1>		");
		out.println("	<img src='" + imgPath + "' >	");	// 같은 서버면 'http://localhost:8000/'지워도 됨.
		
		
		//동일한 이름의 파라미터값이 여러개 전송된 경우
		//요청객체.getgetParameterValues("파라미터명")
		//명령문으로 다수의 파라미터값들을 읽기 가능
		String[] chun = req.getParameterValues("chunsik");
		// chun == [ "6","7","8" ]
		if(chun != null) {
			for (String s : chun) {	
				switch (s) {
				case "6":
					out.println("	<img src='/exweb/img/6.png' >	");	// 같은 서버면 'http://localhost:8000/'지워도 됨.
					break;
					
				case "7":
					out.println("	<img src='/exweb/img/7.png' >	");	// 같은 서버면 'http://localhost:8000/'지워도 됨.
					break;
					
				case "8":
					out.println("	<img src='/exweb/img/8.png' >	");	// 같은 서버면 'http://localhost:8000/'지워도 됨.
					break;
				}
			}			
		}
		
		
		out.println("</body>                ");
		out.println("</html>                ");
		
	}
}