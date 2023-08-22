package kr.or.ddit.middle.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.IMatchService;
import kr.or.ddit.middle.service.MatchServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.middle.vo.MatchVO;
import kr.or.ddit.middle.vo.TicketVO;

@WebServlet("/cancelTicket.do")
public class CancelTicket extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		String b_no = request.getParameter("b_no");
		
		System.out.println("b_no" + b_no);
		IMatchService service = MatchServiceImpl.getInstance();
	
		int res1 = service.insertRefund(b_no);
		
		int res = service.cancelTicket(b_no);
		
		System.out.println("res="+res);
		//response.sendRedirect(request.getContextPath()+"/ticketCheck.do");
		request.getRequestDispatcher("/ticketCheck.do").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
	}

}
