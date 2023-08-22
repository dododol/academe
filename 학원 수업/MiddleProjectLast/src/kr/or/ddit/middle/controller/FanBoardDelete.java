package kr.or.ddit.middle.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.middle.service.FanBoardServiceImpl;
import kr.or.ddit.middle.service.IFanBoardService;

@WebServlet("/board/fanBoardDelete.do")
public class FanBoardDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		
		int bono = Integer.parseInt(request.getParameter("bono"));
		
		IFanBoardService service = FanBoardServiceImpl.getInstance();

		int cnt = service.deleteFanBoard(bono);
		
		request.setAttribute("UpdateFanVO", cnt);
		
		
		response.sendRedirect(request.getContextPath()+"/board/fanboardlist.do");

	}
	
}