package kr.or.ddit.middle.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.middle.service.IMatchService;
import kr.or.ddit.middle.service.MatchServiceImpl;
import kr.or.ddit.middle.vo.LoginVO;
import kr.or.ddit.middle.vo.MatchVO;
import kr.or.ddit.middle.vo.TicketVO;

@WebServlet("/ticketCheck.do")
public class TicketCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		IMatchService service = MatchServiceImpl.getInstance();
		LoginVO loginVO = (LoginVO)request.getSession().getAttribute("loginSign");
		String id = loginVO.getMem_id();
		
		System.out.println("id="+id);
		
		List<TicketVO> ticketList = service.getTicket(id);
		
		request.setAttribute("getTicket", ticketList);
		//response.sendRedirect(request.getContextPath()+"/html/예매내역.jsp");
		request.getRequestDispatcher("/html/예매내역.jsp").forward(request, response);
		
		
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
