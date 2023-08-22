package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.ILoginService;
import kr.or.ddit.middle.service.LoginServiceImpl;

@WebServlet("/adminDeleteMem.do")
public class AdminDeleteMem extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String memid = request.getParameter("id");
		
		System.out.println("id=" + memid);
		
		ILoginService service = LoginServiceImpl.getInstance();

		int res = service.deleteMember(memid);
		
		request.setAttribute("deleteMember", res);
		
		request.getRequestDispatcher("/adminManager.do").forward(request, response);
		
	}

}
