package com.exam.myapp;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

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

//다수의 서블릿들이 공유할 데이터를 저장하는 장소
//1.서버
//(1)요청객체 : 요청당 1개의 요청객체와 응답객체 생성 및 소멸
//(2)세션객체 : 클라이언트(웹브라우저)당 1개의 세션객체 생성	(서버 재시작시 사라짐)
// - 새로운 클라이언트가 처음 요청을 전송(서블릿실행)했을때 생성
// - 일정시간동안 접속이 없거나 웹애플리케이션이 종료될 때 소멸
//(3) 서블릿컨텍스트객체 : 웹애플리케이션 전체에 1개의 서블릿컨텍스트 생성
// - 웹 애플리케이션이 시작될때 생성, 종료될 때 소멸
//2. 클라이언트(웹브라우저)
//(1)쿠키			(서버 재시작시 사라지지 않음)
//(2)로컬스토리지,세션스토리지

@WebServlet("/save.do") 
public class SaveServlet  extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");	//브라우저가 보내준걸 읽을때 셋팅
		String idVal = req.getParameter("id");	
		
		req.setAttribute("user", idVal);	//idVal값을 "user"라는 이름으로 요청객체에 저장
		HttpSession session = req.getSession();	//현재 요청을 보낸 사용자의 세션객체 가져오기
		session.setAttribute("user", idVal);	//idVal값을 "user"라는 이름으로 세션객체에 저장
		
		ServletContext context = getServletContext();	//현재 웹앱의 서블릿컨텍스트 가져오기
		context.setAttribute("user", idVal);	//idVal값을 "user"라는 이름으로 서블릿컨텍스트객체에 저장
		
		Cookie c = new Cookie("user", URLEncoder.encode(idVal, "UTF-8") );	// 쿠키 이름, 값을 담은 쿠키 객체 생성
//		c.setComment("쿠키에대한설명");
//		c.setDomain("도메인");	//지정한 도메인 또는 그 서브 도메인으로 요청을 보낼때만 쿠키를 포함 ex)www.naver.com 등
//		c.setPath("경로");	//지정한 경로의 하위 경로로 요청을 보낼때만 쿠키를 포함 ex)"/exweb/member/" 또는 "/exweb/member/list.do" O "/exweb/read.do" x
//		c.setMaxAge(-1);	//브라우저가 쿠키를 저장하고 유지하는 시간(초)
		//0은 쿠키를 즉시 삭제, 음수는 브라우저 종료시 쿠키 삭제
//		c.setVersion(0);	//0은 Netsacpe호환쿠키, 1은 RFC2109호환쿠키
//		c.setSecure(false);	//true설정시, HTTPS 보안 프로토콜 사용시에만 쿠키포함
//		c.setHttpOnly(false);	//true 설정시, 자바스크립트에서 쿠키 접근 불가
		resp.addCookie( c );	//웹브라우저에 저장할 쿠키정보를 응답에 추가
		
		//현재 요청객체와 응답객체를 전달하면서,
		//"/read.do" 주소와 연결된 서블릿을 실행
//		req.getRequestDispatcher("/read.do").forward(req, resp);
		
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
		out.println("<h1>" + idVal + " 을 저장했습니다.</h1>");
		out.println("</body>                ");
		out.println("</html>                ");
		
	}
}