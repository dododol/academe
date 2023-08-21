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


@WebServlet("/loginSign.do")
public class LoginSign extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String userId = request.getParameter("userid");
		String pass = request.getParameter("userpass");
		
		LoginVO vo = new LoginVO();
		vo.setMem_id(userId);
		vo.setMem_pw(pass);
		
		ILoginService service = LoginServiceImpl.getInstance();
		
		LoginVO loginMemberVo = service.getMemberLogin(vo);
		
		HttpSession session = request.getSession();
		
		if(loginMemberVo != null) {
			session.setAttribute("loginSign", loginMemberVo);
			response.sendRedirect(request.getContextPath()+"/html/main.jsp");
			
		}else {
			response.sendRedirect(request.getContextPath()+"/html/sign.jsp");
		}
		
//		RequestDispatcher disp;
//		disp = request.getRequestDispatcher(request.getContextPath()+"/sign.jsp");
//		disp.forward(request, response);
//		request.getRequestDispatcher("/html/sign.jsp").forward(request, response);
		
	}

}

