package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;

@WebServlet("/memDelete.do")
public class MemDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String memid = request.getParameter("id");
		
		System.out.println("id=" + memid);
		
		ILoginService service = LoginServiceImpl.getInstance();
		
		HttpSession session = request.getSession();
		
		int res = service.deleteMember(memid);
		
		request.setAttribute("deleteMember", res);
		
		if(res>0) {
			
			// 세션 내용 전체 삭제
			session.invalidate();
			
			response.sendRedirect(request.getContextPath() + "/html/main.jsp" );
		}
		

	}
	
		/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String mem_id = request.getParameter("userID");
		System.out.println(mem_id);
		
		ILoginService service = LoginServiceImpl.getInstance();
		
		HttpSession session = request.getSession();
		
		
		int res = service.deleteMember(mem_id);
		System.out.println("res="+res);
		
		request.setAttribute("deleteMember", res);
		
		if(res>0) {
			
			// 세션 내용 전체 삭제
			session.invalidate();
			
			response.sendRedirect(request.getContextPath() + "/html/main.jsp" );
		}
		

		
	} */

}
